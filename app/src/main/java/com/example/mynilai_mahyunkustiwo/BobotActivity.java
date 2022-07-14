package com.example.mynilai_mahyunkustiwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BobotActivity extends AppCompatActivity {
    EditText presentasi,nilaitugas,nilaiuas,nilaiuts;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobot);

        presentasi=findViewById(R.id.etpresensi);
        nilaitugas=findViewById(R.id.ettugas);
        nilaiuas=findViewById(R.id.etuas);
        nilaiuts=findViewById(R.id.etUts);
        btn=findViewById(R.id.Btnsubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BobotActivity.this, AkhirActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}