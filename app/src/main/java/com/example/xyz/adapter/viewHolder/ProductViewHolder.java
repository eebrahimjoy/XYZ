package com.example.xyz.adapter.viewHolder;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.xyz.databinding.ModeListItemProductBinding;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {

    private ModeListItemProductBinding productBinding;
    private Context context;

    public ProductViewHolder(ModeListItemProductBinding productBinding, Context context) {
        super(productBinding.getRoot());
        this.productBinding = productBinding;
        this.context = context;
    }

    public void setProductName(String name) {
        productBinding.productTV.setText(name);

        if (name == "120"){
            Toast.makeText(context, ""+name, Toast.LENGTH_SHORT).show();
            productBinding.viewId.setVisibility(View.VISIBLE);
        }
    }
}

