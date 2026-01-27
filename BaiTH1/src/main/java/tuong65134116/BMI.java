package tuong65134116;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/bmi.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		double h = Double.parseDouble(request.getParameter("height"));
        double w = Double.parseDouble(request.getParameter("weight"));
        
        double bmi = w / (h * h);
        
        String kq;
        if (bmi < 18.5) {
            kq = "Gầy";
        } else if (bmi < 25) {
            kq = "Bình thường";
        } else if (bmi < 30) {
            kq = "Thừa cân";
        } else {
            kq = "Béo phì";
        }
        
        PrintWriter out = response.getWriter();
        out.println("<h2>KẾT QUẢ BMI</h2>");
        out.println("BMI = " + bmi + "<br>");
        out.println("Kết luận: " + kq + "<br><br>");
        out.println("<a href='BMI'>Quay lại</a>");
	}

}
