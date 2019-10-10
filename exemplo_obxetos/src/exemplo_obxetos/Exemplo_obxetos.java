package exemplo_obxetos;

public class Exemplo_obxetos {

    public static void main(String[] args) {
        //Instanciamos un obxeto
        Alumno pepito=new Alumno();
        pepito.amosar();
        Alumno antia=new Alumno("Lucía",8);
        antia.amosar();
        System.out.println("****"+antia.getNome());
    }

}