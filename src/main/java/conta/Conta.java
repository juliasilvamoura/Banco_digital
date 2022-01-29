package conta;

import cliente.Cliente;

public class Conta implements FuncionalidadesConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private Cliente titular;
    private int numeroConta;
    private int agencia;
    private double saldo;

    public Conta(Cliente titular, double saldoInicial) {
        this.titular = titular;
        this.agencia = AGENCIA_PADRAO;
        this.saldo=saldoInicial;
        this.numeroConta = SEQUENCIAL++;
    }


    @Override
    public boolean sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saldo após saque: R$" + saldo);
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo: R$" + saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        contaDestino.depositar(valor);
        sacar(valor);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Titular:" + this.getTitular());
        System.out.println("Agencia:" + this.getAgencia());
        System.out.println("Conta:" + this.getNumeroConta());
        System.out.println("Saldo:" + this.getSaldo());
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
