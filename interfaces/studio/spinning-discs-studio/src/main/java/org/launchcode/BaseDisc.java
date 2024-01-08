package org.launchcode;

public abstract class BaseDisc {
    protected String name;
    protected double capacity;
    protected String contents;
    protected String discType;

    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    //--getters--//
    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    //--setters--//
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    //--shared methods--//
    public void loadDisc() {
        System.out.println(name + " is loaded into the player.");
    }

    public void unloadDisc() {
        System.out.println(name + " is ejected from the player.");
    }

    //--abstract method (implemented by subclasses)--//
    public abstract void printDiscInfo();
}
