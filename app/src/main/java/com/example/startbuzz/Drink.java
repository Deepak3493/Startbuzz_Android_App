package com.example.startbuzz;

public class Drink {
    private String name;
    private String Description;
    private int imageResourceId;
    public static final Drink[] drinks={new Drink("Latte","A couple of espresso shots with steamed milk",R.drawable.latte),new Drink("Capuccino","Espresso hot milk, and a steamed milk foam",R.drawable.cappuccino),new Drink("Filter","Highest Quality beans roasted and brewed fresh",R.drawable.filter)};
    public Drink(String name, String Description, int imageResourceId1) {
        this.name=name;
        this.Description=Description;
        this.imageResourceId=imageResourceId1;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
