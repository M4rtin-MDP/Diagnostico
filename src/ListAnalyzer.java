import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    public static int contadorImpares(List<Integer> lista){
        int cuenta = 0;
        for (int numero : lista) {
            if (numero % 2 != 0) {
                cuenta += 1;
            }
        }
        return cuenta;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> lista) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int numero : lista) {
            if (consecutivos.isEmpty() || consecutivos.get(consecutivos.size() - 1) < numero) {
                    consecutivos.add(numero);
                }
            if (consecutivos.get(consecutivos.size() - 1) > numero) {
                    consecutivos.clear();
                    consecutivos.add(numero);
                }
            }
        return consecutivos;
    }
}
