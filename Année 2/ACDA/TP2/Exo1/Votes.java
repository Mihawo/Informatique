import java.sql.*;

public class Votes {
	private int oui;
	private int non;
	private Connection connect;

	public Votes() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			try {
				this.connect=DriverManager.getConnection("jdbc:mariadb://dwarves.arda/suty","suty","suty");
				try {
					PreparedStatement statement = this.connect.prepareStatement("SELECT * from Vote where id=0");
					ResultSet res = statement.executeQuery();
					res.next();
					this.oui=res.getInt(1);
					this.non=res.getInt(2);
				} catch(SQLException e) {
					System.err.println("Err : 3");
					System.exit(3);
				}
			} catch (SQLException e) {
				System.err.println("Err : 2");
				System.exit(2);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Err : 1");
			System.exit(1);
		}
	}

	public void close() {
		try {
			this.connect.close();
		} catch (SQLException e) {
			System.err.println("Err : 6");
			System.exit(6);
		}
	}

	public void voteOui() {
		this.oui++;
		try {
			PreparedStatement statement = this.connect.prepareStatement("Update Vote Set oui=? where id=0");
			statement.setInt(1,this.oui);
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Err : 4");
			System.exit(4);
		}
	}
	public void voteNon() {
		this.non++;
		try {
			PreparedStatement statement = this.connect.prepareStatement("Update Vote Set non=? where id=0");
			statement.setInt(1,this.non);
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Err : 5");
			System.exit(5);
		}
	}

	public int getOui() {
		return this.oui;
	}
	public int getNon() {
		return this.non;
	}
}