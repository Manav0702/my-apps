package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Summary2 extends AppCompatActivity {

    private static TextView p,q;
    Button a;
    ImageView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary2);
        p=(TextView)findViewById(R.id.bur);
        a=(Button)findViewById(R.id.proceed);
        q=(TextView)findViewById(R.id.ger);
        r=(ImageView)findViewById(R.id.image) ;
        // String name=getIntent().getStringExtra("keyname");
        //String price=getIntent().getStringExtra("keyprice");
        //p.setText(name);
        //q.setText(price);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            int resId=bundle.getInt("resId");
            r.setImageResource(resId);
        }
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),AddressActivity.class);
                startActivity(intent);
            }
        });

    }
}