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

public class MaquinariaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final FloatExpression precioDeCompra;
	public final DateExpression fechaFinVidaUtil;
	public final DateExpression fechaCompra;
	public final StringExpression codInventario;
	public final CollectionExpression periodoMaquinariaEnObras;
	
	public MaquinariaDetachedCriteria() {
		super(Maquinaria.class, MaquinariaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precioDeCompra = new FloatExpression("precioDeCompra", this.getDetachedCriteria());
		fechaFinVidaUtil = new DateExpression("fechaFinVidaUtil", this.getDetachedCriteria());
		fechaCompra = new DateExpression("fechaCompra", this.getDetachedCriteria());
		codInventario = new StringExpression("codInventario", this.getDetachedCriteria());
		periodoMaquinariaEnObras = new CollectionExpression("ORM_PeriodoMaquinariaEnObras", this.getDetachedCriteria());
	}
	
	public MaquinariaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MaquinariaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precioDeCompra = new FloatExpression("precioDeCompra", this.getDetachedCriteria());
		fechaFinVidaUtil = new DateExpression("fechaFinVidaUtil", this.getDetachedCriteria());
		fechaCompra = new DateExpression("fechaCompra", this.getDetachedCriteria());
		codInventario = new StringExpression("codInventario", this.getDetachedCriteria());
		periodoMaquinariaEnObras = new CollectionExpression("ORM_PeriodoMaquinariaEnObras", this.getDetachedCriteria());
	}
	
	public PeriodoMaquinariaEnObraDetachedCriteria createPeriodoMaquinariaEnObrasCriteria() {
		return new PeriodoMaquinariaEnObraDetachedCriteria(createCriteria("ORM_PeriodoMaquinariaEnObras"));
	}
	
	public Maquinaria uniqueMaquinaria(PersistentSession session) {
		return (Maquinaria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Maquinaria[] listMaquinaria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Maquinaria[]) list.toArray(new Maquinaria[list.size()]);
	}
}

