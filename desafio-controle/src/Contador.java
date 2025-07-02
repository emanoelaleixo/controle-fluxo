import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = sn.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int segundoParametro = sn.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sn.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem ; i++) {
            System.out.println(i);
        }
    }
}
