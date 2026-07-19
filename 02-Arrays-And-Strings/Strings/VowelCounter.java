public class VowelCounter {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = countVowels(str);
        System.out.println("Total vowels: " + count);
    }

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        
        int count = 0;
        // Convert to lowercase to minimize comparison checks
        String lowerStr = str.toLowerCase(); 

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
