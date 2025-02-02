public class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display Circle Details
    public void displayCircleInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayCircleInfo();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(5.5);
        customCircle.displayCircleInfo();
    }
}
