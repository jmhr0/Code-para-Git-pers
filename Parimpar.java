public class Parimpar {
    public static void main (String [] args){
        int max = 100;
        int aleatorio = (int)Math.floor(Math.random()*max);
        System.out.println(aleatorio);
        String espar =aleatorio + " es par";
        String noespar = aleatorio + " no es par";
        if (aleatorio % 2 == 0)
        System.out.println(espar);
        else
        System.out.println(noespar);

    }
}
