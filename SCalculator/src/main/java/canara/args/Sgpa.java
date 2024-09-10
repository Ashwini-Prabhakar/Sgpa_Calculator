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
			String mark1="0";
			String mark2="0";
			String mark3="0";
			String mark4="0";
			String mark5="0";
			String mark6="0";
			String mark7="0";
			String mark8="0";
			String mark9="0";   
			int n=Integer.valueOf(num);
			String mark[]=new String[n];
			String cred[]=new String[n];
			int p1[]=new int[n];
			int mc[]=new int[n];
			/*String cred[]=new String[n];
			for(int i=0;i<n;i++) {
				mark[i]="0";
			}
			for(int i=0;i<n;i++) {
				mark[i]=req.getParameter("mi");
			}	*/
			
			mark1 = req.getParameter("m1");
			mark2 = req.getParameter("m2");
			mark3 = req.getParameter("m3");
			mark4 = req.getParameter("m4");
			mark5 = req.getParameter("m5");
			mark6 = req.getParameter("m6");
			mark7 = req.getParameter("m7");
			mark8 = req.getParameter("m8");
			  
			
			
			mark[0]=mark1;
			mark[1]=mark2;
			mark[2]=mark3;
			mark[3]=mark4;
			mark[4]=mark5;
			mark[5]=mark6;
			mark[6]=mark7;
			mark[7]=mark8;
			
			for(int i=0;i<n;i++) {
				if(Integer.valueOf(mark[i])>=60 && Integer.valueOf(mark[i])<70) 
					mc[i]=7;
				
				else if(Integer.valueOf(mark[i])>=70 && Integer.valueOf(mark[i])<80) 
					mc[i]=8;
				else if(Integer.valueOf(mark[i])>=80 && Integer.valueOf(mark[i])<90) 
					mc[i]=9;
				else if(Integer.valueOf(mark[i])>=90 && Integer.valueOf(mark[i])<=100) 
					mc[i]=10;
				else
					mc[i]=0;
			}
			
			String cred1="0";
			String cred2="0";
			String cred3="0";
			String cred4="0";
			String cred5="0";
			String cred6="0";
			String cred7="0";
			String cred8="0";
			
			
			cred1=req.getParameter("c1");
			cred2=req.getParameter("c2");  
			cred3=req.getParameter("c3");
			cred4=req.getParameter("c4");
			cred5=req.getParameter("c5");
			cred6=req.getParameter("c6");
			cred7=req.getParameter("c7");
			cred8=req.getParameter("c8");
			
			
			cred[0]=cred1;
			cred[1]=cred2;
			cred[2]=cred3;
			cred[3]=cred4;
			cred[4]=cred5;
			cred[5]=cred6;
			cred[6]=cred7;
			cred[7]=cred8;
			
			
			PrintWriter out=resp.getWriter();
			int j=0;
			while(j<n) {
				p1[j]=mc[j]*Integer.valueOf(cred[j]);
				j++;
			}
			int creditsum=0;
			int prodsum=0;
			for(int i=0;i<n;i++) {
				creditsum+=Integer.valueOf(cred[i]);
				prodsum+=p1[i];
					
			}
			
			double d=(double)prodsum/creditsum;  
		/*	for(int i=0;i<n;i++) {
				cred[i]="0";
			}
			for(int i=0;i<n;i++) {
				cred[i]=req.getParameter("ce".replace('e',i));
			}  */
			
			
			out.println("The sum of credits is: "+creditsum+" The product sum is:  "+prodsum+" ");
			out.println("The sgpa is "+String.format("%.2f",d));
			
			
			
			
			

	}
		
		

}

