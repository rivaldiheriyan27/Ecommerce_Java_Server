package com.rivaldicommarce.ecommarce.entity.model;

// Intinya ini fungsi enum
/*
enum ini dapat digunakan untuk merepresentasikan status pesanan pada
sistem e-commerce atau aplikasi pemesanan lainnya. Dengan
menggunakan enum, kita dapat memastikan bahwa nilai yang digunakan untuk
merepresentasikan status pesanan adalah nilai yang valid dan
terdefinisi dengan jelas, sehingga memudahkan dalam melakukan validasi dan
pengolahan data pada sistem.
Selain itu, penggunaan enum juga membuat kode program
lebih mudah dibaca dan dipahami oleh programmer lain.

 */
public enum StatusPesanan  {
    DRAFT, PEMBAYARAN, PACKING, PENGIRIMAN, SELESAI
}
