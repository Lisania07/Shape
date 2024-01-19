public class House extends Shape{
    Triangle roof;
    Square base;
    private double side;
    
    public House(double side, String color, boolean filled, Triangle roof, Square base){
        super(color,filled);
        this.side=side;
        this.roof=roof;
        this.base=base;
           
    }
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double side){
        this.side=side;
    }
    
    public double calculateArea(){
       return roof.calculateArea()+base.calculateArea();
    }
    
    public double calculatePerimeter(){
        return roof.calculatePerimeter()+base.calculatePerimeter()-2*base.getLength();
    }
}
