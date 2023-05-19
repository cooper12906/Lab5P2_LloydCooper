package Lab5P2_LloydCooper;

public class Alien extends Extraterrestre {
    private String planetaProcedencia;

    public Alien(String planetaProcedencia, String nombre, String poder, String debilidad, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, fuerza, agilidadFisica, agilidadMental);
        this.planetaProcedencia = planetaProcedencia;
    }

    public String getPlanetaProcedencia() {
        return planetaProcedencia;
    }

    public void setPlanetaProcedencia(String planetaProcedencia) {
        this.planetaProcedencia = planetaProcedencia;
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

    
    
}
