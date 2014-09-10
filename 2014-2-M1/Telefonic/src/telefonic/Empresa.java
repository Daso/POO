package telefonic;

public class Empresa {
    private String razonSocial;
    private String ruc;
    private int pasos;

    public Empresa(){
        
    }
    
    public Empresa(String razonSocial, String ruc) {
        this.razonSocial = razonSocial;
        this.ruc = ruc;
    }
    
    public void registrarPasos(int pasos){
        this.pasos =  pasos;
    }
    
    public double calcularPago(){
        if (pasos <= 1000){ 
           return 500.0;
        }else{            
            double pasos_adicionales = Math.ceil((pasos - 1000) / 100.0);          
            return 500 + pasos_adicionales * 20;
        }
    }
}
