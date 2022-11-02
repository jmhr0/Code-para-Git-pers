public class estructuraselectiva {
    public static void main (String[] args) {
        //dados dos numeros a y b que muestre por la consola que a>b en caso de que a sea mayor que b
        Integer a = 12;
        Integer b = 4;
        if(a>b){
            System.out.println("A");
        } else 
            if(b>a){
            System.out.println("B");
            } else {
            System.out.println("A=B");
    }
    //operador ternario
    String mayor = (a>b)?"A":"B";
    String menor = (a<b)?"A":"B";
    System.out.println("El mayor es " + mayor + " y el menor es " + menor);
    //dada una variable entera que almacene el numero de la semana, si dia=1 "lunes" si dia=2"martes".. 6 y 7=fin de semana
    Integer dia=1;
    if(dia==1){
        System.out.println("Lunes");
    }else if(dia==2){
        System.out.println("Martes");
    }else if(dia==3){
        System.out.println("Miercoles");
    }else if(dia==4){
        System.out.println("Jueves");
    }else if(dia==5){
        System.out.println("Viernes");
    }else{
        System.out.println("Finde");
    
}
if(dia==1){
    System.out.println("empieza la semana");
}else if(dia==2){
    System.out.println("Martes");
}else if(dia==3){
    System.out.println("Miercoles");
}else if(dia==4){
    System.out.println("Jueves");
}else if(dia==5){
    System.out.println("ya es viernes");
}else{
    System.out.println("Finde");

}
}
}