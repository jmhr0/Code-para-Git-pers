public class Ejercicio_constantes {
    final static Double PI = Math.PI;
    public static void main (String[] args) {
        //dado el radio calcular la circunferencia del circulo 2 x pi x r
        Integer radio = 2;
        System.out.println("El radio de la circunferencia es " + 2*PI*radio + " m");
        //dado el radio calcular el area del circulo; 2 x r^2
        Double rcuad=Math.pow(2, 2);
        System.out.println("El area del circulo de radio 2 es " + PI*rcuad + " m" );
    }
}