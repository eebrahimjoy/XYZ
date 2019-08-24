package com.example.xyz.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.xyz.Interface.OnMenuItemClickedListener;
import com.example.xyz.R;
import com.example.xyz.databinding.ActivityHomeBinding;
import com.example.xyz.otherClasses.SharedPref;
import com.example.xyz.otherClasses.StaticKeys;
import com.example.xyz.view.fragment.BoxFragment;
import com.example.xyz.view.fragment.HomeFragment;
import com.example.xyz.view.fragment.MessengerFragment;
import com.example.xyz.view.fragment.MoreFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity implements OnMenuItemClickedListener {

    private ActivityHomeBinding binding;
    private int currentPage = 0;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        initialize();

        String languageType = sharedPreferences.getString(SharedPref.LANGUAGE_TYPE, "");
        if (!languageType.equals("")) {
            setLocal(languageType);
        } else {
            setLocal(StaticKeys.ENGLISH);
        }

        binding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        replaceFragment(new HomeFragment(this, binding.navigation));
        currentPage = 0;


    }

    private void initialize() {
        sharedPreferences = getSharedPreferences(SharedPref.SHARED_PREFERENCE_NAME, MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (currentPage != 0) {
                        currentPage = 0;
                        replaceFragment(new HomeFragment(HomeActivity.this, binding.navigation));
                    }
                    return true;
                case R.id.navigation_messenger:
                    if (currentPage != 1) {
                        currentPage = 1;
                        replaceFragment(new MessengerFragment());
                    }
                    return true;
                case R.id.navigation_box:
                    if (currentPage != 2) {
                        currentPage = 2;
                        replaceFragment(new BoxFragment());
                    }
                    return true;
                case R.id.navigation_setting:
                    if (currentPage != 3) {
                        currentPage = 3;
                        replaceFragment(new MoreFragment());
                    }
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }

    @Override
    public void onClicked(View view) {
        view.performClick();

    }

    private void setLocal(String type) {
        Locale locale = new Locale(type);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        editor.putString(SharedPref.LANGUAGE_TYPE, type);
        editor.apply();
    }
}
