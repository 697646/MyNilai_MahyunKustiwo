package com.example.mynilai_mahyunkustiwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AkhirActivity extends AppCompatActivity {
    TextView nim,nama,nilai,grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhir);

        nim =findViewById(R.id.tvnim);
        nama =findViewById(R.id.tvnama);
        nilai =findViewById(R.id.tvNiakhir);
        grade =findViewById(R.id.etUts);

    }
}