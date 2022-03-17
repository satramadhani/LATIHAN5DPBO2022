# LATIHAN5DPBO2022
### Saya [Muhammad Satria Ramadhani - 2005128] mengerjakan evaluasi [Latihan Praktikum 05] dalam mata kuliah [Desain dan Pemrograman Berorientasi Objek] untuk keberkahan-Nya, maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Pengerjaan Latihan

a. **Mengganti font dan ukuran teks**. Cara yang dilakukan adalah dengan menekan elemen yang ingin diubah di JFrame hingga muncul menu Palette dan Properties-nya. Di Properties, cari menu "font" dan pilihlah gaya yang diinginkan. Dalam hal ini, program mengganti *font* dari **Segoe UI** menjadi **Verdana** dan judul program diberi *style* **Bold**.

b. **Mengubah nama variabel setiap komponen**. Cara yang dilakukan adalah dengan mengklik kanan elemen yang akan diubah di JFrame hingga muncul menu *dropdown*, lalu pilih menu "Change Variable Name..." dan ubahlah nama variabel sesuai kebutuhan.

c. **Menambahkan validasi ketika inputan tidak lengkap**. Cara yang dilakukan adalah memeriksa apakah kotak untuk mengisi data ada nilainya atau tidak, dengan membandingkannya menggunakan `equals("")`. Jika semua yang terisi, maka jalankan perintah berikutnya, tetapi jika tidak terisi maka tampilkan pesan error.

d. **Menghapus data pada label inputan ketika sudah selesai modifikasi data atau menekan tombol cancel**. Cara yang dilakukan adalah menambah `setText("")` di masing-masing kotak untuk mengisi data pada setiap method-nya. Lebih jelasnya, setelah memindahkan teks ke dalam variabel di method **insertData**, **updateData**, **deleteData**, dan **buttonCancelActionPerformed**, lantas ditambahkan kode:

```
textNIM.setText("");
textName.setText("");
textGrade.setText("");
textClass.setText("");
```

e. **Mengupdate tabel setiap kali ada perubahan pada data**. Cara yang dilakukan adalah dengan menambahkan baris kode `table.setModel(setTable());` setelah data dimodifikasi di masing-masing method (**insertData**, **updateData**, **deleteData**).

***Bonus***

**Menambahkan atribut inputan baru selain yang sudah ada pada form**. Dalam kasus ini, atribut yang ditambahkan dalam program adalah "Kelas". Adapun cara yang dilakukan adalah:

1. Memberi label dan kotak pengisi data yang sesuai di desain JFrame.
2. Menambahkan atribut beserta Getter-Setter di class-nya (Mahasiswa.java).
3. Menambahkan data baru saat deklarasi `object[] column`, yakni "Kelas".
4. Menambahkan data baru di deklarasi `object[] row`. Karena ini merupakan data keempat, maka objek yang diisi berada pada indeks ke-3 dengan sintaks `list.get(i).getKelas()'.
5. Pada method **insertData** dan **updateData**, ditambahkan variabel baru yang sesuai untuk kemudian diisi dengan teks yang ada pada kotak.
6. Pada method untuk *action* baris dalam tabel ditekan (**tableMouseClicked**), tambahkan baris untuk kolom baru yang sepola dengan kolom lainnya.

## Hasil Program

Tampilan awal.

![1](https://user-images.githubusercontent.com/72297396/158768360-df185249-b9e0-463c-9a05-2f917d35ac30.png)

Tampilan ketika data akan ditambah, tetapi masih ada kotak yang kosong.

![2](https://user-images.githubusercontent.com/72297396/158768464-728ff3a6-7740-4c20-a734-b87f6d2b2632.png)

Tampilan ketika data berhasil ditambah.

![3](https://user-images.githubusercontent.com/72297396/158768504-c8d064e6-5791-45bb-ab4c-b1fb80fe852c.png)

Tampilan ketika data akan diperbarui, tetapi ada kotak yang kosong.

![4](https://user-images.githubusercontent.com/72297396/158768577-cbc24827-5072-47a8-a05a-2be6b250d207.png)

Tampilan ketika data berhasil diperbarui.

![5](https://user-images.githubusercontent.com/72297396/158768625-cf3a9068-c70a-4354-9b75-c492f3082963.png)

Tampilan ketika data berhasil dihapus.

![6](https://user-images.githubusercontent.com/72297396/158768654-1c9f5677-3dbc-4b21-b8d8-fda6e637f6d2.png)

