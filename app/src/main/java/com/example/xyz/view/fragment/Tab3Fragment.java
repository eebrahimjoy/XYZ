package com.example.xyz.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xyz.R;
import com.example.xyz.adapter.ViewPagerAdapter;
import com.example.xyz.databinding.FragmentTab3Binding;

import static android.content.Context.MODE_PRIVATE;

public class Tab3Fragment extends Fragment {
    private FragmentTab3Binding binding;
    private ViewPagerAdapter adapter;
    private Context getActivity;


    public Tab3Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tab3, container, false);

        initialize();
        initTab();
        return binding.getRoot();
    }

    private void initialize() {
        getActivity = this.getActivity();
        adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
    }

    private void initTab() {
        adapter.addFragment(new LeftTabFragment(), getActivity.getResources().getString(R.string.leftTab));
        adapter.addFragment(new RightTabFragment(),getActivity.getResources().getString(R.string.rightTab));
        binding.viewPagerId.setAdapter(adapter);
        binding.tabLayoutId.setupWithViewPager(binding.viewPagerId);
    }



}
