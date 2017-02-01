package Shapes;

import java.math.BigDecimal;

/**
 * Created by andrey on 30.10.16.
 */
public abstract class Shape {

    public BigDecimal getArea() {
        return area;
    }

    public BigDecimal getPerimetr() {
        return perimetr;
    }

    private BigDecimal area;
    private BigDecimal perimetr;

    public abstract BigDecimal calculateArea();
    public abstract BigDecimal calculatePerimeter();

    @Override
    public String toString() {
        return String.format("Area = %.2f Perimetr = %.2f", area, perimetr);
    }

    public void setData(){
        area = calculateArea();
        perimetr = calculatePerimeter();
    }
}
