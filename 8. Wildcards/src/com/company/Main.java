package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*if you have a list of buildings you cannot apply the subtypes of the building (offices) to them list
    (In reverse, it's also a problem (list of offices, cannot apply supertype (buildings)
    So here we have the wildcards to solve our problem
     */
    public static void main(String[] args) {
        /*Regular cases*/
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Office());
        buildings.add(new Building());
        printB(buildings);

        /*Create an office list*/
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        //printB(offices);      This one right here is our problem, subtypes don't work on List
        printA(offices);

        /*Try on the supertype wildcard*/
        addNewOffice(offices);
        printA(offices);
        addNewOffice(buildings);
        printA(buildings);
    }

    public static void printB(List<Building> buildingList) {
        for (int i=0; i<buildingList.size(); i++) {
            System.out.println(buildingList.get(i).toString());
        }
    }

    /*handle subtype with wildcard in List*/
    public static void printA(List<? extends Building> buildingList) {
        for (int i=0; i<buildingList.size(); i++) {
            System.out.println(buildingList.get(i).toString());
        }
    }

    /*handle supertype with wildcard in List*/
    public static void addNewOffice(List<? super Office> officeList) {
        officeList.add(new Office());
        System.out.println();
    }
}
