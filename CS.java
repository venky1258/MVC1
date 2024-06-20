

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.LoginBean;




public class CS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		LoginBean bean=new LoginBean();
		bean.setName(request.getParameter("t1"));
		bean.setPassword(request.getParameter("t2"));
		request.setAttribute("bean", bean);
		if(bean.validate())
		{
			RequestDispatcher rd=(RequestDispatcher) request.getRequestDispatcher("ls.jsp");
			rd.forward((ServletRequest) request,response);
		}
		else
		{
			RequestDispatcher rd=(RequestDispatcher) request.getRequestDispatcher("le.jsp");
			rd.forward((ServletRequest) request, response);
		}
	}

	

}
