import java.util.ArrayList;
import java.util.List;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private List<ArticuloManufacturadoDetalle> detalles;

    public ArticuloManufacturado(String denominacion, String codigo, Double precioVenta, boolean habilitado,String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, codigo, precioVenta, habilitado);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.detalles = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public List<ArticuloManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<ArticuloManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
            detalles.add(detalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle) {
            detalles.remove(detalle);
    }
}
