import javax.swing.JOptionPane;
import javax.xml.namespace.QName;

public class App {
    public static void main(String[] args) {

        Cliente objCliente = new Cliente(JOptionPaneo.showInputDialog("digite o nome: "));
            Integer.parseInt(JOptionPane.showInputDialog("digite a idade: "));
            Double.parseDouble(JOptionPane.showInputDialog("digite o peso: "));

            
        Produto objProduto = new Produto();

        //cliente
        objCliente.setNome(JOptionPane.showInputDialog("digite o nome: "));
        objCliente.setIdade(Integer.parseInt(
            JOptionPane.showInputDialog("digite a idade:")));
        objCliente.setPeso(Double.parseDouble(
            JOptionPane.showInputDialog("digite o peso: ")));
        objCliente.setProduto(objProduto);

        //produto
        objProduto.setTipo(JOptionPane.showInputDialog("digite o tipo de produto: "));
        objProduto.setMarca(JOptionPane.showInputDialog("digite a marca: "));
        objProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(
            "digite a quantidade: ")));
        objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog(
            "digite o valor: ")));
        

        System.out.println("nome: " + objCliente.getNome() + 
                        "\nidade: " + objCliente.getIdade() + 
                        "\npeso: " + objCliente.getPeso() +
                        "\ntipo de produto: " + objProduto.getTipo() +
                        "\nmarca: " + objCliente.getProduto().getMarca() + 
                        "\nquantidade: " + objCliente.getProduto().getQuantidade() + 
                        "\nvalor: " + objCliente.getProduto().getValor());
    }
}
