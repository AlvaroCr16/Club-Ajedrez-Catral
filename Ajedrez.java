import java.util.Scanner;
public class Ajedrez {

    public static String inicio(){
        System.out.println("¡¡Buenas!!¿Qué pieza quieres situar en el tablero?");
        System.out.println("P-Peón");
        System.out.println("T-Torre");
        System.out.println("C-Caballo");
        System.out.println("A-Álfil");
        System.out.println("R-Rey");
        System.out.println("D-Dama");
        Scanner sc = new Scanner(System.in);
        String piezainicial = sc.nextLine();
        System.out.println("¿¿Dónde quieres situar la pieza??(Recuerda que el tablero es 8x8, A-H y 1-8, Ej:B6,C2,G8...)");
        Scanner sc2 = new Scanner(System.in);
        String posicioninicial = sc2.nextLine();
return "";
    }



    public static void main(String[] args) {
        Ajedrez fin = new Ajedrez();
        System.out.println(inicio());
    }

}
