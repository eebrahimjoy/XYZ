package com.example.xyz.repository;

import android.app.Application;

import com.example.xyz.model.Product;

import java.util.List;

public class HomeRepo {
    private Application application;
    private List<Product> products;



    public HomeRepo(Application application) {
        this.application = application;

    }

}