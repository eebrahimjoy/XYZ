package com.example.xyz.view.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.xyz.Interface.OnMenuItemClickedListener;
import com.example.xyz.R;
import com.example.xyz.databinding.FragmentHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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

                binding.tab1Btn.setTextColor(getResources().getColor(R.color.white));
                binding.tab1Btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.tab2Btn.setTextColor(getResources().getColor(R.color.white));
                binding.tab2Btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                replaceFragment(new Tab3Fragment());
            }
        });

        binding.tab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tab1Btn.setTextColor(getResources().getColor(R.color.colorPrimary));
                binding.tab1Btn.setBackgroundColor(getResources().getColor(R.color.white));

                binding.tab3Btn.setTextColor(getResources().getColor(R.color.white));
                binding.tab3Btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.tab2Btn.setTextColor(getResources().getColor(R.color.white));
                binding.tab2Btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                replaceFragment(new Tab1Fragment());
            }
        });

        binding.tab2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tab2Btn.setTextColor(getResources().getColor(R.color.colorPrimary));
                binding.tab2Btn.setBackgroundColor(getResources().getColor(R.color.white));

                binding.tab3Btn.setTextColor(getResources().getColor(R.color.white));
                binding.tab3Btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.tab1Btn.setTextColor(getResources().getColor(R.color.white));
                binding.tab1Btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                replaceFragment(new Tab1Fragment());
            }
        });
        binding.tab4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "" + getActivity().getResources().getString(R.string.under_development), Toast.LENGTH_SHORT).show();
            }
        });

        binding.tab5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "" + getActivity().getResources().getString(R.string.under_development), Toast.LENGTH_SHORT).show();
            }
        });
        binding.tab6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "" + getActivity().getResources().getString(R.string.under_development), Toast.LENGTH_SHORT).show();
            }
        });


        return view;


    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayoutInsideFragment, fragment);
        ft.commit();
    }

}
