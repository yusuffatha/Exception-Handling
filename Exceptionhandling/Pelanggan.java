package Exceptionhandling;
public class Pelanggan implements Swalayan {
    public String nama;
    public String noHP;

    public Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
    @Override
    public void cetakFaktur() {
        throw new UnsupportedOperationException("Unimplemented method 'cetakFaktur'");
    }

    @Override
    public Integer totalBayar() {
        throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
    }

	}
