package veterinaria;

import java.util.ArrayList;


public class Cliente {
    private String nombre;
    ArrayList<Mascota> mascotas = new ArrayList<>();
    
    public void agregarMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    
    public String reporteMascotas(){
        String mensaje = "";
        for (Mascota mascota : mascotas) {
         mensaje += mascota.comunicarse();
         mensaje += '\n';
        }
        return mensaje;
}
}

