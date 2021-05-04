package com.example.monitory_10118085;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Tanggal Pengerjaan : Selasa, 4 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan data diri dan memberikan input nama untuk ditampilkan ke halaman Finish
 * Nim : 10118085
 * Nama : Risky Irfansyah
 * Kelas : IF-2
 **/
public class Data_Diri extends AppCompatActivity {

    public static final String INPUT_NICKNAME = "com.example.monitory_10118085.INPUT_NICKNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_diri);
    }

    public void btnnext(View view) {
        EditText nickName = (EditText) findViewById(R.id.isinama);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, End.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);

    }

}