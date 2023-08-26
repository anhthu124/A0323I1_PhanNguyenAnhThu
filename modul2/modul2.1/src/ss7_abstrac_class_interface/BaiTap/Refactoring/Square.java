package ss7_abstrac_class_interface.BaiTap.Refactoring;

public class Square implements IResizeable {
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }


    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    public void resize(double percent) {
        edge *= 1 + percent / 100.0;
    }
}
