
package examen;

public class Red {
    private String nombre;
    private String tipo;
    public int OA , OB , OC , OD ;
    Host host;
    public Red(String nombre , String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public int getOA() {
        return OA;
    }

    public void setOA(int OA) {
        this.OA = OA;
    }

    public int getOB() {
        return OB;
    }

    public void setOB(int OB) {
        this.OB = OB;
    }

    public int getOC() {
        return OC;
    }

    public void setOC(int OC) {
        this.OC = OC;
    }

    public int getOD() {
        return OD;
    }

    public void setOD(int OD) {
        this.OD = OD;
    }
    
    
    void details (Host host){
        System.out.println("Host en la red: " + this.nombre);
        System.out.println("Host: " + host.getNombre() + ", Ip:  "+ host.OA + "." + host.OB+ "." + host.OC + "." + host.OD);
    }
    boolean isLimitHost(Host host){
        if ("A".equals(this.tipo)){
            if(host.sumHost>3){
                return true;
            }else{
                return false;
            }
        }
        if (this.tipo=="B"){
            if(host.sumHost>5){
                return true;
            }else{
                return false;
            }
        }
        if (this.tipo=="C"){
            if(host.sumHost>7){
                return true;
            }else{
                return false;
            }
        }

        
    }
    
    
}
