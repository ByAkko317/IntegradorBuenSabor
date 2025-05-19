
import java.util.HashSet;
import java.util.Set;

public abstract class Articulo extends Base{
    protected String denominacion,codigo;
    protected Double precioVenta;
    protected boolean habilitado;


    private Set<ImagenArticulo> imagenes;

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

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Set<ImagenArticulo> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<ImagenArticulo> imagenes) {
        this.imagenes = imagenes;
    }

    public void addImagen(ImagenArticulo imagen) {
        if (this.imagenes == null) this.imagenes = new HashSet<>();
        if (imagenes != null) this.imagenes.add(imagen);
    }

    public void removeImagen(ImagenArticulo imagen) {
        if (this.imagenes.contains(imagen))this.imagenes.remove(imagen);
    }
}
