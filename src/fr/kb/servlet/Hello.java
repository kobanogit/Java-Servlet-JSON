package fr.kb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

//import org.json.simple.JSONObject;
//import net.sf.json.JSONArray;
/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jsonObject = "{ \"key1\": \"value1\", \"key2\": \"value2\" }";
		
//		response.setContentType("text/html");
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
//
		PrintWriter out = response.getWriter();
//		
//		JSONObject json = new JSONObject();

	    // put some value pairs into the JSON object .
//	    json.put("Mobile", 9999988888);
//	    json.put("Name", "ManojSarnaik");

	    // finally output the json string       
//	    out.print(json.toString());
		
//		out.print("<html><body>");
//		out.print("<h3>Hello Servlet</h3>");
//		out.print("</body></html>");
		
		out.print(jsonObject);
		out.flush();
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
