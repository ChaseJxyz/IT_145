// Chase Anderson
// IT-145-16119-M01 Found in App Development 2026 C-3 (May - Jun)


public class Dog {
    /* Dog class to make Dog objects
    for unique dog customers at business
    inherits from Pet class */

    // class properties
    // TODO: something w/the DOG enum from pet
    private int dogSpaceNumber; // room number for dog customer
    private int dogWeight;      // weight of dog customer
    private boolean grooming;   // if pet parent ordered optional grooming (default false)

    // constructor methods
    // default constructor method with default values
    public Dog(){
        // defaults all values to 0/false/unknown
        dogSpaceNumber = 0;
        dogWeight = 0;
        grooming = false;
    }
    // constructor method with user-input values
    public Dog(int spaceNum, int weight, boolean  groom){
        // parameters captured in main()
        dogSpaceNumber = spaceNum;
        dogWeight = weight;
        grooming = groom;
    }

    // accessor/mutator methods for class properties
    // dogSpaceNumber setters/getters
    public void setDogSpaceNumber(int spaceNum){
        dogSpaceNumber = spaceNum;
    }
    public int getDogSpaceNumber(){
        return dogSpaceNumber;
    }

    // dogWeight setters/getters
    public void setDogWeight(int weight){
        dogWeight = weight;
    }
    public int getDogWeight(){
        return dogWeight;
    }

    // grooming setters/getters
    public void setGrooming(boolean groom){
        grooming = groom;
    }
    public boolean getGrooming(){
        return grooming;
    }
}