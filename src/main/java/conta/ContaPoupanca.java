package conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }

}
