import java.util.*;

public class Main {
    public static void main(String[] args) {
        String sampleText = "MWFIN AKHLN RVMWF UNKPF RMFKI NAGFV TRNBX AFTKL TNRVM WFRMW\n" +
                "FEKFL MFVTR NKTUG UTRSF RXFRM AEATI NRVNA AMWFA XMMAF TELMF\n" +
                "KLLMT TVNRV INXMF VXRNK TIMWF MXBFW NLUTB FMWFI NAKHL LNXVM\n" +
                "TMNAG TOBNR EMWXR ZLTOL WTFLN RVLWX PLNRV LFNAX RZINC TOUNY\n" +
                "YNZFL NRVGX RZLNR VIWEM WFLFN XLYTX AXRZW TMNRV IWFMW FKPXZ\n" +
                "LWNSF IXRZL";
        Map<Character, Double> probabilities = analyzeLetterFrequencyWithProbability(sampleText);
        probabilities = sortByValueDescending(probabilities);
        System.out.println(probabilities);
    }

    public static Map<Character, Double> analyzeLetterFrequencyWithProbability(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        Map<Character, Double> probabilities = new HashMap<>();
        text = text.toUpperCase();
        int totalLetters = 0;

        // Count frequencies of each letter
        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
                totalLetters++;
            }
        }

        // Calculate probabilities
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            double probability = (double) entry.getValue() / totalLetters;
            probabilities.put(entry.getKey(), probability);
        }

        return probabilities;
    }

    public static Map<Character, Double> sortByValueDescending(Map<Character, Double> map) {
        List<Map.Entry<Character, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Character, Double>comparingByValue().reversed());

        Map<Character, Double> result = new LinkedHashMap<>();
        for (Map.Entry<Character, Double> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
