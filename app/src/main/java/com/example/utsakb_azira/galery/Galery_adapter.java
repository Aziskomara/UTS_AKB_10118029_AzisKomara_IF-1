// Tanggal : 01 06 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira.galery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utsakb_azira.R;
import com.makeramen.roundedimageview.RoundedImageView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Galery_adapter extends RecyclerView.Adapter<Galery_adapter.GaleryViewHolder>{

    private List<Galery_item> galery_items;

    public Galery_adapter(List<Galery_item> galery_items) {
        this.galery_items = galery_items;
    }

    @NonNull
    @NotNull
    @Override
    public GaleryViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new GaleryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_poto_galery,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Galery_adapter.GaleryViewHolder holder, int position) {

        holder.setPostImage(galery_items.get(position));

    }

    @Override
    public int getItemCount() {
        return galery_items.size();
    }

    class GaleryViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView imageview;

        GaleryViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.poto_galeri);
        }

        void setPostImage(Galery_item galery_item) {

            imageview.setImageResource(galery_item.getImage());
        }
    }
}
