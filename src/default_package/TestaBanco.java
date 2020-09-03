package default_package;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.cpf = "222.222.222.22";
        paulo.nome = "Paulo Silveira";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
