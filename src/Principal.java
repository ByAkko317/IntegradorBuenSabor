import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        Pais pais= new Pais("Argentina");
        Provincia prov1=new Provincia("Mendoza");
        Provincia prov2=new Provincia("Buenos Aires");
        prov1.setPais(pais);
        prov2.setPais(pais);

        Localidad loc1=new Localidad("Ciudad de Mendoza");
        Localidad loc2=new Localidad("CABA");
        loc1.setProvincia(prov1);
        loc2.setProvincia(prov2);

        Domicilio dom1=new Domicilio("Avenida Belgrano",1200,5501);
        Domicilio dom2=new Domicilio("Avenida Libertadores",500,1499);
        dom1.setLocalidad(loc1);
        dom2.setLocalidad(loc2);

        Sucursal suc1=new Sucursal("Sucursal Mendoza", LocalTime.of(8,30),LocalTime.of(22,30));
        Sucursal suc2=new Sucursal("Sucursal Buenos Aires",LocalTime.of(9,0),LocalTime.of(23,0));
        suc1.setDomicilio(dom1);
        suc2.setDomicilio(dom2);

        Empresa empresa=new Empresa("Smash Burgers","Smash Burgers S.A.",332084567);
        empresa.addSucursal(suc1);
        empresa.addSucursal(suc2);

        System.out.println(empresa);
    }
}
