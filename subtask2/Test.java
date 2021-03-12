package subtask2;

import java.util.Scanner;

public class Test {

    private static Logistics logistics;

    public static void main(String[] args) {
        initialize();
        logistic();
    }

    static void logistic() {
        logistics.planDelivery();
    }

    static void initialize() {
        String transport = "ship";
        if (transport.equals("truck")) {
            logistics = new RoadLogistics();
        } else if (transport.equals("ship")) {
            logistics = new SeaLogistics();
        }
    }
}
