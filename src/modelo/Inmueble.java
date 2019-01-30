/*
Superclase
inmueble se compone de los datos del propietario, por ello se crea la clase propietario primero
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public abstract class Inmueble {
    protected Propietario objP;
    protected String chip, dir;
    protected double valor;

    public Inmueble(Propietario objP, String chip, String dir, double valor) {
        this.objP = objP;
        this.chip = chip;
        this.dir = dir;
        this.valor = valor;
    }

    public Inmueble() {
        objP = new Propietario();
        this.chip = "";
        this.dir = "";
        this.valor = 0;
    }

    public Propietario getObjP() {
        return objP;
    }

    public void setObjP(Propietario objP) {
        this.objP = objP;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Propietario{" + "objP=" + objP.toString() + 
                "\n chip=" + chip + 
                "\n dir=" + dir + 
                "\n valor=" + valor;
    }
    
    public abstract double imuesto();
     
    
}
