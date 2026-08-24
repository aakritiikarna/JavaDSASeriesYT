public class variable {
    public static void main(String[] args) {
        int age;
        age= 10;
        age = 11;
        System.out.println(age);

        // define or intialize
        int totalMarks = 20;
        System.out.println(totalMarks);
        
        // Case sensitive
        int weight = 80;
        int WEIGHT = 90;
        System.out.println("weight:" + weight);
        System.out.println("Weight:" + WEIGHT);

        //Strating Letter
        int marks = 10;
        int MARKS = 11;
        int _marks = 12;
        int $marks = 13;
        System.out.println("marks:" + marks);
        System.out.println("MARKS:" + MARKS);
        System.out.println("_marks:" + _marks);
        System.out.println("$marks:" + $marks);

        // Subsequent Letters
        int height5= 21;
        int height_love = 33;
        int height$12Love = 44;
        int height_ = 22;
        int height$ = 23;
        System.out.println("height5:" + height5);
        System.out.println("height_love:" + height_love);
        System.out.println("height$12Love:" + height$12Love);
        System.out.println("height_:" + height_);
        System.out.println("height$:" + height$);

        //No Reserved Keywords

        //length
        int a= 1;
        int b=2;
        int c= 3;
        int length= a+b+c;
        System.out.println("length: " + length);

        //constants
        int DAYS_IN_YEAR = 365;
        System.out.println("DAYS_IN_YEAR: " + DAYS_IN_YEAR);
    }
}
