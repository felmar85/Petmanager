/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author USUARIO
 */
public class clsDog extends clsPet {
    private String breed;
    private boolean pedigree;

    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    
    
    public void WalkAround(){
        System.out.println("El perro " + super.getName() + " está caminando.");
    }    

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    
}
