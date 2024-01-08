package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    //--cd specific fields--//
    private String artist;
    private int releaseYear;

    //--constructor--//
    public CD(String name, double capacity, String contents, String artist, int releaseYear) {
        super(name, capacity, contents, "CD");
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    //--implementations for OpticalDisc interface methods--//
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeDataUsingLaser() {
        System.out.println("Writing data to CD using a laser.");
    }

    @Override
    public void readDataUsingLaser() {
        System.out.println("Reading data from CD using a laser.");
    }

    @Override
    public void reportInformation() {
        System.out.println("CD Name: " + getName() + ", Capacity: " + getCapacity() +
                "GB, Contents: " + getContents() + ", Artist: " + artist +
                ", Release Year: " + releaseYear);
    }

    @Override
    public void startPlaying() {
        System.out.println("CD is starting to play.");
    }

    @Override
    public void stopPlaying() {
        System.out.println("CD has stopped playing.");
    }

    @Override
    public void ejectDisc() {
        System.out.println("CD is ejected from the player.");
    }

    //-- cd specific methods--//
    public void playTrack(int trackNumber) {
        System.out.println("Playing track number: " + trackNumber);
    }

    //--cs specific getters & setters--//
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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
