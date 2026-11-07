public class Pattern {
    public static void main(String[] args) {

        // int n = 4;

        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // solid rectanglur pattern
        // int n= 6;
        // for(int row=1; row<=n; row++){
        //     // for each row -> col
        //     for(int col=1; col<=5; col++){
        //         //star
        //         System.out.print("* ");
        //     }
        //     //move to next row
        //     System.out.println();
        // }


        // int n=5;

        // for(int row=1; row<=n; row++){
        //     // for each row -> variable columns
        //     //formula -> col-> 1-> value for now
        //     for (int col=1; col<=row; col++){
        //         System.out.print("* ");
        //     }
        //     //move to next line
        //     System.out.println();
        // }

  //rombus rectangular pattern
    //     int n = 5;

    // for (int row = 1; row <= n; row++) {

    //     // Spaces
    //     for (int col = 1; col <= n - row; col++) {
    //         System.out.print(" ");
    //     }

    //     // Stars
    //     for (int col = 1; col <= n; col++) {
    //         System.out.print("* ");
    //     }

    //     // Move to next line
    //     System.out.println();
    // }


    // int n=5;
    // for(int row=1; row<=n; row++){
    //     //for each row -> variable columns
    //     for(int col=1; col<=n-row+1; col++){
    //         System.out.print("* ");
    //     }
    //     //move to next line
    //     System.out.println();
    // }


    // int n = 5;

    // for (int row = 1; row <= n; row++) {

    //     // Spaces
    //     for (int col = 1; col <= n - row; col++) {
    //         System.out.print(" ");
    //     }

    //     // Stars
    //     for (int col = 1; col <= 2 * row - 1; col++) {
    //         System.out.print("*");
    //     }

    //     // Move to the next line
    //     System.out.println();
    // }


    // int n=4;

    // for(int row=1; row<=n; row++){
    //     //for each row -> variable columns
    //     //spaces
    //     for(int col=1; col<=row-1; col++) {
    //         System.out.print(" ");
    //     }
    //     //stars
    //     for(int col=1; col<=2*n-2*row+1; col++) {
    //         System.out.print("* ");
    //     }
    //     //move to next line
    //     System.out.println();
    // }


    // int n = 4;

    // for (int row = 1; row <= n; row++) {

    //     // For each row, print 6 columns
    //     for (int col = 1; col <= 6; col++) {

    //         // First row or last row
    //         if (row == 1 || row == n) {
    //             System.out.print("* ");
    //         } else {

    //             // First column
    //             if (col == 1) {
    //                 System.out.print("* ");
    //             }
    //             // Last column
    //             else if (col == 6) {
    //                 System.out.print("* ");
    //             }
    //             // Middle columns
    //             else {
    //                 System.out.print("  ");
    //             }
    //         }
    //     }

    //     // Move to the next row
    //     System.out.println();

    // }

    // int n = 5;

    // for (int row = 1; row <= n; row++) {

    //     // Part 1: Leading spaces
    //     for (int col = 1; col <= n - row; col++) {
    //         System.out.print(" ");
    //     }

    //     // Part 2: First and last rows
    //     if (row == 1 || row == n) {
    //         for (int col = 1; col <= 2*row-1; col++) {
    //             System.out.print("* ");
    //         }
    //     } else {
    //         // First star
    //         System.out.print("* ");

    //         // Inner spaces
    //         for (int col = 1; col <= 2*row - 3; col++) {
    //             System.out.print("  ");
    //         }

    //         // Last star
    //         System.out.print("*");
    //     }

    //     // Move to next line
    //     System.out.println();
    // }




    // int n = 4;

    //     // Upper Triangle
    //     for (int row = 1; row <= n; row++) {

    //         // Spaces
    //         for (int col = 1; col <= n - row; col++) {
    //             System.out.print(" ");
    //         }

    //         // Stars
    //         for (int col = 1; col <= 2 * row - 1; col++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }

    //     // Lower Inverted Triangle
    //     for (int row = n - 1; row >= 1; row--) {

    //         // Spaces
    //         for (int col = 1; col <= n - row; col++) {
    //             System.out.print(" ");
    //         }

    //         // Stars
    //         for (int col = 1; col <= 2 * row - 1; col++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();
    //     }



    // int n =5;
    // for( int row=1; row<=n; row++) {
    //     //for each row -> variable columns
    //     for(int col=1; col<=row; col++) {
    //         System.out.print(col+" ");
    //     }
    //     System.out.println();
    // }



    // int n= 5;
    // int count =1;

    // for(int row=1; row<=n; row++) {
    //     //for each row -> variable columns
    //     for(int col=1; col<=row; col++) {
    //         System.out.print(count+" ");
    //         count++;
    //     }
    //     System.out.println();
    // }



    // int n=5;

    // for(int row=1; row<=n; row++) {
    //     //for each row -> variable columns
    //     for(int col=1; col<=row; col++) {
    //         int a=col;
    //         int b=('A' -1);
    //         int ans = a+b;
    //         char finalAns = (char)ans;
    //         System.out.print(finalAns+" ");
    //     }
    //     System.out.println();
    // }


    //    int n=5;

    //     for(int row=1; row<=n; row++) {
    //         //for each row -> variable columns
    //         for(int col=1; col<=row; col++) {
    //             int a=n-col;
    //             int b=('A');
    //             int ans = a+b;
    //             char finalAns = (char)ans;
    //             System.out.print(finalAns+" ");
    //         }
    //         System.out.println();
    //     }



    // int n =4;

    // for(int row=1; row<=n; row++) {
    //     // part1
    //     for(int col=1; col<=n-row; col++){
    //         System.out.print(" ");
    //     }
    //     //part 2
    //     for(int col=1; col<=2*row-1; col++){
    //         System.out.print(row+" ");
    //     }
    //     System.out.println();
    // }
}
}