package com.example.myapplicationcoffiers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMenuTop extends RecyclerView.Adapter<AdapterMenuTop.mymenulist> {
    Context context;
    List<MenuTop>mdataMenuData;
    MenutopOnClickListener menutopOnClickListener;

    public AdapterMenuTop(Context context, List<MenuTop> mdataMenuData,MenutopOnClickListener listener) {
        this.context = context;
        this.mdataMenuData = mdataMenuData;
        menutopOnClickListener = listener;
    }

    public AdapterMenuTop(Deatiltopmenu context, List<detaiMenuCV> ldata) {
    }

    @NonNull
    @Override
    public mymenulist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_coffiers,parent,false);
        return new mymenulist(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mymenulist holder, int position) {
        holder.Menutitles.setText(mdataMenuData.get(position).getKeterangan());
        holder.gambarMenuCoffiers.setImageResource(mdataMenuData.get(position).getGambarmenu());
    }

    @Override
    public int getItemCount() {
        return mdataMenuData.size();
    }

    public class mymenulist extends RecyclerView.ViewHolder{
        private TextView Menutitles;
        private ImageView gambarMenuCoffiers;
        public mymenulist(@NonNull View itemView) {
            super(itemView);
            Menutitles = itemView.findViewById(R.id.text_titleMenu);
            gambarMenuCoffiers = itemView.findViewById(R.id.foto_rv_menu);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    menutopOnClickListener.onMenutopClick(mdataMenuData.get(getAdapterPosition()),gambarMenuCoffiers);
                }
            });
        }
    }
}
