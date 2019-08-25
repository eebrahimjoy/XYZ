package com.example.xyz.model;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Company extends ExpandableGroup {
    public Company(String title, List items) {
        super(title, items);
    }

    protected Company(Parcel in) {
        super(in);
    }
}
