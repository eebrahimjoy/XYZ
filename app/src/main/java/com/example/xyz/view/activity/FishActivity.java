package com.example.xyz.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityFishBinding;
import com.example.xyz.databinding.ActivityHealthMinistryBinding;

import java.util.ArrayList;
import java.util.List;

public class FishActivity extends AppCompatActivity {

    ActivityFishBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fish);
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

        strings.add("ই-প্রাণিসম্পদ");
        strings.add("পিডিএস - বিএফআরআই");
        strings.add("ফিস এ্যাডভাইস সিস্টেম");
        strings.add("মৎস্যখাদ্যের লাইসেন্সিং");
        strings.add("প্রাণিসম্পদের এসএমএস সেবা");



        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("E, Pranisompod");
        stringsBengali.add("P.D.S, B.F.R.I");
        stringsBengali.add("Fish Advice system");
        stringsBengali.add("Motshokhaddor license");
        stringsBengali.add("Pranishompod S.M.S Sheba");


        List<Drawable> drawables = new ArrayList<>();

        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));
        drawables.add(getResources().getDrawable(R.drawable.ic_utility_1));
        drawables.add(getResources().getDrawable(R.drawable.ic_money_three));
        drawables.add(getResources().getDrawable(R.drawable.ic_telephone_four));
        drawables.add(getResources().getDrawable(R.drawable.ic_gass_five));


        complimentAdapter = new ComplimentAdapter(strings, this, FishActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
