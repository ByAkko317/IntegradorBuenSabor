import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String denominacion,codigo;
    private Double precioVenta;
    private boolean habilitado;

    private List<Imagen> imagenes;

    public Articulo(String denominacion, String codigo, Double precioVenta, boolean habilitado) {
        this.denominacion = denominacion;
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.habilitado = habilitado;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public void addImagen(Imagen imagen){
        if(this.imagenes==null) this.imagenes=new ArrayList<>();
        if(imagenes!=null) this.imagenes.add(imagen);
    }

    public void removeImagen(Imagen imagen){}

}
