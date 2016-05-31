/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateGestiónEconómicaConstructoraDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(GestiónEconómicaConstructoraPersistentManager.instance());
			GestiónEconómicaConstructoraPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
