package com.example.xyz.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityTransportServiceBinding;
import com.example.xyz.databinding.ActivityUtilityBillBinding;

import java.util.ArrayList;
import java.util.List;

public class TransportServiceActivity extends AppCompatActivity {

    ActivityTransportServiceBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_transport_service);
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


        strings.add("অনলাইন ট্রাভেল এজেন্সি ( বেসামরিক বিমান পরিবহন ও পর্যটন মন্ত্রণালয়)");
        strings.add("অনলাইন পেমেন্ট (বাংলাদেশ সড়ক পরিবহন কর্তৃপক্ষ)");
        strings.add("অনলাইন যানবাহন রিক্যুইজিশন সিস্টেম (বস্ত্র ও পাট মন্ত্রণালয়)");
        strings.add("স্টোর ম্যানেজমেন্ট ও ভেহিকেল (তথ্য ও যোগাযোগ প্রযুক্তি বিভাগ)");
        strings.add("অনলাইনে মিউজু বাসের আবেদন (জাতীয় বিজ্ঞান ও প্রযুক্তি জাদুঘর)");
        strings.add("অনলাইন লাইসেন্সিং (শ্রম ও কর্মসংস্থান মন্ত্রণালয়)");
        strings.add("অনলাইন ফ্রি পরিবহন সুবিধা (জাতীয় বিজ্ঞান ও প্রযুক্তি জাদুঘর)");
        strings.add("সিএনজি স্টেশন লাইসেন্স অনলাইন ফর্ম");
        strings.add("বিআরটিএ’র ফি ক্যালকুলেটর");
        strings.add("স্থানীয় সরকার প্রকৌশল অধিদপ্তরের ডিজিটাল মানচিত্র");
        strings.add("স্থানীয় সরকার প্রকৌশল অধিদপ্তরের সড়ক ডাটাবেস");

        List<String> stringsBengali = new ArrayList<>();

        stringsBengali.add("Online Travel Agency, (Besamorik Biman Poribohon Ebong Porjoton Montronaloy)");
        stringsBengali.add("Online Payment, (Bangladesh Sorok Poribohon Kortipokkho)");
        stringsBengali.add("Online Janbahon Requisition System, (Bostro Ebong Pat Montronaloy)");
        stringsBengali.add("Store Managemnet Ebong Vehicle, (Tottho Ebonf JogaJoog Projokti bivag)");
        stringsBengali.add("Online Mujoo Baser Abedhon, (Jatiyo Biggan Ebong Projokti Jadogor)");
        stringsBengali.add("Online License, (Srom Ebong Kormo,songsthan Montronaloy)");
        stringsBengali.add("Online Free Poribohon Soobidha, (Jatiyo Biggan Ebong Projokti Jadogor)");
        stringsBengali.add("C.N.G, Station License Online Form");
        stringsBengali.add("B.R.T.A Er Fee Calculator");
        stringsBengali.add("Sthaniyo Sorkar Prokoushol Odidoptorer Digital Manchitro");
        stringsBengali.add("Sthaniyo Sorkar Prokoushol Odidoptorer Sorok Databse");



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
        drawables.add(getResources().getDrawable(R.drawable.ic_meter_six));
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
        drawables.add(getResources().getDrawable(R.drawable.ic_meter_six));
        drawables.add(getResources().getDrawable(R.drawable.ic_meter_six));
        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));
        drawables.add(getResources().getDrawable(R.drawable.ic_utility_1));

        complimentAdapter = new ComplimentAdapter(strings, this, TransportServiceActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
