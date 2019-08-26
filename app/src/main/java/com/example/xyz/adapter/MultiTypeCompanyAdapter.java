package com.example.xyz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.xyz.R;
import com.example.xyz.adapter.viewHolder.ProductViewHolder;
import com.example.xyz.adapter.viewHolder.ProductRegionViewHolder;
import com.example.xyz.adapter.viewHolder.CompanyViewHolder;
import com.example.xyz.databinding.ModeListItemProductBinding;
import com.example.xyz.databinding.ModelCompanyItemListBinding;
import com.example.xyz.databinding.ModelListItemRegionBinding;
import com.example.xyz.model.Product;
import com.example.xyz.model.Company;
import com.thoughtbot.expandablerecyclerview.MultiTypeExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.models.ExpandableListPosition;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import java.util.List;

public class MultiTypeCompanyAdapter extends MultiTypeExpandableRecyclerViewAdapter<CompanyViewHolder, ChildViewHolder> {

    private Context context;
    public static final int REGION_TYPE = 3;
    public static final int PRODUCT_TYPE = 4;

    public MultiTypeCompanyAdapter(List<Company> companies,Context context ) {
        super(companies);
        this.context = context;
    }

    @Override
    public CompanyViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        ModelCompanyItemListBinding companyItemListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.model_company_item_list, parent, false);
        return new CompanyViewHolder(companyItemListBinding);
    }

    @Override
    public ChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case PRODUCT_TYPE:
                ModeListItemProductBinding productBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.mode_list_item_product, parent, false);
                return new ProductViewHolder(productBinding,context);
            case REGION_TYPE:
                ModelListItemRegionBinding regionBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.model_list_item_region, parent, false);
                return new ProductRegionViewHolder(regionBinding,context);
            default:
                throw new IllegalArgumentException("Invalid viewType");
        }
    }

    @Override
    public void onBindChildViewHolder(ChildViewHolder holder, int flatPosition, ExpandableGroup group,
                                      int childIndex) {
        int viewType = getItemViewType(flatPosition);
        Product product = ((Company) group).getItems().get(childIndex);
        switch (viewType) {
            case PRODUCT_TYPE:
                ((ProductViewHolder) holder).setProductName(product.getName());
                break;
            case REGION_TYPE:
                ((ProductRegionViewHolder) holder).setRegionName(product.getName());
        }
    }

    @Override
    public void onBindGroupViewHolder(CompanyViewHolder holder, int flatPosition,
                                      ExpandableGroup group) {
        holder.setGenreTitle(group);
    }

    @Override
    public int getChildViewType(int position, ExpandableGroup group, int childIndex) {
        if (((Company) group).getItems().get(childIndex).isRegion()) {
            return REGION_TYPE;
        } else {
            return PRODUCT_TYPE;
        }
    }

    @Override
    public boolean isGroup(int viewType) {
        return viewType == ExpandableListPosition.GROUP;
    }

    @Override
    public boolean isChild(int viewType) {
        return viewType == REGION_TYPE || viewType == PRODUCT_TYPE;
    }
}

