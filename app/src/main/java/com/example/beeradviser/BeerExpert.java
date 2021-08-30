package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){

        List<String> brands = new ArrayList<>();

        if (color.equals("dark")){
            brands.add("Kozel dark");
            brands.add("Esse night");
            brands.add("Paul");

        }
        else if (color.equals("brown")){
            brands.add("Don");
            brands.add("Keln");
        }
        else  {
            brands.add("Gus");
            brands.add("Sova");
            brands.add("XXX10");
        }

        return  brands;
    }
}
