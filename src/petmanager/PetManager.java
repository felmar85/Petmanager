package petmanager;

import Classes.*;
import java.util.Date;


public class PetManager {

    public static void main(String[] args) {
        // INSTANCIANDO CLASES Y CREANDO OBJETOS, TENER PRESENTE LA ASOCIACION
        clsDoctor doctor1 = new clsDoctor("Gerardo Galindo", "Lic1234");
        clsVeterinary veterinaria1 = new clsVeterinary("MIS NEGOCIO", "12345", "CLL 51b 11-20", doctor1);          
        System.out.println(veterinaria1.getName() + " ATENDIDO POR " + veterinaria1.getDoctor().getName());
        
        clsDog dog1 = new clsDog("criollo", false, "001", "Firulais", 2013, "Negro", "Sano");        
        clsCat cat1 = new clsCat("Angora", "002", "Minino", 2013, "Blanco y negro", "Enfermo");
        
        Date current_date = new Date();
        int current_year = current_date.getYear();
        
        int agePet1 = current_year - dog1.getBorn_year();
        int agePet2 = current_year - cat1.getBorn_year();
        
        if(agePet1 > agePet2){
            System.out.println("La mascota " + dog1.getName() + " es mayor que la mascota " + cat1.getName());
        }else{
            if(agePet2 > agePet1){
                System.out.println("La mascota " + cat1.getName() + " es mayor que la mascota " + dog1.getName());
            }else{
                System.out.println("La mascota " + dog1.getName() + " tiene la misma edad que la mascota " + cat1.getName());
            }
        }
        
        //INVOCANDO MÉTODOS
        dog1.Eat();
        cat1.Eat();
        cat1.Move();
        cat1.Sound();        
        dog1.WalkAround();
        cat1.SelfCleaning();
        
        //COMPLEMENTAR: ASIGNAR A LA MISMA VETERINARIA LAS DOS MASCOTAS CREADAS Y MOSTRAR AL FRENTE SU VETERINARIA Y DOCTOR
    } //fin main
    
} //fin clase PetManager
