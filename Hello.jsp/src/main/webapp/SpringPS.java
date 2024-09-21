import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;


public class SpringPS extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{
res.setContentType("new/html");
 

PrintWriter out=res.getWriter();
int n=Integer.parseInt(req.getParameter("new")); if(n>=0)
{
out.println("Number is Positive");
}
else
{
out.println("Number is Negative");
}

}
}