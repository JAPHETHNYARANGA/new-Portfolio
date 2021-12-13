package com.japhethnyaranga.my_portfolioapp.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.japhethnyaranga.my_portfolioapp.R;

public class AndroidAppsFragment extends Fragment {
    private View view;
    private ImageView ExchangeRateApp;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_android_apps, container, false);

       ExchangeRateApp = view.findViewById(R.id.ExchangeRateApp);

        ExchangeRateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.moringaschool.exchangerateapp"));
                startActivity(intent);
            }


        });



        return view;
    }
}