package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Thali extends AppCompatActivity {

    Button buy1 , buy2 , buy3 ;
    TextView name1 , name2 , name3 , rs1 , rs2 , rs3 , rs12 , rs22 , rs32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thali);

        buy1 = findViewById(R.id.buy1);
        buy2 = findViewById(R.id.buy2);
        buy3 = findViewById(R.id.buy3);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        name3 = findViewById(R.id.name3);
        rs1 = findViewById(R.id.rs1);
        rs2 = findViewById(R.id.rs2);
        rs3= findViewById(R.id.rs3);
        rs12 = findViewById(R.id.rs12);
        rs22 = findViewById(R.id.rs22);
        rs32 = findViewById(R.id.rs32);

        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = name1.getText().toString();
                String rupee = rs1.getText().toString();
                String price = rs12.getText().toString();
                Toast.makeText(Thali.this, "Your Choice Is Amazing", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(),SummaryActivity.class);
                intent.putExtra("keyname",name);
                intent.putExtra("keyprice",price);
                intent.putExtra("resId", R.drawable.t1);

                startActivity(intent);
            }
        });

        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = name2.getText().toString();
                String rupee = rs2.getText().toString();
                String price = rs22.getText().toString();

                Intent intent = new Intent(getBaseContext(),SummaryActivity.class);
                intent.putExtra("keyname",name);
                intent.putExtra("keyprice",price);
                intent.putExtra("resId", R.drawable.t2);

                startActivity(intent);
            }
        });

        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = name3.getText().toString();
                String rupee = rs3.getText().toString();
                String price = rs32.getText().toString();

                Intent intent = new Intent(getBaseContext(),SummaryActivity.class);
                intent.putExtra("keyname",name);
                intent.putExtra("keyprice",price);
                intent.putExtra("resId", R.drawable.t3);

                startActivity(intent);
            }
        });
    }
}