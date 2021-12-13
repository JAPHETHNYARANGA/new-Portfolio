package com.japhethnyaranga.my_portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView Avatar;
    TextView Services, Skills, Portfolio, Contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Avatar = findViewById(R.id.Avatar);

        Services = findViewById(R.id.Services);
        Skills = findViewById(R.id.Skills);
        Portfolio = findViewById(R.id.Portfolio);
        Contact = findViewById(R.id.Contact);

        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ServicesActivity.class));
            }
        });
        Skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SkillsActivity.class));
            }
        });
        Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PortfolioActivity.class));
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ContactActivity.class));
            }
        });

//        Picasso.get()
//                .load("https://chingizpro.github.io/portfolio/img/person.png")
//                .placeholder(R.drawable.ic_launcher_background)
        Picasso.get().load("https://chingizpro.github.io/portfolio/img/person.png").into(Avatar);
    }
}