package twins.snu;

import java.io.IOException;
import java.io.PrintWriter;
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
	/*
	private void printHeader(PrintWriter out) throws ServletException {
		  out.println("<HTML><HEAD><TITLE>Guestbook</TITLE>");
		  out.println("<link rel=\"stylesheet\" href=\"Style.css\">");
		  out.println("</HEAD>");
		}
		*/
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
	String rr = "";
	if(rs.next()==false) {
		rr += "<center><h2>올바른 형식의 업무가 아닙니다.</h2></center>";
		
		return rr;
	}
//	rr = "<style> table{width:100%;} table,td,th{border:1px solid #bcbcbc;}</style>";
//	rr = "<table border-collapse:collapse width:50% table-layout:fixed";
//	rr = "<table margin-top: 50px width: 700px height: 600px border: 1px solid black text-align: center></table>";
//	rr = "<table border-collapse:collapse width:50% border:'1px solid black' table-layout:fixed >";
//	rr = "<table border-collapse:collapse width:50% bordercolor='black'>";
//	rr = "<table  width=\"100%\" height=200 bgcolor=black bordercolor=\"black\" cellspacing=\"5\">";
	rr = "<table width=\"80%\" style=\"margin:auto\" height=\"200px\" border=\"1px solid #444444\" border-collapse=\"collapse\"  bordercolor=\"black\">";
			
//	rr = "<style>"+"<table border:'1px solid red' border-collapse:'collapse'>" +"</style>";
	//String rr = "<table border:1px color:'red' width:'60%' text-align:'center'>";
//	rr+="<tr vertical-align:'inherit' text-align:'center'>";
//	rr+="<th 'padding':10px 'border': 1px solid black 'border-collapse' : collapse>직위 </th>"+"<th 'padding':10px 'border': 1px solid black 'border-collapse' : collapse>이름</th>"+"<th 'padding':10px 'border': 1px solid black 'border-collapse' :collapse>이메일</th>"+"<th 'padding':10px 'border': 1px solid black 'border-collapse' : collapse>전화번호 </th>"+"<th 'padding':10px 'border': 1px solid black 'border-collapse' : collapse>업무</th>";
//	rr+="<th padding:10px border: 1px solid black border-collapse : collapse>직위 </th>"+"<th padding:10px border: 1px solid black border-collapse : collapse>이름</th>"+"<th padding:10px border: 1px solid black border-collapse :collapse>이메일</th>"+"<th padding:10px border: 1px solid black border-collapse : collapse>전화번호 </th>"+"<th padding:10px border: 1px solid black border-collapse : collapse>업무</th>";
	rr += "<th height=\"50px\"  align=\"center\" bgcolor=\"#C4E9FF\" border=\"1px solid #2b303b\" paddig=\"10px\">직위</th>";
	rr += "<th height=\"50px\" width=\"20%\" align=\"center\" bgcolor=\"#C4E9FF\"  border=\"1px solid #2b303b\" paddig=\"10px\">이름 </th>";
	rr += "<th height=\"50px\" width=\"20%\"align=\"center\" bgcolor=\"#C4E9FF\"  border=\"1px solid #2b303b\" paddig=\"10px\">이메일  </th>";
	rr += "<th height=\"50px\" width=\"20%\" align=\"center\" bgcolor=\"#C4E9FF\"  border=\"1px solid #2b303b\" paddig=\"10px\">전화번호  </th>";
	rr += "<th height=\"50px\" width=\"20%\" align=\"center\" bgcolor=\"#C4E9FF\"  border=\"1px solid #2b303b\" paddig=\"10px\">업무  </th>";
//	rr += "<th align=\"center\" bgcolor=\"#fff8dc\">이메일</th>"+"<th align=\"center\" bgcolor=\"#fff8dc\">전화번호</th>"+"<th align=\"center\" bgcolor=\"#fff8dc\">업무</th>";
	//	rr+="<th padding :'10px'>직위 </th>"+"<th padding :'10px'>이름</th>"+"<th padding :'10px' >이메일</th>"+"<th padding :'10px' >전화번호 </th>"+"<th padding :'10px' >업무</th>";
	//	rr+="</tr>";
	
	while(rs.next()) {
		rr += "<tr align=\"center\" bgcolor=\"white\">";
		
		for(int i = 1; i <= 5; i++) {
		//	rr += "<td width='300' height='50' style='table-layout:fixed' border: '1px solid black' border-collapse : 'collapse' >" + rs.getString(i) + "</td>";
		//	rr += "<td width:300 height:50 table-layout:fixed border: 1px solid black border-collapse : collapse  text-align: center>" + rs.getString(i) + "</td>";
			rr+="<td height=\"200px\" width=\"150px\" border=\"1px solid #444444\" paddig=\"10px\" align=\"center\">"+ rs.getString(i) + "</td>";
			System.out.println(rs.getString(i));		//	rr += "<td  >" + rs.getString(i) + "</td>";
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
