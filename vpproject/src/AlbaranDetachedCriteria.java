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

public class AlbaranDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression empleadoId;
	public final AssociationExpression empleado;
	public final IntegerExpression proveedorId;
	public final AssociationExpression proveedor;
	public final DateExpression fecha;
	public final StringExpression numAlbaran;
	public final CollectionExpression lineaAlbarans;
	
	public AlbaranDetachedCriteria() {
		super(Albaran.class, AlbaranCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		empleadoId = new IntegerExpression("empleado.ID", this.getDetachedCriteria());
		empleado = new AssociationExpression("empleado", this.getDetachedCriteria());
		proveedorId = new IntegerExpression("proveedor.ID", this.getDetachedCriteria());
		proveedor = new AssociationExpression("proveedor", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		numAlbaran = new StringExpression("numAlbaran", this.getDetachedCriteria());
		lineaAlbarans = new CollectionExpression("ORM_LineaAlbarans", this.getDetachedCriteria());
	}
	
	public AlbaranDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AlbaranCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		empleadoId = new IntegerExpression("empleado.ID", this.getDetachedCriteria());
		empleado = new AssociationExpression("empleado", this.getDetachedCriteria());
		proveedorId = new IntegerExpression("proveedor.ID", this.getDetachedCriteria());
		proveedor = new AssociationExpression("proveedor", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		numAlbaran = new StringExpression("numAlbaran", this.getDetachedCriteria());
		lineaAlbarans = new CollectionExpression("ORM_LineaAlbarans", this.getDetachedCriteria());
	}
	
	public EmpleadoAlmacenDetachedCriteria createEmpleadoCriteria() {
		return new EmpleadoAlmacenDetachedCriteria(createCriteria("empleado"));
	}
	
	public ProveedorDetachedCriteria createProveedorCriteria() {
		return new ProveedorDetachedCriteria(createCriteria("proveedor"));
	}
	
	public LineaAlbaranDetachedCriteria createLineaAlbaransCriteria() {
		return new LineaAlbaranDetachedCriteria(createCriteria("ORM_LineaAlbarans"));
	}
	
	public Albaran uniqueAlbaran(PersistentSession session) {
		return (Albaran) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Albaran[] listAlbaran(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Albaran[]) list.toArray(new Albaran[list.size()]);
	}
}

