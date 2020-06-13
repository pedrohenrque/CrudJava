
package frb.edu.br.infra.logica;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import frb.edu.br.infra.dao.CidadeDao;
import frb.edu.br.infra.model.Cidade;
/**
 *
 * @author pedro
 */
public class ListarCidade implements Logica {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CidadeDao dao = new CidadeDao();
		List<Cidade> lista = dao.listarTudo();

		req.setAttribute("lista", lista);

		return "/listaDeCidades.jsp";
	}
}
