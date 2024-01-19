public class Pentagon extends Triangle{
    private double sideLength;

   public Pentagon(double sideLength,String color,boolean filled){
       super(color,filled);
       this.sideLength=sideLength;
   }
   public double getSideLength(){
       return sideLength;
   }
   public void setSideLength(double sideLength){
       this.sideLength=sideLength;
   }
   public double calculateArea(){
       return 5*(sideLength/2/Math.tan(36)*sideLength/2);
   }
   public double calculatePerimeter(){
       return 5*sideLength;
    }
}
