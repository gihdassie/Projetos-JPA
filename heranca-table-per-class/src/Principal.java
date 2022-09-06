
import dao.FuncionarioDAO;
import dao.PessoaDAO;
import model.Funcionario;
import model.Pessoa;
import java.math.BigDecimal;


public class Principal {
    public static void main(String[] args) {
//        Pessoa p1= new Pessoa();
//        p1.setNome("Joao");
//        
//        PessoaDAO pessoaDAO = new PessoaDAO();
//        pessoaDAO.inserir(p1);
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setSalario(new BigDecimal(50000));
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserir(f1);
      }
}
