
public class Square extends Rectangle{
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    //Mutator Method
    public void setLength(double s){
    super.setLength(s);
    super.setWidth(s);
    }
    //Accessor Method
    public double getLength(){
    return super.getLength();
    }
    //Overiding
    public double calculatePerimeter(){
       return super.calculatePerimeter();
    }
    
    public double calculateArea(){
        return super.calculateArea();
    }
    
}

