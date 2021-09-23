
package examen;

public class Host {
    private String nombre;
    private String so;
    public int sumHost;
    public int OA , OB , OC , OD ;
    Red red;
    
    public Host ( String nombre , String so){
        this.nombre=nombre;
        this.so=so;
        this.sumHost++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public Red getRed() {
        return red;
    }

    public void setRed(Red red) {
        this.red = red;
    }

    public int getSumHost() {
        return sumHost;
    }

    public void setSumHost(int sumHost) {
        this.sumHost = sumHost;
    }
    
    
    

    void configurar(int A , int B , int C , int D){
        this.OA=A;
        this.OB=B;
        this.OC=C;
        this.OD=D;
    }
    void ping (Host host , String msg){
        System.out.println("Mensaje " + msg +  " Enviado a " + host.nombre);
    }
    void ping (String msg){
         System.out.println("Mensaje " + msg +  " Enviado a " + this.nombre ;
    }
       
    boolean conectar (Red red){
        if (red.getTipo()=="A"){
            for(int i=1 ; i<=this.sumHost ; i++){
                if (sumHost<=3){
                    return true;
                }else{
                    return false;
                }
            }
            
        }
        if (red.getTipo()=="B"){
            if (this.sumHost<=5){
                for(int i=1 ; i<=this.sumHost ; i++){
                return true;
                }
            }
 
        }
        if (red.getTipo()=="C"){
            if (this.sumHost<=7){
                for(int i=1 ; i<=this.sumHost ; i++){
                return true;
                }
            }else{
                return false;
            }
            if(this.sumHost>7){
                for(int i=1 ; i<=this.sumHost ; i++){
                return false;
            }
            
        }