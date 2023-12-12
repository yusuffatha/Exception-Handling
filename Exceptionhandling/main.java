package Exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String n = "true";
        Integer hargaBarang = 0;
        Integer jumlahBarang = 0;
        while (n.equals("true")) {
            boolean input = false;
            Scanner  saya  = new Scanner(System.in);
            Scanner integer = new Scanner(System.in);
            System.out.print("nama Pelanggan   : ");
            String nama = saya.nextLine();
            System.out.print("Nomor Hp         : ");
            String noHp = saya.next();
            System.out.print("Nama Barang      : ");
            String namaBarang = saya.next();

            do {
                try {
                    System.out.print("Harga Barang     : ");
                    hargaBarang = integer.nextInt();
                    input = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    integer.next();
                }
            } while (!input);
            input = false;
            do {
                try {
                    System.out.print("Jumlah Barang    : ");
                    jumlahBarang = integer.nextInt();
                    input = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    integer.next();
                }
            } while (!input);

            Penjualan penjualan = new Penjualan(nama, noHp, namaBarang, hargaBarang, jumlahBarang);

            Scanner cout = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("ketik true untuk melanjutkan");
            n = cout.next();
            System.out.println();
        }
    }
}
