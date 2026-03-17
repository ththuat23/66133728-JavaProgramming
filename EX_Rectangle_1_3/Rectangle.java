package EX_Rectangle_1_3;

public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    // Constructor mặc định
    public Rectangle() {
    }

    // Constructor có tham số
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter length
    public float getLength() {
        return length;
    }

    // Setter length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter width
    public float getWidth() {
        return width;
    }

    // Setter width
    public void setWidth(float width) {
        this.width = width;
    }

    // Tính diện tích
    public double getArea() {
        return length * width;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Hiển thị thông tin
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}