public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String originalToLowerCase = original.toLowerCase();
        String originalToUpperCase = original.toUpperCase();
        String originalTrim = original.trim();
        String originalSubString = original.substring(2);
        String originalSubstring2 = original.substring(2, 9);
        String originalReplace = original.replace('a', 'x');
        String originalReplace2 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        String s = "potato apple lemon";
        String[] vetor = s.split(" ");
        String word1 = vetor[0];
        String word2 = vetor[1];
        String word3 = vetor[2];


        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + originalToLowerCase + "-");
        System.out.println("toUperCase: -" + originalToUpperCase + "-");
        System.out.println("trim: -" + originalTrim + "-");
        System.out.println("substring(2): -" + originalSubString + "-");
        System.out.println("substring(2, 9): -" + originalSubstring2 + "-");
        System.out.println("replace: -" + originalReplace + "-");
        System.out.println("replace2: -" + originalReplace2 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
        System.out.println(word1 + " " + word2 + " " + word3);




    }
}