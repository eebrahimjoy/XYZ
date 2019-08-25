package com.example.xyz.view.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.example.xyz.R;
import com.example.xyz.databinding.FragmentMoreBinding;
import com.example.xyz.otherClasses.SharedPref;
import com.example.xyz.otherClasses.StaticKeys;
import com.example.xyz.view.activity.HomeActivity;

import java.util.Locale;


public class MoreFragment extends Fragment {
    private FragmentMoreBinding binding;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    public MoreFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_more, container, false);
        View view = binding.getRoot();

        initialize();

        String languageType = sharedPreferences.getString(SharedPref.LANGUAGE_TYPE, "");
        if (!languageType.equals("")) {
            setLocal(languageType);
        }

        if (languageType.equals(StaticKeys.BENGALI)) {
            binding.englishRB.setChecked(false);
            binding.englishRB.setTextColor(getResources().getColor(R.color.gray_light));
            binding.banglaRB.setTextColor(getResources().getColor(R.color.colorPrimary));
            binding.banglaRB.setChecked(true);
        } else if (languageType.equals(StaticKeys.ENGLISH)) {
            binding.banglaRB.setTextColor(getResources().getColor(R.color.gray_light));
            binding.englishRB.setTextColor(getResources().getColor(R.color.colorPrimary));
            binding.banglaRB.setChecked(false);
            binding.englishRB.setChecked(true);
        } else {
            binding.banglaRB.setTextColor(getResources().getColor(R.color.gray_light));
            binding.englishRB.setTextColor(getResources().getColor(R.color.colorPrimary));
            binding.banglaRB.setChecked(false);
            binding.englishRB.setChecked(true);
        }


        binding.banglaRB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    binding.englishRB.setChecked(false);
                    binding.englishRB.setTextColor(getResources().getColor(R.color.gray_light));
                    binding.banglaRB.setTextColor(getResources().getColor(R.color.black));
                    setLocal(StaticKeys.BENGALI);
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                }

            }
        });
        binding.englishRB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    binding.banglaRB.setChecked(false);
                    binding.banglaRB.setTextColor(getResources().getColor(R.color.gray_light));
                    binding.englishRB.setTextColor(getResources().getColor(R.color.black));
                    setLocal(StaticKeys.ENGLISH);
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }

            }
        });


        return view;
    }

    private void initialize() {
        sharedPreferences = getActivity().getSharedPreferences(SharedPref.SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    private void setLocal(String type) {

        Locale locale = new Locale(type);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getActivity().getBaseContext().getResources().updateConfiguration(config, getActivity().getBaseContext().getResources().getDisplayMetrics());

        editor.putString(SharedPref.LANGUAGE_TYPE, type);
        editor.apply();
    }


}