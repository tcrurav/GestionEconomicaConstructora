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

public class PeriodoJefeObraEnObraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final FloatExpression coste;
	public final IntegerExpression jefeDeObraId;
	public final AssociationExpression jefeDeObra;
	public final IntegerExpression obraId;
	public final AssociationExpression obra;
	
	public PeriodoJefeObraEnObraDetachedCriteria() {
		super(PeriodoJefeObraEnObra.class, PeriodoJefeObraEnObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("ORM_JefeDeObra.null", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("ORM_JefeDeObra", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
	}
	
	public PeriodoJefeObraEnObraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PeriodoJefeObraEnObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("ORM_JefeDeObra.null", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("ORM_JefeDeObra", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
	}
	
	public JefeDeObraDetachedCriteria createJefeDeObraCriteria() {
		return new JefeDeObraDetachedCriteria(createCriteria("ORM_JefeDeObra"));
	}
	
	public ObraDetachedCriteria createObraCriteria() {
		return new ObraDetachedCriteria(createCriteria("ORM_Obra"));
	}
	
	public PeriodoJefeObraEnObra uniquePeriodoJefeObraEnObra(PersistentSession session) {
		return (PeriodoJefeObraEnObra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PeriodoJefeObraEnObra[]) list.toArray(new PeriodoJefeObraEnObra[list.size()]);
	}
}

