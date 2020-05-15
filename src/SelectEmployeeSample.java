import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class SelectEmployeeSample {
  public static void main(String[] args) {
//    // データベースに接続
//    try (Connection conn = DriverManager.getConnection(
//        "jdbc:h2:tcp://localhost/~/example", "sa", "")) {
//
//      // SELECT文を準備
//      String sql = "SELECT ID,NAME,AGE FROM EMPLOYEE";
//      PreparedStatement pStmt = conn.prepareStatement(sql);
//
//      // SELECTを実行し、結果表（ResultSet）を取得
//      ResultSet rs = pStmt.executeQuery();
//
//      // 結果表に格納されたレコードの内容を表示
//      while (rs.next()) {
//        String id = rs.getString("ID");
//        String name = rs.getString("NAME");
//        int age = rs.getInt("AGE");
//
//        // 取得したデータを出力
//        System.out.println("ID:" + id);
//        System.out.println("名前:" + name);
//        System.out.println("年齢:" + age + "\n");
//      }
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }

	  EmployeeDAO empDAO = new EmployeeDAO();
	  List<Employee> empList = empDAO.findAll();

	  for(Employee emp : empList) {
		  System.out.println("ID:" + emp.getId());
		  System.out.println("名前:" + emp.getName());
		  System.out.println("年齢:" + emp.getAge());
	  }
	 
  }
}
