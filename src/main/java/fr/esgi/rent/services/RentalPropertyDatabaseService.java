package fr.esgi.rent.services;

import fr.esgi.rent.beans.RentalProperty;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class RentalPropertyDatabaseService {

    public List<RentalProperty> getAllRentalProperties() {
        //TODO: Exercice 1

        return Collections.emptyList();
    }

    public Optional<RentalProperty> getRentalPropertyById(int id) {
        //TODO: Exercice 2

        return Optional.empty();
    }

    public void addRentalProperty(RentalProperty rentalProperty) {
        // TODO: Exercice 3
    }

}
