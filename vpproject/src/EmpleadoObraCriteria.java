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

public class EmpleadoObraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression telefono;
	public final StringExpression dni;
	public final CollectionExpression proveedor;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final StringExpression usuario;
	public final StringExpression contra;
	public final CollectionExpression periodoEmpleadoEnObras;
	
	public EmpleadoObraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		telefono = new StringExpression("telefono", this);
		dni = new StringExpression("dni", this);
		proveedor = new CollectionExpression("ORM_Proveedor", this);
		categoriaId = new IntegerExpression("categoria.ID", this);
		categoria = new AssociationExpression("categoria", this);
		usuario = new StringExpression("usuario", this);
		contra = new StringExpression("contra", this);
		periodoEmpleadoEnObras = new CollectionExpression("ORM_PeriodoEmpleadoEnObras", this);
	}
	
	public EmpleadoObraCriteria(PersistentSession session) {
		this(session.createCriteria(EmpleadoObra.class));
	}
	
	public EmpleadoObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public PeriodoEmpleadoEnObraCriteria createPeriodoEmpleadoEnObrasCriteria() {
		return new PeriodoEmpleadoEnObraCriteria(createCriteria("ORM_PeriodoEmpleadoEnObras"));
	}
	
	public CategoriaCriteria createCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("categoria"));
	}
	
	public ProveedorCriteria createProveedorCriteria() {
		return new ProveedorCriteria(createCriteria("ORM_Proveedor"));
	}
	
	public EmpleadoObra uniqueEmpleadoObra() {
		return (EmpleadoObra) super.uniqueResult();
	}
	
	public EmpleadoObra[] listEmpleadoObra() {
		java.util.List list = super.list();
		return (EmpleadoObra[]) list.toArray(new EmpleadoObra[list.size()]);
	}
}

