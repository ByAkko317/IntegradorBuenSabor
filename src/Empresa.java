import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre,razonSocial,logo;
    private Integer cuit;

    private List<Sucursal> sucursales;

    public Empresa(String nombre, String razonSocial, String logo, Integer cuit) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.logo = logo;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        if(this.sucursales==null){
            this.sucursales=new ArrayList<>();
        }
        if(sucursal != null){
            this.sucursales.add(sucursal);
        }
    }
}
