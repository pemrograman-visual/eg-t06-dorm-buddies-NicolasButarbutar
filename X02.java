// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHAEAN

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];

        fungsi1(nama);
        fungsi2(nama);
    }
    
    public static void fungsi1(String[] nama) {
        int p;

        for (p = 0; p <= 3; p++) {
            nama[p] = "";
        }
    }
    
    public static void fungsi2(String[] nama) {
        int x, a;

        for (x = 0; x <= 3; x++) {
            nama[x] = input.nextLine();
            if (nama[x].equals("---")) {
                nama[x] = "";
                a = x;
                x = 4;
            } else {
                a = x;
            }
        }
        fungsi3(nama);
    }
    
    public static void fungsi3(String[] nama) {
        int c;

        for (c = 0; c <= 3; c++) {
            System.out.println(nama[c]);
        }
    }
}
