/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemsewahandphone;

import Model.FeaturePhone;
import Model.Handphone;
import Model.Pelanggan;
import Model.Sewa;
import Model.Smartphone;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   SISTEM PENYEWAAN HANDPHONE     ");
        System.out.println("=========================================");

        // Input data pelanggan
        System.out.print("Masukkan Nama Pelanggan : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan No. KTP        : ");
        String ktp = scanner.nextLine();
        System.out.print("Masukkan No. Telepon    : ");
        String telp = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, ktp, telp);

        Smartphone sp1 = new Smartphone("Apple", "iPhone 15 Pro", 150000, "iOS", 8);
        FeaturePhone fp1 = new FeaturePhone("Nokia", "105 4G", 30000, 1450, true);

        System.out.println("\n--- Pilih Handphone yang Disewa ---");
        System.out.println("1. [Smartphone] " + sp1.getMerk() + " " + sp1.getTipe() + " (Rp" + sp1.getHargaSewaPerHari() + "/hari)");
        System.out.println("2. [FeaturePhone] " + fp1.getMerk() + " " + fp1.getTipe() + " (Rp" + fp1.getHargaSewaPerHari() + "/hari)");
        System.out.print("Pilihan Anda (1/2): ");
        int pilihan = scanner.nextInt();

        Handphone hpDipilih;
        if (pilihan == 1) {
            hpDipilih = sp1;
        } else {
            hpDipilih = fp1;
        }

        // Input lama sewa
        System.out.print("Masukkan Lama Sewa (Hari): ");
        int lamaSewa = scanner.nextInt();

        // Memproses transaksi sewa
        Sewa transaksiSewa = new Sewa(pelanggan, hpDipilih, lamaSewa);
        transaksiSewa.cetakNotaSewa();

        scanner.close();
    }
}