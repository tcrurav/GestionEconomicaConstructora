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

public class JefeDeObraCriteria extends AbstractORMCriteria {
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
	public final CollectionExpression periodoJefeObraEnObras;
	public final CollectionExpression materialAsignadoAObra;
	public final CollectionExpression periodoMaquinariaEnObra;
	public final CollectionExpression periodoEmpleadoEnObra;
	
	public JefeDeObraCriteria(Criteria criteria) {
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
		periodoJefeObraEnObras = new CollectionExpression("ORM_PeriodoJefeObraEnObras", this);
		materialAsignadoAObra = new CollectionExpression("ORM_MaterialAsignadoAObra", this);
		periodoMaquinariaEnObra = new CollectionExpression("ORM_PeriodoMaquinariaEnObra", this);
		periodoEmpleadoEnObra = new CollectionExpression("ORM_PeriodoEmpleadoEnObra", this);
	}
	
	public JefeDeObraCriteria(PersistentSession session) {
		this(session.createCriteria(JefeDeObra.class));
	}
	
	public JefeDeObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public PeriodoJefeObraEnObraCriteria createPeriodoJefeObraEnObrasCriteria() {
		return new PeriodoJefeObraEnObraCriteria(createCriteria("ORM_PeriodoJefeObraEnObras"));
	}
	
	public MaterialParaObraCriteria createMaterialAsignadoAObraCriteria() {
		return new MaterialParaObraCriteria(createCriteria("ORM_MaterialAsignadoAObra"));
	}
	
	public PeriodoMaquinariaEnObraCriteria createPeriodoMaquinariaEnObraCriteria() {
		return new PeriodoMaquinariaEnObraCriteria(createCriteria("ORM_PeriodoMaquinariaEnObra"));
	}
	
	public PeriodoEmpleadoEnObraCriteria createPeriodoEmpleadoEnObraCriteria() {
		return new PeriodoEmpleadoEnObraCriteria(createCriteria("ORM_PeriodoEmpleadoEnObra"));
	}
	
	public CategoriaCriteria createCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("categoria"));
	}
	
	public ProveedorCriteria createProveedorCriteria() {
		return new ProveedorCriteria(createCriteria("ORM_Proveedor"));
	}
	
	public JefeDeObra uniqueJefeDeObra() {
		return (JefeDeObra) super.uniqueResult();
	}
	
	public JefeDeObra[] listJefeDeObra() {
		java.util.List list = super.list();
		return (JefeDeObra[]) list.toArray(new JefeDeObra[list.size()]);
	}
}

