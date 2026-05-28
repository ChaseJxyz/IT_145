// Chase Anderson
// IT-145-16119-M01 Found in App Development 2026 C-3 (May - Jun)


public class Pet {

    /* Pet class to make pet objects
    (dogs or cats, which will inherit
    from this) */

    // class properties
    
    // enum for pet type for cat/dog classes
    enum PetType {
        CAT,
        DOG,
        UNKNOWN
    }
    private PetType petType; // pet species
    private String petName;  // pet customer name
    private int petAge;      // pet customer age (human years)
    private int dogSpaces;   // num available dog rooms
    private int catSpaces;   // num available cat rooms
    private int daysStay;    // length of booked stay
    private int amountDue;   // sum of total services (cents)

    // constructor methods
    // default constructor method with default values
    public Pet(){
        // defaults all values to 0/false/unknown
        PetType petType = PetType.UNKNOWN;
        petName = "UNKNOWN";
        petAge = 0;
        dogSpaces = 0;
        catSpaces = 0;
        daysStay = 0;
        amountDue = 0;
    }
    // constructor method with user-input values
    public Pet(PetType type, String name, int age, int numDogSpaces, int numCatSpaces, int stayLength, int balance){
        //parameters captured in main()
        petType = type;
        petName = name;
        petAge = age;
        dogSpaces = numDogSpaces;
        catSpaces = numCatSpaces;
        daysStay = stayLength;
        amountDue = balance;
    }

    // accessor/mutator methods for class properties
    // petType setters/getters
    public void setPetType(PetType type){
        petType = type;
    }
    public PetType getPetType(){
        return petType;
    }

    // petName setters/getters
    public void setPetName(String name){
        petName = name;
    }
    public String getPetName(){
        return petName;
    }

    // petAge setters/getters
    public void setPetAge(int age){
        petAge = age;
    }
    public int getPetAge(){
        return petAge;
    }

    // dogSpaces setters/getters
    public void setDogSpaces(int spaces){
        dogSpaces = spaces;
    }
    public int getDogSpaces(){
        return dogSpaces;
    }

    // catSpaces setters/getters
    public void setCatSpaces(int spaces){
        catSpaces = spaces;
    }
    public int getCatSpaces(){
        return catSpaces;
    }

    // daysStay setters/getters
    public void setDaysStay(int stayLength){
        daysStay = stayLength;
    }
    public int getDaysStay(){
        return daysStay;
    }

    // amountDue setters/getters
    public void setAmountDue(int balance){
        amountDue = balance;
    }
    public int getAmountDue(){
        return amountDue;
    }
}
