package Lab5P2_LloydCooper;

public abstract class Persona extends SecretWarsGUI {
    protected String nombre;
    protected String poder;
    protected String debilidad;
    protected int fuerza;
    protected int agilidadFisica;
    protected int agilidadMental;

    public Persona(String nombre, String poder, String debilidad, int fuerza, int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    @Override
    public String toString() {
        return "Persona{" + 
                "nombre=" + nombre + 
                ", poder=" + poder + 
                ", debilidad=" + debilidad + 
                ", fuerza=" + fuerza + 
                ", agilidadFisica=" + agilidadFisica + 
                ", agilidadMental=" + agilidadMental + '}';
    }
    
    
}
