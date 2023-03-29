//Nama : Nurul Azmi
//NIM	: 13020210066

import java.util.Scanner;

public class Hitung0066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mil: ");
        double mil = input.nextDouble();

        double meter = mil * 1609.344;

        System.out.printf("%.3f mil = %.3f meter", mil, meter);

        input.close();
    }
}
