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
import com.example.xyz.databinding.ActivityUtilityBillBinding;

import java.util.ArrayList;
import java.util.List;

public class HealthMinistryActivity extends AppCompatActivity {

    ActivityHealthMinistryBinding binding;
    ComplimentAdapter complimentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_health_ministry);
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

        strings.add("নিবন্ধিত সিএসবিএ যাচাই");
        strings.add("অনলাইন ফোরাম (BSMMU)");
        strings.add("ই-হেলথ");
        strings.add("ই-হেলথ স্ট্যান্ডার্সস");
        strings.add("পরমাণু চিকিৎসার অনলাইন সেবা (বাংলাদেশ পরমাণু শক্তি কমিশন)");
        strings.add("এসএস - সেবা পরিসংখ্যান (পরিবার পরিকল্পনা অধিদপ্তর)");
        strings.add("নিবন্ধিত নার্স/মিডওয়াইফ যাচাই");
        strings.add("অ্যান্টিবায়োটিক গাইডলাইন (বঙ্গবন্ধু শেখ মুজিব মেডিকেল বিশ্ববিদ্যালয়)");
        strings.add("Appointment (স্বাস্থ্য শিক্ষা ও পরিবার কল্যাণ বিভাগ)");
        strings.add("ই-স্বাস্থ্য সেবা");
        strings.add("অনলাইন ফোরাম (বঙ্গবন্ধু শেখ মুজিব মেডিকেল বিশ্ববিদ্যালয়)");
        strings.add("অনলাইন আবেদন (ক্যান্সার, কিডনী, লিভার সিরোসিস ও অন্যান্য রোগ)");
        strings.add("টেলিমেডিসিন");
        strings.add("স্বাস্থ্য, জনসংখ্যা ও পুষ্টি বিষয়ক টুলকিট");


        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Nibondito C.S.B.A, Jachai");
        stringsBengali.add("Online Forum , (B.S.M.M)");
        stringsBengali.add("E Health");
        stringsBengali.add("E Health Standards");
        stringsBengali.add("Poromanu Chikitshar Online Seba, (Bangladesh Poromanu Shokti Commission)");
        stringsBengali.add("S.S Seba Porishokkhan, (Poribar Porikolpona Odidoptor)");
        stringsBengali.add("Nibondito Nurse , MidWaif Jachai");
        stringsBengali.add("Antibiotic Guideline, ( B.S.M.M.C");
        stringsBengali.add("Appointment, (Sastho,Poribar Kollan bivag");
        stringsBengali.add("E Shastho Sheba");
        stringsBengali.add("Online Forum, (B.S.M.M.C)");
        stringsBengali.add("Online Abedhon, ( Cancer, Kidney, Liver Sclerosis Ebong Onnano Roog ");
        stringsBengali.add("TeleMedicine");
        stringsBengali.add("Sastho, Jonoshongkkha Ebong Poosti Bishoyook Tulkit");


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

        complimentAdapter = new ComplimentAdapter(strings, this, HealthMinistryActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
