public class Sphere extends Circle {

//calls the Circle constructor using super
public Sphere(double radius){
super(radius);
}

@Override
//area() - returns the surface area of the sphere
public double getArea(){
    double radius = getArea();
    return 4 * Math.PI * radius * radius;
}

//volume() - returns the volume of the sphere
public double getVolume (){
    return (4.0/3.0) * Math.PI * radius * radius * radius;
}
    


}