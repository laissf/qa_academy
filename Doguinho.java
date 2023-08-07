public class Doguinho{

    public static void latir(double alt){
        if (alt>0.50){
            System.out.println("latido alto");
        }else{
            System.out.println("Latido baixo");
        }

    }
//metodo não é real, só estudando a lógica de O.O.
    public static double calculo_peso (double alt){
        double peso = alt*5;
        return peso;
    }

    public static String testandoString(){
        return "teste string";
    }
}