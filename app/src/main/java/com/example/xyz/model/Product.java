package com.example.xyz.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    private String name;
    private boolean isRegion;

    public Product(String name, boolean isRegion) {
        this.name = name;
        this.isRegion = isRegion;
    }

    protected Product(Parcel in) {
        name = in.readString();
    }

    public String getName() {
        return name;
    }

    public boolean isRegion() {
        return isRegion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product)) return false;

        Product product = (Product) object;

        if (isRegion() != product.isRegion()) return false;
        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (isRegion() ? 1 : 0);
        return result;
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

