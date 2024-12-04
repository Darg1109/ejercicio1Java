package clases.IngresoPersonas;
import java.util.Scanner;

public class Persona {
    public Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private int identificacion;
    private char sexo;
    private double peso;
    private double altura;
    public Persona(){
        nombre="null";
        edad=0;
        crearDNI();
        sexo='H';
        peso=0.0;
        altura=0.0;
        comprobarSexo();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        crearDNI();
        this.sexo=sexo;
        peso=0.0;
        altura=0.0;
        comprobarSexo();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double  altura){
        this.nombre=nombre;
        this.edad=edad;
        crearDNI();
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        comprobarSexo();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getedad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getIdentificacion(){
        return identificacion;
    }

    public char getsexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo=sexo;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public int CalPesoIdeal(){
        double pIdeal=(peso/(Math.pow(altura, 2)));
        if (pIdeal<20){
            return -1;
        }
        else if (pIdeal >=20 && pIdeal<=25) {
            return 0;
        }
        else{
            return 1;
        }       
    }

    public boolean mayorEdad(){
        boolean verificacion = true;
        if (edad<18){
            verificacion =false;
        }
        return verificacion;
    }

    public void comprobarSexo(){
        if (this.sexo == 'H'|| this.sexo == 'M'){
        }
        else{
            this.sexo = 'H';
        }
    }

    public void mostrarInfo(){
        System.out.println("Los datos de la persona son:\nNombre: "+ nombre+"\nEdad: "+ edad+ "\nDNI: "+ identificacion+"\nSexo: "+ sexo+"\nPeso: "+ peso+"\nAltura: "+altura);
    }

    public void crearDNI(){
        int identificacion=(int) (Math.random()*1000+1);
        this.identificacion=identificacion;
    }

}
