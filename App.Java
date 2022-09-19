public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean suspended = false;
        boolean holiday = true;
        


        if (suspended) {
            System.out.println(" Stay at home ");
        }
        else if ( holiday ) {
            System.out.println(" Stay with my family ");
    }
        
        else {
            // Step 1
            walk();

            // Step 2
            rideTricycle();

            // Step 3
            walk2();

            // Step 4
            rideJeep();

            // Step 5
            rideTricycle2();
        }

    }

    static void walk() {
        System.out.println(" Walk for 15 minutes to ride Tricycle ");
    }

    static void rideTricycle() {
        System.out.println(" Ride tricycle to Pier ");
        System.out.println(" Exit tricycle to Jeep ");
    }

    static void walk2() {
        System.out.println(" Walk for 10 minutes to ride Jeep");
    }

    static void rideJeep() {
        System.out.println(" Ride jeep to España ");
        System.out.println(" Exit jeep to overpass ");
    }

    static void rideTricycle2() {
        System.out.println(" Ride tricycle to NU");
    }
}
