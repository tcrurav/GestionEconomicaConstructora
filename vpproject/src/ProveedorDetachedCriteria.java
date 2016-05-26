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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProveedorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final CollectionExpression contacto;
	public final CollectionExpression albaran;
	
	public ProveedorDetachedCriteria() {
		super(Proveedor.class, ProveedorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		contacto = new CollectionExpression("ORM_Contacto", this.getDetachedCriteria());
		albaran = new CollectionExpression("ORM_Albaran", this.getDetachedCriteria());
	}
	
	public ProveedorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ProveedorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		contacto = new CollectionExpression("ORM_Contacto", this.getDetachedCriteria());
		albaran = new CollectionExpression("ORM_Albaran", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createContactoCriteria() {
		return new PersonaDetachedCriteria(createCriteria("ORM_Contacto"));
	}
	
	public AlbaranDetachedCriteria createAlbaranCriteria() {
		return new AlbaranDetachedCriteria(createCriteria("ORM_Albaran"));
	}
	
	public Proveedor uniqueProveedor(PersistentSession session) {
		return (Proveedor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Proveedor[] listProveedor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Proveedor[]) list.toArray(new Proveedor[list.size()]);
	}
}

