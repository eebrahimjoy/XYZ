package com.example.xyz.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.xyz.repository.HomeRepo;

public class HomeViewModel extends AndroidViewModel {
    HomeRepo homeRepo;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        homeRepo = new HomeRepo(application);
    }

}
