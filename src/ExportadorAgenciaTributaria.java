import java.util.List;
public class ExportadorAgenciaTributaria extends ExportadorFinanciero {
    public void exportarDatos(List<String> registros) {
        if (validar(registros)) { System.out.println("Enviando a Agencia Tributaria..."); for (String r : registros) System.out.println(r); }
    }
}
