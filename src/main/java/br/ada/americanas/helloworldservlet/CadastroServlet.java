package br.ada.americanas.helloworldservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroServlet", value = "/cadastrar")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");


        PrintWriter out = response.getWriter();
        out.println("<html><body>Cliente nome: " + nome + " , cpf: " + cpf + " foi cadastrado com sucesso.</body></html>");

    }
}
