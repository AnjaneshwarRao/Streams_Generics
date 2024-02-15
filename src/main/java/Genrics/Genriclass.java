package Genrics;

public class Genriclass <T extends Number, I extends Number> {

    public T getX() {
        return x;
    }



    T x;

    @Override
    public String toString() {
        return "Genriclass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public T getY() {
        return y;
    }

    T y;
  Genriclass(T x, T y){
      this.x = x;
      this.y = y;
  }


}
