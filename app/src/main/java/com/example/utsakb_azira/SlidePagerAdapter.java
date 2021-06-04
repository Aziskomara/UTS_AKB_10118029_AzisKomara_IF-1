// Tanggal : 26 05 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SlidePagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public SlidePagerAdapter(FragmentManager fm,List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
