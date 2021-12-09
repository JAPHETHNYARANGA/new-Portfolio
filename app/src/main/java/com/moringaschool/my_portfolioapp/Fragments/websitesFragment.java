package com.moringaschool.my_portfolioapp.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.moringaschool.my_portfolioapp.R;
import com.squareup.picasso.Picasso;


public class websitesFragment extends Fragment {
    private View view;
    private ImageView delani, pizza, soon1,soon2,soon3,soon4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_websites, container, false);
        delani = view.findViewById(R.id.delani);
        pizza = view.findViewById(R.id.pizza);
        soon1 = view.findViewById(R.id.soon1);
        soon2 = view.findViewById(R.id.soon2);
        soon3 = view.findViewById(R.id.soon3);
        soon4 = view.findViewById(R.id.soon4);


        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSX1g4OhoBN3M4Sfnj0i6ibwbmw_Q6SHKltw&usqp=CAU").resize(200, 200).into(delani);

        Picasso.get().load("https://i.pinimg.com/236x/0b/bc/7f/0bbc7f8893b630538bc4de00879f1cae.jpg").resize(200, 200).into(pizza);
        Picasso.get().load("https://i.pinimg.com/236x/97/f3/80/97f380ab4315257d9202dfbd23c4ebd9.jpg").resize(200, 200).into(soon1);
        Picasso.get().load("https://i.pinimg.com/236x/d2/61/0c/d2610cce8f7f697c6bdd84da4f95b694.jpg").resize(200, 200).into(soon2);
        Picasso.get().load("https://i.pinimg.com/236x/a6/4e/fd/a64efdf5a4be30ba38fd0190f4a51339.jpg").resize(200, 200).into(soon3);
        Picasso.get().load("https://i.pinimg.com/236x/73/12/0c/73120c2dda7de90253404e9655177f5c.jpg").resize(200, 200).into(soon4);

        delani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://japhethnyaranga.github.io/Delanistudio/"));
                        startActivity(intent);

            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://japhethnyaranga.github.io/Pizza-project/"));
                startActivity(intent);

            }
        });

        soon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://japhethnyaranga.github.io/Akan-project/"));
                startActivity(intent);

            }
        });




        soon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://japhethnyaranga.github.io/PluralPright/"));
                startActivity(intent);

            }
        });

        soon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://japhethnyaranga.github.io/Dog-Api/"));
                startActivity(intent);

            }
        });


        soon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://japhethnyaranga.github.io/Reviews-javascript/"));
                startActivity(intent);

            }
        });





        return view;
    }
}