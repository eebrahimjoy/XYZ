package com.example.xyz.adapter.viewHolder;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xyz.R;
import com.example.xyz.databinding.ModelListItemRegionBinding;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;


public class ProductRegionViewHolder extends ChildViewHolder {

    private ModelListItemRegionBinding regionBinding;
    private Context context;

    public ProductRegionViewHolder(ModelListItemRegionBinding regionBinding, final Context context) {
        super(regionBinding.getRoot());
        this.regionBinding = regionBinding;
        this.context = context;

        regionBinding.regionTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setToast(context.getResources().getString(R.string.under_development));

            }
        });

        regionBinding.region2TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setToast(context.getResources().getString(R.string.under_development));

            }
        });

        regionBinding.region3TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setToast(context.getResources().getString(R.string.under_development));

            }
        });

        regionBinding.region4TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setToast(context.getResources().getString(R.string.under_development));

            }
        });
    }

    public void setRegionName(String name) {
        regionBinding.regionTV.setText(name);
    }

    private void setToast(String string) {
        Toast.makeText(context, "" + context.getResources().getString(R.string.under_development), Toast.LENGTH_SHORT).show();
    }

}