import java.util.Scanner;

public class Main{
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        //Doguinho class é a forma, doguinho é o objeto que eu criei a parti dessa forma
        Doguinho doguinho = new Doguinho();

        float altura;
        System.out.println("Qual a altura do doguinho?");
        altura = reader.nextFloat();
        doguinho.latir(altura);
        System.out.println("Peso aproximado: "+doguinho.calculo_peso(altura));

       doguinho.testandoString();

    }
}