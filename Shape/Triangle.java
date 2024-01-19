

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    
    Triangle(double side1,double side2,double side3,String color,boolean filled){
        super(color, filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    
    Triangle(String color,boolean filled){
        super(color, filled);
    }
    
    //Accessor methods
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    //Mutator methods
    public void setSide1(double side1){
        this.side1=side1;
    }
    public void setSide2(double side2){
        this.side2=side2;
    }
    public void setSide3(double side3){
        this.side3=side3;
    }
    //Overiding methods
    public double calculatePerimeter(){
        return side1+side2+side3;
    }
 
    public double calculateArea(){
        double half=(side1+side2+side3)/2;
        return Math.sqrt(half*(half-side1)*(half-side2)*(half-side3));
    }
    /*
    public class myDriverClass{
      public static void main(String[]args){
        Triangle myTriag = new Triangle(3.0,4.0,5.0,"yellow",false);
        myTriag.displayInfo();
      }
    }
    */
}
