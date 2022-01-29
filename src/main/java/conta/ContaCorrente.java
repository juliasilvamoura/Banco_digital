package conta;

import cliente.Cliente;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
