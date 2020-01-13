package com.example.xyz.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xyz.R;
import com.example.xyz.databinding.ActivityBangladeshPortalBinding;

public class BangladeshPortalActivity extends AppCompatActivity {
    ActivityBangladeshPortalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bangladesh_portal);


        binding.utilityBillCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BangladeshPortalActivity.this, UtilityBillActivity.class));
            }
        });
        binding.transportServiceCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BangladeshPortalActivity.this, TransportServiceActivity.class));
            }
        });
        binding.healthMinistryCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BangladeshPortalActivity.this, HealthMinistryActivity.class));
            }
        });
        binding.postalCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BangladeshPortalActivity.this, PostalActivity.class));
            }
        });
    }

}
