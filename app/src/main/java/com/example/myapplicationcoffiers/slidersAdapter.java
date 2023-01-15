package com.example.myapplicationcoffiers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class slidersAdapter extends PagerAdapter {
    private Context context;
    private List<sliders> mdatalist;

    public slidersAdapter(Context context, List<sliders> mdatalist) {
        this.context = context;
        this.mdatalist = mdatalist;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View LayoutslidesSize = inflater.inflate(R.layout.activity_item_slide,null);
        ImageView imageViewslides = LayoutslidesSize.findViewById(R.id.main_contentSLide);
        TextView textView = LayoutslidesSize.findViewById(R.id.title_slide);
        imageViewslides.setImageResource(mdatalist.get(position).getImage());
        textView.setText(mdatalist.get(position).getTitle());
        container.addView(LayoutslidesSize);
        return LayoutslidesSize;
    }

    @Override
    public int getCount() {
        return mdatalist.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object) ;
    }
}
