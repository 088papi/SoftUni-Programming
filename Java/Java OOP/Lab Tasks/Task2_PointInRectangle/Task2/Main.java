package Task2;

import Task2.IOUtils.ConsoleReader;
import Task2.IOUtils.InputParser;
import Task2.geometry.GeometryFactory;
import Task2.geometry.Point2D;
import Task2.geometry.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();

        int[] rectangleInfo = InputParser.parseArray(reader.readLine(),"\\s+");

        Rectangle rectangle = GeometryFactory.createRectangle(rectangleInfo);
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            int[] pointInfo = InputParser.parseArray(reader.readLine(),"\\s+");

           Point2D point2D =  GeometryFactory.createPoint2D(pointInfo);
            System.out.println(rectangle.contains(point2D));


        }


    }
}
