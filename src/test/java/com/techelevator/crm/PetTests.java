package com.techelevator.crm;

import com.techelevator.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PetTests {

    @Test
    public void listVaccinationsReturnsVaccinations() {
        Pet pet = new Pet("Tiny","Doggo");
        ArrayList<String> vaccines = new ArrayList<>();
        vaccines.add("Rabies");
        vaccines.add("Lepto");
        vaccines.add("Parvo");

        pet.setVaccinations(vaccines);

        Assert.assertEquals("List of Vaccinations is incorrect.",
                "[Rabies, Lepto, Parvo]",
                pet.listVaccinations());
    }
}
