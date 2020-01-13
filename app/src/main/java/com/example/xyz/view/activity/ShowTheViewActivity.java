package com.example.xyz.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.xyz.R;
import com.example.xyz.adapter.ComplimentAdapter;
import com.example.xyz.databinding.ActivityShowTheViewBinding;

import java.util.ArrayList;
import java.util.List;

public class ShowTheViewActivity extends AppCompatActivity {

    ActivityShowTheViewBinding binding;
    ComplimentAdapter complimentAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_show_the_view);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        initRecyclerView();




    }

    private void initRecyclerView() {

        List<String> strings = new ArrayList<>();
        strings.add("ডেসকো ইন্টারনেট বিল পরিশোধ");
        strings.add("অনলাইন পেমেন্ট (খুলনা ওয়াসা)");
        strings.add("অনলাইন পেমেন্ট (ঢাকা ওয়াসা)");
        strings.add("ডেসকো মিটার রিডিং");
        strings.add("ডেসকো ই বিল");
        strings.add("অনলাইন বিল পেমেন্ট -DPDC");
        strings.add("DPDC বিদ্যুৎ বিলের পেমেন্ট");
        strings.add("ট্যারিফ রেট -DPDC");
        strings.add("ডেসকো অনুমোদিত পেমেন্ট কেন্দ্র");
        strings.add("বিল অন ওয়েব - (বিপিডিবি)");

        complimentAdapter = new ComplimentAdapter( strings,this,ShowTheViewActivity.this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
