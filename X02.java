// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHAEAN

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];
        int i;

        i = 0;
        initialized(nama, i);
        var_input(nama);
        output(nama);
    }
    
    public static void initialized(String[] nama, int i) {
        String initialized;

        for (i = 0; i <= 3; i++) {
            nama[i] = "";
        }
    }
    
    public static void var_input(String[] nama) {
        String var_input;
        int i;

        for (i = 0; i <= 3; i++) {
            nama[i] = input.nextLine();
            if (nama[i].equals("---")) {
                i = 9;
            }
        }
    }
    
    public static void output(String[] nama) {
        String output;
        int i;

        for (i = 0; i <= 3; i++) {
            if (nama[i].equals("---")) {
                i = 72;
            } else {
                System.out.println(nama[i]);
            }
        }
    }
}


