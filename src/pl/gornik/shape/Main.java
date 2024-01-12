package pl.gornik.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("Kwadrat", 'M', ColorType.BLUE));
        shapes.add(new Shape("Koło", 'M', ColorType.GREEN));
        shapes.add(new Shape("Trójkąt", 'M', ColorType.YELLOW));
        shapes.add(new Shape("Romb", 'M', ColorType.BLACK));


        System.out.println("Wprowadź nazwę, rozmiar ('S', 'M', 'L') oraz kolor");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char size = scanner.nextLine().charAt(0);

        ColorType color = getColor(scanner.nextLine());
        if (color != null) {
            shapes.add(new Shape(name, size, color));
        } else {
            System.out.println("Wprowadziłeś niepoprawną wartość");
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static ColorType getColor(String colorString) {
        switch (colorString) {
            case "czerwony" -> {
                return ColorType.RED;
            }
            case "niebieski" -> {
                return ColorType.BLUE;
            }
            case "żółty" -> {
                return ColorType.YELLOW;
            }
            case "zielony" -> {
                return ColorType.GREEN;
            }
            case "czarny" -> {
                return ColorType.BLACK;
            }
            case "biały" -> {
                return ColorType.WHITE;
            }
            default -> {
                return null;
            }
        }
    }
}