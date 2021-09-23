
package examen;

public class InterfazRed {

    public static void main(String[] args) {
  
    Red red = new Red("UPC" , "A");
    Host host1 = new Host("PC1" , "Windows");
    host1.configurar(192, 168, 0, 1);
    
    Host host2 = new Host("PC2" , "Linux");
    host2.configurar(192, 168, 0, 3);
    
    Host host3 = new Host("PC3" , "IOS");
    host3.configurar(192, 168, 1, 2);
    
    Host host4 = new Host("Movil" , "Android");
    host4.configurar(192, 168, 0, 4);
    System.out.println(host1.conectar(red));
    System.out.println(host2.conectar(red));
    System.out.println(host3.conectar(red));
    System.out.println(host4.conectar(red));
    red.details(host1);
    red.details(host2);
    red.details(host3);
    red.details(host4);
    host1.ping(host3, "Paquete 1");
    
    host1.ping("Paquete 2");
    
    }
    
}