package Exceptionhandling;

	import java.util.InputMismatchException;
	import java.util.Scanner;
	import java.text.SimpleDateFormat;
	import java.util.Date;


	class Penjualan extends Pelanggan {
	    public String namaBarang;
	    public Integer hargaBarang;
	    public Integer jumlahBarang;
	    public Integer totalBayar;
	    public static Integer noFaktur = 0;

	    public Penjualan(String nama, String noHp, String namaBarang, Integer hargaBarang, Integer jumlahBarang) {
	        super(nama, noHp);
	        this.namaBarang = namaBarang;
	        this.hargaBarang = hargaBarang;
	        this.jumlahBarang = jumlahBarang;
	        this.totalBayar = hargaBarang * jumlahBarang;
	        cetakFaktur();
	    }

	    @Override
	    public void cetakFaktur() {
	       
	        System.out.println();
	        System.out.println("Faktur ");
	        
	        System.out.println("  MMHH0" + ++noFaktur + "     ");
	        System.out.println();
	        System.out.println("Swalayan :Muayyadillah  Alamat : Keckuranji ");
	    
	        System.out.println("Atas Nama : " + nama);
	        System.out.println("No      : " + noHP);
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        System.out.println("Tanggal      : " + dateFormat.format(new Date()));
	      
	        System.out.println(namaBarang);
	        System.out.println("Rp." + hargaBarang + " * " + jumlahBarang + " = " + totalBayar);
	       
	        System.out.println("Total        : Rp." + totalBayar);
	  

	    
	}
	}
	