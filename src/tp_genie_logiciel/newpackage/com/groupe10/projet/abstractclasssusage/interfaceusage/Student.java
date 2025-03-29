
package tp_genie_logiciel.newpackage.com.groupe10.projet.abstractclasssusage.interfaceusage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tp_genie_logiciel.newpackage.com.groupe10.projets.connectionsample.ConnectionFactory;


public class Student implements Person {
	private int id;
	private String firstName;
	private String lastName;
	private String rollNumber;

	public Student() {
	}

	public Student(int id, String firstName, String lastName, String rollNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public void showIdentity() {
		System.out.println(String.format("Student with ID [%s], FistName [%s], LastName [%s], Roll Number [%s]", id,
				firstName, lastName, rollNumber));
	}

	@Override
	public int add() throws SQLException {
		String sqlQuery = "INSERT INTO student(id,firstName,lastName,rollNumber) VALUES(?,?,?,?)";
		PreparedStatement ps = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION)
				.prepareStatement(sqlQuery);
		ps.setInt(1, id);
		ps.setString(2, firstName);
		ps.setString(3, lastName);
		ps.setString(4, rollNumber);

		return ps.executeUpdate();
	}

	@Override
	public void showDynamicIdentity(int id) throws SQLException {
		String sqlQuery = "SELECT student.id, student.firstName, student.lastName, student.rollNumber FROM student WHERE student.id=?";
		try (PreparedStatement ps = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION)
				.prepareStatement(sqlQuery)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					System.out.println(String.format(
							"Student with ID [%s], FistName [%s], LastName [%s], Roll Number [%s]", rs.getInt("id"),
							rs.getString("firstName"), rs.getString("lastName"), rs.getString("rollNumber")));
				}
			}

		}

	}

}
