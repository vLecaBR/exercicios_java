public class MainContaBancaria {
        public static void main(String[] args) {
            ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Leça");

            // Usando getters e setters
            System.out.println("Titular: " + conta.titular);
            System.out.println("Número da Conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.getSaldo());

            conta.setSaldo(1500.0);
            System.out.println("Saldo atualizado: " + conta.getSaldo());
        }
    }
