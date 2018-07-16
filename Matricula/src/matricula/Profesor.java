package matricula;

public class Profesor extends Persona{
    
    private String materia;

    public Profesor(String nombre, String apellido, int Edad, String materia) {
        super(nombre, apellido, Edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
