// Tanggal : 30 05 2021
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

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Daily_adapter extends RecyclerView.Adapter<Daily_adapter.ListViewHolder> {
    private ArrayList<Friendly> listDaily;

    public Daily_adapter(ArrayList<Friendly> list){
        this.listDaily = list;
    }
    @NonNull
    @NotNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Daily_adapter.ListViewHolder holder, int position) {
        Friendly f = listDaily.get(position);
        holder.tv_kegiatan.setText(f.getKegiatan());

    }

    @Override
    public int getItemCount() {
        return listDaily.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_kegiatan;
        ListViewHolder(View itemview) {
            super(itemview);
            tv_kegiatan = itemview.findViewById(R.id.TV_k);
        }
    }
}
