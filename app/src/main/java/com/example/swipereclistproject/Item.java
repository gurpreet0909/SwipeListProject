package com.example.swipereclistproject;

import java.util.ArrayList;

/**
 * Created by gurpreetsingh on 2018-08-23.
 */

public class Item {

    String countryName;
    ArrayList<String> languagesSpoken;
    ArrayList<String> currenciesUsed;

    public Item(){

    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList<String> getLanguagesSpoken() {
        return languagesSpoken;
    }

    public void setLanguagesSpoken(ArrayList<String> languagesSpoken) {
        this.languagesSpoken = languagesSpoken;
    }

    public ArrayList<String> getCurrenciesUsed() {
        return currenciesUsed;
    }

    public void setCurrenciesUsed(ArrayList<String> currenciesUsed) {
        this.currenciesUsed = currenciesUsed;
    }
}
