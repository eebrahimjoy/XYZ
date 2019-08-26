package com.example.xyz.adapter.viewHolder;
import com.example.xyz.R;
import com.example.xyz.databinding.ModelCompanyItemListBinding;
import com.example.xyz.model.Company;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class CompanyViewHolder extends GroupViewHolder {
    private ModelCompanyItemListBinding companyItemListBinding;

    public CompanyViewHolder(ModelCompanyItemListBinding companyItemListBinding) {
        super(companyItemListBinding.getRoot());
        this.companyItemListBinding = companyItemListBinding;
    }

    public void setGenreTitle(ExpandableGroup genre) {
        if (genre instanceof Company) {
            companyItemListBinding.companyNameTextView.setText(genre.getTitle());
        }

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
        companyItemListBinding.expandArrowIV.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

    }

    private void animateCollapse() {
        companyItemListBinding.expandArrowIV.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);

    }
}
