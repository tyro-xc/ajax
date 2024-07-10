package main.com.Test;

public class City {
    private int ID;
    private int cityID;
    private String city;
    private int father;

    public City() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFather() {
        return father;
    }

    public void setFather(int father) {
        this.father = father;
    }

    public City(int ID, int cityID, String city, int father) {
        this.ID = ID;
        this.cityID = cityID;
        this.city = city;
        this.father = father;
    }
}
