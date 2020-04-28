package collections;

public class Some {

    private Integer x;

    public Some(Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.valueOf(x);
    }
}
