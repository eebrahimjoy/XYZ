package com.example.xyz.adapter.viewHolder;

import android.view.animation.RotateAnimation;
import com.example.xyz.databinding.ModelExapandableRecyclerViewCompanyBinding;
import com.example.xyz.model.Company;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class CompanyViewHolder extends GroupViewHolder {

    private ModelExapandableRecyclerViewCompanyBinding binding;

    public CompanyViewHolder(ModelExapandableRecyclerViewCompanyBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind (Company company){
        binding.companyNameTV.setText(company.getTitle());
    }

    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        binding.arrowIV.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF, 0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        binding.arrowIV.setAnimation(rotate);
    }
}
