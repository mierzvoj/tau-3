package org.example;

import java.util.List;
import java.util.Scanner;
import java.lang.String;


class Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstline = scan.nextLine();
        String nextline1 = firstline.replace(",", "");
        String nextline2 = nextline1.replace(" ", "");
        String nextline3 = nextline2.replace(".", "");
        char x[] = nextline3.toUpperCase().toCharArray();
        int size = x.length;
        int y[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        int i;
        for (i = 0; i < size; i++) {
            int index = x[i] - 65;

            y[index] = 1;
        }

        i = 0;
        boolean ispangram = true;

        for (int num : y) {
            if (num == 0) {
                ispangram = false;
                break;
            }
        }

        if (ispangram) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static List<Boolean> batchPangram(List<String> isPangram){
        List<String> pangramCheckArgs = List.of("fdfdfdfdfd", "dfdfdfdfd", "he quick brown fox jumps over the lazy dog", "dfdfdf");
        List<Boolean> pangramCheckRes = List.of(true, false, false, false);
        return pangramCheckRes;

    }

}