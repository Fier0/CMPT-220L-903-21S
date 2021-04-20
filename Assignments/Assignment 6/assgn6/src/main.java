public class main {
    public static void main(String[] args) {
        Plant rose = new Plant(true, "flower", "rose"); // creates a rose
        if(rose.getWatering()){ // gets the watering instructions if needed
            System.out.println(rose.wateringInstructions());
        }
        System.out.println(rose.sunlightRequirements());

    }
}

