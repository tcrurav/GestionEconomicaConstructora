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

public class ObraDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ObraDetachedCriteria() {
		super(Obra.class, ObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		presupuestoTotalEjecucion = new FloatExpression("presupuestoTotalEjecucion", this.getDetachedCriteria());
		estimacionCosteMateriales = new FloatExpression("estimacionCosteMateriales", this.getDetachedCriteria());
		estimacionCosteManoDeObra = new FloatExpression("estimacionCosteManoDeObra", this.getDetachedCriteria());
		estimacionGastosGenerales = new FloatExpression("estimacionGastosGenerales", this.getDetachedCriteria());
		estimacionBeneficioIndustrial = new FloatExpression("estimacionBeneficioIndustrial", this.getDetachedCriteria());
		porcentajeDeObraEjecutado = new FloatExpression("porcentajeDeObraEjecutado", this.getDetachedCriteria());
		cantidadCobrada = new FloatExpression("cantidadCobrada", this.getDetachedCriteria());
		cantidadFacturada = new FloatExpression("cantidadFacturada", this.getDetachedCriteria());
		periodoJefeObraEnObras = new CollectionExpression("ORM_PeriodoJefeObraEnObras", this.getDetachedCriteria());
		periodoEmpleadoEnObras = new CollectionExpression("ORM_PeriodoEmpleadoEnObras", this.getDetachedCriteria());
		materialParaObras = new CollectionExpression("ORM_MaterialParaObras", this.getDetachedCriteria());
		periodoMaquinariaEnObras = new CollectionExpression("ORM_PeriodoMaquinariaEnObras", this.getDetachedCriteria());
	}
	
	public ObraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		presupuestoTotalEjecucion = new FloatExpression("presupuestoTotalEjecucion", this.getDetachedCriteria());
		estimacionCosteMateriales = new FloatExpression("estimacionCosteMateriales", this.getDetachedCriteria());
		estimacionCosteManoDeObra = new FloatExpression("estimacionCosteManoDeObra", this.getDetachedCriteria());
		estimacionGastosGenerales = new FloatExpression("estimacionGastosGenerales", this.getDetachedCriteria());
		estimacionBeneficioIndustrial = new FloatExpression("estimacionBeneficioIndustrial", this.getDetachedCriteria());
		porcentajeDeObraEjecutado = new FloatExpression("porcentajeDeObraEjecutado", this.getDetachedCriteria());
		cantidadCobrada = new FloatExpression("cantidadCobrada", this.getDetachedCriteria());
		cantidadFacturada = new FloatExpression("cantidadFacturada", this.getDetachedCriteria());
		periodoJefeObraEnObras = new CollectionExpression("ORM_PeriodoJefeObraEnObras", this.getDetachedCriteria());
		periodoEmpleadoEnObras = new CollectionExpression("ORM_PeriodoEmpleadoEnObras", this.getDetachedCriteria());
		materialParaObras = new CollectionExpression("ORM_MaterialParaObras", this.getDetachedCriteria());
		periodoMaquinariaEnObras = new CollectionExpression("ORM_PeriodoMaquinariaEnObras", this.getDetachedCriteria());
	}
	
	public PeriodoJefeObraEnObraDetachedCriteria createPeriodoJefeObraEnObrasCriteria() {
		return new PeriodoJefeObraEnObraDetachedCriteria(createCriteria("ORM_PeriodoJefeObraEnObras"));
	}
	
	public PeriodoEmpleadoEnObraDetachedCriteria createPeriodoEmpleadoEnObrasCriteria() {
		return new PeriodoEmpleadoEnObraDetachedCriteria(createCriteria("ORM_PeriodoEmpleadoEnObras"));
	}
	
	public MaterialParaObraDetachedCriteria createMaterialParaObrasCriteria() {
		return new MaterialParaObraDetachedCriteria(createCriteria("ORM_MaterialParaObras"));
	}
	
	public PeriodoMaquinariaEnObraDetachedCriteria createPeriodoMaquinariaEnObrasCriteria() {
		return new PeriodoMaquinariaEnObraDetachedCriteria(createCriteria("ORM_PeriodoMaquinariaEnObras"));
	}
	
	public Obra uniqueObra(PersistentSession session) {
		return (Obra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Obra[] listObra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Obra[]) list.toArray(new Obra[list.size()]);
	}
}

