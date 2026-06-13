// Chase Anderson
// IT-145-16119-M01 Found in App Development 2026 C-3 (May - Jun)

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0;
        double wallWidth = 0;
        double wallArea;
        double gallonsPaintNeeded;
        final double squareFeetPerGallons = 350.0;

        // Error handling variables
        String clearLine; // only used to clear scanner for invalid input
        String genericErrorText = "Invalid input. Please enter digits, with or without a decimal point.";
        String mathErrorText = "Measurements of physical objects cannot be 0 or negative. Please enter digits, with or without a decimal point.";
        
        // Prompt user to input wall's height
        boolean heightCorrect = false;
        System.out.println("Enter wall height (in feet): ");
        while(!heightCorrect){
            try {
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0) {
                    throw new ArithmeticException(mathErrorText);
                }
                heightCorrect = true;}
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(genericErrorText);
                clearLine = scnr.nextLine();
            }
        }

        // Prompt user to input wall's width
        boolean widthCorrect = false;
        System.out.println("Enter wall width (in feet): ");
        while(!widthCorrect){
            try {
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0) {
                    throw new ArithmeticException(mathErrorText);
                }
                widthCorrect = true;
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(genericErrorText);
                clearLine = scnr.nextLine();
            }
        }

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
