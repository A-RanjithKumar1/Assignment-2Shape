package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class shapeS{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String typeOfShape;
    double length;
    double breadth;
    double radius;
    double side1;
    double side2;
    double side3;
    double base;
    double height;
    static final float pI = 3.14f;
    shapeS(float a,float b){
        length=a;
        breadth=b;
    }
    shapeS(float b1,float h1,float s1,float s2,float s3){
        base=b1;height=h1;side1=s1;side2=s2;side3=s3;
    }
    shapeS(float r){
        radius=r;
    }
    public double perimeter(String s){
        if((s.toUpperCase()).equals("TRIANGLE")){
            return (side1+side2+side3);
        }
        else if((s.toUpperCase()).equals("RECTANGLE")){
            return (2*(length+breadth));
        }
        else if((s.toUpperCase()).equals("CIRCLE")){
            return (2*pI*radius);
        }
        return 0.0;
    }
    public double area(String s){
        if((s.toUpperCase()).equals("TRIANGLE")){
            return (1.5*base*height);
        }
        else if((s.toUpperCase()).equals("RECTANGLE")){
            return (length*breadth);
        }
        else if((s.toUpperCase()).equals("CIRCLE")){
            return (pI*radius*radius);
        }
        return 0.0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LOGGER.log(Level.INFO,"Please enter the shape for which you want to find Area and Perimeter");
        String op=sc.next();
        if((op.toUpperCase()).equals("RECTANGLE")){
            LOGGER.log(Level.INFO,"Enter the length of the Rectangle");
            float l=sc.nextFloat();
            LOGGER.log(Level.INFO,"Enter the breadth of the Rectangle");
            float b=sc.nextFloat();
            LOGGER.log(Level.INFO,"Select the Below required option"+"\n"+"1.Perimeter"+"\n"+"2.Area"+"\n"+"3.Both");
            int option=sc.nextInt();
            if(option==1){
                shapeS figure=new shapeS(l,b);
                double pm=figure.perimeter("rectangle");
                LOGGER.log(Level.INFO,"The perimeter of the Rectangle is-----"+pm);
            }
            else if(option==2){
                shapeS figure=new shapeS(l,b);
                double ar=figure.area("rectangle");
                LOGGER.log(Level.INFO,"The Area of the Rectangle is-----"+ar);
            }
            else if(option==3){
                shapeS figure=new shapeS(l,b);
                double pm=figure.perimeter("rectangle");
                LOGGER.log(Level.INFO,"The perimeter of the Rectangle is-----"+pm);
                shapeS figure1=new shapeS(l,b);
                double ar=figure1.area("rectangle");
                LOGGER.log(Level.INFO,"The Area of the Rectangle is-----"+ar);
            }
            else{
                LOGGER.log(Level.INFO,"Oh! choose the correct option");
            }
        }
        else if((op.toUpperCase()).equals("TRIANGLE")){
            LOGGER.log(Level.INFO,"Enter the base of the Triangle");
            float b1=sc.nextFloat();
            LOGGER.log(Level.INFO,"Enter the height of the Triangle");
            float h1=sc.nextFloat();
            LOGGER.log(Level.INFO,"Enter the three sides of the Triangle");
            float s1=sc.nextFloat();
            float s2=sc.nextFloat();
            float s3=sc.nextFloat();
            LOGGER.log(Level.INFO,"Select the Below required option"+"\n"+"1.Perimeter"+"\n"+"2.Area"+"\n"+"3.Both");
            int option=sc.nextInt();
            if(option==1){
                shapeS figure=new shapeS(b1,h1,s1,s2,s3);
                double pm1=figure.perimeter("Triangle");
                LOGGER.log(Level.INFO,"The perimeter of the Triangle is-----"+pm1);
            }
            else if(option==2){
                shapeS figure=new shapeS(b1,h1,s1,s2,s3);
                double ar1=figure.area("rectangle");
                LOGGER.log(Level.INFO,"The Area of the Triangle is-----"+ar1);
            }
            else if(option==3){
                shapeS figure=new shapeS(b1,h1,s1,s2,s3);
                double pm1=figure.perimeter("Triangle");
                LOGGER.log(Level.INFO,"The perimeter of the Triangle is-----"+pm1);
                shapeS figure2=new shapeS(b1,h1,s1,s2,s3);
                double ar1=figure2.area("rectangle");
                LOGGER.log(Level.INFO,"The Area of the Triangle is-----"+ar1);
            }
            else{
                LOGGER.log(Level.INFO,"Oh! choose the correct option");
            }
        }
        else if((op.toUpperCase()).equals("CIRCLE")){
            LOGGER.log(Level.INFO,"Enter the radius of the Circle");
            float r=sc.nextFloat();
            LOGGER.log(Level.INFO,"Select the Below required option"+"\n"+"1.Perimeter"+"\n"+"2.Area"+"\n"+"3.Both");
            int option=sc.nextInt();
            if(option==1){
                shapeS figure=new shapeS(r);
                double pm2=figure.perimeter("circle");
                LOGGER.log(Level.INFO,"The perimeter of the circle is-----"+pm2);
            }
            else if(option==2){
                shapeS figure=new shapeS(r);
                double ar2=figure.area("circle");
                LOGGER.log(Level.INFO,"The Area of the circle is-----"+ar2);
            }
            else if(option==3){
                shapeS figure=new shapeS(r);
                double pm2=figure.perimeter("circle");
                LOGGER.log(Level.INFO,"The perimeter of the circle is-----"+pm2);
                shapeS figure3=new shapeS(r);
                double ar2=figure3.area("circle");
                LOGGER.log(Level.INFO,"The Area of the circle is-----"+ar2);
            }

            else{
                LOGGER.log(Level.INFO,"Oh! choose the correct option");
            }
        }
        else{
            LOGGER.log(Level.INFO,"Please select the proper option");
        }
    }

}
