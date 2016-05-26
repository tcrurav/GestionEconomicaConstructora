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

public class MaquinariaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final FloatExpression precioDeCompra;
	public final DateExpression fechaFinVidaUtil;
	public final DateExpression fechaCompra;
	public final StringExpression codInventario;
	public final CollectionExpression periodoMaquinariaEnObras;
	
	public MaquinariaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		precioDeCompra = new FloatExpression("precioDeCompra", this);
		fechaFinVidaUtil = new DateExpression("fechaFinVidaUtil", this);
		fechaCompra = new DateExpression("fechaCompra", this);
		codInventario = new StringExpression("codInventario", this);
		periodoMaquinariaEnObras = new CollectionExpression("ORM_PeriodoMaquinariaEnObras", this);
	}
	
	public MaquinariaCriteria(PersistentSession session) {
		this(session.createCriteria(Maquinaria.class));
	}
	
	public MaquinariaCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public PeriodoMaquinariaEnObraCriteria createPeriodoMaquinariaEnObrasCriteria() {
		return new PeriodoMaquinariaEnObraCriteria(createCriteria("ORM_PeriodoMaquinariaEnObras"));
	}
	
	public Maquinaria uniqueMaquinaria() {
		return (Maquinaria) super.uniqueResult();
	}
	
	public Maquinaria[] listMaquinaria() {
		java.util.List list = super.list();
		return (Maquinaria[]) list.toArray(new Maquinaria[list.size()]);
	}
}

