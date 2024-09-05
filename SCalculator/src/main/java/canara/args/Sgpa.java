package canara.args;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sgpa extends HttpServlet{

	
		
		public void doPost(HttpServletRequest req,
				             HttpServletResponse resp) 
				             throws ServletException, IOException {
			System.out.println("Running doPost() method");
			
			String num = req.getParameter("number");
			String m1 = req.getParameter("marks1");
			String m2 = req.getParameter("marks2");
			String c1=req.getParameter("credit1");
			String c2=req.getParameter("credit2");
			PrintWriter out=resp.getWriter();
			int n=Integer.valueOf(num);
			int p1=Integer.valueOf(m1)*Integer.valueOf(c1);
			int p2=Integer.valueOf(m2)*Integer.valueOf(c2);
			int s=p1+p2;
			int sc=Integer.valueOf(c1)+Integer.valueOf(c2);
			double d=s/sc;
			for(int i=0;i<n;i++) {
				
			}
			out.println(m1+" "+ m2+" ");
			out.println(c1+" "+ c2+" ");
			out.println(p1+" "+ p2+" ");
			out.println(s+" "+ sc+" ");
			out.println("The sgpa is "+d);
			
			
			
			
			

	}
		
		

}
