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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
public class MaterialParaObra implements Serializable {
	public MaterialParaObra() {
	}
	
	public static MaterialParaObra loadMaterialParaObraByORMID(int ID, Material material, Obra obra) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialParaObraByORMID(session, ID, material, obra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra getMaterialParaObraByORMID(int ID, Material material, Obra obra) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getMaterialParaObraByORMID(session, ID, material, obra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByORMID(int ID, Material material, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialParaObraByORMID(session, ID, material, obra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra getMaterialParaObraByORMID(int ID, Material material, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getMaterialParaObraByORMID(session, ID, material, obra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByORMID(PersistentSession session, int ID, Material material, Obra obra) throws PersistentException {
		try {
			MaterialParaObra materialparaobra = new MaterialParaObra();
			materialparaobra.setID(ID);
			materialparaobra.setORM_Material(material);
			materialparaobra.setORM_Obra(obra);
			
			return (MaterialParaObra) session.load(MaterialParaObra.class, materialparaobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra getMaterialParaObraByORMID(PersistentSession session, int ID, Material material, Obra obra) throws PersistentException {
		try {
			MaterialParaObra materialparaobra = new MaterialParaObra();
			materialparaobra.setID(ID);
			materialparaobra.setORM_Material(material);
			materialparaobra.setORM_Obra(obra);
			
			return (MaterialParaObra) session.get(MaterialParaObra.class, materialparaobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByORMID(PersistentSession session, int ID, Material material, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			MaterialParaObra materialparaobra = new MaterialParaObra();
			materialparaobra.setID(ID);
			materialparaobra.setORM_Material(material);
			materialparaobra.setORM_Obra(obra);
			
			return (MaterialParaObra) session.load(MaterialParaObra.class, materialparaobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra getMaterialParaObraByORMID(PersistentSession session, int ID, Material material, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			MaterialParaObra materialparaobra = new MaterialParaObra();
			materialparaobra.setID(ID);
			materialparaobra.setORM_Material(material);
			materialparaobra.setORM_Obra(obra);
			
			return (MaterialParaObra) session.get(MaterialParaObra.class, materialparaobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterialParaObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryMaterialParaObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterialParaObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryMaterialParaObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra[] listMaterialParaObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listMaterialParaObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra[] listMaterialParaObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listMaterialParaObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterialParaObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MaterialParaObra as MaterialParaObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterialParaObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MaterialParaObra as MaterialParaObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MaterialParaObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra[] listMaterialParaObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMaterialParaObra(session, condition, orderBy);
			return (MaterialParaObra[]) list.toArray(new MaterialParaObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra[] listMaterialParaObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMaterialParaObra(session, condition, orderBy, lockMode);
			return (MaterialParaObra[]) list.toArray(new MaterialParaObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialParaObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialParaObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MaterialParaObra[] materialParaObras = listMaterialParaObraByQuery(session, condition, orderBy);
		if (materialParaObras != null && materialParaObras.length > 0)
			return materialParaObras[0];
		else
			return null;
	}
	
	public static MaterialParaObra loadMaterialParaObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MaterialParaObra[] materialParaObras = listMaterialParaObraByQuery(session, condition, orderBy, lockMode);
		if (materialParaObras != null && materialParaObras.length > 0)
			return materialParaObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMaterialParaObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateMaterialParaObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaterialParaObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateMaterialParaObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaterialParaObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MaterialParaObra as MaterialParaObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaterialParaObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MaterialParaObra as MaterialParaObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MaterialParaObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MaterialParaObra loadMaterialParaObraByCriteria(MaterialParaObraCriteria materialParaObraCriteria) {
		MaterialParaObra[] materialParaObras = listMaterialParaObraByCriteria(materialParaObraCriteria);
		if(materialParaObras == null || materialParaObras.length == 0) {
			return null;
		}
		return materialParaObras[0];
	}
	
	public static MaterialParaObra[] listMaterialParaObraByCriteria(MaterialParaObraCriteria materialParaObraCriteria) {
		return materialParaObraCriteria.listMaterialParaObra();
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof MaterialParaObra))
			return false;
		MaterialParaObra materialparaobra = (MaterialParaObra)aObj;
		if (getID() != materialparaobra.getID())
			return false;
		if (getMaterial() == null) {
			if (materialparaobra.getMaterial() != null)
				return false;
		}
		else if (!getMaterial().equals(materialparaobra.getMaterial()))
			return false;
		if (getObra() == null) {
			if (materialparaobra.getObra() != null)
				return false;
		}
		else if (!getObra().equals(materialparaobra.getObra()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getMaterial() != null) {
			hashcode = hashcode + (int) getMaterial().getORMID();
		}
		if (getObra() != null) {
			hashcode = hashcode + (int) getObra().getORMID();
		}
		return hashcode;
	}
	
	public static MaterialParaObra createMaterialParaObra() {
		return new MaterialParaObra();
	}
	
	public boolean save() throws PersistentException {
		try {
			GestiónEconómicaConstructoraPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			GestiónEconómicaConstructoraPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			GestiónEconómicaConstructoraPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			GestiónEconómicaConstructoraPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getJefeDeObra() != null) {
				getJefeDeObra().materialAsignadoAObra.remove(this);
			}
			
			if(getAdministrativoObra() != null) {
				getAdministrativoObra().materialAsignadoAObra.remove(this);
			}
			
			Material material = getMaterial();
			if(getMaterial() != null) {
				getMaterial().materialParaObras.remove(this);
			}
			setORM_Material(material);
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().materialParaObras.remove(this);
			}
			setORM_Obra(obra);
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getJefeDeObra() != null) {
				getJefeDeObra().materialAsignadoAObra.remove(this);
			}
			
			if(getAdministrativoObra() != null) {
				getAdministrativoObra().materialAsignadoAObra.remove(this);
			}
			
			Material material = getMaterial();
			if(getMaterial() != null) {
				getMaterial().materialParaObras.remove(this);
			}
			setORM_Material(material);
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().materialParaObras.remove(this);
			}
			setORM_Obra(obra);
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MATERIALPARAOBRA_ADMINISTRATIVOOBRA) {
			this.administrativoObra = (AdministrativoObra) owner;
		}
		
		else if (key == ORMConstants.KEY_MATERIALPARAOBRA_JEFEDEOBRA) {
			this.jefeDeObra = (JefeDeObra) owner;
		}
		
		else if (key == ORMConstants.KEY_MATERIALPARAOBRA_MATERIAL) {
			this.material = (Material) owner;
		}
		
		else if (key == ORMConstants.KEY_MATERIALPARAOBRA_OBRA) {
			this.obra = (Obra) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private JefeDeObra jefeDeObra;
	
	private AdministrativoObra administrativoObra;
	
	private float CantidadMaterial;
	
	private float coste;
	
	private java.util.Date fechaSolicitud;
	
	private java.util.Date fechaRecepcion;
	
	private Material material;
	
	private int materialId;
	
	private void setMaterialId(int value) {
		this.materialId = value;
	}
	
	public int getMaterialId() {
		return materialId;
	}
	
	private Obra obra;
	
	private int obraId;
	
	private void setObraId(int value) {
		this.obraId = value;
	}
	
	public int getObraId() {
		return obraId;
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setCantidadMaterial(float value) {
		this.CantidadMaterial = value;
	}
	
	public float getCantidadMaterial() {
		return CantidadMaterial;
	}
	
	/**
	 * Este es el coste del material en el momento de la asignación a la obra.
	 */
	public void setCoste(float value) {
		this.coste = value;
	}
	
	/**
	 * Este es el coste del material en el momento de la asignación a la obra.
	 */
	public float getCoste() {
		return coste;
	}
	
	public void setFechaSolicitud(java.util.Date value) {
		this.fechaSolicitud = value;
	}
	
	public java.util.Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	
	public void setFechaRecepcion(java.util.Date value) {
		this.fechaRecepcion = value;
	}
	
	public java.util.Date getFechaRecepcion() {
		return fechaRecepcion;
	}
	
	public void setAdministrativoObra(AdministrativoObra value) {
		if (administrativoObra != null) {
			administrativoObra.materialAsignadoAObra.remove(this);
		}
		if (value != null) {
			value.materialAsignadoAObra.add(this);
		}
	}
	
	public AdministrativoObra getAdministrativoObra() {
		return administrativoObra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_AdministrativoObra(AdministrativoObra value) {
		this.administrativoObra = value;
	}
	
	private AdministrativoObra getORM_AdministrativoObra() {
		return administrativoObra;
	}
	
	public void setJefeDeObra(JefeDeObra value) {
		if (jefeDeObra != null) {
			jefeDeObra.materialAsignadoAObra.remove(this);
		}
		if (value != null) {
			value.materialAsignadoAObra.add(this);
		}
	}
	
	public JefeDeObra getJefeDeObra() {
		return jefeDeObra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_JefeDeObra(JefeDeObra value) {
		this.jefeDeObra = value;
	}
	
	private JefeDeObra getORM_JefeDeObra() {
		return jefeDeObra;
	}
	
	public void setMaterial(Material value) {
		if (material != null) {
			material.materialParaObras.remove(this);
		}
		if (value != null) {
			value.materialParaObras.add(this);
		}
	}
	
	public Material getMaterial() {
		return material;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Material(Material value) {
		this.material = value;
	}
	
	private Material getORM_Material() {
		return material;
	}
	
	public void setObra(Obra value) {
		if (obra != null) {
			obra.materialParaObras.remove(this);
		}
		if (value != null) {
			value.materialParaObras.add(this);
		}
	}
	
	public Obra getObra() {
		return obra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Obra(Obra value) {
		this.obra = value;
	}
	
	private Obra getORM_Obra() {
		return obra;
	}
	
	public void MaterialAsignadoAObra() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID() + " " + ((getMaterial() == null) ? "" : String.valueOf(getMaterial().getORMID())) + " " + ((getObra() == null) ? "" : String.valueOf(getObra().getORMID())));
	}
	
}
