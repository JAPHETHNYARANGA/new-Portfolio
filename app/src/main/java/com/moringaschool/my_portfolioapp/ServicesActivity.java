package com.moringaschool.my_portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ServicesActivity extends AppCompatActivity {
    TextView Home, Skills, Portfolio, Contact;
    ImageView Design, Web, Android;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Design = findViewById(R.id.DesignImage);
        Web = findViewById(R.id.WebDesignImage);
        Android = findViewById(R.id.AndroidDesignImage);

        Home = findViewById(R.id.Home);
        Skills = findViewById(R.id.Skills);
        Portfolio = findViewById(R.id.Portfolio);
        Contact = findViewById(R.id.Contact);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ServicesActivity.this,MainActivity.class));
            }
        });
        Skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ServicesActivity.this,SkillsActivity.class));
            }
        });
        Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ServicesActivity.this,PortfolioActivity.class));
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ServicesActivity.this,ContactActivity.class));
            }
        });

        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyq_VG4oz6bcZHi-l6EIkt_rlEoQx_c3gU91p1f6Jh7wjOoPDpQf2EAQmj19s3_pABaxc&usqp=CAU")
                .resize(250, 250)
                .into(Design);
        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKjZK8A5XVcmKgZq_5Ak7O9bkBR-cJ35z4PqpNIyBaaTaN7GBgYGL5QcBcU2Xlba05hrU&usqp=CAU")
                .resize(250, 250)
                .into(Web);

        Picasso.get()
                .load("https://i.pinimg.com/236x/dd/f8/bf/ddf8bf41277600bb895fa812b5df4136.jpg")
                .resize(250, 250)
                .into(Android);
    }
}