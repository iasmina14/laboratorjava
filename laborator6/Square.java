package laborator6;

public class Square extends Shape implements Exemplu{
    public Square(Integer l) {
        super(l);
    }

    @Override
    public Double area() {
        return Double.valueOf(l*l);
    }
    @Override
    public Integer perimeter(){
        return l*4;
    }

    @Override
    public void methodExemplu() {

    }
}
