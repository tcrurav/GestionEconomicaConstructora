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

public class LineaAlbaranCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression cantidad;
	public final IntegerExpression albaranId;
	public final AssociationExpression albaran;
	public final IntegerExpression materialId;
	public final AssociationExpression material;
	
	public LineaAlbaranCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		cantidad = new IntegerExpression("cantidad", this);
		albaranId = new IntegerExpression("ORM_Albaran.null", this);
		albaran = new AssociationExpression("ORM_Albaran", this);
		materialId = new IntegerExpression("ORM_Material.null", this);
		material = new AssociationExpression("ORM_Material", this);
	}
	
	public LineaAlbaranCriteria(PersistentSession session) {
		this(session.createCriteria(LineaAlbaran.class));
	}
	
	public LineaAlbaranCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public AlbaranCriteria createAlbaranCriteria() {
		return new AlbaranCriteria(createCriteria("ORM_Albaran"));
	}
	
	public MaterialCriteria createMaterialCriteria() {
		return new MaterialCriteria(createCriteria("ORM_Material"));
	}
	
	public LineaAlbaran uniqueLineaAlbaran() {
		return (LineaAlbaran) super.uniqueResult();
	}
	
	public LineaAlbaran[] listLineaAlbaran() {
		java.util.List list = super.list();
		return (LineaAlbaran[]) list.toArray(new LineaAlbaran[list.size()]);
	}
}

