import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    private Imagen imagen;
    private Usuario usuario;

    private List<Pedido> pedidos;
    private List<Domicilio> domicilios;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Imagen imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void addPedido(Pedido pedido){
        if(this.pedidos==null) {this.pedidos=new ArrayList<>();}
        this.pedidos.add(pedido);
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }
    public void addDomicilio(Domicilio domicilio){
        if(this.domicilios==null) {this.domicilios=new ArrayList<>();}
        this.domicilios.add(domicilio);
    }
}
