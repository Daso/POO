package veterinaria;

import java.util.ArrayList;

public class Cliente {
  private String nombre;
  private ArrayList<Mascota> mascotas= new ArrayList<>();
  
  
  public void registrarMascota(String nombre, char tipoMascota){
      Mascota mascota = crearMascota(nombre, tipoMascota);
      addMascota(mascota);
  }
  
  public void addMascota(Mascota mascota){
      mascotas.add(mascota);
  }
  
  public Mascota crearMascota(String nombre, char tipoMascota){
      Mascota mascota;
      
      if (tipoMascota == 'G'){
          mascota = new Gato(nombre);
      }else if(tipoMascota == 'P'){
          mascota = new Perro(nombre);
      }else if(tipoMascota == 'A'){
          mascota = new Ave(nombre);
      }else{
          mascota = null;
      }
      return mascota;
  }
  
  public String hacerRuidos(){
      String mensaje = "";
      for(Mascota mascota:mascotas){
          mensaje += mascota.comunicarse();
          mensaje += '\n';
      }
      return mensaje;
  }
  
}
