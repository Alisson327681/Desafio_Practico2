package sv.edu.udb.Alumno;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int idMateria;

    public Alumno() {
    }
    public Alumno(int id, String nombre, String apellido, int idMateria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idMateria = idMateria;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdMateria() {
        return idMateria;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idMateria=" + idMateria +
                '}';
    }
}

