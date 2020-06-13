
package frb.edu.br.infra.logica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
public interface Logica {
	String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
