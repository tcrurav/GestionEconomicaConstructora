/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProveedorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final CollectionExpression contacto;
	public final CollectionExpression albaran;
	
	public ProveedorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		direccion = new StringExpression("direccion", this);
		contacto = new CollectionExpression("ORM_Contacto", this);
		albaran = new CollectionExpression("ORM_Albaran", this);
	}
	
	public ProveedorCriteria(PersistentSession session) {
		this(session.createCriteria(Proveedor.class));
	}
	
	public ProveedorCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createContactoCriteria() {
		return new PersonaCriteria(createCriteria("ORM_Contacto"));
	}
	
	public AlbaranCriteria createAlbaranCriteria() {
		return new AlbaranCriteria(createCriteria("ORM_Albaran"));
	}
	
	public Proveedor uniqueProveedor() {
		return (Proveedor) super.uniqueResult();
	}
	
	public Proveedor[] listProveedor() {
		java.util.List list = super.list();
		return (Proveedor[]) list.toArray(new Proveedor[list.size()]);
	}
}

