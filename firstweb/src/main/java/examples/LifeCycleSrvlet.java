package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/LifeCycleSrvlet")
public class LifeCycleSrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LifeCycleSrvlet() {
        System.out.println("lifeCycleServlet 생성!");
        
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 123호출 ");
	}

	
	public void destroy() {
		System.out.println("destroy 호출");
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method = 'post'action='/firstweb/LifeCycleSrvlet'>");
		out.println("name:<input type='text' name='name'><br>");
		out.println("<input type='submit' value='ok'><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<h1>hello"+name+"</h1>");
		out.close();
		
	}

	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service 호출");
//	}

}
