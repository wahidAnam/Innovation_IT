package com.example.innovationit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.innovationit.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.SliderView> {

    private List<Product> sliderItems;
    private Context context;


    public ProductAdapter(List<Product> sliderItems, Context context) {
        this.sliderItems = sliderItems;
        this.context = context;
    }

    @NonNull
    @Override
    public SliderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.demo_page,
                        parent,false);
        return new SliderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderView holder, int position) {

        Product product = sliderItems.get(position);
        holder.detailsID.setText(product.getDetailsID());
        holder.imageID.setImageResource(product.getImageID());

    }

    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    public class SliderView extends RecyclerView.ViewHolder {

        private ImageView imageID;
        private TextView detailsID;
        public SliderView(@NonNull View itemView) {
            super(itemView);

            imageID = itemView.findViewById(R.id.imageID);
            detailsID = itemView.findViewById(R.id.detailsID);
        }
    }
}
