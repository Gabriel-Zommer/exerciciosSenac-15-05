public class TestaConta {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        
        conta1.setTitular("João");
        conta1.setNumero(12345);
        conta1.setAgencia("001");
        conta1.setSaldo(1000.0);
        conta1.setDataAbertura("01/01/2023");

        conta2.setTitular("Maria");
        conta2.setNumero(67890);
        conta2.setAgencia("002");
        conta2.setSaldo(2000.0);
        conta2.setDataAbertura("01/02/2023");

        
        if (conta1 == conta2) {
            System.out.println("As contas são iguais.");
        } else {
            System.out.println("As contas são diferentes.");
        }

        
        String dadosConta1 = conta1.recuperaDadosParaImpressao();
        System.out.println("Dados da Conta 1:\n" + dadosConta1);

        
        conta2.saca(500.0);

        
        System.out.println("Saldo da Conta 2 após saque: " + conta2.getSaldo());

       
    }
}