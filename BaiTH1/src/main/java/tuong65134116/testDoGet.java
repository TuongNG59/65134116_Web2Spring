package tuong65134116;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class testDoGet
 */
@WebServlet("/testDoGet")
public class testDoGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testDoGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		response.setContentType("text/html; charset=UTF-8");
		
		String noiDungHTML = "";
		noiDungHTML += "<center><h3>TOI HOC WEB JAVA</h3></center>";
		noiDungHTML += "<hr>";
		noiDungHTML += "65.CNTT-CLC";
		
		PrintWriter boTraLoi = response.getWriter();
		boTraLoi.print(noiDungHTML);
	}

}
