import java.util.Scanner;
public class Fornecedores {
   private String NomeFornecedor;
   private String NomeProduto;
   private String Descricao;

    public Fornecedores() {
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
   
    public void CadastrarFornecedor (){
     Scanner um;
    um = new Scanner (System.in);
     System.out.println("Nome do Fornecedor:");
       setNomeFornecedor(um.next());
       System.out.println("Nome do Produto:");
       setNomeProduto(um.next());
       System.out.println("Descrção do Produto:");
       setDescricao(um.next());
    }
    
    public void ListarFornecedor(){
    System.out.println ("\nNome do Fornecedor:" +this.NomeFornecedor +"\nNome do Produto:" + this.NomeProduto+ "\nDescrição do Produto:" +this.Descricao);
    }
}
