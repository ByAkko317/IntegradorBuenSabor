public class DetallePedido {
    private Integer cantidad;
    private Double subtotal;

    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo=articulo;
        this.subtotal= cantidad * articulo.getPrecioVenta();
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

}
