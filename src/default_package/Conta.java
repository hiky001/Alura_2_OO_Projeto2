package default_package;

class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            System.out.println("Você não tem o dinheiro que quer sacar na sua conta!");
            return false;

        }
    }

    public boolean transfere(double valor, Conta destino){
        if (saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
};
