package org.example;
import java.util.Scanner;
public class shape{
    String typeOfShape;
    double length;
    double breadth;
    double radius;
    double side1;
    double side2;
    double side3;
    double base;
    double height;
    static final float pi = 3.14f;
    shape(float a,float b){
        length=a;
        breadth=b;
    }
    shape(float b1,float h1,float s1,float s2,float s3){
        base=b1;height=h1;side1=s1;side2=s2;side3=s3;
    }
    shape(float r){
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
            return (2*pi*radius);
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
            return (pi*radius*radius);
        }
        return 0.0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the shape for which you want to find Area and Perimeter");
        String op=sc.next();
        if((op.toUpperCase()).equals("RECTANGLE")){
            System.out.println("Enter the length of the Rectangle");
            float l=sc.nextFloat();
            System.out.println("Enter the breadth of the Rectangle");
            float b=sc.nextFloat();
            System.out.println("Select the Below required option"+"\n"+"1.Perimeter"+"\n"+"2.Area"+"\n"+"3.Both");
            int option=sc.nextInt();
            if(option==1){
                shape figure=new shape(l,b);
                double pm=figure.perimeter("rectangle");
                System.out.println("The perimeter of the Rectangle is-----"+pm);
            }
            else if(option==2){
                shape figure=new shape(l,b);
                double ar=figure.area("rectangle");
                System.out.println("The Area of the Rectangle is-----"+ar);
            }
            else if(option==3){
                shape figure=new shape(l,b);
                double pm=figure.perimeter("rectangle");
                System.out.println("The perimeter of the Rectangle is-----"+pm);
                shape figure1=new shape(l,b);
                double ar=figure1.area("rectangle");
                System.out.println("The Area of the Rectangle is-----"+ar);
            }
            else{
                System.out.println("Oh! choose the correct option");
            }
        }
        else if((op.toUpperCase()).equals("TRIANGLE")){
            System.out.println("Enter the base of the Triangle");
            float b1=sc.nextFloat();
            System.out.println("Enter the height of the Triangle");
            float h1=sc.nextFloat();
            System.out.println("Enter the three sides of the Triangle");
            float s1=sc.nextFloat();
            float s2=sc.nextFloat();
            float s3=sc.nextFloat();
            System.out.println("Select the Below required option"+"\n"+"1.Perimeter"+"\n"+"2.Area"+"\n"+"3.Both");
            int option=sc.nextInt();
            if(option==1){
                shape figure=new shape(b1,h1,s1,s2,s3);
                double pm1=figure.perimeter("Triangle");
                System.out.println("The perimeter of the Triangle is-----"+pm1);
            }
            else if(option==2){
                shape figure=new shape(b1,h1,s1,s2,s3);
                double ar1=figure.area("rectangle");
                System.out.println("The Area of the Triangle is-----"+ar1);
            }
            else if(option==3){
                shape figure=new shape(b1,h1,s1,s2,s3);
                double pm1=figure.perimeter("Triangle");
                System.out.println("The perimeter of the Triangle is-----"+pm1);
                shape figure2=new shape(b1,h1,s1,s2,s3);
                double ar1=figure2.area("rectangle");
                System.out.println("The Area of the Triangle is-----"+ar1);
            }
            else{
                System.out.println("Oh! choose the correct option");
            }
        }
        else if((op.toUpperCase()).equals("CIRCLE")){
            System.out.println("Enter the radius of the Circle");
            float r=sc.nextFloat();
            System.out.println("Select the Below required option"+"\n"+"1.Perimeter"+"\n"+"2.Area"+"\n"+"3.Both");
            int option=sc.nextInt();
            if(option==1){
                shape figure=new shape(r);
                double pm2=figure.perimeter("circle");
                System.out.println("The perimeter of the circle is-----"+pm2);
            }
            else if(option==2){
                shape figure=new shape(r);
                double ar2=figure.area("circle");
                System.out.println("The Area of the circle is-----"+ar2);
            }
            else if(option==3){
                shape figure=new shape(r);
                double pm2=figure.perimeter("circle");
                System.out.println("The perimeter of the circle is-----"+pm2);
                shape figure3=new shape(r);
                double ar2=figure3.area("circle");
                System.out.println("The Area of the circle is-----"+ar2);
            }

            else{
                System.out.println("Oh! choose the correct option");
            }
        }
        else{
            System.out.println("Please select the proper option");
        }
    }

}
