package com.example.xyz.view.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xyz.R;
import com.example.xyz.databinding.FragmentRightTabBinding;
import com.example.xyz.viewmodel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class RightTabFragment extends Fragment {
    private FragmentRightTabBinding binding;
    private HomeViewModel homeViewModel;

    public RightTabFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_right_tab, container, false);
        View view = binding.getRoot();

        init();

        //initRecyclerView();

        return view;
    }

    private void init() {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
    }



    private void initRecyclerView() {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
