/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frb.edu.br.infra.logica;

import frb.edu.br.infra.dao.CidadeDao;
import frb.edu.br.infra.model.Cidade;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
public class CadastrarCidade implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String estado = req.getParameter("estado");

		Cidade cidade = new Cidade();
		cidade.setNome(nome);
		cidade.setEstado(estado);

		new CidadeDao().inserir(cidade);

		return "sucessoCidade.jsp";
	}
}