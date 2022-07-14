package com.example.mynilai_mahyunkustiwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NilaiActivity extends AppCompatActivity {
    private EditText nilaiuas, nilaiuts, presentasi, nim, nama, nilaitugas;
    private Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);

        nilaiuas = findViewById(R.id.etNiUas);
        nilaiuts = findViewById(R.id.etUts);
        nim = findViewById(R.id.etnim);
        nama = findViewById(R.id.etnama);
        presentasi = findViewById(R.id.etpresensi);
        nilaitugas = findViewById(R.id.etNitugas);
        lanjut = (Button) findViewById(R.id.Btnsubmit);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NilaiActivity.this,BobotActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}