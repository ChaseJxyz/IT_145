import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                             

   public static void printArrayList
   (ArrayList<Plant> myGarden){
      int i = 1;
       for (Plant plant : myGarden) {
         System.out.println("Plant "+i+" Information: ");
         plant.printInfo();
         System.out.println();
         i+=1;
      }
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<Plant>();

      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String colorOfFlowers;
      boolean isAnnual;

      String thingType;
      String tempName;
      String tempCost;


      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower

        if (input.equalsIgnoreCase("plant")) {
            plantName = scnr.next();
            plantCost = scnr.next();
            Plant tempPlant = new Plant();
            tempPlant.setPlantName(plantName);
            tempPlant.setPlantCost(plantCost);
            myGarden.add(tempPlant);
         }
         else if (input.equalsIgnoreCase("flower")){
            plantName = scnr.next();
            plantCost = scnr.next();
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            Flower tempFlower = new Flower();
            tempFlower.setPlantName(plantName);
            tempFlower.setPlantCost(plantCost);
            tempFlower.setPlantType(isAnnual);
            tempFlower.setColorOfFlowers(colorOfFlowers);
            myGarden.add(tempFlower);
         }
         
        input = scnr.next();

         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
