public class Circle extends Shape{
    private double radius=0;
    //Constructor
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    //Accessor methods
    public double getRadius(){
        return radius;
    }
    //Mutator methods
    public void setRadius(double a){
        radius=a;
    }
    //Overiding methods
    public double calculateArea(){
       return calculatedArea=Math.PI * Math.pow(radius, 2);
    }
    public double calculatePerimeter(){
        return calculatedPerimeter=Math.PI * (2 * radius);
    }
    //Test
    public class myDriverClass { 
      public static void main(String[] args) {
        Circle myCircle = new Circle(5.0,"Red",true);
        myCircle.displayInfo();
      }
    }  
}


