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

public class LineaAlbaranDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression cantidad;
	public final IntegerExpression albaranId;
	public final AssociationExpression albaran;
	public final IntegerExpression materialId;
	public final AssociationExpression material;
	
	public LineaAlbaranDetachedCriteria() {
		super(LineaAlbaran.class, LineaAlbaranCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
		albaranId = new IntegerExpression("ORM_Albaran.null", this.getDetachedCriteria());
		albaran = new AssociationExpression("ORM_Albaran", this.getDetachedCriteria());
		materialId = new IntegerExpression("ORM_Material.null", this.getDetachedCriteria());
		material = new AssociationExpression("ORM_Material", this.getDetachedCriteria());
	}
	
	public LineaAlbaranDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, LineaAlbaranCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
		albaranId = new IntegerExpression("ORM_Albaran.null", this.getDetachedCriteria());
		albaran = new AssociationExpression("ORM_Albaran", this.getDetachedCriteria());
		materialId = new IntegerExpression("ORM_Material.null", this.getDetachedCriteria());
		material = new AssociationExpression("ORM_Material", this.getDetachedCriteria());
	}
	
	public AlbaranDetachedCriteria createAlbaranCriteria() {
		return new AlbaranDetachedCriteria(createCriteria("ORM_Albaran"));
	}
	
	public MaterialDetachedCriteria createMaterialCriteria() {
		return new MaterialDetachedCriteria(createCriteria("ORM_Material"));
	}
	
	public LineaAlbaran uniqueLineaAlbaran(PersistentSession session) {
		return (LineaAlbaran) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LineaAlbaran[] listLineaAlbaran(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LineaAlbaran[]) list.toArray(new LineaAlbaran[list.size()]);
	}
}

