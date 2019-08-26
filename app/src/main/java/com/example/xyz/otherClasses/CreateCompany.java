package com.example.xyz.otherClasses;

import com.example.xyz.model.Product;
import com.example.xyz.model.Company;

import java.util.Arrays;
import java.util.List;

public class CreateCompany {

    public static List<Company> makeGenres() {
        return Arrays.asList(
                createDummyComapny(),
                createSolutionsComapny(),
                createSotfwareCompany(),
                createGoogleCompany(),
                createGermantsCompany(),
                createFirmingCompany(),
                createDummyComapny(),
                createSolutionsComapny(),
                createSotfwareCompany(),
                createGoogleCompany(),
                createGermantsCompany(),
                createFirmingCompany(),
                createDummyComapny(),
                createSolutionsComapny(),
                createSotfwareCompany(),
                createGoogleCompany(),
                createGermantsCompany(),
                createFirmingCompany());
    }
    public static Company createDummyComapny() {
        return new Company("Dummy Company", createDummy());
    }
    public static List<Product> createDummy() {
        Product product1 = new Product("120", false);
        Product product2 = new Product("110", false);
        Product product3 = new Product("100", false);
        Product product4 = new Product("90", false);
        Product product5 = new Product("80", false);
        Product dhaka = new Product("Dhaka", true);
        return Arrays.asList(product1, product2, product3,product4,dhaka);
    }
    public static Company createSolutionsComapny() {
        return new Company("Solution Company", createSolution());
    }
    public static List<Product> createSolution() {
        Product drive = new Product("Drive", false);
        Product gmail = new Product("G-mail", false);
        Product email = new Product("E-mail", false);
        Product contact = new Product("Contact", false);
        Product dhaka = new Product("Dhaka", true);
        return Arrays.asList(drive, gmail, email,contact,dhaka);
    }

    public static Company createSotfwareCompany() {
        return new Company("Software", createSoftware());
    }



    public static List<Product> createSoftware() {
        Product drive = new Product("Drive", false);
        Product gmail = new Product("G-mail", false);
        Product email = new Product("E-mail", false);
        Product contact = new Product("Contact", false);
        Product dhaka = new Product("Dhaka", true);

        return Arrays.asList(drive, gmail, email,contact,dhaka);
    }

    public static Company createGoogleCompany() {
        return new Company("Google", createGoogle());
    }


    public static List<Product> createGoogle() {
        Product drive = new Product("Drive", false);
        Product gmail = new Product("G-mail", false);
        Product email = new Product("E-mail", false);
        Product contact = new Product("Contact", false);
        Product dhaka = new Product("Dhaka", true);

        return Arrays.asList(drive, gmail, email,contact,dhaka);
    }

    public static Company createGermantsCompany() {
        return new Company("Garments ", createGarments());
    }


    public static List<Product> createGarments() {
        Product drive = new Product("Drive", false);
        Product gmail = new Product("G-mail", false);
        Product email = new Product("E-mail", false);
        Product contact = new Product("Contact", false);
        Product dhaka = new Product("Dhaka", true);

        return Arrays.asList(drive, gmail, email,contact,dhaka);
    }

    public static Company createFirmingCompany() {
        return new Company("Firming Company", createFarmingCompany());
    }


    public static List<Product> createFarmingCompany() {
        Product drive = new Product("Drive", false);
        Product gmail = new Product("G-mail", false);
        Product email = new Product("E-mail", false);
        Product contact = new Product("Contact", false);
        Product dhaka = new Product("Dhaka", true);

        return Arrays.asList(drive, gmail, email,contact,dhaka);
    }


}
