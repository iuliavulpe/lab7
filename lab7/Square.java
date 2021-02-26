package lab7;

class Square extends Figure
{
    private double length;


    Square(double x, double length ){

        super(x, length);
        this.length = length;
    }

    public double getPerimeter(){

        return length * 4;
    }

    public double getArea(){

        return length * 2;

    }
}

