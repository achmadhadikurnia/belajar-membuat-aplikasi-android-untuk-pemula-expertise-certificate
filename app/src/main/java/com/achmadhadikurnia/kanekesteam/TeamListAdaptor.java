package com.achmadhadikurnia.kanekesteam;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class TeamListAdaptor extends RecyclerView.Adapter<TeamListAdaptor.ListViewHolder> {
    private ArrayList<Team> listTeam;

    public TeamListAdaptor(ArrayList<Team> list) {
        this.listTeam = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_team_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Team team = listTeam.get(position);
        Glide.with(holder.itemView.getContext())
                .load(team.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imageView_team_avatar);
        holder.textView_team_name.setText(team.getName());
        holder.textView_team_job.setText(team.getJob());

        holder.button_team_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Email: " +
                        listTeam.get(holder.getAdapterPosition()).getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTeam.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView_team_avatar;
        TextView textView_team_name, textView_team_job;
        Button button_team_detail;

        ListViewHolder(View itemView) {
            super(itemView);
            imageView_team_avatar = itemView.findViewById(R.id.imageView_team_avatar);
            textView_team_name = itemView.findViewById(R.id.textView_team_name);
            textView_team_job = itemView.findViewById(R.id.textView_team_job);
            button_team_detail = itemView.findViewById(R.id.button_team_detail);
        }
    }
}
