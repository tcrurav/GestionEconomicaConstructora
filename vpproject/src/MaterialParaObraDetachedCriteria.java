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

public class MaterialParaObraDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public MaterialParaObraDetachedCriteria() {
		super(MaterialParaObra.class, MaterialParaObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("jefeDeObra", this.getDetachedCriteria());
		administrativoObraId = new IntegerExpression("administrativoObra.ID", this.getDetachedCriteria());
		administrativoObra = new AssociationExpression("administrativoObra", this.getDetachedCriteria());
		CantidadMaterial = new FloatExpression("CantidadMaterial", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		fechaSolicitud = new DateExpression("fechaSolicitud", this.getDetachedCriteria());
		fechaRecepcion = new DateExpression("fechaRecepcion", this.getDetachedCriteria());
		materialId = new IntegerExpression("ORM_Material.null", this.getDetachedCriteria());
		material = new AssociationExpression("ORM_Material", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
	}
	
	public MaterialParaObraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MaterialParaObraCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		jefeDeObraId = new IntegerExpression("jefeDeObra.ID", this.getDetachedCriteria());
		jefeDeObra = new AssociationExpression("jefeDeObra", this.getDetachedCriteria());
		administrativoObraId = new IntegerExpression("administrativoObra.ID", this.getDetachedCriteria());
		administrativoObra = new AssociationExpression("administrativoObra", this.getDetachedCriteria());
		CantidadMaterial = new FloatExpression("CantidadMaterial", this.getDetachedCriteria());
		coste = new FloatExpression("coste", this.getDetachedCriteria());
		fechaSolicitud = new DateExpression("fechaSolicitud", this.getDetachedCriteria());
		fechaRecepcion = new DateExpression("fechaRecepcion", this.getDetachedCriteria());
		materialId = new IntegerExpression("ORM_Material.null", this.getDetachedCriteria());
		material = new AssociationExpression("ORM_Material", this.getDetachedCriteria());
		obraId = new IntegerExpression("ORM_Obra.null", this.getDetachedCriteria());
		obra = new AssociationExpression("ORM_Obra", this.getDetachedCriteria());
	}
	
	public JefeDeObraDetachedCriteria createJefeDeObraCriteria() {
		return new JefeDeObraDetachedCriteria(createCriteria("jefeDeObra"));
	}
	
	public AdministrativoObraDetachedCriteria createAdministrativoObraCriteria() {
		return new AdministrativoObraDetachedCriteria(createCriteria("administrativoObra"));
	}
	
	public MaterialDetachedCriteria createMaterialCriteria() {
		return new MaterialDetachedCriteria(createCriteria("ORM_Material"));
	}
	
	public ObraDetachedCriteria createObraCriteria() {
		return new ObraDetachedCriteria(createCriteria("ORM_Obra"));
	}
	
	public MaterialParaObra uniqueMaterialParaObra(PersistentSession session) {
		return (MaterialParaObra) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MaterialParaObra[] listMaterialParaObra(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MaterialParaObra[]) list.toArray(new MaterialParaObra[list.size()]);
	}
}

