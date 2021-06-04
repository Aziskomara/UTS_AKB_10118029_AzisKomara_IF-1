// Tanggal : 30 05 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFriendly_adapter extends RecyclerView.Adapter<ListFriendly_adapter.ListViewHolder> {
    private ArrayList<Friendly> list_teman;

    public ListFriendly_adapter(ArrayList<Friendly> list){
        this.list_teman = list;

    }
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friendlist, parent, false);


        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ListFriendly_adapter.ListViewHolder holder, int position) {
        Friendly fr = list_teman.get(position);
        Glide.with(holder.itemView.getContext())
                .load(fr.getPoto())
                .apply(new RequestOptions().override(80,80))
                .into(holder.ImgPhoto);
        holder.tv_nama.setText(fr.getNama());
        holder.tv_alamat.setText(fr.getAlamat());
    }


    @Override
    public int getItemCount() {
        return list_teman.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView ImgPhoto;
        TextView tv_nama,tv_alamat;

        ListViewHolder(View itemview) {
            super(itemview);

            ImgPhoto = itemview.findViewById(R.id.img_friend);
            tv_nama  = itemview.findViewById(R.id.nama_tv);
            tv_alamat= itemview.findViewById(R.id.alamat_tv);
        }
    }
}
