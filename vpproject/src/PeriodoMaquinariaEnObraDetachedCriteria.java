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

public class PeriodoMaquinariaEnObraDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public PeriodoMaquinariaEnObraDetachedCriteria() {
		super(PeriodoMaquinariaEnObra.class, PeriodoMaquinariaEnObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		empleadoAlmacenId = new IntegerExpression("empleadoAlmacen.ID", this.getDetachedCriteria());
		empleadoAlmacen = new AssociationExpression("empleadoAlmacen", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("jefeDeObra", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		fechaSolicitud = new DateExpression("fechaSolicitud", this.getDetachedCriteria());
		fechaRecepcion = new DateExpression("fechaRecepcion", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
		maquinariaId = new IntegerExpression("ORM_Maquinaria.null", this.getDetachedCriteria());
		maquinaria = new AssociationExpression("ORM_Maquinaria", this.getDetachedCriteria());
	}
	
	public PeriodoMaquinariaEnObraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PeriodoMaquinariaEnObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		empleadoAlmacenId = new IntegerExpression("empleadoAlmacen.ID", this.getDetachedCriteria());
		empleadoAlmacen = new AssociationExpression("empleadoAlmacen", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("jefeDeObra", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		fechaSolicitud = new DateExpression("fechaSolicitud", this.getDetachedCriteria());
		fechaRecepcion = new DateExpression("fechaRecepcion", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
		maquinariaId = new IntegerExpression("ORM_Maquinaria.null", this.getDetachedCriteria());
		maquinaria = new AssociationExpression("ORM_Maquinaria", this.getDetachedCriteria());
	}
	
	public EmpleadoAlmacenDetachedCriteria createEmpleadoAlmacenCriteria() {
		return new EmpleadoAlmacenDetachedCriteria(createCriteria("empleadoAlmacen"));
	}
	
	public JefeDeObraDetachedCriteria createJefeDeObraCriteria() {
		return new JefeDeObraDetachedCriteria(createCriteria("jefeDeObra"));
	}
	
	public ObraDetachedCriteria createObraCriteria() {
		return new ObraDetachedCriteria(createCriteria("ORM_Obra"));
	}
	
	public MaquinariaDetachedCriteria createMaquinariaCriteria() {
		return new MaquinariaDetachedCriteria(createCriteria("ORM_Maquinaria"));
	}
	
	public PeriodoMaquinariaEnObra uniquePeriodoMaquinariaEnObra(PersistentSession session) {
		return (PeriodoMaquinariaEnObra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PeriodoMaquinariaEnObra[]) list.toArray(new PeriodoMaquinariaEnObra[list.size()]);
	}
}

