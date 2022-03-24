package com.example.innovationit;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.innovationit.model.Client;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.ViewHolder> {

    private Context context;
    private List<Client> clientList;

    public ClientAdapter(Context context, List<Client> clientList) {
        this.context = context;
        this.clientList = clientList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.client_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Client client = clientList.get(position);
        holder.imageFTB.setImageResource(client.getImageFTB());
        holder.nameTV.setText(client.getNameTV());

    }

    @Override
    public int getItemCount() {
        return clientList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTV;
        private FloatingActionButton imageFTB;
        public ViewHolder(@NonNull View view) {
            super(view);
            nameTV = view.findViewById(R.id.nameTV);
            imageFTB = view.findViewById(R.id.imageFTB);
        }
    }
}
