public class EjemplosString {
    public static void main(String[] args) {
    //crear variable string
    String nombre = "adios";
    String apellido = "mundo";
    float edad = 18;
    //imprimir el valor de la variable
    //System.out.println("Hola " + s);
    float z = 2/3;
    
    //imprimir con formato
    //Hola Fran Gomez, tengo 18 años
    System.out.printf("Hola %s %s, tengo: %.4f \t \"siguiente\" linea \n" , nombre,apellido,edad);
    System.out.printf("Hola %s ", z);
    }
}