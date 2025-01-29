public class BMICalculator {

    public static void main(String[] args) {
        // Hardcoded values for weight and height
        double weight = 70; // in kilograms
        double height = 1.75; // in meters

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Display the result
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);
    }
}
 
    

