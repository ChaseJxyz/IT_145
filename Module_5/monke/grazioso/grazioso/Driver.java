// Chase Anderson
// IT-145-16119-M01 Found in App Development 2026 C-3 (May - Jun)

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // CHANGED: added monkeyList
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)


    public static void main(String[] args) {

        // Initialize lists of dummy data
        initializeDogList();
        initializeMonkeyList();

        // Starts menu and takes first user input
        Scanner scnr = new Scanner(System.in);
        displayMenu();
        String input =  scnr.next();

        // Switch case for input
        // FIXME: Replace placeholder test with actual methods
        // default covers malformed input
        while(!input.equals("quit")){
        switch(input){
            case "1":
                System.out.println("Dog intake choice");
                intakeNewDog(scnr);
                break;
            case "2":
                System.out.println("Monkey intake choice");
                intakeNewMonkey(scnr);
                break;
            case "3":
                System.out.println("Reserve an animal choice");
                reserveAnimal(scnr);
                break;
            case "4":
                System.out.println("Dog print list choice");
                printAnimals(input);
                break;
            case "5":
                System.out.println("Monkey list print choice");
                printAnimals(input);
                break;
            case "6":
                System.out.println("Non reserved list choice");
                printAnimals(input);
                break;
            case "q":
                System.out.println("Quit choice");
                System.out.println("This is where the app would close gracefully, but it's only placeholder text for now");
                // FIXME: exit app gracefully
                break;
            default:
                System.out.println("Erroneous input");
                break;
        }
        // determines what to do once chosen function(s) finish
            if(input.equals("q")){
                // FIXME: exit app gracefully
                input = "quit";
                System.err.println("This is an exit screen, thank you!");
            }
            else{
                System.err.println("Returning to main menu...");
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
        System.out.println("Enter a menu selection");
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
    //Optional for testing
    public static void initializeMonkeyList() {
        //TODO: more monkeys
        Monkey monkey1 = new Monkey("Donkey", "male", "44", "800", "07-09-1981", "Japan", "intake", false, "Skull Island", "0", "72", "70", "Capuchin");

        monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        //FIXME: figure out why it skips the first one
        String name = scanner.nextLine();
        name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            // Check if monkey is already in database
            //TODO: remove all the "you entered:" test lines
            System.out.println("What is the monkey's name?");
            //FIXME: it's probably the same issue as the dog one as to
            // why the first scanner doesn't "take"
            String name = scanner.nextLine();
            //System.out.println("You've entered: " + name);            
            name = scanner.nextLine();
            System.out.println("You've entered: " + name);
            for(Monkey monkey: monkeyList){
                if(monkey.getName().equalsIgnoreCase(name)){
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return;
                }
            }
            // Prompt/collect all relevant monkey info
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            System.out.println("You've entered: " + gender);            
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            System.out.println("You've entered: " + age);
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            System.out.println("You've entered: " + weight);            
            System.out.println("What was the monkey acquired?");
            String acquisitionDate = scanner.nextLine();
            System.out.println("You've entered: " + acquisitionDate);
            System.out.println("Where was the monkey acquired?");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("You've entered: " + acquisitionCountry);            
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
            System.out.println("You've entered: " + trainingStatus);            
            System.out.println("Is the monkey reserved?");
            System.out.println("Please only enter 'true' or 'false'");
            // FIXME: validate this input
            boolean reserved = scanner.nextBoolean();
            System.out.println("You've entered: " + reserved);            
            System.out.println("What is the monkey's service country?");
            // FIXME: this also has the skipping issue 
            String serviceCountry = scanner.nextLine();
            serviceCountry = scanner.nextLine();
            System.out.println("You've entered: " + serviceCountry);            
            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();
            System.out.println("You've entered: " + tailLength);            
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            System.out.println("You've entered: " + height);            
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            System.out.println("You've entered: " + bodyLength);            
            System.out.println("And, finally, what is the monkey's species?");
            String species = scanner.nextLine();
            System.out.println("You've entered: " + species);            
            // Make new monkey object and add to list
            Monkey tempMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, serviceCountry, tailLength, height, bodyLength, species);
            monkeyList.add(tempMonkey);
            System.out.println("Added " + tempMonkey.getName() + " to the database!");
        }


        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String listType) {
            System.out.println("The method printAnimals needs to be implemented");

        }
}

