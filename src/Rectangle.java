public class Rectangle {
    private static String color;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
        Rectangle.color = "yellow";
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectangle.color = (color != null) ? color : "yellow";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : 1.0;
    }

    @Override
    public String toString() {
        return String.format("Rectangle { width:%.2f, height:%.2f, color:%s }", width, height, color);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    // comment
}