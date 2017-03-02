package com.jdkgroup.tabsearch.Model;

public class ModelCountry {

    private String name;
    private String isocode;


    public ModelCountry(String name, String isocode){
        this.name=name;
        this.isocode=isocode;
    }

    public String getName() {
        return name;
    }

    public String getisoCode() {
        return isocode;
    }
}
