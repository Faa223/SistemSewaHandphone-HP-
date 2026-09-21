<div align="center">

  <h1> SISTEM PENYEWAAN HANDPHONE </h1>
  <p><b>Tugas Individu Pemrograman Berorientasi Objek (Java)</b></p>

  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" alt="Java" />
  <img src="https://img.shields.io/badge/Paradigm-OOP-green?style=for-the-badge" alt="OOP" />

</div>

<hr />

##  Identitas Mahasiswa

<table>
  <tr>
    <td width="150"><b>Nama</b></td>
    <td>: Rifaa Zainul Arifin</td>
  </tr>
  <tr>
    <td><b>NIM</b></td>
    <td>: 2509116092</td>
  </tr>
  <tr>
    <td><b>Kelas</b></td>
    <td>: C</td>
  </tr>
  <tr>
    <td><b>Mata Kuliah</b></td>
    <td>: Pemrograman Berorientasi Objek</td>
  </tr>
</table>

---

##  1. Deskripsi Studi Kasus

<b>Sistem Penyewaan Handphone</b> adalah aplikasi berbasis konsol (<i>Command Line Interface / CLI</i>) yang dibangun menggunakan bahasa pemrograman Java. Aplikasi ini memfasilitasi transaksi persewaan unit handphone secara interaktif dengan fitur:

 **Pencatatan Data Pelanggan**: Menyimpan nama, nomor KTP, dan nomor telepon penyewa.
 **Katalog Unit**: Memilih jenis unit HP (*Smartphone* atau *FeaturePhone*).
 **Kalkulasi Biaya**: Menghitung total harga sewa berdasarkan durasi penyewaan (hari).
 **Pencetakan Nota Transaksi**: Menampilkan rincian lengkap transaksi persewaan.
 **Perulangan Transaksi**: Memungkinkan pengguna melakukan transaksi berulang tanpa *restart* aplikasi.

---

##  2. Struktur Hierarki Class

Aplikasi ini terdiri dari **6 file `.java`** terpisah[cite: 2]:

<table border="1">
  <thead>
    <tr>
      <th>Nama File</th>
      <th>Peran / Tipe Class</th>
      <th>Keterangan</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>Main.java</code></td>
      <td>Main Class</td>
      <td>Menjalankan alur program, input/output CLI, dan perulangan transaksi.</td>
    </tr>
    <tr>
      <td><code>Handphone.java</code></td>
      <td>Super Class</td>
      <td>Kelas induk yang menyimpan atribut umum HP (merk, tipe, harga sewa).</td>
    </tr>
    <tr>
      <td><code>Smartphone.java</code></td>
      <td>Sub Class 1</td>
      <td>Turunan dari Handphone dengan fitur OS dan RAM.</td>
    </tr>
    <tr>
      <td><code>FeaturePhone.java</code></td>
      <td>Sub Class 2</td>
      <td>Turunan dari Handphone dengan fitur kapasitas baterai dan Radio FM.</td>
    </tr>
    <tr>
      <td><code>Pelanggan.java</code></td>
      <td>Encapsulation Class</td>
      <td>Mengelola identitas penyewa (getter & setter).</td>
    </tr>
    <tr>
      <td><code>Sewa.java</code></td>
      <td>Encapsulation Class</td>
      <td>Mengelola transaksi sewa, kalkulasi biaya, dan pencetakan nota.</td>
    </tr>
  </tbody>
</table>

### Diagram Hierarki

<img width="452" height="493" alt="Untitled" src="https://github.com/user-attachments/assets/ae65e587-2d08-4024-bfe4-57db72c1e207" />

<hr />

##  3. Penerapan Konsep PBO

### A. Inheritance (Pewarisan)
Penerapan <i>inheritance</i> dilakukan dengan membuat relasi antara <i>super-class</i> <code>Handphone</code> dengan dua <i>sub-class</i>, yaitu <code>Smartphone</code> dan <code>FeaturePhone</code>.

* Sub-class menggunakan kata kunci <code>extends Handphone</code>.
* Menggunakan pemanggilan konstruktor super-class melalui <code>super(merk, tipe, hargaSewaPerHari)</code> untuk mewarisi atribut dari kelas induk.

<b>Potongan Kode Inheritance (<code>Smartphone.java</code>):</b>

      // Sub Class mewarisi Super Class Handphone
      public class Smartphone extends Handphone {
          private String sistemOperasi;
          private int kapasitasRAM;
      
        public Smartphone(String merk, String tipe, double hargaSewaPerHari, String sistemOperasi, int kapasitasRAM) {
              super(merk, tipe, hargaSewaPerHari); // Memanggil atribut super-class
              this.sistemOperasi = sistemOperasi;
              this.kapasitasRAM = kapasitasRAM;
          }
      }

##  4. Output Program
<img width="353" height="921" alt="Screenshot 2026-09-21 174041" src="https://github.com/user-attachments/assets/3e17498d-c51b-4993-915a-b825dbb6cb9c" />

