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


public class DesignFragment extends Fragment {

   private View view;
    private ImageView design1, design2, design3, design4, design5, design6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_design, container, false);

        design1 = view.findViewById(R.id.design1);
        design2 = view.findViewById(R.id.design2);
        design3 = view.findViewById(R.id.design3);
        design4 = view.findViewById(R.id.design4);
        design5 = view.findViewById(R.id.design5);
        design6 = view.findViewById(R.id.design6);


        design1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.figma.com/file/B9AvUEV9tO21dghftYybMd/Untitled"));
                startActivity(intent);

            }
        });
        design2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.figma.com/file/rm4W52zdZRHMTrfWrjj6kf/MyPortfolioFromDEC-2021?node-id=0%3A1"));
                startActivity(intent);

            }
        });
        design3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.figma.com/file/SzJVOYFJpTN3pHNNFF5AjE/HTMLCSSYOUTUBE"));
                startActivity(intent);

            }
        });
        design4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.figma.com/file/SUbit2EEaqJ3QBksmULx6K/Portfolio"));
                startActivity(intent);

            }
        });
        design5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.figma.com/file/IvEe0Z8Gh2JkzxWD2oSgzP/Untitled"));
                startActivity(intent);

            }
        });
        design6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.figma.com/file/4vm30ZJzmUIgDOQvQNxyuH/classified-website-django1"));
                startActivity(intent);

            }
        });


        return view;
    }
}