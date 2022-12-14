import java.util.Scanner;

public class tablero {
    private static Scanner sc = new Scanner(System.in);
    private static String letraF;
    private static String posicion;
    private static String[][] tab = {
            {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
            {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
            {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
            {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}
    };

    public static String RecorrerArray(String[][] tab2) {
        int error = 0;
        System.out.println("Ficha: ");
        letraF = sc.nextLine();
        System.out.println("Posición: ");
        posicion = sc.nextLine();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (posicion.equals(tab[i][j])) {
                    error++;
                }
            }
        }
        if (error == 1) {
            System.out.println("BIEN");
        } else {
            System.out.println("ERROR");
        }
        return "";
    }
    public static String Rey(String pos) {
        String num = "12345678";
        String letras = "abcdefgh";
        String mov = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (posicion.equals(tab[i][j])) {
                    for (int o = 0; o < letras.length(); o++) {
                            if (letras.charAt(o) == pos.charAt(0)) {
                                    mov += letras.charAt(o + 1);
                            }
                        }
                    for (int u = 0; u < num.length(); u++) {
                        if (num.charAt(u) == pos.charAt(1)) {
                            mov += num.charAt(u + 1);
                        }
                    }
                }
            }
        }
        System.out.println(mov);
        return "";
    }

    public static void main(String[] args) {
        RecorrerArray(tab);
        Rey(posicion);
    }
}

