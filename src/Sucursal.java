import java.time.LocalTime;
import java.util.*;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura,horarioCierre;

    private Domicilio domicilio;
    private List<Categoria> categorias;
    private Set<Promocion> promociones;

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(Categoria categoria){
        if(this.categorias==null){
            this.categorias=new ArrayList<>();
        }
        if(categoria!=null){
            this.categorias.add(categoria);
        }
    }

    public void addPromocion(Promocion promocion){
        if(this.promociones==null)this.promociones=new HashSet<>();
        if(promocion!=null)this.promociones.add(promocion);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                '}';
    }
}
