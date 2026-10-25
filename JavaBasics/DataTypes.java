public class DataTypes {
    public static void main(String[] args) {

        // Numeric DT - Short, byte, int, long
        byte num1 = 127;
        System.out.println(num1);

        short num2 = 32767;
        System.out.println(num2);

        int num3= 2147483647;
        System.out.println(num3);

        long num4 = 9223372036854775807L;
        System.out.println(num4);

        // float 
        float num5 = 5.99f;
        System.out.println(num5);

        double num6 = 3.142435464;
        System.out.println(num6);

        //other -Char,Boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char grade = 'A';
        System.out.println(grade);

        char firstCharacter = 'a';
        System.out.println("My First Character is: " + (char)(firstCharacter+2));

    }
}