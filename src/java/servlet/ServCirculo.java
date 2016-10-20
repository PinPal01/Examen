package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServCirculo", urlPatterns = {"/ServCirculo"})
public class ServCirculo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                double diam = Double.parseDouble(request.getParameter("Diametro"));
                String button = request.getParameter("boton");
                double op = 0f;
                
		if (button.equals("area")) {
			 op = (3.14*(diam/2)*(diam/2));
                         response.setContentType("text/html");
                         PrintWriter out = new PrintWriter(response.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>Circulo</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>Resultado "  + op + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
		} else if (button.equals("perimetro")) {
                         op = 3.14*diam;
                         response.setContentType("text/html");
                         PrintWriter out = new PrintWriter(response.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>Circulo</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>Resultado: "  + op + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
                }
	}
}
