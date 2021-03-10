package figures;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    Double calculatePerimeter() {
        if (getPerimeter() == null){
            double perimeter = 2 * Math.PI * radius;
            setPerimeter(perimeter);
        }
        return getPerimeter();
    }

    @Override
    Double calculateArea() {
        if (getArea() == null){
            Double area = Math.PI * radius * radius;
            setArea(area);

        }

        return getArea();

    }
}


