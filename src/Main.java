//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Alumno juancito = new Alumno("Juan","Peres","333");
    Final finalDeJuancito = new Final(juancito,"Final de matematicas","Enunciado",6.00,8.00,"Desc");
        System.out.println(finalDeJuancito.obtenerPromedio());
        Final finalDeJuancito2 = new Final(juancito,"Final de matematicas","Enunciado",5.99,8.00,"Desc");
        System.out.println(finalDeJuancito2.obtenerPromedio());
        System.out.println(finalDeJuancito.compareTo(finalDeJuancito2));
    }
}