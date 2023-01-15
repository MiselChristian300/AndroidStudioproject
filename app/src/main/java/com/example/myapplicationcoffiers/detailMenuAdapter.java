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

public class detailMenuAdapter extends RecyclerView.Adapter<detailMenuAdapter.mymenudetailMenuAdapter> {
    Context context;
    List<detaiMenuCV>mdata_detailMenuCV;

    public detailMenuAdapter(Context context, List<detaiMenuCV> mdata_detailMenuCV) {
        this.context = context;
        this.mdata_detailMenuCV = mdata_detailMenuCV;
    }

    @NonNull
    @Override
    public mymenudetailMenuAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_coffedetails,parent,false);
        return new detailMenuAdapter.mymenudetailMenuAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mymenudetailMenuAdapter holder, int position) {
        holder.titlleitemlist.setText(mdata_detailMenuCV.get(position).getTitle());
        holder.gambaritemlist.setImageResource(mdata_detailMenuCV.get(position).getGambarcoffe());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class mymenudetailMenuAdapter extends RecyclerView.ViewHolder {
        private TextView titlleitemlist;
        private ImageView gambaritemlist;
        public mymenudetailMenuAdapter(@NonNull View itemView) {
            super(itemView);
            titlleitemlist = itemView.findViewById(R.id.titlescake);
            gambaritemlist = itemView.findViewById(R.id.gambar_cake);
        }

    }
}
