

public class Driver{
public static void main(String args[]){
    Shape[]shapes=new Shape [6];
    
    shapes[0]=new Circle (5.0,"red",true);
    shapes[1]=new Rectangle(3.0,5.0,"blue",false);
    shapes[2]=new Triangle(3.0,4.0,5.0,"yellow",true);
    shapes[3]=new Pentagon(5.0,"green",false);
    shapes[4]=new House(6.0,"pink",true, new Triangle(6.0,6.0,6.0,"yellow",true), new Square(3.5,"purple",false) );
    shapes[5]=new Square(3.5,"purple",false);
    
    System.out.println("PERIMETER:");
    for(int i=0; i< shapes.length; i++){
    System.out.println(shapes[i].calculatePerimeter());
}

 System.out.println("AREA:");
    for(Shape s:shapes){
        System.out.println(s.calculateArea());  
    }
    
    
}
}

