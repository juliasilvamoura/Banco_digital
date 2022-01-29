package conta;

public interface FuncionalidadesConta {

    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
