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

public class PeriodoJefeObraEnObraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final FloatExpression coste;
	public final IntegerExpression jefeDeObraId;
	public final AssociationExpression jefeDeObra;
	public final IntegerExpression obraId;
	public final AssociationExpression obra;
	
	public PeriodoJefeObraEnObraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		fechaInicio = new DateExpression("fechaInicio", this);
		fechaFin = new DateExpression("fechaFin", this);
		coste = new FloatExpression("coste", this);
		jefeDeObraId = new IntegerExpression("ORM_JefeDeObra.null", this);
		jefeDeObra = new AssociationExpression("ORM_JefeDeObra", this);
		obraId = new IntegerExpression("ORM_Obra.null", this);
		obra = new AssociationExpression("ORM_Obra", this);
	}
	
	public PeriodoJefeObraEnObraCriteria(PersistentSession session) {
		this(session.createCriteria(PeriodoJefeObraEnObra.class));
	}
	
	public PeriodoJefeObraEnObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public JefeDeObraCriteria createJefeDeObraCriteria() {
		return new JefeDeObraCriteria(createCriteria("ORM_JefeDeObra"));
	}
	
	public ObraCriteria createObraCriteria() {
		return new ObraCriteria(createCriteria("ORM_Obra"));
	}
	
	public PeriodoJefeObraEnObra uniquePeriodoJefeObraEnObra() {
		return (PeriodoJefeObraEnObra) super.uniqueResult();
	}
	
	public PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObra() {
		java.util.List list = super.list();
		return (PeriodoJefeObraEnObra[]) list.toArray(new PeriodoJefeObraEnObra[list.size()]);
	}
}

