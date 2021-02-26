package lab7;

abstract class Figure{

    double x;
    double y;

    Figure(double x, double y){

        this.x=x;
        this.y=y;
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}

