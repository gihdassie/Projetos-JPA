
import br.edu.ifsp.edu.dao.ProdutoDAO;
import br.edu.ifsp.pep.modelo.Produto;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Principal {
    
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public static void main(String[] args) {
        adicionarProdutos();
    }
    
    private static void adicionarProdutos(){
        for(int i=0;i<10;i++){
            Produto p = new Produto("Produto " + i,i *10, new BigDecimal((i+1)*100));
            
            produtoDAO.inserir(p);
        }
    }
}
