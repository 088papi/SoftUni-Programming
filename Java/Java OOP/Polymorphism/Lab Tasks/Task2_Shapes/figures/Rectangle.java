package figures;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }


    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    Double calculatePerimeter() {

        if (getPerimeter() == null){
            double perimeter = 2 * this.height + 2 * this.width;
            setPerimeter(perimeter);
        }

        return getPerimeter();
    }

    @Override
    Double calculateArea() {
        if (getArea() == null){
            Double area = this.height * this.width;
            setArea(area);

        }

        return getArea();
    }
}
