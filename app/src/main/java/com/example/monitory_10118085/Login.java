package com.example.monitory_10118085;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Tanggal Pengerjaan : Selasa, 4 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan Login dan memberikan intent untuk menuju ke halaman Data_Diri
 * Nim : 10118085
 * Nama : Risky Irfansyah
 * Kelas : IF-2
 **/
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Intent intent = getIntent();
    }
    public void btnmasuk(View view) {
        Intent intent = new Intent(this, Data_Diri.class);
        startActivity(intent);
    }
}