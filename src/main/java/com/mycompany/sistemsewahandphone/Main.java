/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemsewahandphone;

import Model.Sewa;
import Model.Handphone;
import Model.Smartphone;
import Model.FeaturePhone;
import Model.Pelanggan;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulang;

        // Perulangan utama program menggunakan do-while
        do {
            System.out.println("\n=========================================");
            System.out.println("       SISTEM PENYEWAAN HANDPHONE        ");
            System.out.println("=========================================");

            // Input data pelanggan
            System.out.print("Masukkan Nama Pelanggan : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan No. KTP        : ");
            String ktp = scanner.nextLine();
            System.out.print("Masukkan No. Telepon    : ");
            String telp = scanner.nextLine();

            Pelanggan pelanggan = new Pelanggan(nama, ktp, telp);

            // Deklarasi pilihan unit handphone (Sub Class)
            Smartphone sp1 = new Smartphone("Apple", "iPhone 15 Pro", 150000, "iOS", 8);
            FeaturePhone fp1 = new FeaturePhone("Nokia", "105 4G", 30000, 1450, true);

            Handphone hpDipilih = null;
            int pilihan = 0;

            // Perulangan untuk validasi pilihan unit handphone
            while (pilihan != 1 && pilihan != 2) {
                System.out.println("\n--- Pilih Handphone yang Disewa ---");
                System.out.println("1. [Smartphone] " + sp1.getMerk() + " " + sp1.getTipe() + " (Rp" + sp1.getHargaSewaPerHari() + "/hari)");
                System.out.println("2. [FeaturePhone] " + fp1.getMerk() + " " + fp1.getTipe() + " (Rp" + fp1.getHargaSewaPerHari() + "/hari)");
                System.out.print("Pilihan Anda (1/2): ");
                
                if (scanner.hasNextInt()) {
                    pilihan = scanner.nextInt();
                    if (pilihan == 1) {
                        hpDipilih = sp1;
                    } else if (pilihan == 2) {
                        hpDipilih = fp1;
                    } else {
                        System.out.println("Pilihan tidak valid! Silakan pilih 1 atau 2.");
                    }
                } else {
                    System.out.println("Input harus berupa angka!");
                    scanner.next(); // Membersihkan bufffer input salah
                }
            }

            // Input lama sewa dengan perulangan validasi angka positif
            int lamaSewa = 0;
            while (lamaSewa <= 0) {
                System.out.print("Masukkan Lama Sewa (Hari): ");
                if (scanner.hasNextInt()) {
                    lamaSewa = scanner.nextInt();
                    if (lamaSewa <= 0) {
                        System.out.println("Lama sewa harus minimal 1 hari!");
                    }
                } else {
                    System.out.println("Input harus berupa angka!");
                    scanner.next();
                }
            }

            // Memproses transaksi sewa
            Sewa transaksiSewa = new Sewa(pelanggan, hpDipilih, lamaSewa);
            transaksiSewa.cetakNotaSewa();

            // Konfirmasi perulangan transaksi
            System.out.print("\nApakah ingin melakukan transaksi sewa lagi? (y/n): ");
            ulang = scanner.next().charAt(0);
            scanner.nextLine(); // Membersihkan buffer newline

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\n=========================================");
        System.out.println(" Terima kasih telah menyewa Handphone disini ");
        System.out.println("=========================================");

        scanner.close();
    }
}