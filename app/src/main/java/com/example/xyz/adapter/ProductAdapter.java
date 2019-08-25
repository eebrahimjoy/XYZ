package com.example.xyz.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.xyz.R;
import com.example.xyz.adapter.viewHolder.CompanyViewHolder;
import com.example.xyz.adapter.viewHolder.ProductViewHolder;
import com.example.xyz.databinding.ModelExapandableRecyclerViewCompanyBinding;
import com.example.xyz.databinding.ModelExapdableRecyclerviewProductBinding;
import com.example.xyz.model.Company;
import com.example.xyz.model.Product;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ProductAdapter extends ExpandableRecyclerViewAdapter <CompanyViewHolder, ProductViewHolder> {
    public ProductAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public CompanyViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        ModelExapandableRecyclerViewCompanyBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.model_exapandable_recycler_view_company, parent, false);
        return new CompanyViewHolder(binding);
    }

    @Override
    public ProductViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        ModelExapdableRecyclerviewProductBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.model_exapdable_recyclerview_product, parent, false);
        return new ProductViewHolder(binding);
    }

    @Override
    public void onBindChildViewHolder(ProductViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Product product = (Product) group.getItems().get(childIndex);
        holder.bind(product);

    }

    @Override
    public void onBindGroupViewHolder(CompanyViewHolder holder, int flatPosition, ExpandableGroup group) {
        final Company company = (Company) group;
        holder.bind(company);

    }
}
