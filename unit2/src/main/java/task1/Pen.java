package task1;

import java.util.Objects;

public class Pen {

    private String color;
    private String brend;

    public Pen(String color, String brend) {
        this.color = color;
        this.brend = brend;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Objects.equals(color, pen.color) &&
                Objects.equals(brend, pen.brend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brend);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", brend='" + brend + '\'' +
                '}';
    }
}
