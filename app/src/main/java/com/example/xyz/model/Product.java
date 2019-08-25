package com.example.xyz.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
   public final String name;
   public Product(String name){
       this.name = name;
   }

   protected Product (Parcel in){
       name = in.readString();
   }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
       dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };
}
