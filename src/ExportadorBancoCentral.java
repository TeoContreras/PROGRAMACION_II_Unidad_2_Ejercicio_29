import java.util.List;
public class ExportadorBancoCentral extends ExportadorFinanciero {
    public void exportarDatos(List<String> registros) {
        if (validar(registros)) { System.out.println("Enviando al Banco Central..."); for (String r : registros) System.out.println(r); }
    }
}
