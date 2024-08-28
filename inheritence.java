 /*Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
 Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle. */


 class Shape {
    
     double getPerimeter() {
        return 0.0;
    }

     double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {

        double radius;

        //constructor
        Circle(double radius){
            this.radius=radius;
        }

        double getPerimeter(){
            return 2*Math.PI*radius;
        }

        double getArea(){
            return Math.PI*radius*radius;
        }

}
class Main{
public static void main (String[]args){

    double r=8.0;

    Circle c1=new Circle(r);
    System.out.println("Radius of circle = " +r);
    System.out.println("Perimeter of Circle " +c1.getPerimeter());
    System.out.println("Area of circle=" +c1.getArea());

    double r2=5.0;

    Circle c2=new Circle(r2);
    System.out.println("Radius of circle = " +r2);
    System.out.println("Perimeter of Circle " +c2.getPerimeter());
    System.out.println("Area of circle=" +c2.getArea());
}
}
