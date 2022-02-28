package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

public class foodietype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodietype);

        GridView gridview = (GridView)findViewById(R.id.gridview2);
        gridview.setAdapter(new Foodie(this));

        gridview.setOnItemClickListener((parent, view, position, id) -> {
            //   Toast.makeText(foodtype.this,"Welcome To Burger Zone",Toast.LENGTH_SHORT).show();
            Intent myintent =null;
            if(position==0){
                Toast.makeText(foodietype.this,"Welcome To Burger Zone",Toast.LENGTH_SHORT).show();
                myintent=new Intent(view.getContext(),BurgerActivity.class);

            }
            if(position==1) {
                myintent = new Intent(view.getContext(), BurgerActivity.class);
            }
            if(position==2) {
                myintent = new Intent(view.getContext(), BurgerActivity.class);
            }
            if(position==3) {
                myintent = new Intent(view.getContext(),BurgerActivity.class);
            }
            if(position==4) {
                myintent = new Intent(view.getContext(), BurgerActivity.class);
            }
            if(position==5) {
                myintent = new Intent(view.getContext(), BurgerActivity.class);
            }
            startActivity(myintent);
        });
    }
}