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

public class PeriodoEmpleadoEnObraCriteria extends AbstractORMCriteria {
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
	
	public PeriodoEmpleadoEnObraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		administrativoManoObraId = new IntegerExpression("administrativoManoObra.ID", this);
		administrativoManoObra = new AssociationExpression("administrativoManoObra", this);
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this);
		jefeDeObra = new AssociationExpression("jefeDeObra", this);
		fechaInicio = new DateExpression("fechaInicio", this);
		fechaFin = new DateExpression("fechaFin", this);
		coste = new FloatExpression("coste", this);
		fechaSolicitud = new DateExpression("fechaSolicitud", this);
		fechaRecepcion = new DateExpression("fechaRecepcion", this);
		empleadoObraId = new IntegerExpression("ORM_EmpleadoObra.null", this);
		empleadoObra = new AssociationExpression("ORM_EmpleadoObra", this);
		obraId = new IntegerExpression("ORM_Obra.null", this);
		obra = new AssociationExpression("ORM_Obra", this);
	}
	
	public PeriodoEmpleadoEnObraCriteria(PersistentSession session) {
		this(session.createCriteria(PeriodoEmpleadoEnObra.class));
	}
	
	public PeriodoEmpleadoEnObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public AdministrativoManoDeObraCriteria createAdministrativoManoObraCriteria() {
		return new AdministrativoManoDeObraCriteria(createCriteria("administrativoManoObra"));
	}
	
	public JefeDeObraCriteria createJefeDeObraCriteria() {
		return new JefeDeObraCriteria(createCriteria("jefeDeObra"));
	}
	
	public EmpleadoObraCriteria createEmpleadoObraCriteria() {
		return new EmpleadoObraCriteria(createCriteria("ORM_EmpleadoObra"));
	}
	
	public ObraCriteria createObraCriteria() {
		return new ObraCriteria(createCriteria("ORM_Obra"));
	}
	
	public PeriodoEmpleadoEnObra uniquePeriodoEmpleadoEnObra() {
		return (PeriodoEmpleadoEnObra) super.uniqueResult();
	}
	
	public PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObra() {
		java.util.List list = super.list();
		return (PeriodoEmpleadoEnObra[]) list.toArray(new PeriodoEmpleadoEnObra[list.size()]);
	}
}

