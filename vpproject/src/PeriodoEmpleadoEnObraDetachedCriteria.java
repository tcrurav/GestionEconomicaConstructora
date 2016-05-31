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

public class PeriodoEmpleadoEnObraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression administrativoManoObraId;
	public final AssociationExpression administrativoManoObra;
	public final IntegerExpression jefeDeObraId;
	public final AssociationExpression jefeDeObra;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final FloatExpression coste;
	public final DateExpression fechaSolicitud;
	public final DateExpression fechaRecepcion;
	public final IntegerExpression empleadoObraId;
	public final AssociationExpression empleadoObra;
	public final IntegerExpression obraId;
	public final AssociationExpression obra;
	
	public PeriodoEmpleadoEnObraDetachedCriteria() {
		super(PeriodoEmpleadoEnObra.class, PeriodoEmpleadoEnObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		administrativoManoObraId = new IntegerExpression("administrativoManoObra.ID", this.getDetachedCriteria());
		administrativoManoObra = new AssociationExpression("administrativoManoObra", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("jefeDeObra", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		fechaSolicitud = new DateExpression("fechaSolicitud", this.getDetachedCriteria());
		fechaRecepcion = new DateExpression("fechaRecepcion", this.getDetachedCriteria());
		empleadoObraId = new IntegerExpression("ORM_EmpleadoObra.null", this.getDetachedCriteria());
		empleadoObra = new AssociationExpression("ORM_EmpleadoObra", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
	}
	
	public PeriodoEmpleadoEnObraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PeriodoEmpleadoEnObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		administrativoManoObraId = new IntegerExpression("administrativoManoObra.ID", this.getDetachedCriteria());
		administrativoManoObra = new AssociationExpression("administrativoManoObra", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("jefeDeObra", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		fechaSolicitud = new DateExpression("fechaSolicitud", this.getDetachedCriteria());
		fechaRecepcion = new DateExpression("fechaRecepcion", this.getDetachedCriteria());
		empleadoObraId = new IntegerExpression("ORM_EmpleadoObra.null", this.getDetachedCriteria());
		empleadoObra = new AssociationExpression("ORM_EmpleadoObra", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
	}
	
	public AdministrativoManoDeObraDetachedCriteria createAdministrativoManoObraCriteria() {
		return new AdministrativoManoDeObraDetachedCriteria(createCriteria("administrativoManoObra"));
	}
	
	public JefeDeObraDetachedCriteria createJefeDeObraCriteria() {
		return new JefeDeObraDetachedCriteria(createCriteria("jefeDeObra"));
	}
	
	public EmpleadoObraDetachedCriteria createEmpleadoObraCriteria() {
		return new EmpleadoObraDetachedCriteria(createCriteria("ORM_EmpleadoObra"));
	}
	
	public ObraDetachedCriteria createObraCriteria() {
		return new ObraDetachedCriteria(createCriteria("ORM_Obra"));
	}
	
	public PeriodoEmpleadoEnObra uniquePeriodoEmpleadoEnObra(PersistentSession session) {
		return (PeriodoEmpleadoEnObra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PeriodoEmpleadoEnObra[]) list.toArray(new PeriodoEmpleadoEnObra[list.size()]);
	}
}

