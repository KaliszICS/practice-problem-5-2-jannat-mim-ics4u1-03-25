public class Circle {

public double radius;

//constructor takes in double as a parameter for the radius
public Circle(double radius){
    this.radius = radius; 
}

// returns diameter of the circle
public double getDiameter(){
    return this.radius * 2;
}

//returns perimeter of circle
public double getPerimeter(){
    return 2 * Math.PI * this.radius;
}

//returns area of the circle
public double getArea(){
    return Math.PI * this.radius * this.radius;
}

//getters and setters for radius
public double getRadius(){
    return radius;
}

public void setRadius(double newRadius){
    this.radius = newRadius;
}

}
