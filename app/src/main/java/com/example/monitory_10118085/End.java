package com.example.monitory_10118085;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * Tanggal Pengerjaan : Selasa, 4 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan Akhir dan menerima input nama dari halaman data diri untuk ditampilkan pada text kamu
 * Nim : 10118085
 * Nama : Risky Irfansyah
 * Kelas : IF-2
 **/
public class End extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        String nickName = getIntent().getStringExtra(Data_Diri.INPUT_NICKNAME);

        String text = getString(R.string.pesan_beres).toString();
        TextView textberes = (TextView)findViewById(R.id.textberes);

        textberes.setText(String.format(text, nickName).toString());
    }

    public void btnfinish(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}