import java.util.ArrayList;
import java.util.List;


public class MainCirculo {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();

        Circulo circulo1 = new Circulo(1.0);
        Circulo circulo2 = new Circulo(2.0);
        Circulo circulo3 = new Circulo(3.0);
        Circulo circulo4 = new Circulo(4.0);
        Circulo circulo5 = new Circulo(5.0);

        //tem que sempre lembrar do add pq é ele que o adiciona na lista
        circulos.add(circulo1);
        circulos.add(circulo2);
        circulos.add(circulo3);
        circulos.add(circulo4);
        circulos.add(circulo5);

        //é o que percorre a lista e imprime a area de cada circulo
        for (Circulo circulo : circulos) {
            System.out.println("Area do circulo: " + circulo.calcularArea());
        }
    }
}
