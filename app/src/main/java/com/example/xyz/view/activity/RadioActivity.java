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
import com.example.xyz.databinding.ActivityRadioBinding;

import java.util.ArrayList;
import java.util.List;

public class RadioActivity extends AppCompatActivity {

    ActivityRadioBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_radio);
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

        strings.add("বাংলাদেশ বেতারের লাইভ এফএম রেডিও");
        strings.add("বাংলাদেশ বেতারের লাইভ এএম রেডিও");
        strings.add("বাংলাদেশ বেতারের বাংলা খবর");
        strings.add("বাংলাদেশ বেতারের ইংরেজি খবর");
        strings.add("বাংলাদেশ বেতারের আরবি খবর");
        strings.add("বাংলাদেশ বেতারের হিন্দি খবর");
        strings.add("বাংলাদেশ টেলিভিশন");


        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Bangladesh Betar Live F.M Radio");
        stringsBengali.add("Bangladesh Betar Live A.M Radio");
        stringsBengali.add("Bangladesh Betar Er Bangla Khobor");
        stringsBengali.add("Bangladesh Betar Er Engregi Khobor");
        stringsBengali.add("Bangladesh Betar Er Arbi Khobor");
        stringsBengali.add("Bangladesh Betar Er Hindi Khobor");
        stringsBengali.add("Bangladesh Television");


        List<Drawable> drawables = new ArrayList<>();

        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));
        drawables.add(getResources().getDrawable(R.drawable.ic_utility_1));
        drawables.add(getResources().getDrawable(R.drawable.ic_money_three));
        drawables.add(getResources().getDrawable(R.drawable.ic_telephone_four));
        drawables.add(getResources().getDrawable(R.drawable.ic_gass_five));
        drawables.add(getResources().getDrawable(R.drawable.ic_meter_six));
        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));

        complimentAdapter = new ComplimentAdapter(strings, this, RadioActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
