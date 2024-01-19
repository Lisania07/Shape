public class Shape
{
   private String color;
   private boolean filled;
   public double calculatedArea;
   public double calculatedPerimeter;
   
   
   public Shape(String c,boolean f){
       color=c;
       filled=f;
   }
   
   public double calculateArea(){
       return 0;
   }
   
   public double calculatePerimeter(){
       return 0;
   }
   
   public void displayInfo(){
    if(filled){
       System.out.println("Color:"+color+",the shape is filled.");
    }else{
        System.out.println("Color:"+color+",the shape is not filled.");
    }
   } 

   public double getArea(){
       return calculatedArea;
   }
   
   public boolean isFill(){
       return filled;
   } 
   
   public void setArea(int a){
       calculatedArea=a;
   }
   
   public void setFill(boolean a){
       filled=a;
   }
}