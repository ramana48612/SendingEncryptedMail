

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;





/**
 * Servlet implementation class HelloServlet
 */

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws IOException 
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet()  {
        super();
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
	    	String recepient =	(request.getParameter("mailId"));
	    	String msg =	(request.getParameter("message"));
	    	
//	    	msg = MailSending.encrypt(msg);
	    	
	    	
	    	
	    	Random random = new Random();
	    	 int n =  random.nextInt(8)+1; 
	    		 
	    	   	 String s = msg;
	    	   	

	    	   	 String str = "";		
	    			for(int j=0; j<n; j++) {	
	    				for(int i=1; i<s.length(); i+=2){
	    					char c = s.charAt(i);				
	    					str += c;
	    				}		
	    				for(int i=0; i<s.length(); i+=2){
	    					char c = s.charAt(i);				
	    					str += c;
	    				}		
	    				s= str;
	    				str = "";			
	    			}			
	    			
	    			
	    			msg = s+"\n\n\n\thttps://decryptforserver.ramana48612.repl.co/";
	    			
	    		
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	       MailSending.sendMail(recepient, msg ,n);
	       
	    	
	    	
	    	out.println("<h1> Mail Sent...!</h1>");
	    	out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
//	-------------------------------------------------------------------------
	
	


	
	
	
	
	

}


