package com.example.appmypham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrangChu extends AppCompatActivity {

    Button btnmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        btnmap = (Button) findViewById(R.id.btnmap);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrangChu.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}