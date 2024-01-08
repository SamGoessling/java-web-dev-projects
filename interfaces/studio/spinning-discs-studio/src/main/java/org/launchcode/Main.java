package org.launchcode;

public class Main {
    public static void main(String[] args) {
        //--constructor calls w/ required parameters--//
        CD myCd = new CD("My CD", 0.7, "Music Album", "Artist Name", 1999);
        DVD myDvd = new DVD("My DVD", 4.7, "Movie", "Director Name", 2008);

        //--behaviors--//
        myCd.spinDisc();
        myDvd.spinDisc();

        //--some additional behaviors--//
        myCd.writeDataUsingLaser();
        myDvd.startPlaying();

    }
}