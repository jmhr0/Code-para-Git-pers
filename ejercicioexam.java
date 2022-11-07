public class ejercicioexam {
    //escribir la tabla de multiplicar de los 10 primeros numeros hasta el 10
    public static void main (String[] args){
        Integer numtabla= 0;
        while (numtabla<= 9){
            numtabla= numtabla + 1;
            System.out.println("--------------");
            System.out.println("|" + "Tabla del " + numtabla + "|");
            System.out.println("--------------");
            for (int nummult=0 ;nummult<=10 ; nummult++ ){
            System.out.println("|" + numtabla + " x " + nummult + "=" + numtabla*nummult + "|");
            }
        }
    }
}
