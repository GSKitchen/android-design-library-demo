package com.example.kfc.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.kfc.fragment.PastaFragment;
import com.example.kfc.fragment.PizzaFragment;
import com.example.kfc.fragment.StoreFragment;
import com.example.kfc.fragment.TopFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new TopFragment();
            case 1:
                return new PizzaFragment();
            case 2:
                return new PastaFragment();
            case 3:
                return new StoreFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
