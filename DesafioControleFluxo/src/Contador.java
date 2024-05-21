import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try{
            contarParametros(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro " + e.toString());
        }

    }
    static void contarParametros(int firtsParametre, int secondParametre) throws ParametrosInvalidosException{
        if(firtsParametre > secondParametre) {
            throw new ParametrosInvalidosException();
        }else {
           int contagemParametros = secondParametre - firtsParametre;
           for (int i = 0; i <= contagemParametros; i++) {
               System.out.println("Imprimindo o número: " + i);
           }
        }
    }

}