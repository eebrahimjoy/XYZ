package com.example.xyz.adapter.viewHolder;

import com.example.xyz.R;
import com.example.xyz.databinding.ModelExapandableRecyclerViewCompanyBinding;
import com.example.xyz.model.Company;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;


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

        binding.arrowIV.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
    }

    private void animateCollapse() {
        binding.arrowIV.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
    }
}
