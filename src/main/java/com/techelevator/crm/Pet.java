package com.techelevator.crm;

import java.util.ArrayList;

public class Pet {

    private String name;
    private String species;
    private ArrayList<String> vaccinations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public ArrayList<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public String listVaccinations(){
        String allVacs = "";
        allVacs = vaccinations.toString();
        allVacs.split(" ");

        return allVacs;
    }

}
