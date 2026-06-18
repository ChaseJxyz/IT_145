// Chase Anderson
// IT-145-16119-M01 Found in App Development 2026 C-3 (May - Jun)


public class Monkey extends RescueAnimal {
    // Class for monkey-type rescue animals

    // Properties
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;


    // Constructor
    // only fixed value is animalType = "monkey"
    // (implied by Monkey class)
    public Monkey(String name, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) {
	this.setName(name);
    this.setAnimalType("monkey");
	this.setGender(gender);
	this.setAge(age);
	this.setWeight(weight);
	this.setAcquisitionDate(acquisitionDate);
	this.setAcquisitionLocation(acquisitionCountry);
	this.setTrainingStatus(trainingStatus);
	this.setReserved(reserved);
	this.setInServiceCountry(inServiceCountry);    
    this.tailLength = tailLength;
    this.height = height;
    this.bodyLength = bodyLength;
    this.species = species;
    }

    // Setters and Getters
    // tailLength
    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    // height
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    // bodyLength
    public String getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    // species
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}