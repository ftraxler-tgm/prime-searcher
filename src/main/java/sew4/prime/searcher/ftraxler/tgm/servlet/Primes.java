package sew4.prime.searcher.ftraxler.tgm.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-04-26
 * @project sew4-prime-searcher-ftraxler-tgm
 */
@WebServlet(name="Prime",urlPatterns = "/primes")
public class Primes extends HttpServlet {

    protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/primes/searcher");
    }

}
