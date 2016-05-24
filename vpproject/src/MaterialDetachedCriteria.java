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

public class MaterialDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression codigo;
	public final StringExpression descripcion;
	public final IntegerExpression stockMedio;
	public final IntegerExpression stockMinimo;
	public final FloatExpression precio;
	public final IntegerExpression stock;
	public final CollectionExpression lineaAlbarans;
	public final CollectionExpression materialParaObras;
	
	public MaterialDetachedCriteria() {
		super(Material.class, MaterialCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		codigo = new StringExpression("codigo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		stockMedio = new IntegerExpression("stockMedio", this.getDetachedCriteria());
		stockMinimo = new IntegerExpression("stockMinimo", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		stock = new IntegerExpression("stock", this.getDetachedCriteria());
		lineaAlbarans = new CollectionExpression("ORM_LineaAlbarans", this.getDetachedCriteria());
		materialParaObras = new CollectionExpression("ORM_MaterialParaObras", this.getDetachedCriteria());
	}
	
	public MaterialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MaterialCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		codigo = new StringExpression("codigo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		stockMedio = new IntegerExpression("stockMedio", this.getDetachedCriteria());
		stockMinimo = new IntegerExpression("stockMinimo", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		stock = new IntegerExpression("stock", this.getDetachedCriteria());
		lineaAlbarans = new CollectionExpression("ORM_LineaAlbarans", this.getDetachedCriteria());
		materialParaObras = new CollectionExpression("ORM_MaterialParaObras", this.getDetachedCriteria());
	}
	
	public LineaAlbaranDetachedCriteria createLineaAlbaransCriteria() {
		return new LineaAlbaranDetachedCriteria(createCriteria("ORM_LineaAlbarans"));
	}
	
	public MaterialParaObraDetachedCriteria createMaterialParaObrasCriteria() {
		return new MaterialParaObraDetachedCriteria(createCriteria("ORM_MaterialParaObras"));
	}
	
	public Material uniqueMaterial(PersistentSession session) {
		return (Material) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Material[] listMaterial(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Material[]) list.toArray(new Material[list.size()]);
	}
}

