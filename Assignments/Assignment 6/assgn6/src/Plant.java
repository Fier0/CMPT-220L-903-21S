public class Plant{
    // initialize variables
    boolean watering;

    // create object
    public Plant(boolean needsWatering, String plantFamily, String name){
        watering = needsWatering;
        System.out.println("Name: "+name+" | Family: "+ plantFamily + " | Needs watering? "+ needsWatering);
    }

    // get watering boolean
    public boolean getWatering(){
        return watering;
    }

    // print watering instructions
    public String wateringInstructions(){
    return "water this plant daily until the soil is soaked. Do not over water.";
    }

    // print sunlight requirements
    public String sunlightRequirements(){
        return "Keep this plant in good sunlight.";
    }
}
