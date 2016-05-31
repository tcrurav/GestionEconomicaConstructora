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

public class MaterialCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression codigo;
	public final StringExpression descripcion;
	public final IntegerExpression stockMedio;
	public final IntegerExpression stockMinimo;
	public final FloatExpression precio;
	public final IntegerExpression stock;
	public final CollectionExpression lineaAlbarans;
	public final CollectionExpression materialParaObras;
	
	public MaterialCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		codigo = new StringExpression("codigo", this);
		descripcion = new StringExpression("descripcion", this);
		stockMedio = new IntegerExpression("stockMedio", this);
		stockMinimo = new IntegerExpression("stockMinimo", this);
		precio = new FloatExpression("precio", this);
		stock = new IntegerExpression("stock", this);
		lineaAlbarans = new CollectionExpression("ORM_LineaAlbarans", this);
		materialParaObras = new CollectionExpression("ORM_MaterialParaObras", this);
	}
	
	public MaterialCriteria(PersistentSession session) {
		this(session.createCriteria(Material.class));
	}
	
	public MaterialCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public LineaAlbaranCriteria createLineaAlbaransCriteria() {
		return new LineaAlbaranCriteria(createCriteria("ORM_LineaAlbarans"));
	}
	
	public MaterialParaObraCriteria createMaterialParaObrasCriteria() {
		return new MaterialParaObraCriteria(createCriteria("ORM_MaterialParaObras"));
	}
	
	public Material uniqueMaterial() {
		return (Material) super.uniqueResult();
	}
	
	public Material[] listMaterial() {
		java.util.List list = super.list();
		return (Material[]) list.toArray(new Material[list.size()]);
	}
}

