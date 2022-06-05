

import java.io.IOException;
/**
 * Servlet implementation class valid
 */
@WebServlet("/valid")
public class valid extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tech;
		tech=request.getParameter("techno");
		PrintWriter p=response.getWriter();
		if(tech.equals("Java"))
		{
			RequestDispatcher rt= request.getRequestDispatcher("java.html");
					rt.forward(request,response);
			p.println("You have selected:"+"Java");			
		}
		else if(tech.equals("Dotnet"))
		{
			RequestDispatcher ro= request.getRequestDispatcher("Dotnet.html");
					ro.forward(request,response);
		}
		else if(tech.equals("C"))
		{
			RequestDispatcher ro= request.getRequestDispatcher("C.html");
					ro.forward(request,response);
		}

		else if(tech.equals("C++"))
		{
			RequestDispatcher ro= request.getRequestDispatcher("C++.html");
					ro.forward(request,response);
		}

		else
		{
			RequestDispatcher rt= request.getRequestDispatcher("course.html");
					rt.include(request,response);
					p.print("<B>YOU SELECTED:INVALID page!!!!<B>");
		}
	}
}