package Lab5P2_LloydCooper;

import java.util.ArrayList;

public class Escuadron {
    private String name;
    private String lugarDeBase;
    private Persona lider;
    private String HoV;
    private ArrayList<Persona> persona = new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String name, String lugarDeBase, Persona lider, String HoV) {
        this.name = name;
        this.lugarDeBase = lugarDeBase;
        this.lider = lider;
        this.HoV = HoV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLugarDeBase() {
        return lugarDeBase;
    }

    public void setLugarDeBase(String lugarDeBase) {
        this.lugarDeBase = lugarDeBase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public String getHoV() {
        return HoV;
    }

    public void setHoV(String HoV) {
        this.HoV = HoV;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }
    
    @Override
    public String toString() {
        return "Escuadron:\n" + 
                "\nEl nombre es: " + name + 
                "\nEl lugar de la base es: " + lugarDeBase + 
                "\nEl lider es: " + lider + 
                "\nHeroe o villano: " + HoV + 
                "\nLa persona es: " + persona;
    }
    
    
}
