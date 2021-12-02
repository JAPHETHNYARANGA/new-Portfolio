package com.moringaschool.my_portfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ContactActivity extends AppCompatActivity {
    TextView Services, Home, Skills, Portfolio;
    ImageView linkdn, github , twitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        linkdn = findViewById(R.id.Linkdn);
        github = findViewById(R.id.Github);
        twitter = findViewById(R.id.Twitter);

        Home = findViewById(R.id.Home);
        Services = findViewById(R.id.Services);
        Skills = findViewById(R.id.Skills);
        Portfolio = findViewById(R.id.Portfolio);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContactActivity.this,MainActivity.class));
            }
        });
        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContactActivity.this,ServicesActivity.class));
            }
        });
        Skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContactActivity.this,SkillsActivity.class));
            }
        });
        Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContactActivity.this,PortfolioActivity.class));
            }
        });
        Picasso.get()
                .load("https://i.pinimg.com/736x/4a/8d/44/4a8d44d6f63a89d7de81add721e7cf22.jpg")
                .resize(150, 150)
                .into(linkdn);

        Picasso.get()
                .load("https://i.pinimg.com/236x/84/3d/d8/843dd8ca717a56cfc9a615df10d39944.jpg")
                .resize(150, 150)
                .into(twitter);

        Picasso.get()
                .load("https://i.pinimg.com/236x/95/7c/4d/957c4dd9aa815cc1de2040cc1259589f.jpg")
                .resize(150, 150)
                .into(github);
    }
}