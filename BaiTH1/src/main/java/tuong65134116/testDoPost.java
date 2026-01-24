package tuong65134116;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class testDoPost
 */
@WebServlet("/testDoPost")
public class testDoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testDoPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();

        out.println("<h3>Form test doPost</h3>");
        out.println("<form method='post' action='testDoPost'>");
        out.println("Họ tên: <input type='text' name='hoten'><br><br>");
        out.println("Tuổi: <input type='number' name='tuoi'><br><br>");
        out.println("<input type='submit' value='Gửi'>");
        out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String hoTen = request.getParameter("hoten");
        String tuoi = request.getParameter("tuoi");

        PrintWriter out = response.getWriter();
        out.println("<h3>Kết quả nhận từ doPost</h3>");
        out.println("<hr>");
        out.println("Họ tên: " + hoTen + "<br>");
        out.println("Tuổi: " + tuoi + "<br>");
        out.println("<br><a href='testDoPost'>Quay lại form</a>");
	}
}
