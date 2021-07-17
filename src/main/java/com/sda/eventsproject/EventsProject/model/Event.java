package com.sda.eventsproject.EventsProject.model;

import java.time.LocalDate;

public class Event {

    private LocalDate date;
    private String eventName;
    private String eventAdress;
    private Acess acess;
    private String organiser;

    public Event(LocalDate date, String eventName, String eventAdress, Acess acess, String organiser) {
        this.date = date;
        this.eventName = eventName;
        this.eventAdress = eventAdress;
        this.acess = acess;
        this.organiser = organiser;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventAdress() {
        return eventAdress;
    }

    public void setEventAdress(String eventAdress) {
        this.eventAdress = eventAdress;
    }

    public Acess getAcess() {
        return acess;
    }

    public void setAcess(Acess acess) {
        this.acess = acess;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }
}
