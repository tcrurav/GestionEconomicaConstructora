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

public class CategoriaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final FloatExpression coste;
	public final StringExpression nombre;
	public final CollectionExpression empleado;
	
	public CategoriaDetachedCriteria() {
		super(Categoria.class, CategoriaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		empleado = new CollectionExpression("ORM_Empleado", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CategoriaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		empleado = new CollectionExpression("ORM_Empleado", this.getDetachedCriteria());
	}
	
	public EmpleadoDetachedCriteria createEmpleadoCriteria() {
		return new EmpleadoDetachedCriteria(createCriteria("ORM_Empleado"));
	}
	
	public Categoria uniqueCategoria(PersistentSession session) {
		return (Categoria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categoria[] listCategoria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

