import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип фигуры:");
        System.out.println("1. Круг");
        System.out.println("2. Прямоугольник");
        System.out.println("3. Треугольник");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите радиус круга:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                ShapeManager shapeManager = new ShapeManager();
                System.out.println("Circle:");
                shapeManager.printShapeDetails(circle);
                break;
            case 2:
                System.out.println("Введите длину и ширину прямоугольника:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                shapeManager = new ShapeManager();
                System.out.println("Rectangle:");
                shapeManager.printShapeDetails(rectangle);
                break;
            case 3:
                System.out.println("Введите длины сторон треугольника:");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                shapeManager = new ShapeManager();
                System.out.println("Triangle:");
                shapeManager.printShapeDetails(triangle);
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}