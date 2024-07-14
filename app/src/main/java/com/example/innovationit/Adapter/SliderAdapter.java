package com.example.innovationit.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.innovationit.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderViewHolder> {


    private int[] images;
    private String[] text;

    public SliderAdapter(int[] images, String[] text) {
        this.images = images;
        this.text = text;
    }
    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item_layout,null,false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {

        viewHolder.imageViewID.setImageResource(images[position]);
        viewHolder.textDescTV.setText(text[position]);

    }

    @Override
    public int getCount() {
        return  images.length;
    }

    public class SliderViewHolder extends SliderAdapter.ViewHolder {

        private ImageView imageViewID;
        private TextView textDescTV;

        public SliderViewHolder(View itemView) {
            super(itemView);
            imageViewID = itemView.findViewById(R.id.imageViewID);
            textDescTV = itemView.findViewById(R.id.textDescTV);
        }
    }
}
