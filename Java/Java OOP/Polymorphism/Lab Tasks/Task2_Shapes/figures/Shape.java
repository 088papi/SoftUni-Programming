package figures;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected Double getPerimeter(){
        return this.perimeter;
    }
    protected void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    protected Double getArea(){
        return this.area;
    }
    protected void setArea(Double area){
        this.area = area;
    }
    abstract Double calculatePerimeter();
    abstract Double calculateArea();
}
