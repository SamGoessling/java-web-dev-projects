package org.launchcode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //--breakpoint 1--//
        //--constructor calls w/ required parameters--//
        CD myCd = new CD("My CD", 0.7, "Music Album", "Artist Name", 1999);
        DVD myDvd = new DVD("My DVD", 4.7, "Movie", "Director Name", 2008);

        //--breakpoint 2--//
        //--behaviors--//
        myCd.spinDisc();
        myDvd.spinDisc();

        //--breakpoint 3--//
        //--some additional behaviors--//
        myCd.writeDataUsingLaser();
        myDvd.startPlaying();

        //--throw error--//
        try {
            throw new Error("Bad.");
        } catch(Error e){
            e.printStackTrace();
        }
    }
}