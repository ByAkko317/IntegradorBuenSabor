public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subtotal;

    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad) {
        this.cantidad = cantidad;
        this.subtotal = subtotal();
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() { return subtotal;}

    public void setSubtotal(Articulo articulo) {
        this.subtotal= cantidad * articulo.getPrecioVenta();
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double subtotal() {
        if(articulo != null) {
            return cantidad * articulo.precioVenta;
        }else{
            return 0;
        }
    }

}
