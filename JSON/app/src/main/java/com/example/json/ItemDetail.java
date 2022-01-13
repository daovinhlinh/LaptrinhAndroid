package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ItemDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item_detail);
        ImageView avatar = findViewById(R.id.avatar);
        TextView username =  findViewById(R.id.username);
        TextView name =  findViewById(R.id.name);
        TextView email =  findViewById(R.id.email);
        TextView address =  findViewById(R.id.address);
        TextView phone =  findViewById(R.id.phone);
        TextView company =  findViewById(R.id.company);

        Picasso.get().load("https://lebavui.github.io" + getIntent().getStringExtra("avatar")).into(avatar);
        username.setText(getIntent().getStringExtra("username"));
        name.setText(getIntent().getStringExtra("name"));
        email.setText(getIntent().getStringExtra("email"));
        address.setText(getIntent().getStringExtra("address"));
        phone.setText(getIntent().getStringExtra("phone"));
        company.setText(getIntent().getStringExtra("company"));


    }
}