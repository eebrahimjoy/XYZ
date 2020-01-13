package com.example.xyz.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.drawable.Drawable;
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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_show_the_view);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
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

        strings.add("ডেসকো ইন্টারনেট বিল পরিশোধ");
        strings.add("অনলাইন ভেসেল বিল (নৌ-পরিবহন মন্ত্রণালয়)");
        strings.add("অনলাইন পেমেন্ট (পানি সরবরাহ ও পয়:নিষ্কাশন কর্তৃপক্ষ)");
        strings.add("অনলাইন পেমেন্ট (খুলনা ওয়াসা)");
        strings.add("অনলাইন বিল পে (তিতাস গ্যাস ট্রান্সমিশন এন্ড ডিস্ট্রিবিউশন কোম্পানি)");
        strings.add("অনলাইন পানি বিল (চট্টগ্রাম ওয়াসা)");
        strings.add("অনলাইন পেমেন্ট (ঢাকা ওয়াসা)");
        strings.add("ডিপ টিউব ওয়েল ই বিল (চট্টগ্রাম ওয়াসা)");
        strings.add("ডেসকো মিটার রিডিং");
        strings.add("ডেসকো ই বিল");
        strings.add("অনলাইন বিল পেমেন্ট -DPDC");
        strings.add("DPDC বিদ্যুৎ বিলের পেমেন্ট");
        strings.add("বিএসটিআই বিলিং সফটওয়্যার");
        strings.add("বিল পেমেন্ট (বাংলাদেশ টেলিকমিউনিকেশনস কোম্পানি লিমিটেড)");
        strings.add("ট্যারিফ রেট -DPDC");
        strings.add("অনলাইন ভেসেল বিল (বন্দর বহির্ভূত নেটওয়ার্ক) (চট্টগ্রাম বন্দর কর্তৃপক্ষ)");
        strings.add("ডেসকো অনুমোদিত পেমেন্ট কেন্দ্র");
        strings.add("অনলাইন পেমেন্ট (খুলনা উন্নয়ন কর্তৃপক্ষ)");
        strings.add("ইন্টারনেট বিল পেমেন্ট (বিদ্যুৎ, জ্বালানি ও খনিজ সম্পদ মন্ত্রণালয়)");
        strings.add("ডি.পি.ডি.সি. বিদ্যুৎ বিল");
        strings.add("ঢাকা ওয়াসা পানির বিল পরিশোধ");
        strings.add("বিটিসিএল টেলিফোন বিল");
        strings.add("বিটিসিএল এডিএসএল ইন্টারনেট বিল");
        strings.add("বিল অন ওয়েব - (বিপিডিবি)");

        List<String> stringsBengali = new ArrayList<>();


        stringsBengali.add("Desko Internet Bill Porishud");
        stringsBengali.add("Online Vesel Bill, (Nou Poribohon montronaloy)");
        stringsBengali.add("Online Payment (Pani SorobRahoo Evong Poy Niskashon KortiPokkho)");
        stringsBengali.add("Online Payment (Khoolna, Wasa");
        stringsBengali.add("Online Bill Pay, (Titas Gass Transmission And Distribution Company)");
        stringsBengali.add("Online Pani Bill, (Chottogram , Wasa)");
        stringsBengali.add("Online Payment (Dhaka, Wasa)");
        stringsBengali.add("Deep Tubewel E-Bill,(Chottogram , Wasa)");
        stringsBengali.add("Desko Meter Rating");
        stringsBengali.add("Desko E Bill");
        stringsBengali.add("Online Bill Payment, D.P.D.C");
        stringsBengali.add("D.P.D.C, Biddhot Biller Payment");
        stringsBengali.add("B.S.T.I, Billing Software");
        stringsBengali.add("Bill Payment,( Bangladesh Tele Communication Company Limited)");
        stringsBengali.add("Tariff Rate, D.P.D.C ");
        stringsBengali.add("Online Vesel Bill, (Bondor Bohirvurto Network)");
        stringsBengali.add("Desko Onumudito Payment Kendro");
        stringsBengali.add("Online Payment (Khulna Unnoyon Kortipokkho)");
        stringsBengali.add("Internet Bill Payment (Biddhot , Jalanee Ebong Khoniz Sompodh Montronaloy)");
        stringsBengali.add("D.P.D.C Biddhot Bill");
        stringsBengali.add("Dhaka Wasa Panir Bill Porushudh");
        stringsBengali.add("B.T.C.L, Telephone Bill");
        stringsBengali.add("B.T.C.L, A.D.S.L, Internet Bill");
        stringsBengali.add("Bill On Web, (B.P.D.B)");


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

        complimentAdapter = new ComplimentAdapter(strings, this, ShowTheViewActivity.this, drawables, stringsBengali);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(complimentAdapter);


    }

}
