package com.example.xyz.view.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xyz.Interface.OnMenuItemClickedListener;
import com.example.xyz.R;
import com.example.xyz.databinding.FragmentHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private OnMenuItemClickedListener onMenuItemClickedListener;
    private BottomNavigationView bottomNavigationView;

    public HomeFragment() {

    }

    @SuppressLint("ValidFragment")
    public HomeFragment(OnMenuItemClickedListener onMenuItemClickedListener, BottomNavigationView bottomNavigationView) {
        this.onMenuItemClickedListener = onMenuItemClickedListener;
        this.bottomNavigationView = bottomNavigationView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();

        binding.tab3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tab3Btn.setTextColor(getResources().getColor(R.color.colorPrimary));
                binding.tab3Btn.setBackgroundColor(getResources().getColor(R.color.white));
                replaceFragment(new Tab3Fragment());
            }
        });



        return view;


    }
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayoutInsideFragment,fragment);
        ft.commit();
    }

}
