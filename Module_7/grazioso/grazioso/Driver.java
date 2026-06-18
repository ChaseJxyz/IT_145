// Chase Anderson
// IT-145-16119-M01 Found in App Development 2026 C-3 (May - Jun)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver { 
    // Initialize RescueAnimal array lists
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // List of valid animal types
    private static final List<String> validAnimalsList = Arrays.asList("Dog","Monkey");

    public static void main(String[] args) {

        // Initialize lists of dummy data
        initializeDogList();
        initializeMonkeyList();

        // Clears the scanner, if needed

        String clearMe = "";

        // Starts menu and takes first user input
        Scanner scnr = new Scanner(System.in);
        displayMenu();
        String input =  scnr.next();

        // Switch case for input
        // default covers malformed input
        while(!input.equals("quit")){
        switch(input){
            case "1":
                intakeNewDog(scnr);
                break;
            case "2":
                intakeNewMonkey(scnr);
                break;
            case "3":
                reserveAnimal(scnr);
                break;
            case "4":
                printAnimals(dogList, true);
                break;
            case "5":
                printAnimals(monkeyList, true);
                break;
            case "6":
                printAnimals(null,false);
                break;
            case "q":
            case "Q":
                break;
            default:
                System.out.println("\nPlease input a valid menu option.\n");
                break;
        }

        // Determines what to do once chosen function(s) finish
            if(input.equalsIgnoreCase("q")){
                input = "quit";
                System.out.println("\nThis is an exit screen, thank you!\n");
            }
            else{
                System.out.println("Returning to main menu...");
                displayMenu();
                input = scnr.next();
            }
        }
    }



    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection:\n");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Donkey", "male", "44", "800", "07-09-1981", "Japan", "intake", false, "Skull Island", "0", "72", "70", "Capuchin");

        monkeyList.add(monkey1);
    }


    // Adds a new dog to dogList array
    public static void intakeNewDog(Scanner scanner) {
        String clearMe = "";
        System.out.println("\nWhat is the dog's name?\n");
        clearMe = scanner.nextLine();
        String name = scanner.nextLine();

        // Checks if dog already exists
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Prompts for/collects all relevant info
        System.out.println("\nWhat is the dog's breed?\n");
        String breed = scanner.nextLine();
        System.out.println("\nWhat is the dog's gender?\n");
        String gender = scanner.nextLine();
        System.out.println("\nWhat is the dog's age?\n");
        String age = scanner.nextLine();
        System.out.println("\nWhat is the dog's weight?\n");
        String weight = scanner.nextLine(); 
        System.out.println("\nWhen was the dog acquired?\n");
        String date = scanner.nextLine();
        System.out.println("\nWhere was the dog acquired?\n");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("\nWhat is the dog's training status?\n");
        String status = scanner.nextLine();


        System.out.println("\nIs the dog reserved?\n");
        System.out.println("Please only enter 'true' or 'false.'\n");
        boolean reserved = false;
        boolean boolError = true;
        // If input throws type error, re-prompts user for input
        do{
            try{
                reserved = scanner.nextBoolean();
                boolError = false;
            } catch (Exception e) {
                System.out.println("\nPlease enter 'true' or 'false' only.\n");
                clearMe = scanner.nextLine();
        }}while (boolError);    
        
        System.out.println("\nWhat is the dog's service country?\n");
        clearMe = scanner.nextLine();
        String serviceCountry = scanner.nextLine();       
        
        // Creates new dog and adds to array

        Dog tempDog = new Dog(name, breed, gender, age, weight, date, acquisitionCountry, status, reserved, serviceCountry);
        dogList.add(tempDog);
        System.out.println("\nAdded " + tempDog.getName() + " to the database!\n");
    }


	    // Adds a new monkey to monkeyList array
        public static void intakeNewMonkey(Scanner scanner) {
            String clearMe = "";
            System.out.println("\nWhat is the monkey's name?");
            String name = scanner.nextLine();        
            name = scanner.nextLine();

            // Checks if monkey already exists
            for(Monkey monkey: monkeyList){
                if(monkey.getName().equalsIgnoreCase(name)){
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; // returns to menu
                }
            }

            // Prompts for/collects all relevant info
            System.out.println("\nWhat is the monkey's gender?\n");
            String gender = scanner.nextLine();            
            System.out.println("\nWhat is the monkey's age?\n");
            String age = scanner.nextLine();
            System.out.println("\nWhat is the monkey's weight?\n");
            String weight = scanner.nextLine();      
            System.out.println("\nWhen was the monkey acquired?\n");
            String acquisitionDate = scanner.nextLine();
            System.out.println("\nWhere was the monkey acquired?\n");
            String acquisitionCountry = scanner.nextLine();          
            System.out.println("\nWhat is the monkey's training status?\n");
            String trainingStatus = scanner.nextLine();
            
            
            System.out.println("\nIs the monkey reserved?\n");
            System.out.println("Please only enter 'true' or 'false.'\n");
            boolean reserved = false;
            boolean boolError = true;
            // If input throws type error, re-prompts user for input            
            do{
                try{
                    reserved = scanner.nextBoolean();
                    boolError = false;
                } catch (Exception e) {
                    System.out.println("\nPlease enter 'true' or 'false' only.\n");
                    clearMe = scanner.nextLine();
            }}while (boolError);

            System.out.println("\nWhat is the monkey's service country?\n"); 
            clearMe = scanner.nextLine();
            String serviceCountry = scanner.nextLine();           
            System.out.println("\nWhat is the monkey's tail length?\n");
            String tailLength = scanner.nextLine();          
            System.out.println("\nWhat is the monkey's height?\n");
            String height = scanner.nextLine();         
            System.out.println("\nWhat is the monkey's body length?\n");
            String bodyLength = scanner.nextLine();            
            System.out.println("\nWhat is the monkey's species?\n");
            String species = scanner.nextLine();

            // Creates a new monkey and adds to array

            Monkey tempMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, serviceCountry, tailLength, height, bodyLength, species);
            monkeyList.add(tempMonkey);
            System.out.println("\nAdded " + tempMonkey.getName() + " to the database!\n");
        }


        // Reserves an animal for use
        public static void reserveAnimal(Scanner scanner) {
            String reservedAnimalName = "";
            
            // Prompt for search parameters
            System.out.println("\nPlease enter desired animal type.\n");
            System.out.println("Valid animal types: \n");

            // Iterates from list constant to print options
            validAnimalsList.forEach(System.out::println);
            System.out.println();

            // Capture input + normalizes input
            String clearMe = scanner.nextLine();
            String type = scanner.nextLine();
            String typeNormalized = type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();;
            boolean validType = false;

            // Searches list constant for animal type
            while (validType == false){
                if(!validAnimalsList.contains(typeNormalized)){
                    System.out.println("\nPlease enter a valid animal type.\n");
                    type = scanner.nextLine();                
            } 
                else{
                    validType = true;
                }
            }

            System.out.println("\nPlease enter desired service country.\n");
            String country = scanner.nextLine();

            // Checks dogList for available dog
            if(type.equalsIgnoreCase("dog")){
                for(Dog dog: dogList){
                    if(dog.getInServiceCountry().equalsIgnoreCase(country) && !dog.getReserved()){ // Same country AND is NOT reserved
                        System.out.println("\nDog found!\n");
                        reservedAnimalName = dog.getName();
                        dog.setReserved(true);
                        break;
                    }
                    else{
                        System.out.println("\nNo available dogs found in " + country + ".\n");
                        return;
                    }
                }
            }

            // Checks monkeyList for available monkeys
            else if (type.equalsIgnoreCase("monkey")){
                for(Monkey monkey: monkeyList){
                    if(monkey.getInServiceCountry().equalsIgnoreCase(country) && !monkey.getReserved()){ // Same country AND not reserved
                        System.out.println("\nMonkey found!\n");
                        reservedAnimalName = monkey.getName();
                        monkey.setReserved(true);
                        break;
                    }
                    else{
                        System.out.println("\nNo monkeys found in " + country + ".\n");
                        return;
                    }          
                }
            }
            else{ // This should never pop-up, but just in case...
                System.out.println("\nERROR invalid animal type\n");
                return;
            }

            // Confirmation message
            System.out.println("\n\n" + reservedAnimalName + " in " + country + " has been successfully reserved!\n\n");
        }

        // Prints List of all animals in given list(s)
        public static void printAnimals(ArrayList<? extends RescueAnimal> listType, boolean showReserved) {
            // ArrayList is reference to given array list
            // Boolean flag for showing reserved/"unavailable" animals or not
            
            if (listType == null) { // Runs if option to print all is selected
                printAnimals(dogList, false);
                printAnimals(monkeyList, false);
                return;
            }

            // Main loop for printing animals
            for(RescueAnimal animal : listType){
                if(!showReserved){ // if flag set to NOT show reserved animals
                    if (animal.getTrainingStatus().equalsIgnoreCase("in service") && animal.getReserved()) { // in service AND reserved i.e. not available
                        continue; // skip printing said animal
                    }}
                printSingleAnimal(animal); 
            }
            }


        // Function for printing details of a single animal
        public static void printSingleAnimal(RescueAnimal targetAnimal){
            /*Example output:
                            Sonic the Hedgehog
            */
            System.out.println("\n\n\t\t\t\t" + targetAnimal.getName() + " the " + (targetAnimal.getAnimalType().substring(0,1).toUpperCase() + targetAnimal.getAnimalType().substring(1)));
            System.out.println("--- Physical Characteristics ---");
            System.out.println("* Gender: " + targetAnimal.getGender());
            System.out.println("* Age: " + targetAnimal.getAge());
            System.out.println("* Weight: " + targetAnimal.getWeight());

            // Dog specific fields
            if(targetAnimal.getAnimalType().equalsIgnoreCase("dog")){
                System.out.println("* Breed: " + ((Dog)targetAnimal).getBreed());
            }

            // Monkey specific fields
            if(targetAnimal.getAnimalType().equalsIgnoreCase("monkey")){
                System.out.println("* Species: " + ((Monkey)targetAnimal).getSpecies());
                System.out.println("* Tail Length: " + ((Monkey)targetAnimal).getTailLength());
                System.out.println("* Height: " + ((Monkey)targetAnimal).getHeight());
                System.out.println("* Body Length: " + ((Monkey)targetAnimal).getBodyLength());
            }

            // Back to data for all animals
            System.out.println("--- Service Information ---");
            System.out.println("* Acquisition Date: " + targetAnimal.getAcquisitionDate());
            System.out.println("* Acquisition Country: " + targetAnimal.getAcquisitionLocation());
            System.out.println("* Training Status: " + targetAnimal.getTrainingStatus());
            System.out.println("* Reserved?: " + targetAnimal.getReserved());
            System.out.println("* Service Country: " + targetAnimal.getInServiceCountry() + "\n\n");
        }

        }