
package tp_genie_logiciel.newpackage.com.groupe10.projet.abstractclasssusage.interfaceusage;

import java.sql.SQLException;

public interface Person {
	void showIdentity();
	void showDynamicIdentity(int id) throws SQLException;
	int add() throws SQLException;
}
