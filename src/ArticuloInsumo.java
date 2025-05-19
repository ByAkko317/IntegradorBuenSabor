
public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private Integer stockActual, stockMinimo;
    private Integer stockMaximo;
    private Boolean esParaElaborar;


    public ArticuloInsumo(String denominacion, String codigo, Double precioVenta, boolean habilitado, Double precioCompra, Integer stockActual, Integer stockMinimo, Integer stockMaximo, Boolean esParaElaborar) {
        super(denominacion, codigo, precioVenta, habilitado);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public Double getPrecioCompra() {return precioCompra;}

    public void setPrecioCompra(Double precioCompra) {this.precioCompra = precioCompra;}

    public Integer getStockActual() {return stockActual;}

    public void setStockActual(Integer stockActual) {this.stockActual = stockActual;}

    public Integer getStockMinimo() {return stockMinimo;}

    public void setStockMinimo(Integer stockMinimo) {this.stockMinimo = stockMinimo;}

    public Integer getStockMaximo() {return stockMaximo;}

    public void setStockMaximo(Integer stockMaximo) {this.stockMaximo = stockMaximo;}

    public Boolean getEsParaElaborar() {return esParaElaborar;}

    public void setEsParaElaborar(Boolean esParaElaborar) {this.esParaElaborar = esParaElaborar;}
}
