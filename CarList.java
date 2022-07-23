/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Naviank
 */
public class CarList extends ArrayList<Car> {

    BrandList brandList;

    public CarList(BrandList bList) {
        brandList = bList;
    }

    public boolean loadFromFile(String filename) {
        return true;
    }

    public boolean saveToFile(String filename) {
        return true;
    }

    public int searchID(String carID) {
        int n = this.size();
        for (int i = 0; i < n; i++) {
            if (this.get(i).carID.equals(carID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchFrame(String frameID) {
        int n = this.size();
        for (int i = 0; i < n; i++) {
            if (this.get(i).frameID.equals(frameID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngine(String engineID) {
        int n = this.size();
        for (int i = 0; i < n; i++) {
            if (this.get(i).carID.equals(engineID)) {
                return i;
            }
        }
        return -1;
    }

    public void addCar() {
        Scanner sc = new Scanner(System.in);
//Enter ID     
        System.out.print("Enter car ID: ");
        String cID = MyLibs.inputStr();
        while (searchID(cID) != -1) {
            System.out.println("This carID has been existed!");
            System.out.println("Please enter another carID!");
            cID = MyLibs.inputStr();
        }
//Enter Brand 
        Menu mn = new Menu();
        Brand nBrand = (Brand) mn.ref_getChoice(brandList);
//Enter Color        
        System.out.print("Enter color of car: ");
        String nColor = sc.nextLine();
        while (!"\n".equals(nColor)) {
            System.out.println("Color mustn't be empty!");
            System.out.print("\nEnter the color again: ");
            nColor = sc.nextLine();
        }
//Enter FrameID        
        System.out.print("Enter frameID: ");
        String fID = sc.nextLine();
        while (true) {
            if (MyLibs.checkFirstChar(fID, 'F') && MyLibs.checkStringLength(fID, 5) && searchFrame(fID) != -1) {
                System.out.println("This frameID has been existed!");
                System.out.println("Please enter another frameID!");
                fID = sc.nextLine();
                break;
            } else {
                System.out.println("Wrong format of frameID (F0000)!");
                System.out.println("Please enter another frameID!");
                fID = sc.nextLine();
            }
        }
//Enter EngineID
        System.out.print("Enter engineID: ");
        String eID = sc.nextLine();
        while (true) {
            if (MyLibs.checkFirstChar(eID, 'E') && MyLibs.checkStringLength(eID, 5) && searchFrame(eID) != -1) {
                System.out.println("This engineID has been existed!");
                System.out.println("Please enter another engineID!");
                eID = sc.nextLine();
                break;
            } else {
                System.out.println("Wrong format of engineID (E0000)!");
                System.out.println("Please enter another engineID!");
                eID = sc.nextLine();
            }
        }
//Add new car
        Car tmp = new Car(cID, nColor, fID, eID, nBrand);
        this.add(tmp);
    }

    public void printBasedBrandName() {
        Scanner sc = new Scanner(System.in);
        int n = this.size();
        int count = 0;
        String part = sc.next();
        for (int i = 0; i < n; i++) {
            Car c = this.get(i);
            if (c.brand.brandName.contains(part)) {
                System.out.println(c.screenString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No car is detected!");
        }
    }

    public void listCars() {
        Collections.sort(this);
        int n = this.size();
        for (int i = 0; i < n; i++) {
            Car c = this.get(i);
            System.out.println(c.screenString());
        }
    }

    public void removeCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
