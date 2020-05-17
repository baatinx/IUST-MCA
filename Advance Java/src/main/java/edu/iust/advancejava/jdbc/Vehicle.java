package edu.iust.advancejava.jdbc;

import java.time.LocalDate;

public class Vehicle {
    private  int id;
    private String registrationNumber;
    private int numberOfWheels;
    private LocalDate dateOfRegistration;

    public Vehicle(String registrationNumber, int numberOfWheels, LocalDate dateOfRegistration){
        this.registrationNumber = registrationNumber;
        this.numberOfWheels = numberOfWheels;
        this.dateOfRegistration = dateOfRegistration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }

}
