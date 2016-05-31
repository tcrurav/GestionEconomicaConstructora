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

public class PeriodoMaquinariaEnObraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression empleadoAlmacenId;
	public final AssociationExpression empleadoAlmacen;
	public final IntegerExpression jefeDeObraId;
	public final AssociationExpression jefeDeObra;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final DateExpression fechaSolicitud;
	public final DateExpression fechaRecepcion;
	public final IntegerExpression obraId;
	public final AssociationExpression obra;
	public final IntegerExpression maquinariaId;
	public final AssociationExpression maquinaria;
	
	public PeriodoMaquinariaEnObraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		empleadoAlmacenId = new IntegerExpression("empleadoAlmacen.ID", this);
		empleadoAlmacen = new AssociationExpression("empleadoAlmacen", this);
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this);
		jefeDeObra = new AssociationExpression("jefeDeObra", this);
		fechaInicio = new DateExpression("fechaInicio", this);
		fechaFin = new DateExpression("fechaFin", this);
		fechaSolicitud = new DateExpression("fechaSolicitud", this);
		fechaRecepcion = new DateExpression("fechaRecepcion", this);
		obraId = new IntegerExpression("ORM_Obra.null", this);
		obra = new AssociationExpression("ORM_Obra", this);
		maquinariaId = new IntegerExpression("ORM_Maquinaria.null", this);
		maquinaria = new AssociationExpression("ORM_Maquinaria", this);
	}
	
	public PeriodoMaquinariaEnObraCriteria(PersistentSession session) {
		this(session.createCriteria(PeriodoMaquinariaEnObra.class));
	}
	
	public PeriodoMaquinariaEnObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public EmpleadoAlmacenCriteria createEmpleadoAlmacenCriteria() {
		return new EmpleadoAlmacenCriteria(createCriteria("empleadoAlmacen"));
	}
	
	public JefeDeObraCriteria createJefeDeObraCriteria() {
		return new JefeDeObraCriteria(createCriteria("jefeDeObra"));
	}
	
	public ObraCriteria createObraCriteria() {
		return new ObraCriteria(createCriteria("ORM_Obra"));
	}
	
	public MaquinariaCriteria createMaquinariaCriteria() {
		return new MaquinariaCriteria(createCriteria("ORM_Maquinaria"));
	}
	
	public PeriodoMaquinariaEnObra uniquePeriodoMaquinariaEnObra() {
		return (PeriodoMaquinariaEnObra) super.uniqueResult();
	}
	
	public PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObra() {
		java.util.List list = super.list();
		return (PeriodoMaquinariaEnObra[]) list.toArray(new PeriodoMaquinariaEnObra[list.size()]);
	}
}

