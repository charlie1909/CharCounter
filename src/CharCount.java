public class CharCount {

    public static void main(String [] args){
        int[] charCounts = new int[256]; //for ASCII table

        String hello = "Hello";

        for(int i = 0; i< hello.length(); i ++){
            //one single line to count up the characters
            charCounts[hello.charAt(i)]++;
        }

        for(int i = 0; i< charCounts.length; i ++){
            //cast into char as we want to convert the number into its character equivalent
            System.out.println((char) i + ": " + charCounts[i]);
        }
    }
}
