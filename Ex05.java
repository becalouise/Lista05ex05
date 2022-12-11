package Lista05ex05;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        double produto=sc.nextDouble();
        System.out.println("Informe a taxa de imposto: ");
        double taxa=sc.nextDouble();
        sc.close();
      
        double totalComImposto=Imposto(taxa, produto);
        System.out.println("Valor do produto: R$" + produto);
        System.out.println("Taxa de imposto aplicada: "+ taxa);
        System.out.println("Valor total de imposto: R$" + (totalComImposto - produto));
        System.out.println("Valor com imposto: R$" + totalComImposto);
    }

    static double Imposto(double taxaImposto, double custo){
        double total=custo+((custo*taxaImposto)/100);
        return total;
    }

}
