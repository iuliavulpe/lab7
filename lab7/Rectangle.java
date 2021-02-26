package lab7;

    class Rectangle extends Figure
    {
        private double width;
        private double height;


        Rectangle(double x, double y, double width, double height){

            super(x,y);
            this.width = width;
            this.height = height;
        }

        public double getPerimeter(){

            return width * 2 + height * 2;
        }

        public double getArea(){

            return width * height;

        }
    }
