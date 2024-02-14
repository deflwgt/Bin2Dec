
package javabasic;

import java.util.Scanner;
public class Bin2Dex {

    public static void main(String[] args) {
        //Bien result la bien ket qua ban dau da co cong thuc
        //cong thuc : tach so day thanh cac chu so don le , sau do so hang don vi bac 0 , hang chuc bac 1
        int result = 0  ;
        int Square = 10 ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Binary string");
        int Bin = scanner.nextInt();


        System.out.println("print " +Bin );
        // test math.round
        //split number program
        for(int i = 1 ; i < 4 ; i++) {

            for (int j = 0; j <= i; j++) {
                Square = Square*10 ;

                int raw = Math.round(Bin * 10) / 100;
                result = Bin - raw * 10;
            }
        }
        System.out.println(result);
        }
    }



