package com.example.xyz.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityPostalBinding;
import com.example.xyz.databinding.ActivityTrageryBinding;

import java.util.ArrayList;
import java.util.List;

public class TrageryActivity extends AppCompatActivity {

    ActivityTrageryBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tragery);
        initRecyclerView();

        binding.backBtnIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    private void initRecyclerView() {


        List<String> strings = new ArrayList<>();

        strings.add("অনলাইন চালান ভেরিফিকেশন (বাংলাদেশ ট্যুরিজম বোর্ড)");
        strings.add("চালান যাচাই (সরকারি আবাসন পরিদপ্তর)");
        strings.add("অনলাইন চালান যাচাইকরণ");


        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Online Chalan Verification, (Bangladesh Tourism Board)");
        stringsBengali.add("Chalan Jachai, (Sorkari Abashon Odidoptor)");
        stringsBengali.add("Online Chalan Jachaikoron");

        List<Drawable> drawables = new ArrayList<>();

        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));
        drawables.add(getResources().getDrawable(R.drawable.ic_utility_1));
        drawables.add(getResources().getDrawable(R.drawable.ic_money_three));


        complimentAdapter = new ComplimentAdapter(strings, this, TrageryActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
