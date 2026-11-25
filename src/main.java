import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {
        List<String> registros = new ArrayList<String>();
        registros.add("Balance: 150000"); registros.add("Gastos: 40000");
        ArrayList<ExportadorFinanciero> exportadores = new ArrayList<ExportadorFinanciero>();
        exportadores.add(new ExportadorBancoCentral());
        exportadores.add(new ExportadorAgenciaTributaria());
        for (ExportadorFinanciero e : exportadores) e.exportarDatos(registros);
    }
}
