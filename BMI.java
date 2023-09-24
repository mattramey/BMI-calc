import java.util.Scanner;


public class BMI {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter weight in pounds: ");

  // Instantiate scanner class
        try (
        Scanner input = new Scanner (System.in) ){

// initialize var weight
            Double weight = input.nextDouble();
            
        
// get user input
        System.out.println("Enter height, feet: ");

// initialize var feet
        Double feet = input.nextDouble();

// get user input
        System.out.println("Enter height, inches:");

// initialize var inches
  Double inches = input.nextDouble();

  //convert feet to inches 
  Double newHeight = ((feet * 12) + inches);

  // BMI formula  weight (lb) / [height (in)]^2 x 703

  Double BodyMassIndex = (weight / Math.pow(newHeight,2) * 703 );

  System.out.println("BMI is " + BodyMassIndex);

  // delcare what range you body mass is falls in
  if(BodyMassIndex <= 24.9){

  System.out.println("normal");

  }

    else if (BodyMassIndex >= 30.0){

    System.out.println("You're obese :( ");

}

    else if (BodyMassIndex >= 25.0){

    System.out.println("Overweight ");

 }  
  
        }
    }
}
