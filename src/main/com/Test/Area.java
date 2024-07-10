package main.com.Test;

public class Area {
    private int ID;
    private String area;
    private int areaID;

    public Area() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAreaID() {
        return areaID;
    }

    public void setAreaID(int areaID) {
        this.areaID = areaID;
    }

    public Area(int ID, String area, int areaID) {
        this.ID = ID;
        this.area = area;
        this.areaID = areaID;
    }
}
