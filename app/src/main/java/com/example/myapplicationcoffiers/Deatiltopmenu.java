package com.example.myapplicationcoffiers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;


public class Deatiltopmenu extends AppCompatActivity {
    private ImageView gambarMenuTop,MenuTopImg;
    private TextView topstitle;
    private RecyclerView menudetailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatiltopmenu);
        // Set menutop Recler View
        // Set menucoffe Recler View
        menudetailList = findViewById(R.id.rv_etails);
        List<detaiMenuCV> ldata = new ArrayList<>();
        ldata.add(new detaiMenuCV("Hot Coffe", R.drawable.coffebar));
        ldata.add(new detaiMenuCV("Coffe Ice Cream", R.drawable.barista1));
        ldata.add(new detaiMenuCV("Coffe Pack", R.drawable.kemasancoffe));
        ldata.add(new detaiMenuCV("Donuts", R.drawable.jco));
        ldata.add(new detaiMenuCV("Coffe Beans", R.drawable.beans1));
        ldata.add(new detaiMenuCV("coffee cookies ",R.drawable.coffecokies));
        detailMenuAdapter detailMenuAdapter  = new detailMenuAdapter(this,ldata);
        menudetailList.setAdapter(detailMenuAdapter);
        menudetailList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //call data from void intops
        intops();
    }

    void intops(){
        //get data from  adapter top
        String itemMenu = getIntent().getExtras().getString("Keterangan");
        int imageMenu = getIntent().getExtras().getInt("imgUrl");
        int imagecover = getIntent().getExtras().getInt("imgCover");
        gambarMenuTop = findViewById(R.id.foto_rv_menuDetails);
        // set glide
        Glide.with(this).load(imageMenu).into(gambarMenuTop);
        gambarMenuTop.setImageResource(imageMenu);
        MenuTopImg = findViewById(R.id.Bgimageview);
        // set glide 2
        Glide.with(this).load(imagecover).into(MenuTopImg);
        topstitle = findViewById(R.id.text_titleMenuDetails);
//        topstitle.setText(itemMenu);
////        getSupportActionBar().setTitle(itemMenu); error code


    }

}