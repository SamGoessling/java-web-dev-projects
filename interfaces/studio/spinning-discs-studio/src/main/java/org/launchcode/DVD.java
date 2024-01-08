package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    //--dvd specific fields--//
    private String director;
    private int releaseYear;

    //--constructor--//
    public DVD(String name, double capacity, String contents, String director, int releaseYear) {
        super(name, capacity, contents, "DVD");
        this.director = director;
        this.releaseYear = releaseYear;
    }

    //--implementations for OpticalDisc interface methods--//
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeDataUsingLaser() {
        System.out.println("Writing data to DVD using a laser.");
    }

    @Override
    public void readDataUsingLaser() {
        System.out.println("Reading data from DVD using a laser.");
    }

    @Override
    public void reportInformation() {
        System.out.println("DVD Name: " + getName() + ", Capacity: " + getCapacity() +
                "GB, Contents: " + getContents() + ", Director: " + director +
                ", Release Year: " + releaseYear);
    }

    @Override
    public void startPlaying() {
        System.out.println("DVD is starting to play.");
    }

    @Override
    public void stopPlaying() {
        System.out.println("DVD has stopped playing.");
    }

    @Override
    public void ejectDisc() {
        System.out.println("DVD is ejected from the player.");
    }

    //--dvd getters & setters--//
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public void printDiscInfo() {

    }
}