/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Widya160523;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Warnet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Paket UTS.A_230523");
        System.out.println("Warnet");
        System.out.println("==============================");

        System.out.print("Kota Pelanggan: ");
        String kotaPelanggan = input.nextLine();

        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = input.nextLine();

        System.out.print("Jenis Pelanggan (vip/umum): ");
        String jenisPelanggan = input.nextLine();

        System.out.print("Jam Masuk (hh:mm): ");
        String jamMasukStr = input.nextLine();
        int jamMasuk = getJam(jamMasukStr);
        int menitMasuk = getMenit(jamMasukStr);

        System.out.print("Jam Keluar (hh:mm): ");
        String jamKeluarStr = input.nextLine();
        int jamKeluar = getJam(jamKeluarStr);
        int menitKeluar = getMenit(jamKeluarStr);

        // Menghitung lama penggunaan warnet
        int lama = hitungLama(jamMasuk, menitMasuk, jamKeluar, menitKeluar);

        // Menghitung tarif
        int tarif = hitungTarif(jenisPelanggan);

        // Menghitung total biaya
        int total = lama + tarif;

        System.out.println("==============================");
        System.out.println("Kota Pelanggan: " + kotaPelanggan);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jenis Pelanggan: " + jenisPelanggan);
        System.out.println("Lama Penggunaan: " + lama + " menit");
        System.out.println("Tarif: Rp " + tarif);
        System.out.println("Total Biaya: Rp " + total);
    }

    // Fungsi untuk mendapatkan jam dari string format hh:mm
    private static int getJam(String waktu) {
        return Integer.parseInt(waktu.split(":")[0]);
    }

    // Fungsi untuk mendapatkan menit dari string format hh:mm
    private static int getMenit(String waktu) {
        return Integer.parseInt(waktu.split(":")[1]);
    }

    // Fungsi untuk menghitung lama penggunaan warnet
    private static int hitungLama(int jamMasuk, int menitMasuk, int jamKeluar, int menitKeluar) {
        int lamaJam = jamKeluar - jamMasuk;
        int lamaMenit = menitKeluar - menitMasuk;

        if (lamaMenit < 0) {
            lamaJam--;
            lamaMenit += 60;
        }

        return lamaJam * 60 + lamaMenit;
    }

    // Fungsi untuk menghitung tarif berdasarkan jenis pelanggan
    private static int hitungTarif(String jenisPelanggan) {
        if (jenisPelanggan.equalsIgnoreCase("vip")) {
            return 10000;
        } else if (jenisPelanggan.equalsIgnoreCase("umum")) {
            return 15000;
        } else {
            return 0; // Jika jenis pelanggan tidak valid
        }
    }
}

