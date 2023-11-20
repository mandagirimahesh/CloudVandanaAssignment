public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkIfPangram(sentence.toLowerCase());

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] alphabetPresent = new boolean[26];
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                if (!alphabetPresent[ch - 'a']) {
                    alphabetPresent[ch - 'a'] = true;
                    count++;
                }
            }

            if (count == 26) {
                return true;
            }
        }

        return false;
    }
}