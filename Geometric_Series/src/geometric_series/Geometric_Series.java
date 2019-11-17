package geometric_series;

import java.util.Scanner;

public class Geometric_Series {

    public static void seriesPrinter() {
        try {
            Scanner in = new Scanner(System.in);
            //take the number of queries from user
            int t = in.nextInt();
            //consider each query as a line
            for (int i = 0; i < t; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int n = in.nextInt();
                //calculate each column number
                for (int j = 0; j < n; j++) {
                    int value = x;
                    //sum of respective y variables
                    for (int k = 0; k <= j; k++) {
                        value += ((int) Math.pow(2, k)) * y;
                    }
                    System.out.print(value + " ");
                }
                System.out.println("");
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Something went wrong! Try again, please.");
            seriesPrinter();
        }
    }

    public static void main(String[] args) {
        seriesPrinter();
    }
}
