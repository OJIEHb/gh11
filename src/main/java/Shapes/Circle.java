package Shapes;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrey on 30.10.16.
 */
public class Circle extends Shape {
    private Scanner input = new Scanner(System.in);
    private double radius;

    public void setData(double radius){
        this.radius = radius;
        super.setData();
    }

    @Override
    public BigDecimal calculateArea() {
        return new BigDecimal(Math.PI * Math.pow(radius,2));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return new BigDecimal(2*Math.PI * radius);
    }

}
