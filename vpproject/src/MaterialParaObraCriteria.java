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

public class MaterialParaObraCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression jefeDeObraId;
	public final AssociationExpression jefeDeObra;
	public final IntegerExpression administrativoObraId;
	public final AssociationExpression administrativoObra;
	public final FloatExpression CantidadMaterial;
	public final FloatExpression coste;
	public final DateExpression fechaSolicitud;
	public final DateExpression fechaRecepcion;
	public final IntegerExpression materialId;
	public final AssociationExpression material;
	public final IntegerExpression obraId;
	public final AssociationExpression obra;
	
	public MaterialParaObraCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this);
		jefeDeObra = new AssociationExpression("jefeDeObra", this);
		administrativoObraId = new IntegerExpression("administrativoObra.ID", this);
		administrativoObra = new AssociationExpression("administrativoObra", this);
		CantidadMaterial = new FloatExpression("CantidadMaterial", this);
		coste = new FloatExpression("coste", this);
		fechaSolicitud = new DateExpression("fechaSolicitud", this);
		fechaRecepcion = new DateExpression("fechaRecepcion", this);
		materialId = new IntegerExpression("ORM_Material.null", this);
		material = new AssociationExpression("ORM_Material", this);
		obraId = new IntegerExpression("ORM_Obra.null", this);
		obra = new AssociationExpression("ORM_Obra", this);
	}
	
	public MaterialParaObraCriteria(PersistentSession session) {
		this(session.createCriteria(MaterialParaObra.class));
	}
	
	public MaterialParaObraCriteria() throws PersistentException {
		this(GestiónEconómicaConstructoraPersistentManager.instance().getSession());
	}
	
	public JefeDeObraCriteria createJefeDeObraCriteria() {
		return new JefeDeObraCriteria(createCriteria("jefeDeObra"));
	}
	
	public AdministrativoObraCriteria createAdministrativoObraCriteria() {
		return new AdministrativoObraCriteria(createCriteria("administrativoObra"));
	}
	
	public MaterialCriteria createMaterialCriteria() {
		return new MaterialCriteria(createCriteria("ORM_Material"));
	}
	
	public ObraCriteria createObraCriteria() {
		return new ObraCriteria(createCriteria("ORM_Obra"));
	}
	
	public MaterialParaObra uniqueMaterialParaObra() {
		return (MaterialParaObra) super.uniqueResult();
	}
	
	public MaterialParaObra[] listMaterialParaObra() {
		java.util.List list = super.list();
		return (MaterialParaObra[]) list.toArray(new MaterialParaObra[list.size()]);
	}
}

