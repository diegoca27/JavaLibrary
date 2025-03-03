package LibraryJava;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    //Atributos
    private String name;
    private int ID;
    private String address;
    private String additionalInfo;
}

    //Constructor
    public Patron(String name, int ID, String address, String additionalInfo){
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.additionalInfo = additionalInfo;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    public String getAddress(){
        return address;
    }

    public String getAdditionalInfo(){
        return additionalInfo;
    }

    public String setName(String name){
        this.name = name;
    }

    public int setID(int ID){
        this.ID = ID;
    }

    public String setAddress(String address){
        this.address = address;
    }

    public String setAdditionalInfo(String additionalInfo){
        this.additionalInfo = additionalInfo;
    }