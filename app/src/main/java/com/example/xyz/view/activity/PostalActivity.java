package com.example.xyz.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityHealthMinistryBinding;
import com.example.xyz.databinding.ActivityPostalBinding;

import java.util.ArrayList;
import java.util.List;

public class PostalActivity extends AppCompatActivity {

    ActivityPostalBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_postal);
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

        strings.add("পার্সেল এবং রেজিস্ট্রি ট্রাকিং");
        strings.add("ডাকটিকেট অর্ডার ট্র্যাকিং");
        strings.add("অনলাইন চিঠি প্রক্রিয়া");
        strings.add("পার্সেল এবং রেজিস্ট্রি চিঠি সনাক্তকরণ");
        strings.add("জি.ই.পি সার্ভিস চার্জ ক্যালকুলেটর");
        strings.add("প্রাইজবন্ডের ফলাফল");
        strings.add("ই.এম.এস সার্ভিস চার্জ ক্যালকুলেটর");
        strings.add("আন্তর্জাতিক ডাক খরচ ক্যালকুলেটর");
        strings.add("অভ্যন্তরীণ ডাক খরচ ক্যালকুলেটর");
        strings.add("পোস্টকোড ফাইন্ডার");
        strings.add("ডাক জীবনবীমার প্রিমিয়াম ক্যালকুলেটর");



        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Parcel Ebong Registry Tracking");
        stringsBengali.add("Duk Ticket Order Tracking");
        stringsBengali.add("Online Chithi Prokriya");
        stringsBengali.add("Parcel Ebong Registry Chithi Sonaktokoroon");
        stringsBengali.add("G.E.P, Service Charge Calculator");
        stringsBengali.add("Prize Band Folafol");
        stringsBengali.add("E.M.S, Service Charge Calculator");
        stringsBengali.add("Antorjarteek Dak Khoroch Calculator");
        stringsBengali.add("Ovvontoreen Dak Khoroch Calculator");
        stringsBengali.add("Postal Code Fiber");
        stringsBengali.add("Duk, Jibonbimaar Premium Calculator");


        List<Drawable> drawables = new ArrayList<>();

        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));
        drawables.add(getResources().getDrawable(R.drawable.ic_utility_1));
        drawables.add(getResources().getDrawable(R.drawable.ic_money_three));
        drawables.add(getResources().getDrawable(R.drawable.ic_telephone_four));
        drawables.add(getResources().getDrawable(R.drawable.ic_gass_five));
        drawables.add(getResources().getDrawable(R.drawable.ic_meter_six));
        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));
        drawables.add(getResources().getDrawable(R.drawable.ic_utility_1));
        drawables.add(getResources().getDrawable(R.drawable.ic_money_three));
        drawables.add(getResources().getDrawable(R.drawable.ic_telephone_four));
        drawables.add(getResources().getDrawable(R.drawable.ic_gass_five));


        complimentAdapter = new ComplimentAdapter(strings, this, PostalActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
