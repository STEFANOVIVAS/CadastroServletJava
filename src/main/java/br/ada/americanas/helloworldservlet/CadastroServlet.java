package br.ada.americanas.helloworldservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CadastroServlet", value = "/cadastrar")
public class CadastroServlet extends HttpServlet {

    private List<Cadastro> cadastramento=new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        Cadastro cadastro=new Cadastro(nome,cpf);
        var cadastros=recuperaCadastro(request);
        cadastros.add(cadastro);


        request.setAttribute("nome",nome);
        request.setAttribute("cpf",cpf);
//        request.setAttribute("Historico_operacao",this.cadastramento);

        request.getRequestDispatcher("Historico.jsp").forward(request,response);
       /* PrintWriter out = response.getWriter();
        out.println("<html><body>Cliente nome: " + nome + " , cpf: " + cpf + " foi cadastrado com sucesso.</body></html>");*/

    }
    private List<Cadastro> recuperaCadastro(HttpServletRequest request){
        HttpSession session=request.getSession(true);
        List<Cadastro> cadastramento=(List<Cadastro>)session.getAttribute("Historico_operacao");
        if (cadastramento==null){
            cadastramento=new ArrayList<>();
            session.setAttribute("Historico_operacao",cadastramento);
        }
        return cadastramento;

    }
}
