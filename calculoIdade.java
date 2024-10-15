import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int idadeEmDias = s.nextInt();
        int anos = idadeEmDias / 365;
        int diasRestantes = idadeEmDias % 365;
        int meses = diasRestantes / 30;
        int dias = diasRestantes % 30;
        System.out.println(anos + " ano(s)");
                System.out.println(meses + " mes(es)");
                        System.out.println(dias + " dia(s)");
    }
}