import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        Pais pais = new Pais("Argentina");
        Provincia prov1 = new Provincia("Mendoza");
        Provincia prov2 = new Provincia("Buenos Aires");
        prov1.setPais(pais);
        prov2.setPais(pais);

        Localidad loc1 = new Localidad("Ciudad de Mendoza");
        Localidad loc2 = new Localidad("CABA");
        loc1.setProvincia(prov1);
        loc2.setProvincia(prov2);

        Domicilio dom1 = new Domicilio("Avenida Belgrano", 1200, 5501);
        Domicilio dom2 = new Domicilio("Avenida Libertadores", 500, 1499);
        dom1.setLocalidad(loc1);
        dom2.setLocalidad(loc2);

        Sucursal suc1 = new Sucursal("Sucursal Mendoza", LocalTime.of(8, 30), LocalTime.of(22, 30));
        Sucursal suc2 = new Sucursal("Sucursal Buenos Aires", LocalTime.of(9, 0), LocalTime.of(23, 0));
        suc1.setDomicilio(dom1);
        suc2.setDomicilio(dom2);

        Empresa empresa = new Empresa("Smash Burgers", "Smash Burgers S.A.", 332084567);
        empresa.addSucursal(suc1);
        empresa.addSucursal(suc2);
        System.out.println(empresa);

        Factura factura = new Factura(20000.00, FormaPago.MERCADO_PAGO, LocalDate.now());
        Factura factura2 = new Factura(10000.00, FormaPago.EFECTIVO, LocalDate.now());

        //Instanciamos el pedido
//        Pedido pedido = new Pedido(LocalTime.of(10, 30), detalle, 1000.00, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now());
        //Instanciamos el detalle pedido
        DetallePedido detalle = new DetallePedido(2);
        Pedido pedido = new Pedido(LocalTime.of(10, 30), /*1000.00, 1000.00,*/ Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now());
        //Agregamos el detalle al pedido
        pedido.addDetallePedido(detalle);
        //Agregamos domicilio al pedido
        pedido.setDomicilio(dom1);
        //Agregamos la sucursal al pedido
        pedido.setSucursal(suc1);


        //Instanciamos los artículos
        ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Hamburguesa", "1500", 1000.00, true, "Hamburguesa con queso, tomate y lechuga", 18, "Coccion media");
        //Instanciamos los detalles de los articulos manufacturados
        ArticuloManufacturadoDetalle detalleArticuloManufacturado1 = new ArticuloManufacturadoDetalle(1);
        ArticuloManufacturadoDetalle detalleArticuloManufacturado2 = new ArticuloManufacturadoDetalle(2);
        //Instanciamos ArticuloInsumo
        ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("Queso", "100", 100.00, true, 50.00, 15, 5, 25, true);
        ArticuloInsumo articuloInsumo2= new ArticuloInsumo("carne","101",300.00,true,120.00,30,4,50,true);
        ArticuloInsumo articuloInsumo3= new ArticuloInsumo("cerveza","200",150.00,true,60.00,20,2,30,false);
        detalleArticuloManufacturado1.setArticuloInsumo(articuloInsumo1);
        articuloManufacturado1.addDetalle(detalleArticuloManufacturado1);
        articuloManufacturado1.addDetalle(detalleArticuloManufacturado2);

        detalle.setArticulo(articuloManufacturado1);

        //Instanciamos imagenes para articulo
        ImagenArticulo imgArticulo1 = new ImagenArticulo("Fachada del Restaurante", "imagen.jpg");
        ImagenArticulo imgArticulo2 = new ImagenArticulo("Cocina", "imagen.jpg");
        //Agregamos imagenes a articulo
        articuloManufacturado1.addImagen(imgArticulo1);
        articuloManufacturado1.addImagen(imgArticulo2);

        //Instanciamos unidad de medida
        UnidadMedida unidadMedida = new UnidadMedida("gramos (g)");

        //Agregamos unidades de medida a articulo
        articuloManufacturado1.setUnidadMedida(unidadMedida);

        //Instanciamos categoria
        Categoria categoria1 = new Categoria("Hamburguesas");
        Categoria categoria2 = new Categoria("Bebidas");

        //Agregamos categorias a Sucursal
        suc1.addCategoria(categoria1);
        suc1.addCategoria(categoria2);

        //Agregamos articulo a categoria
        categoria1.addArticulo(articuloManufacturado1);
        //Agregamos articulo a DetallePedido
        detalle.setArticulo(articuloManufacturado1);

        //Instanciamos cliente con su usuario e imagen
        Usuario user = new Usuario("227", "mfernandez");
        ImagenCliente imgCliente = new ImagenCliente("imagen.jpg");
        Cliente cliente = new Cliente("Mariana", "Fernandez", "2611234567", "mfernandez@uc.cl", LocalDate.of(2000, 10, 10));
        cliente.setImagen(imgCliente);
        cliente.setUsuario(user);
        //Istanciamos el domicilio del cliente y se lo agregamos a la lista de domicilios
        Domicilio dom3 = new Domicilio("Avenida Lavalle", 1500, 5601);
        cliente.addDomicilio(dom3);
        //Agregamos pedido a cliente
        cliente.addPedido(pedido);

        //Instanciamos promocion
        Promocion promocion1 = new Promocion("Promo 10%", LocalDate.MIN, LocalDate.MAX, LocalTime.MIN, LocalTime.MAX, "Descuento por el aniversario del restaurante", 7500.00, TipoPromocion.PROMOCION);

        //Agregamos articulo a promocion
        promocion1.addArticulo(articuloManufacturado1);

        //Instanciamos ImagenPromocion
        ImagenPromocion imagenPromocion = new ImagenPromocion("Imagen de platillo clásico de la casa","imagen.jpg");

        //Agregamos ImagenPromocion a promocion
        promocion1.addImagen(imagenPromocion);

        //Agregamos Promocion a Sucursal
        suc1.addPromocion(promocion1);


    }
}