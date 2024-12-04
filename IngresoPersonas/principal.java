package clases.IngresoPersonas;
import java.util.Scanner;
public class principal {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el nombre: ");
        String nombre= leer.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad=leer.nextInt();
        System.out.print("Ingrese la edad, H o M: ");
        char sexo =leer.next().charAt(0);
        System.out.print("Ingrese el peso en Kg: ");
        double peso= leer.nextDouble();
        System.out.print("Ingrese la altura en metros: ");
        double altura=leer.nextDouble();

        Persona p1 =new Persona(nombre, edad, sexo, peso, altura);

        Persona p2 =new Persona(nombre, edad, sexo, 0, altura);
        
        Persona p3 =new Persona();

        p3.setNombre("Duvan");
        p3.setEdad(27);
        p3.setSexo('H');
        p3.setPeso(72);
        p3.setAltura(1.7);

        p1.mostrarInfo();
        PesoIdeal(p1.CalPesoIdeal());
        printEdad(p1.mayorEdad());
        p2.mostrarInfo();
        PesoIdeal(p2.CalPesoIdeal());
        printEdad(p2.mayorEdad());
        p3.mostrarInfo();
        PesoIdeal(p3.CalPesoIdeal());
        printEdad(p3.mayorEdad());
        
    }
    public static void PesoIdeal(int indice){
        if (indice == -1){
            System.out.println("BAJO DE PESO");
        }
        else if (indice ==0) {
            System.out.println("PESO IDEAL");
        }
        else if(indice==1){
            System.out.println("SOBREPESO");
        }
    }

    public static void printEdad(boolean indice){
        if (indice){
            System.out.println("MAYOR DE EDAD");
        }
        else{
            System.out.println("MENOR DE EDAD");
        }
    }    
}
