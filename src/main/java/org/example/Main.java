package org.example;

import java.util.ArrayList;
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
        int y[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

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

        class PangramBatchCheck {

            List<String> pangramCheckArgs = List.of("fdfdfdfdfd", "dfdfdfdfd", "he quick brown fox jumps over the lazy dog", "dfdfdf");
            List<Boolean> resList = new ArrayList<>();

            List<Boolean> pangramBatchCheck(List<String> listOfPangrams) {

                for(int i = 0; i < listOfPangrams.size(); i++){
                    String stringBuffer = listOfPangrams.indexOf(i);
                }

                return resList;

            };







        }


    }


}