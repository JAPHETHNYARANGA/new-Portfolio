package com.moringaschool.my_portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkillsActivity extends AppCompatActivity {
    TextView Services, Home, Portfolio, Contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);


        Home = findViewById(R.id.Home);
        Services = findViewById(R.id.Services);
        Portfolio = findViewById(R.id.Portfolio);
        Contact = findViewById(R.id.Contact);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkillsActivity.this,MainActivity.class));
            }
        });
        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkillsActivity.this,ServicesActivity.class));
            }
        });
        Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkillsActivity.this,PortfolioActivity.class));
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SkillsActivity.this,ContactActivity.class));
            }
        });
    }
}