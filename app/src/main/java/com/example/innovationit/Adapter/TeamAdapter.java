package com.example.innovationit.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.innovationit.R;
import com.example.innovationit.model.OurTeam;
import com.example.innovationit.model.Product;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    private List<OurTeam> ourTeams;
    private Context context;

    public TeamAdapter(List<OurTeam> ourTeams, Context context) {
        this.ourTeams = ourTeams;
        this.context = context;
    }


    @NonNull
    @Override
    public TeamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ourteam_sample_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.ViewHolder holder, int position) {

        OurTeam ourTeam = ourTeams.get(position);
        holder.employeeImageIV.setImageResource(ourTeam.getEmployeeImageIV());
        holder.nameTV.setText(ourTeam.getNameTV());
        holder.postNameTV.setText(ourTeam.getPostNameTV());
        holder.educationTV.setText(ourTeam.getEducationTV());
        holder.phoneNumberTV.setText(ourTeam.getPhoneNumberTV());

    }

    @Override
    public int getItemCount() {
        return ourTeams.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView employeeImageIV;
        TextView nameTV,postNameTV,educationTV,phoneNumberTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            employeeImageIV = itemView.findViewById(R.id.employeeImageIV);
            nameTV = itemView.findViewById(R.id.nameTV);
            postNameTV = itemView.findViewById(R.id.postNameTV);
            educationTV = itemView.findViewById(R.id.educationTV);
            phoneNumberTV = itemView.findViewById(R.id.phoneNumberTV);
        }
    }
}
