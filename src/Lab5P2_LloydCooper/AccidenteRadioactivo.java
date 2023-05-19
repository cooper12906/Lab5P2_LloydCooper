package Lab5P2_LloydCooper;

public class AccidenteRadioactivo extends Persona {
    private int edadAccidente;
    private String tipoAccidente;

    public AccidenteRadioactivo(int edadAccidente, String tipoAccidente, String nombre, String poder, String debilidad, int fuerza, int agilidadFisica, int agilidadMental) {
        super(nombre, poder, debilidad, fuerza, agilidadFisica, agilidadMental);
        this.edadAccidente = edadAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
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
        return "Accidente Radioactivo:\n" + 
                "\nLa edad del accidente fue: " + edadAccidente +
                "\nEl tipo de accidente fue: " + tipoAccidente + '}';
    }
    
    
    
    
}
