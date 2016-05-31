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

public class ObraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final StringExpression direccion;
	public final FloatExpression presupuestoTotalEjecucion;
	public final FloatExpression estimacionCosteMateriales;
	public final FloatExpression estimacionCosteManoDeObra;
	public final FloatExpression estimacionGastosGenerales;
	public final FloatExpression estimacionBeneficioIndustrial;
	public final FloatExpression porcentajeDeObraEjecutado;
	public final FloatExpression cantidadCobrada;
	public final FloatExpression cantidadFacturada;
	public final CollectionExpression periodoJefeObraEnObras;
	public final CollectionExpression periodoEmpleadoEnObras;
	public final CollectionExpression materialParaObras;
	public final CollectionExpression periodoMaquinariaEnObras;
	
	public ObraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		fechaInicio = new DateExpression("fechaInicio", this);
		fechaFin = new DateExpression("fechaFin", this);
		direccion = new StringExpression("direccion", this);
		presupuestoTotalEjecucion = new FloatExpression("presupuestoTotalEjecucion", this);
		estimacionCosteMateriales = new FloatExpression("estimacionCosteMateriales", this);
		estimacionCosteManoDeObra = new FloatExpression("estimacionCosteManoDeObra", this);
		estimacionGastosGenerales = new FloatExpression("estimacionGastosGenerales", this);
		estimacionBeneficioIndustrial = new FloatExpression("estimacionBeneficioIndustrial", this);
		porcentajeDeObraEjecutado = new FloatExpression("porcentajeDeObraEjecutado", this);
		cantidadCobrada = new FloatExpression("cantidadCobrada", this);
		cantidadFacturada = new FloatExpression("cantidadFacturada", this);
		periodoJefeObraEnObras = new CollectionExpression("ORM_PeriodoJefeObraEnObras", this);
		periodoEmpleadoEnObras = new CollectionExpression("ORM_PeriodoEmpleadoEnObras", this);
		materialParaObras = new CollectionExpression("ORM_MaterialParaObras", this);
		periodoMaquinariaEnObras = new CollectionExpression("ORM_PeriodoMaquinariaEnObras", this);
	}
	
	public ObraCriteria(PersistentSession session) {
		this(session.createCriteria(Obra.class));
	}
	
	public ObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public PeriodoJefeObraEnObraCriteria createPeriodoJefeObraEnObrasCriteria() {
		return new PeriodoJefeObraEnObraCriteria(createCriteria("ORM_PeriodoJefeObraEnObras"));
	}
	
	public PeriodoEmpleadoEnObraCriteria createPeriodoEmpleadoEnObrasCriteria() {
		return new PeriodoEmpleadoEnObraCriteria(createCriteria("ORM_PeriodoEmpleadoEnObras"));
	}
	
	public MaterialParaObraCriteria createMaterialParaObrasCriteria() {
		return new MaterialParaObraCriteria(createCriteria("ORM_MaterialParaObras"));
	}
	
	public PeriodoMaquinariaEnObraCriteria createPeriodoMaquinariaEnObrasCriteria() {
		return new PeriodoMaquinariaEnObraCriteria(createCriteria("ORM_PeriodoMaquinariaEnObras"));
	}
	
	public Obra uniqueObra() {
		return (Obra) super.uniqueResult();
	}
	
	public Obra[] listObra() {
		java.util.List list = super.list();
		return (Obra[]) list.toArray(new Obra[list.size()]);
	}
}

