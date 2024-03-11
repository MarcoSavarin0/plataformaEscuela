import java.util.Objects;

public class Final extends Examen implements Comparable <Final> {
    private Double notaOral;
    private String descripcion;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcion) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

  Double obtenerPromedio(){
        Double promedio;
        promedio = (nota + notaOral) / 2;
        return  promedio;
    }

    @Override
    public int compareTo(Final otroFinal) {
        if(otroFinal.obtenerPromedio() > this.obtenerPromedio()){
            System.out.println("El otro final tiene mejor promedio");
            return -1;
        } else if (Objects.equals(otroFinal.obtenerPromedio(), this.obtenerPromedio())) {
            System.out.println("Tienen el mismo promedio");
            return 0;
        }else {
            System.out.println("el otro final no supero el promedio de este final");
            return 1;
        }
    }
}
