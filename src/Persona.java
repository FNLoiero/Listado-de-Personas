public class Persona {

    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numero_personas = 0;

    public Persona() {
        this.id = ++Persona.numero_personas;
    }

    public Persona(String nombre, String tel, String email) {
        this();// se llama al constructor vacio
        this.email = email;
        this.nombre = nombre;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID_Persona = " + id + " | Nombre = " + nombre + " | Telefono = " + tel + " | Email=" + email;
    }
}
