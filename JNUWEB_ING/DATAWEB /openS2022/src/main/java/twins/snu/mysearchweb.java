package twins.snu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * Servlet implementation class mysearchweb
 */
public class mysearchweb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mysearchweb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String n1 = request.getParameter("n1");
		System.out.println("In Get " + n1);
		/*
		request.setAttribute("result", "<h2>" + n1 + n1 + "</h2>");
		response.setContentType("text/html;charset=UTF-8");
		getServletContext().getRequestDispatcher("/Retrieve.jsp").forward(request, response);
		//).getWriter().append("Served at: ").append(request.getContextPath());
		 * 
		 */
		String html = null;
		try {
			html = DoSQL(n1);
			
		} catch(Exception e) {
			System.out.println("Error ");
			e.printStackTrace();
		}
	//request.setAttribute("result", "<h2>" + n1 + n1 + "</h2>");
		request.setAttribute("result",  html);
		response.setContentType("text/html;charset=UTF-8");
		getServletContext().getRequestDispatcher("/Retrieve.jsp").forward(request, response);
	}
	
	String DoSQL(String p) throws Exception {
		//String dburl = "jdbc:mysql://192.168.35.22:3306/jsps?useSSL=fasle";
		String dburl = "jdbc:mysql://localhost:3306/jsps?useSSL=false&allowPublicKeyRetrieval=true";
		String dbUser = "mmmszip", dbpwd="wlgus1086!!";
		String sql = "select * from Jihyun where work like '%"+p+"%';";
		System.out.println(sql);
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driverfound");
	Connection conn = DriverManager.getConnection(dburl, dbUser, dbpwd);
	System.out.println("Driverconnect");

	Statement stmt = conn.createStatement();
	System.out.println("Driverstatement");
	ResultSet rs = stmt.executeQuery(sql);
	System.out.println("Driverexcute");
	String rr = "<table border-collapse:'collapse' width:'50%' border='1' bordercolor='black' >";
	rr+="<tr vertical-align:'inherit' text-align:'center'>";
	rr+="<th padding:'10px'>직위 </th>"+"<th padding:'10px'>이름</th>"+"<th padding:'10px'>이메일</th>"+"<th padding:'10px'>전화번호 </th>"+"<th padding:'10px'>업무</th>";
	rr+="</tr>";
	while(rs.next()) {
		rr += "<tr>";
		for(int i = 1; i <= 5; i++) {
			rr += "<td>" + rs.getString(i) + "</td>";
		}
		rr += "</tr>";
	}
	rr += "</table>";
	return (rr);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
