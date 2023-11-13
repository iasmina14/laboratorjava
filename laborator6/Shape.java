package laborator6;

public abstract class Shape {
    public Shape(Integer l) {
        this.l = l;
    }

    public abstract Double area();
    public abstract Integer perimeter();
    protected Integer l;
    public void desen(){
        System.out.println("Area of shape" + area());
        System.out.println("Perimeter of shape" + perimeter());
    }

    public void desen(String culoare){
        System.out.println("Area of shape" + area());
        System.out.println("Perimeter of shape" + perimeter());
        System.out.println("Color shape " + culoare);
    }
    public static void afiseazaCeva(){
        System.out.println("Ceva");
    }
}
