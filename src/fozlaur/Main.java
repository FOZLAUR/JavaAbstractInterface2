package fozlaur;

public class Main {

    public static void main(String[] args) {
        Bus b = new Bus();
        Car c = new Car();
        Plane p = new Plane();
        Train t = new Train();
        int budget = 500;

        printDetails(b,budget);
        printDetails(c,budget);
        printDetails(p,budget);
        printDetails(t,budget);
    }

    public static void printDetails(TransportationInterface t, int budget){
        String transport = t.getClass().toString().replace("class fozlaur.","");
        System.out.println("Means of Transportation: "+transport);
        System.out.println("Cost: "+t.getCost()+" yuan");

        if(t.getCost() < budget){
            System.out.println("Remaining Budget: "+(budget-t.getCost())+" yuan");
        } else {
            System.out.println("This exceeds budget by "+(budget-t.getCost())*(-1)+" yuan");
        }
        System.out.println();
    }
}
