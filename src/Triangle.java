import java.util.InputMismatchException;

public class Triangle {
    public double calcArea(double base, double height){
        if(height<=0 || base<=0) {
            throw new InputMismatchException("Hiba!");
        }
        return base * height / 2;
    }
}
