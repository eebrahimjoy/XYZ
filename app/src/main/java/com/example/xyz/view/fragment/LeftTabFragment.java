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
import com.example.xyz.adapter.MultiTypeCompanyAdapter;
import com.example.xyz.databinding.FragmentLeftTabBinding;
import com.example.xyz.model.Company;
import com.example.xyz.viewmodel.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

import static com.example.xyz.otherClasses.CreateCompany.makeGenres;


public class LeftTabFragment extends Fragment {
    private FragmentLeftTabBinding binding;
    private HomeViewModel homeViewModel;
    private List<Company> companies;
    private List<Company> companyList;

    public LeftTabFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_left_tab, container, false);
        View view = binding.getRoot();

        init();

        getCompanyList();

        initRecyclerView();

        return view;
    }

    private void init() {
        companies = new ArrayList<>();
        companyList = new ArrayList<>();
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
    }

    private void getCompanyList() {

        MultiTypeCompanyAdapter adapter = new MultiTypeCompanyAdapter(makeGenres(), getActivity());
        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }


    private void initRecyclerView() {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
