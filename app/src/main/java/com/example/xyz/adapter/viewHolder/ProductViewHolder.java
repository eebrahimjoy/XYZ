package com.example.xyz.adapter.viewHolder;

import androidx.annotation.NonNull;

import com.example.xyz.databinding.ModelExapdableRecyclerviewProductBinding;
import com.example.xyz.model.Product;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {

    private ModelExapdableRecyclerviewProductBinding binding;


    public ProductViewHolder(@NonNull ModelExapdableRecyclerviewProductBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind (Product product){
        binding.productTextView.setText(product.name);
    }
}
