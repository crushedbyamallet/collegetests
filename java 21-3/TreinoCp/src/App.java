public class App {
    public static void main(String[] args) {

        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Telefone objTelefone = new Telefone();

        objCliente.setNome("chuu do loona");
        objCliente.setIdade(21);
        objCliente.setPeso(48);

        objEndereco.setBairro("porao da bbc");
        objEndereco.setLogradouro("inferno");
        objEndereco.setNumero(12);

        objTelefone.setCelular("(12)99999-9999");
        objTelefone.setContato("(12)99122-1212");
        objTelefone.setFixo("NINGUEM USA TELEFONE FIXO");


        
        System.out.println("nome: " + objCliente.getNome() +
        "\nidade: " + objCliente.getIdade() + 
        "\npeso: " + objCliente.getPeso() +
        "\nbairro: " + objEndereco.getBairro() +
        "\nlogradouro: " + objEndereco.getNumero() +
        "\nnúmero: " + objEndereco.getNumero() + 
        "\ncelular: " + objTelefone.getCelular() +
        "\ncontato: " + objTelefone.getContato() + 
        "\nfixo: " + objTelefone.getFixo() 
        );
    }
}
