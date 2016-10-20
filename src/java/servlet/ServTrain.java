package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServTrain", urlPatterns = {"/ServTrain"})
public class ServTrain extends HttpServlet {
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respons)
			throws ServletException, IOException {
		Float base = Float.parseFloat(request.getParameter("Base"));
		Float hight = Float.parseFloat(request.getParameter("Altura"));
                float resultado = 0f;
			 resultado = (base*hight)/2;
                         respons.setContentType("text/html");
                         PrintWriter out = new PrintWriter(respons.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>RectanguloArea</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>Resultado "  + resultado + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
	}
}

