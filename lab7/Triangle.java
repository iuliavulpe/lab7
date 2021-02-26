package lab7;

import java.lang.Math;

 public class Triangle
{
    double a;
    double b;
    double c;


    Triangle(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getPerimeter(){

        return a + b + c;
    }

    public double getArea( ){

        double area;
        return area = Math.abs((a-c)*(b-a)-(a-b)*(c-a));

    }
}