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

public class AlbaranCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression empleadoId;
	public final AssociationExpression empleado;
	public final IntegerExpression proveedorId;
	public final AssociationExpression proveedor;
	public final DateExpression fecha;
	public final StringExpression numAlbaran;
	public final CollectionExpression lineaAlbarans;
	
	public AlbaranCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		empleadoId = new IntegerExpression("empleado.ID", this);
		empleado = new AssociationExpression("empleado", this);
		proveedorId = new IntegerExpression("proveedor.ID", this);
		proveedor = new AssociationExpression("proveedor", this);
		fecha = new DateExpression("fecha", this);
		numAlbaran = new StringExpression("numAlbaran", this);
		lineaAlbarans = new CollectionExpression("ORM_LineaAlbarans", this);
	}
	
	public AlbaranCriteria(PersistentSession session) {
		this(session.createCriteria(Albaran.class));
	}
	
	public AlbaranCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public EmpleadoAlmacenCriteria createEmpleadoCriteria() {
		return new EmpleadoAlmacenCriteria(createCriteria("empleado"));
	}
	
	public ProveedorCriteria createProveedorCriteria() {
		return new ProveedorCriteria(createCriteria("proveedor"));
	}
	
	public LineaAlbaranCriteria createLineaAlbaransCriteria() {
		return new LineaAlbaranCriteria(createCriteria("ORM_LineaAlbarans"));
	}
	
	public Albaran uniqueAlbaran() {
		return (Albaran) super.uniqueResult();
	}
	
	public Albaran[] listAlbaran() {
		java.util.List list = super.list();
		return (Albaran[]) list.toArray(new Albaran[list.size()]);
	}
}

