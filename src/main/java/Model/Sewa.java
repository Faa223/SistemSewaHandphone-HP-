/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Sewa {
    private Pelanggan pelanggan;
    private Handphone handphone;
    private int lamaSewaHari;

    public Sewa(Pelanggan pelanggan, Handphone handphone, int lamaSewaHari) {
        this.pelanggan = pelanggan;
        this.handphone = handphone;
        this.lamaSewaHari = lamaSewaHari;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Handphone getHandphone() {
        return handphone;
    }

    public void setHandphone(Handphone handphone) {
        this.handphone = handphone;
    }

    public int getLamaSewaHari() {
        return lamaSewaHari;
    }

    public void setLamaSewaHari(int lamaSewaHari) {
        this.lamaSewaHari = lamaSewaHari;
    }

    public double hitungTotalBiaya() {
        return handphone.getHargaSewaPerHari() * lamaSewaHari;
    }

    public void cetakNotaSewa() {
        System.out.println("\n=========================================");
        System.out.println("          NOTA SEWA HP            ");
        System.out.println("=========================================");
        pelanggan.tampilkanPelanggan();
        System.out.println("-----------------------------------------");

        if (handphone instanceof Smartphone) {
            ((Smartphone) handphone).tampilkanInformasiSmartphone();
        } else if (handphone instanceof FeaturePhone) {
            ((FeaturePhone) handphone).tampilkanInformasiFeaturePhone();
        } else {
            handphone.tampilkanInformasi();
        }

        System.out.println("-----------------------------------------");
        System.out.println("Lama Sewa         : " + lamaSewaHari + " Hari");
        System.out.println("Total Biaya Sewa  : Rp" + hitungTotalBiaya());
        System.out.println("=========================================");
    }
}