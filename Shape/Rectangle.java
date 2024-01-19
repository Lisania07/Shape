

public class Rectangle extends Shape{
   private double len;
   private double wid;
   //Constructor
   public Rectangle(double l,double w, String color, boolean filled){
        super(color, filled);
        len=l;
        wid=w;
    }
    //Accessor methods
   public double getWidth(){
       return wid;
   } 
   public  double getLength(){
       return len;
   }
    //Mutator methods
   public void setLength(double len){
       this.len=len;
   }
   public void setWidth(double wid){
       this.wid=wid;
   }
   //Overiding methods
    public double calculateArea(){
        return len*wid;
    }
    public double calculatePerimeter(){
        return 2*(len+wid);
    }
    
    public class myDriverClass{
        public static void main(String[]args){
          Rectangle myRect = new Rectangle(10.0,5.0,"Blue",true);
          myRect.displayInfo();
        }
    }
}

