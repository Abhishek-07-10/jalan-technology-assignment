import java.util.HashMap;
import java.util.Scanner;

class Model {
    HashMap<String, Integer> map = new HashMap<>();

    public Model(int bs01, int ef01, int cf01, int bf01, int gf01) {
        map.put("BS01", bs01);
        map.put("EF01", ef01);
        map.put("CF01", cf01);
        map.put("BF01", bf01);
        map.put("GF01", gf01);
    }
}

class Servicing {

    HashMap<String, String> serviceFullForm = new HashMap<>();
    String nameFromMain;
    Model carModel;

    public Servicing(String nameFromMain) {
        this.nameFromMain = nameFromMain;
        serviceFullForm.put("BS01", "Basic Servicing");
        serviceFullForm.put("EF01", "Engine Fixing");
        serviceFullForm.put("CF01", "Clutch Fixing");
        serviceFullForm.put("BF01", "Brake Fixing");
        serviceFullForm.put("GF01", "Gear Fixing");
    }

    public void check() {
        if (this.nameFromMain.equals("Hatchback")) {
            Model hatchback = new Model(2000, 5000, 2000, 1000, 3000);
            carModel = hatchback;
        } else if (this.nameFromMain.equals("Sedan")) {
            Model sedan = new Model(4000, 8000, 4000, 1500, 6000);
            carModel = sedan;
        } else if (this.nameFromMain.equals("SUV")) {
            Model suv = new Model(5000, 10000, 6000, 2500, 8000);
            carModel = suv;
        }
    }

    public void calculateBill(String[] serviceList) {
        int totalBill = 0;
        System.out.println();
        for (String s : serviceList) {
            System.out.println("Charges for " + serviceFullForm.get(s) + " = " + carModel.map.get(s));
            totalBill += carModel.map.get(s);
        }
        System.out.println("Total price = " + totalBill);
        if (totalBill > 10000) {
            System.out.println("Complimentary services also added 'Full car washing'\n Enjoy it.....");
        }

    }
}

public class NewCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car name");
        String carName = sc.nextLine();
        System.out.println("Enter the full service list");
        String serviceList = sc.nextLine();
        sc.close(); 
        
        String[] list = serviceList.split(",");
        Servicing initializingService = new Servicing(carName);
        initializingService.check();
        initializingService.calculateBill(list);
    }
}
