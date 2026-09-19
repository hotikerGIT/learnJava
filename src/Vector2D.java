import java.util.Locale;

public class Vector2D {
    static int count = 0;
    double x, y;

    public Vector2D() {
        this.x = 1;
        this.y = 1;
        count++;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public Vector2D(Vector2D other) {
        if (this == other) return;
        this.x = other.x;
        this.y = other.y;
        count++;
    }

    public void print() {
        System.out.println(String.format(Locale.US, "%.2f", x) +
                    " " + String.format(Locale.US, "%.2f", y));
    }

    public double length() {
        return Math.sqrt(
                this.x * this.x + this.y * this.y
        );
    }

    public void add(Vector2D other) {
        this.x += other.x;
        this.y += other.y;
    }

    public void sub(Vector2D other) {
        this.x -= other.x;
        this.y -= other.y;
    }

    public void scale(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    public void normalized() {
        double len = length();

        this.x /= len;
        this.y /= len;
    }

    public double dotProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }
}
