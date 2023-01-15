package com.example.myapplicationcoffiers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class home extends AppCompatActivity implements MenutopOnClickListener{
    // set menu rycler
    private RecyclerView menuRV;
    //set slider content penawaran
    private List<sliders> sliescontent;
    // set second menu rycler Cake
    private RecyclerView cakeRv;
    //set viewpager1
    private ViewPager sliderpagers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Set menutop Recler View
        menuRV = findViewById(R.id.rv_menutop);
        // Set menucoffe Recler View
        cakeRv = findViewById(R.id.rv_item);
        sliderpagers = findViewById(R.id.slider_img);
        List<MenuTop> lmenu = new ArrayList<>();
        lmenu.add(new MenuTop("Hot Coffe",R.drawable.hotcoffe,R.drawable.coffebar));
        lmenu.add(new MenuTop("Coffe Ice Cream",R.drawable.coffeicream,R.drawable.barista1));
        lmenu.add(new MenuTop("Coffe Pack",R.drawable.coffepack,R.drawable.kemasancoffe));
        lmenu.add(new MenuTop("Donuts",R.drawable.donat,R.drawable.jco));
        lmenu.add(new MenuTop("Coffe Beans",R.drawable.coffebeans1,R.drawable.beans1));
        lmenu.add(new MenuTop("coffee cookies ",R.drawable.coffecokies));
        AdapterMenuTop adapterMenuTop  = new AdapterMenuTop(this,lmenu,this);
        menuRV.setAdapter(adapterMenuTop);
        menuRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        // Set Item View Pager
        sliescontent = new ArrayList<>();
        sliescontent.add(new sliders(R.drawable.promostarbuks,"Promo Dari Starbuks Ambil Sekarang"));
        sliescontent.add(new sliders(R.drawable.kopiluak,"Variant Baru Dari Gayo Coffe Cek Sekarang"));
        sliescontent.add(new sliders(R.drawable.coffirsnatalesimg,"Natal Telah Tiba Cek Promo Sekarang Yuk"));
        sliescontent.add(new sliders(R.drawable.cabellocoffe,"Ada Yang Baru Dari Carabello Coffe Cek Skuy"));
        slidersAdapter adapter = new slidersAdapter(this,sliescontent);
        sliderpagers.setAdapter(adapter);
        //Set Timer For Sliders
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new home.timer(), 3000,6000);

        List<Cake> lcake = new ArrayList<>();
        lcake.add(new Cake("Cup Cake",R.drawable.cupcake));
        lcake.add(new Cake("Brownies",R.drawable.coffebrownies));
        CakeAdapter cakeAdapter  = new CakeAdapter(this,lcake);
        cakeRv.setAdapter(cakeAdapter);
        cakeRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


    }


    public void munculpopup(View view) {
        BottomSheetDialog bottomSheetDialog= new BottomSheetDialog(
                home.this, R.style.BottomSheetDialogThemes
        );
        View bottomview = LayoutInflater.from(getApplicationContext()).inflate(
                R.layout.layoutpopupbottom,(LinearLayout)findViewById(R.id.popupbuy)
        );
        bottomview.findViewById(R.id.imageViewlove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(home.this,"Add Favorite Succes",Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomview);
        bottomSheetDialog.show();
    }
    public void munculpopup2(View view) {
        BottomSheetDialog bottomSheetDialog= new BottomSheetDialog(
                home.this, R.style.BottomSheetDialogThemes
        );
        View bottomview = LayoutInflater.from(getApplicationContext()).inflate(
                R.layout.layoutpopupbottom2,(LinearLayout)findViewById(R.id.popupbuy)
        );
        bottomview.findViewById(R.id.imageViewlove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(home.this,"Add Favorite Succes",Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomview);
        bottomSheetDialog.show();
    }

    @Override
    public void onMenutopClick(MenuTop menuTop, ImageView menutopImageView) {
        Intent intent = new Intent(this,Deatiltopmenu.class);
        intent.putExtra("title",menuTop.getKeterangan());
        intent.putExtra("imgUrl",menuTop.getGambarmenu());
        intent.putExtra("imgCover",menuTop.getCoverPhoto());
        // Make Animation Enter
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(home.this, menutopImageView,"transition");
        startActivity(intent,options.toBundle());
        Toast.makeText(this,""+menuTop.getKeterangan(),Toast.LENGTH_SHORT).show();


    }

    // Set timer
    public class timer extends TimerTask {
        @Override
        public void run() {
            home.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(sliderpagers.getCurrentItem()<sliescontent.size()-1){
                        sliderpagers.setCurrentItem(sliderpagers.getCurrentItem()+1);
                    }
                    else
                        sliderpagers.setCurrentItem(0);
                }
            });
        }
    }
}