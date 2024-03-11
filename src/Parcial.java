public class Parcial extends Examen {
    private String numeroDeUnidad;
    private Integer numeroDeReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, String numeroDeUnidad, Integer numeroDeReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeReintentos = numeroDeReintentos;
    }
    Boolean sePuedeRecuperar(){
        if(numeroDeReintentos > 3){
            return false;
        }
        return true;
    }
}
