

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Basic HttpServlet code", urlPatterns = { "/test" })

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static{
	     System.out.println("Class loading....");
	}
	public FirstServlet()
	{
		System.out.println("Class Instantiation...");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initalisation using init(SerlvetConfig config)"+config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");      //content type
		PrintWriter out=response.getWriter();        //user entry type
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1>GETTING REPONSE FOR GET REQUEST TYPE</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();                                            //close the writer
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Set the response type
		response.setContentType("text/html");

		// 2. Getting the PrintWriter object to send the response
		PrintWriter out = response.getWriter();

		// 3. Setting the html page to write the response
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1>Getting the reponse for POST request type</h1>");
		out.println("</body>");
		out.println("</html>");

		// 4. close the response object
		out.close();
	}
	@Override
	public void destroy() {
		System.out.println("Servlet Deinstantion....");
	}

}
