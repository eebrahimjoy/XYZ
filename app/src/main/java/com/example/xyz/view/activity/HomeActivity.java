package com.example.xyz.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.xyz.Interface.OnMenuItemClickedListener;
import com.example.xyz.R;
import com.example.xyz.databinding.ActivityHomeBinding;
import com.example.xyz.view.fragment.BoxFragment;
import com.example.xyz.view.fragment.HomeFragment;
import com.example.xyz.view.fragment.MessengerFragment;
import com.example.xyz.view.fragment.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements OnMenuItemClickedListener {

    private ActivityHomeBinding binding;
    private int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        binding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        replaceFragment(new HomeFragment(this,binding.navigation));
        currentPage = 0;


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (currentPage!=0){
                        currentPage = 0;
                        replaceFragment(new HomeFragment(HomeActivity.this,binding.navigation));
                    }
                    return true;
                case R.id.navigation_messenger:
                    if (currentPage!=1){
                        currentPage = 1;
                        replaceFragment(new MessengerFragment());
                    }
                    return true;
                case R.id.navigation_box:
                    if (currentPage!=2){
                        currentPage = 2;
                        replaceFragment(new BoxFragment());
                    }
                    return true;
                case R.id.navigation_setting:
                    if (currentPage!=3){
                        currentPage = 3;
                        replaceFragment(new SettingsFragment());
                    }
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
        ft.commit();
    }

    @Override
    public void onClicked(View view) {
        view.performClick();

    }
}
