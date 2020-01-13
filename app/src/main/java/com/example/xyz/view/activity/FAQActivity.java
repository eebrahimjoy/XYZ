package com.example.xyz.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityFaqBinding;
import com.example.xyz.databinding.ActivityPostalBinding;

import java.util.ArrayList;
import java.util.List;

public class FAQActivity extends AppCompatActivity {

    ActivityFaqBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_faq);
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

        strings.add("বাংলাদেশ বিনিয়োগ উন্নয়ন কর্তৃপক্ষ");
        strings.add("অনলাইন অভিযোগ (প্রবাসী কল্যাণ ও বৈদেশিক কর্মসংস্থান মন্ত্রণালয়)");
        strings.add("অনলাইনে অভিযোগ সুবিধা (জাতীয় বিজ্ঞান ও প্রযুক্তি জাদুঘর)");
        strings.add("অভিযোগ ও পরামর্শ (ওয়েজ আর্নার্স কল্যাণ বোর্ড)");
        strings.add("অভিযোগ বাবস্থাপনা পদ্ধতি (জাতীয় মানবাধিকার কমিশন বাংলাদেশ)");
        strings.add("সেবাগ্রহীতাদের মতামত (বিজ্ঞান ও প্রযুক্তি মন্ত্রণালয়)");
        strings.add("অভিযোগ (শ্রম ও কর্মসংস্থান মন্ত্রণালয়)");
        strings.add("অনলাইন অভিযোগ (জনশক্তি কর্মসংস্থান ও প্রশিক্ষণ ব্যুরো)");
        strings.add("বানিজ্যমন্ত্রীকে জিজ্ঞাসা করুন");
        strings.add("অভিযোগ নিষ্পত্তি ব্যবস্থাপনা");




        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Bangladesh Binoyog Unnoyon Kortipokkho");
        stringsBengali.add("Online Ovijoog, (Provashi Koillan Ebong Boideshik Kormosongsthan Montronaloy)");
        stringsBengali.add("Online Ovijoog Sobidha, (Jatiyo Biggan Ebong Projokti Jadugor)");
        stringsBengali.add("Ovijug Ebong Poramorsho, (Wage Honours Kollan Board)");
        stringsBengali.add("Ovijug Bebosthapona Poddoti, ( Jatiyo Manobadikar Commission Bangladesh)");
        stringsBengali.add("Sheba Grohitader Motamot, (Biggan O projukti Montronaloy)");
        stringsBengali.add("Ovijug (Shrom Ebong Kormosongshan Montronaloy)");
        stringsBengali.add("Online Ovijug, (Jonoshakti Kormosongshan Ebong Proshikkhon Boreu)");
        stringsBengali.add("Banijjikmontrike Jiggasha Korun");
        stringsBengali.add("Ovijug Nispotti Bebosthapona");



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


        complimentAdapter = new ComplimentAdapter(strings, this, FAQActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
