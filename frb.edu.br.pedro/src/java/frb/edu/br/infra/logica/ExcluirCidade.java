
package frb.edu.br.infra.logica;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import frb.edu.br.infra.model.Cidade;
/**
 *
 * @author pedro
 */
public class ExcluirCidade implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idCidade = Integer.parseInt(req.getParameter("id"));

//		pesquisar cidade pelo ID gerando objeto cidade
		Cidade cidade = new CidadeDao().pesquisaId(idCidade);

//		deletar a cidade
		new CidadeDao().excluirCidade(cidade);

		return "sistema?logica=ListarCidade";
	}

}