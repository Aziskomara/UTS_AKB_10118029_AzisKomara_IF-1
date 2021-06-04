// Tanggal : 26 05 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.utsakb_azira.R;

public class PageFragment2 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.page2,container,false);

        return rootView;
    }
}
