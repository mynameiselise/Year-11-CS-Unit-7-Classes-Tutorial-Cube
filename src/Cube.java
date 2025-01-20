
// Job is to create one class called Cube.
public class Cube {

    // Cube has one single private integer variable called side, which represents the length of the side of the cube
    private int side;

    // The Cube class has two constructors. One takes no arguments (has no parameters) and sets side to 1.
    public Cube() {
        side = 1;
    } //this whole thing is a constructor
    //parameter should be in the ()
    // The other constructor will take a single integer argument that is used to initialize the side variable.
    public Cube(int side) {
        setSide(side);  // use the setter for validation
    }

    // Getter for side variable, which returns an integer that represents the length the cube's side

    public int getSide() {
        return side;
    }

    // Sets the value of the side. The side cannot be less than 1. If it is, throw an IllegalArgumentException with a message
    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } //throw means it returns an error (if it is 1 or greater, it's fine)
        this.side = side;
    }

    // A method that returns the surface area of the cube using the formula 6 x side x side
    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    // A method that returns the volume of the cube

    public int calculateVolume() {
        return side * side * side;
    }

    // A toString method that returns a String in the format, for example: Cube{side=4}
    @Override
    public String toString() {
        return "Cube{side=" + side + "}";
    }

}
