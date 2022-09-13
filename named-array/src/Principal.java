
import dao.PessoaDAO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import model.Pessoa;

public class Principal {

    public static void main(String[] args) {

        PessoaDAO pessoaDAO = new PessoaDAO();
        //pessoaDAO.verficarEstadoDoCicloDeVIda();
        
        for (int i = 0; i < 10;) {
            Pessoa p = new Pessoa("Pessoa: " + i, new Date(2005, i, i), new BigDecimal(1000 * ++i));

            pessoaDAO.inserir(p);
        }
        
        List<Pessoa> pessoas = pessoaDAO.buscarPorNome("Pessoa");
        for(Pessoa pessoa : pessoas){
             System.out.println(pessoa);
        
        }
        pessoaDAO.remover(pessoas.get(0));
    }

    private static void testeNamedQueries() {
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        for (int i = 0; i < 10;) {
            Pessoa p = new Pessoa("Pessoa: " + i, new Date(2005, i, i), new BigDecimal(1000 * ++i));

            pessoaDAO.inserir(p);
        }

        //Testar a consulta
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(5);

        List<Pessoa> buscarPorNome = pessoaDAO.buscarPorNome("Pessoa");
        List<Pessoa> buscarPorSalario = pessoaDAO.buscarPorSalario(new BigDecimal(7000));
        List<Pessoa> buscarPorData = pessoaDAO.buscarPorData(new Date(2005, 02, 11));

        System.out.println(pessoaRetornada);

        System.out.println("Busca por Nome:");
        for (Pessoa pessoa : buscarPorNome) {
            System.out.println(pessoa);
        }

        System.out.println("Busca por salarios:");

        for (Pessoa pessoa : buscarPorSalario) {
            System.out.println(pessoa);
        }

        System.out.println("Busca por Data de Nascimento:");

        for (Pessoa pessoa : buscarPorData) {
            System.out.println(pessoa);
        }
    }

}
