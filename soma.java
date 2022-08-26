//Soma entre dois números em java. 
import java.util.*; 

//Classe representando a soma.
class Soma { 

public static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Declaracao de variaveis. Sendo “anum” o primeiro número e o “bnum” segundo número. 
        int anum, bnum, soma;   

        //leituras
        System.out.println("Digite um número");
        anum = sc.nextInt();
        System.out.println("Digite outro número");
        bnum = sc.nextInt();

        //Somar
        soma = anum + bnum;

        //Mostrar na tela
        System.out.println("Soma:" +soma);
    }

}
