public class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    protected Double nota;

    public Examen(Alumno alumno, String titulo, String enunciado, Double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    boolean estadoExamen(){
        return nota >= 4;
    }
}
