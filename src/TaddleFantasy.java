import java.util.Scanner;

public class TaddleFantasy {
public static void main(String[] args) {
int codigo;

Scanner ler = new Scanner(System.in);
System.out.println("Bem vindo Ao Ultimo Marcio");
    System.out.println("Digite 1, Defender");
    System.out.println("Digite 2, Fugir");
    System.out.println("Digite 3, Atacar");
System.out.print("Digite uum código: ");
codigo = ler.nextInt();


switch(codigo){
case 1: //
 System.out.println("Você Decide Defender Mesmo Sendo Nivel 1");
      System.out.println("Sua defesa foi bem sucedida ");
      System.out.println("Você passou no teste");
      break;

      case 2: //
 System.out.println("Você resolve fugir do Márcio");
      System.out.println("Ele te reprova");
      System.out.println("Ficou de DP");

      break;
      case 3: //
 
      System.out.println("Você ataca o marcio");
      System.out.println("Ele morre");
      System.out.println("Você é preso, homicídio é crime");


               break;}
}
}