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

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.myCakelist> {
    Context context;
    List<Cake>mdatacake;

    public CakeAdapter(Context context, List<Cake> mdatacake) {
        this.context = context;
        this.mdatacake = mdatacake;
    }

    @NonNull
    @Override
    public myCakelist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cake,parent,false);
        return new myCakelist(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myCakelist holder, int position) {
        holder.titlecake.setText(mdatacake.get(position).getTitle_cake());
        holder.gambarcake.setImageResource(mdatacake.get(position).getGambar_cake());
    }

    @Override
    public int getItemCount() {
        return mdatacake.size();
    }

    public class myCakelist extends RecyclerView.ViewHolder {
        private TextView titlecake;
        private ImageView gambarcake;
        public myCakelist(@NonNull View itemView) {
            super(itemView);
            titlecake = itemView.findViewById(R.id.titlescake);
            gambarcake = itemView.findViewById(R.id.gambar_cake);
        }
    }
}
