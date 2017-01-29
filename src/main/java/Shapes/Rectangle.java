package Shapes;

import Shapes.Shape;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrey on 30.10.16.
 */
public class Rectangle extends Shape {
    private Scanner input = new Scanner(System.in);
    private double sideA;
    private double sideB;
    private Triangle triangle;

    public void setData(Double sideA, Double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
        triangle = rectangleTriangles();
        super.setData();
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(sideA * sideB);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal((sideA * 2)+(sideB*2));
    }

    public Triangle rectangleTriangles(){
        Triangle triangle = new Triangle();
        triangle.setData(sideA,sideB);
        return triangle;
    }

    @Override
    public String toString() {
        String s = String.format("\nTriangles params: \nA = %.2f\nB = %.2f\nC = %.2f\n",triangle.getSideA(),triangle.getSideB(),triangle.getSideC());
        return super.toString()+ s + triangle.toString();
    }
}
