package org.WalkerCC_CompSci;

public class Shape {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Shape(
            double x1,
            double y1,
            double x2,
            double y2,
            double x3,
            double y3,
            double x4,
            double y4) {

        point1 = new Point(x1,y1);
        point2 = new Point(x2,y2);
        point3 = new Point(x3,y3);
        point4 = new Point(x4,y4);


    }

    public double getPoint1X() {
        return point1.getX();
    }

    public double getPoint1Y() {
        return point1.getY();
    }


    private class Point {
        private double x;
        private double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY(){
            return y;
        }
    }
}
