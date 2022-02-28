package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {
    EditText a,b ,c;
    Button d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        a=findViewById(R.id.editTextTextPersonName);
        b=findViewById(R.id.editTextNumber);
        c=findViewById(R.id.editTextTextPostalAddress);
        d=findViewById(R.id.order);
        String name=a.getText().toString();
        String number=b.getText().toString();
        String address =c.getText().toString();

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  if(name.equals("")||number.equals("")||address.equals(""))
                //T//oast.makeText(address.this,"Pls Enter All The Fields",Toast.LENGTH_SHORT).show();

                //else {
                Toast.makeText(AddressActivity.this, "YOUR ORDER HAS BEEN SUCCESSFULLY PLACED", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), BurgerActivity.class);
                startActivity(intent);

            }});
    }
}