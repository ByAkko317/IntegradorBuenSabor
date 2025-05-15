import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String denominacion;

    private List<Categoria> subCategorias;//=new ArrayList<>();
    private Categoria categoriaPadre;
    private List<Articulo> articulos;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<Categoria> subCategorias) {
        this.subCategorias = subCategorias;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addCategoria(Categoria categoria){
        if (this.subCategorias==null)this.subCategorias=new ArrayList<>();
        if (categoria!=null)this.subCategorias.add(categoria);
        categoria.setCategoriaPadre(this);

        System.out.println("La categoria que llama "+this.denominacion+ " asocia/agrega a su hija "+categoria.denominacion);
    }
    public void removeSubCategoria(Categoria subCategoria){
        if(this.subCategorias.contains(subCategoria))this.subCategorias.remove(subCategoria);
        subCategoria.setCategoriaPadre(null);
    }

    public void addArticulo(Articulo articulo){
        if(this.articulos==null) this.articulos=new ArrayList<>();
        if(articulo!=null) this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo){}

}
