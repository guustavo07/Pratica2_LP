import java.util.Scanner;


public class Pagamento {
  public static void main(String[] args) {
    
    int options=0, parcelas = 0, i;
    double valTotal=0, valDesconto, valParcela, cadaParcela, valTotalParcela;
    Scanner ler = new Scanner(System.in);
    
    while(valTotal != -1){
        System.out.println("Qual é o valor total gasto pelo cliente?");
        valTotal= ler.nextDouble();
        System.out.println("Opções de pagamento: \n1 – À Vista: a vista com 10% de desconto \n2 – Parcelado 2x: em duas vezes (preço da etiqueta) \n3 – Parcelado de 3x ate 6x: de 3 até 6 vezes com 3% de juros ao mês(somente para compras acima de R$ 500,00 - inclusive)");
        options=ler.nextInt();
    switch (options){
      case 1: {
        valDesconto = valTotal * 0.10;
        System.out.printf("O valor total à vista é: %.2f %n", valTotal - valDesconto);
        System.out.print("");
        System.out.println("----------------------------------------------------------------");
        break;
      }
      case 2:{
        valParcela = valTotal / 2;
        System.out.printf("O valor total de cada prestação é: R$ %.2f %n", valParcela);
        System.out.print("");
        System.out.println("----------------------------------------------------------------");
        break;
      }
      case 3:{
        if(valTotal > 500.00){
          System.out.println("\n1 - 3x \n2 - 4x \n3 - 5x \n4 - 6x");
          parcelas = ler.nextInt();
          System.out.print("");
          System.out.println("----------------------------------------------------------------");
          switch(parcelas){
            case 1: {
                  cadaParcela = valTotal / 3;
                  valTotal = cadaParcela * 0.03;
                  valTotalParcela = cadaParcela + valTotal;
                  System.out.printf("1º Parcela       |   %.2f\n", valTotalParcela);
                  System.out.printf("2º Parcela       |   %.2f\n", valTotalParcela);
                  System.out.printf("3º Parcela       |   %.2f\n", valTotalParcela);
                  System.out.print("");
                  System.out.println("----------------------------------------------------------------");
                  break;
            }
            case 2:{
                cadaParcela = valTotal / 4;
                valTotal = cadaParcela * 0.03;
                valTotalParcela = cadaParcela + valTotal;
                System.out.printf("1º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("2º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("3º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("4º Parcela       |   %.2f\n", valTotalParcela);
                System.out.print("");
                System.out.println("----------------------------------------------------------------");
                break;
            }
            case 3:{
                cadaParcela = valTotal / 5;
                valTotal = cadaParcela * 0.03;
                valTotalParcela = cadaParcela + valTotal;
                System.out.printf("1º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("2º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("3º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("4º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("5º Parcela       |   %.2f\n", valTotalParcela);
                System.out.print("");
                System.out.println("----------------------------------------------------------------");
                break;
            }
            case 4:{
                cadaParcela = valTotal / 6;
                valTotal = cadaParcela * 0.03;
                valTotalParcela = cadaParcela + valTotal;
                System.out.printf("1º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("2º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("3º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("4º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("5º Parcela       |   %.2f\n", valTotalParcela);
                System.out.printf("6º Parcela       |   %.2f\n", valTotalParcela);
                System.out.print("");
                System.out.println("----------------------------------------------------------------");
                break;
            default:
            System.out.println("Opção Invalida!");

            }
          }
          default:
                    System.out.println("Opção Invalida!");
        }
      }
      }
      }
    }
}