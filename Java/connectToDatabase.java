private java.sql.Connection con = null;
private PreparedStatement pst = null;
private ResultSet rs = null;
private String url = "jdbc:mysql://localhost:8081/"; /*database address*/
private String user = "root";
private String password = "root";

try{
   con = DriverManager.getConnection(url, user, password);
   Statement st = (Statement) con.createStatement();

   st.executeUpdate("INSERT INTO incomeCalc ()"  + "VALUES ()");

   con.close(); 
}



public void dataConnection(String username, String password){

    con = DriverManager.getConnection(
        "jdcb:myDriver:myDatabase",
        username,
        password
    );

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM Table1");

    while (rs.next()) {
        int x = rs.getInt("a");
        String s = rs.getString("b");
        Float f = rs.getFloat("c");
    }
}