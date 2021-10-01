import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/szamologep.do")
public class Servlet2 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aString = req.getParameter("a");
        String bString = req.getParameter("b");
        String operator = req.getParameter("operator");

        Double result = 0.0;

        if ("+".equals(operator)) {
            result = Double.parseDouble(aString) + Double.parseDouble(bString);
        }

        if ("*".equals(operator)) {
            result = Double.parseDouble(aString) * Double.parseDouble(bString);
        }

        if ("/".equals(operator)) {
            result = Double.parseDouble(aString) / Double.parseDouble(bString);
        }

        if ("-".equals(operator)) {
            result = Double.parseDouble(aString) - Double.parseDouble(bString);
        }

        // eltarolja a keresbe, hogy a jsp is elerje
        req.setAttribute("result", result);

        // forward
        RequestDispatcher rd = req.getSession()
                .getServletContext( )
                .getRequestDispatcher("/");

        rd.forward(req, resp);
    }
}