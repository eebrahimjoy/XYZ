package com.example.xyz.view.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityDigitalCenterBinding;
import com.example.xyz.databinding.ActivityTrageryBinding;

import java.util.ArrayList;
import java.util.List;

public class DigitalCenterActivity extends AppCompatActivity {

    ActivityDigitalCenterBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_digital_center);
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

        strings.add("একসেবা : উদ্যোক্তার জন্য এক ঠিকানায় সব সেবা");

        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Eksheba, Uddooktar Jonno, Ek Thikanai, Sob Sheba");
        List<Drawable> drawables = new ArrayList<>();

        drawables.add(getResources().getDrawable(R.drawable.ic_online_payment_two));


        complimentAdapter = new ComplimentAdapter(strings, this, DigitalCenterActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
