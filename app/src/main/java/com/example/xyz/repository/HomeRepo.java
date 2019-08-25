package com.example.xyz.repository;

import android.app.Application;
import com.example.xyz.model.Company;
import com.example.xyz.model.Product;

import java.util.ArrayList;
import java.util.List;

public class HomeRepo {
    private Application application;
    private List<Company> companies;
    private List<Product> googleProducts;
    private List<Product> microsoftProducts;
    private List<Product> androidProducts;
    private List<Product> computerProducts;
    private List<Product> tableProducts;
    private List<Product> softwareProducts;


    public HomeRepo(Application application) {
        this.application = application;

    }

    public List<Company> getCompanies() {
        companies = new ArrayList<>();
        googleProducts = new ArrayList<>();
        microsoftProducts = new ArrayList<>();
        androidProducts = new ArrayList<>();
        computerProducts = new ArrayList<>();
        tableProducts = new ArrayList<>();
        softwareProducts  = new ArrayList<>();

        googleProducts.add(new Product("Google Drive"));
        googleProducts.add(new Product("Google Message"));
        googleProducts.add(new Product("Google Chrome"));
        googleProducts.add(new Product("Google Watch"));
        googleProducts.add(new Product("Google Contact"));
        googleProducts.add(new Product("Google Mail"));
        googleProducts.add(new Product("Google G-mail"));
        googleProducts.add(new Product("Google Doc"));
        googleProducts.add(new Product("Google E-mail"));
        googleProducts.add(new Product("Google Android"));
        googleProducts.add(new Product("Google Mobile"));
        googleProducts.add(new Product("Google TV"));
        googleProducts.add(new Product("Google Slide"));
        googleProducts.add(new Product("Google Map"));
        googleProducts.add(new Product("Google Drive"));
        googleProducts.add(new Product("Google Message"));
        googleProducts.add(new Product("Google Chrome"));
        googleProducts.add(new Product("Google Watch"));
        googleProducts.add(new Product("Google Contact"));
        googleProducts.add(new Product("Google Mail"));
        googleProducts.add(new Product("Google G-mail"));
        googleProducts.add(new Product("Google Doc"));
        googleProducts.add(new Product("Google E-mail"));
        googleProducts.add(new Product("Google Android"));
        googleProducts.add(new Product("Google Mobile"));
        googleProducts.add(new Product("Google TV"));
        googleProducts.add(new Product("Google Slide"));
        googleProducts.add(new Product("Google Map"));

        Company google = new Company("Google Company", googleProducts);
        companies.add(google);

        microsoftProducts.add(new Product("Google Drive"));
        microsoftProducts.add(new Product("Google Message"));
        microsoftProducts.add(new Product("Google Chrome"));
        microsoftProducts.add(new Product("Google Watch"));
        microsoftProducts.add(new Product("Google Contact"));
        microsoftProducts.add(new Product("Google Mail"));
        microsoftProducts.add(new Product("Google G-mail"));
        microsoftProducts.add(new Product("Google Doc"));
        microsoftProducts.add(new Product("Google E-mail"));
        microsoftProducts.add(new Product("Google Android"));
        microsoftProducts.add(new Product("Google Mobile"));
        microsoftProducts.add(new Product("Google TV"));
        microsoftProducts.add(new Product("Google Slide"));
        microsoftProducts.add(new Product("Google Map"));
        microsoftProducts.add(new Product("Google Drive"));
        microsoftProducts.add(new Product("Google Message"));
        microsoftProducts.add(new Product("Google Chrome"));

        Company microsoft = new Company("Microsoft Company", microsoftProducts);
        companies.add(microsoft);

        androidProducts.add(new Product("Google Drive"));
        androidProducts.add(new Product("Google Message"));
        androidProducts.add(new Product("Google Chrome"));
        androidProducts.add(new Product("Google Watch"));
        androidProducts.add(new Product("Google Contact"));
        androidProducts.add(new Product("Google Mail"));
        androidProducts.add(new Product("Google G-mail"));
        androidProducts.add(new Product("Google Doc"));
        androidProducts.add(new Product("Google E-mail"));
        androidProducts.add(new Product("Google Android"));
        androidProducts.add(new Product("Google Mobile"));
        androidProducts.add(new Product("Google TV"));
        androidProducts.add(new Product("Google Slide"));
        androidProducts.add(new Product("Google Map"));

        Company android = new Company("Android Company", androidProducts);
        companies.add(android);

        computerProducts.add(new Product("Google Drive"));
        computerProducts.add(new Product("Google Message"));
        computerProducts.add(new Product("Google Chrome"));
        computerProducts.add(new Product("Google Watch"));
        computerProducts.add(new Product("Google Contact"));
        computerProducts.add(new Product("Google Mail"));
        computerProducts.add(new Product("Google G-mail"));
        computerProducts.add(new Product("Google Doc"));
        computerProducts.add(new Product("Google E-mail"));
        computerProducts.add(new Product("Google Android"));
        computerProducts.add(new Product("Google Mobile"));
        computerProducts.add(new Product("Google TV"));
        computerProducts.add(new Product("Google Slide"));
        computerProducts.add(new Product("Google Map"));

        Company computer = new Company("Computer Company", computerProducts);
        companies.add(computer);

        tableProducts.add(new Product("Google G-mail"));
        tableProducts.add(new Product("Google Doc"));
        tableProducts.add(new Product("Google E-mail"));
        tableProducts.add(new Product("Google Android"));
        tableProducts.add(new Product("Google Mobile"));
        tableProducts.add(new Product("Google TV"));
        tableProducts.add(new Product("Google Slide"));
        tableProducts.add(new Product("Google Map"));

        Company tablet = new Company("Tablet Company", tableProducts);
        companies.add(tablet);

        softwareProducts.add(new Product("Google G-mail"));
        softwareProducts.add(new Product("Google Doc"));
        softwareProducts.add(new Product("Google E-mail"));
        softwareProducts.add(new Product("Google Android"));
        softwareProducts.add(new Product("Google Mobile"));
        softwareProducts.add(new Product("Google TV"));
        softwareProducts.add(new Product("Google Slide"));
        softwareProducts.add(new Product("Google Map"));

        Company software = new Company("Software Company", softwareProducts);
        companies.add(software);

        Company it = new Company("IT Company", computerProducts);
        companies.add(it);

        Company business = new Company("Business Company", computerProducts);
        companies.add(business);

        Company farming = new Company("Farming Company", computerProducts);
        companies.add(farming);

        Company fishing = new Company("Fishing Company", computerProducts);
        companies.add(fishing);

        Company gym = new Company("Gym Company", computerProducts);
        companies.add(gym);

        Company olympic = new Company("Olympic Company", computerProducts);
        companies.add(olympic);

        return companies;

    }

}