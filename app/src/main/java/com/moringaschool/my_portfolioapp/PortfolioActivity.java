package com.moringaschool.my_portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PortfolioActivity extends AppCompatActivity {
    TextView Services, Home, Skills, Contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Home = findViewById(R.id.Home);
        Services = findViewById(R.id.Services);
        Skills = findViewById(R.id.Skills);
        Contact = findViewById(R.id.Contact);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PortfolioActivity.this,MainActivity.class));
            }
        });
        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PortfolioActivity.this,ServicesActivity.class));
            }
        });
        Skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PortfolioActivity.this,SkillsActivity.class));
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PortfolioActivity.this,ContactActivity.class));
            }
        });
    }
}