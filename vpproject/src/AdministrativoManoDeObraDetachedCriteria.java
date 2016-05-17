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

public class AdministrativoManoDeObraDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression periodoEmpleadoEnObra;
	
	public AdministrativoManoDeObraDetachedCriteria() {
		super(AdministrativoManoDeObra.class, AdministrativoManoDeObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		dni = new StringExpression("dni", this.getDetachedCriteria());
		proveedor = new CollectionExpression("ORM_Proveedor", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.ID", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contra = new StringExpression("contra", this.getDetachedCriteria());
		periodoEmpleadoEnObra = new CollectionExpression("ORM_PeriodoEmpleadoEnObra", this.getDetachedCriteria());
	}
	
	public AdministrativoManoDeObraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AdministrativoManoDeObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		dni = new StringExpression("dni", this.getDetachedCriteria());
		proveedor = new CollectionExpression("ORM_Proveedor", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.ID", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		contra = new StringExpression("contra", this.getDetachedCriteria());
		periodoEmpleadoEnObra = new CollectionExpression("ORM_PeriodoEmpleadoEnObra", this.getDetachedCriteria());
	}
	
	public PeriodoEmpleadoEnObraDetachedCriteria createPeriodoEmpleadoEnObraCriteria() {
		return new PeriodoEmpleadoEnObraDetachedCriteria(createCriteria("ORM_PeriodoEmpleadoEnObra"));
	}
	
	public CategoriaDetachedCriteria createCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("categoria"));
	}
	
	public ProveedorDetachedCriteria createProveedorCriteria() {
		return new ProveedorDetachedCriteria(createCriteria("ORM_Proveedor"));
	}
	
	public AdministrativoManoDeObra uniqueAdministrativoManoDeObra(PersistentSession session) {
		return (AdministrativoManoDeObra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AdministrativoManoDeObra[] listAdministrativoManoDeObra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AdministrativoManoDeObra[]) list.toArray(new AdministrativoManoDeObra[list.size()]);
	}
}

