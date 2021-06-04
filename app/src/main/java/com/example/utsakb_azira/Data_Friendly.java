// Tanggal : 30 05 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira;

import android.provider.ContactsContract;

import androidx.recyclerview.widget.LinearLayoutManager;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Data_Friendly {

    private static String [] data_nama={
        "Rizki Maulana N",
         "Rifa Maulsns N",
         "Surya FH",
         "Suanda",
         "Rohman Hidayat"
    };

    private static String [] data_alamat={
         "TasikMalaya",
         "TasikMalaya",
         "Katapang",
         "Subang",
         "Subang"
    };

    private static int [] data_img={
            R.drawable.iki,
            R.drawable.rifa,
            R.drawable.surya,
            R.drawable.suanda,
            R.drawable.babay
    };

    private  static  String [] Data_kegiatan = {
            "Solat",
            "Makan",
            "Main Game",
            "Berdoa",
            "Nonton Film",
            "Jalan Jalan"
    };

    private static String [] Data_musik = {
            "Killing me inside",
            "It will rain",
            "Unstoppable",
            "To the bone",
            "Inocence Lisa",
            "Sayonara"
    };

    static ArrayList<Friendly> getListData(){
        ArrayList<Friendly> list = new ArrayList<>();
        for (int position = 0; position < data_nama.length; position++){
            Friendly friend = new Friendly();
            friend.setNama(data_nama[position]);
            friend.setAlamat(data_alamat[position]);
            friend.setPoto(data_img[position]);

            list.add(friend);
        }
        return list;
    }

    static  ArrayList<Friendly> getLiskegiatan(){
        ArrayList<Friendly> listDaily = new ArrayList<>();
        for (int position = 0; position < Data_kegiatan.length; position++){
            Friendly friend = new Friendly();
            friend.setKegiatan(Data_kegiatan[position]);

            listDaily.add(friend);
        }
        return  listDaily;
    }

    static ArrayList<Friendly> getListMusic(){
        ArrayList<Friendly> listMusic = new ArrayList<>();
        for(int position = 0; position < Data_musik.length; position++){
            Friendly music = new Friendly();
            music.setMusic(Data_musik[position]);
            listMusic.add(music);
        }
        return  listMusic;
    }


}
