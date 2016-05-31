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

public class CategoriaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final FloatExpression coste;
	public final StringExpression nombre;
	public final CollectionExpression empleado;
	
	public CategoriaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		coste = new FloatExpression("coste", this);
		nombre = new StringExpression("nombre", this);
		empleado = new CollectionExpression("ORM_Empleado", this);
	}
	
	public CategoriaCriteria(PersistentSession session) {
		this(session.createCriteria(Categoria.class));
	}
	
	public CategoriaCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public EmpleadoCriteria createEmpleadoCriteria() {
		return new EmpleadoCriteria(createCriteria("ORM_Empleado"));
	}
	
	public Categoria uniqueCategoria() {
		return (Categoria) super.uniqueResult();
	}
	
	public Categoria[] listCategoria() {
		java.util.List list = super.list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

