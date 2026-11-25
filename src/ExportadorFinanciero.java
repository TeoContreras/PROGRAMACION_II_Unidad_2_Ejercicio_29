import java.util.List;
public abstract class ExportadorFinanciero {
    public boolean validar(List<String> registros) {
        if (registros == null || registros.isEmpty()) { System.out.println("No hay registros para exportar."); return false; }
        return true;
    }
    public abstract void exportarDatos(List<String> registros);
}
