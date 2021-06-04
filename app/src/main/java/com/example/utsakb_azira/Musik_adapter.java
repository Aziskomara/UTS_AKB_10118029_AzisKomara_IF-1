// Tanggal : 01 06 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Musik_adapter extends RecyclerView.Adapter<Musik_adapter.ListViewHolder> {
    private ArrayList<Friendly> listMusic;

    public Musik_adapter(ArrayList<Friendly> listM) {
        this.listMusic = listM;
    }


    @NonNull
    @NotNull
    @Override
    public Musik_adapter.ListViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_musik, parent,false);
        return new Musik_adapter.ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Musik_adapter.ListViewHolder holder, int position) {
        Friendly m = listMusic.get(position);
        holder.tv_music.setText(m.getMusic());
    }

    @Override
    public int getItemCount() {
        return listMusic.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tv_music;
        public ListViewHolder(View itemView) {
            super(itemView);
            tv_music = itemView.findViewById(R.id.TV_m);
        }
    }
}
