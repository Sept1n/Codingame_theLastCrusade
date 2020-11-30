import java.util.*;

import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // number of columns.
        int H = in.nextInt(); // number of rows.
        String [][] table = new String[H][W];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            String LINE = in.nextLine(); // represents a line in the grid and contains W integers. Each integer represents one room of a given type.
            String[] s = LINE.split(" ");
            //System.err.println(s[i]);
            for(int j = 0; j < W; j++) {
                table[i][j] = s[j];
            }
        }
        int x =  0, y = 0;
        int EX = in.nextInt(); // the coordinate along the X axis of the exit (not useful for this first mission, but must be read).
        // game loop
        while (true) {
            int XI = in.nextInt();
            int YI = in.nextInt();
            String POS = in.next();

            System.err.println(table[YI][XI]);
            System.err.println(POS);
            //System.err.println(table[2][1]);

            if (table[YI][XI].equals("1")) {
                x = XI;
                y = YI + 1;
            }
            if (table[YI][XI].equals("2")  || table[YI][XI].equals("6")) {
                if (POS.equals("LEFT")) {
                    x = XI + 1;
                    y = YI;
                }
                else {
                    x = XI - 1;
                    y = YI;
                }
            }
            if (table[YI][XI].equals("3") || table[YI][XI].equals("7") || table[YI][XI].equals("8") ||
                    table[YI][XI].equals("9")) {
                x = XI;
                y = YI + 1;
            }
            if (table[YI][XI].equals("4")) {
                if (POS.equals("TOP")) {
                    x = XI - 1;
                    y = YI;
                }
                else {
                    x = XI;
                    y = YI + 1;
                }
            }
            if (table[YI][XI].equals("5")) {
                if (POS.equals("TOP")) {
                    x = XI + 1;
                    y = YI;
                }
                else {
                    x = XI;
                    y = YI + 1;
                }
            }
            if (table[YI][XI].equals("10")) {
                x = XI - 1;
                y = YI;
            }
            if (table[YI][XI].equals("11")) {
                x = XI + 1;
                y = YI;
            }
            if (table[YI][XI].equals("12")) {
                x = XI;
                y = YI + 1;
            }
            if (table[YI][XI].equals("13")) {
                x = XI;
                y = YI + 1;
            }

            System.out.println(x + " " + y);

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
    }
}