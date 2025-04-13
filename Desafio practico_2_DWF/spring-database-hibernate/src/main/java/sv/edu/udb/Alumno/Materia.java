package sv.edu.udb.Alumno;

public class Materia {
    private int id;
    private String nombre;

    public Materia() {
    }
    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
