package com.japhethnyaranga.my_portfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.japhethnyaranga.my_portfolioapp.Fragments.AndroidAppsFragment;
import com.japhethnyaranga.my_portfolioapp.Fragments.DesignFragment;
import com.japhethnyaranga.my_portfolioapp.Fragments.websitesFragment;

public class PortfolioActivity extends AppCompatActivity {
    TextView Services, Home, Skills, Contact, Design, Website, AndroidApps;
    private FrameLayout framelayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Design = findViewById(R.id.Design);
        Website = findViewById(R.id.Websites);
        AndroidApps = findViewById(R.id.AndroidApps);

        Home = findViewById(R.id.Home);
        Services = findViewById(R.id.Services);
        Skills = findViewById(R.id.Skills);
        Contact = findViewById(R.id.Contact);
        framelayout = findViewById(R.id.frameLayout);

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

        Design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DesignFragment());
            }
        });
        AndroidApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new AndroidAppsFragment());
            }
        });
        Website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new websitesFragment());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}