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
public class LineaAlbaran implements Serializable {
	public LineaAlbaran() {
	}
	
	public static LineaAlbaran loadLineaAlbaranByORMID(int ID, Albaran albaran, Material material) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadLineaAlbaranByORMID(session, ID, albaran, material);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran getLineaAlbaranByORMID(int ID, Albaran albaran, Material material) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getLineaAlbaranByORMID(session, ID, albaran, material);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByORMID(int ID, Albaran albaran, Material material, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadLineaAlbaranByORMID(session, ID, albaran, material, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran getLineaAlbaranByORMID(int ID, Albaran albaran, Material material, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getLineaAlbaranByORMID(session, ID, albaran, material, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByORMID(PersistentSession session, int ID, Albaran albaran, Material material) throws PersistentException {
		try {
			LineaAlbaran lineaalbaran = new LineaAlbaran();
			lineaalbaran.setID(ID);
			lineaalbaran.setORM_Albaran(albaran);
			lineaalbaran.setORM_Material(material);
			
			return (LineaAlbaran) session.load(LineaAlbaran.class, lineaalbaran);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran getLineaAlbaranByORMID(PersistentSession session, int ID, Albaran albaran, Material material) throws PersistentException {
		try {
			LineaAlbaran lineaalbaran = new LineaAlbaran();
			lineaalbaran.setID(ID);
			lineaalbaran.setORM_Albaran(albaran);
			lineaalbaran.setORM_Material(material);
			
			return (LineaAlbaran) session.get(LineaAlbaran.class, lineaalbaran);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByORMID(PersistentSession session, int ID, Albaran albaran, Material material, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			LineaAlbaran lineaalbaran = new LineaAlbaran();
			lineaalbaran.setID(ID);
			lineaalbaran.setORM_Albaran(albaran);
			lineaalbaran.setORM_Material(material);
			
			return (LineaAlbaran) session.load(LineaAlbaran.class, lineaalbaran, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran getLineaAlbaranByORMID(PersistentSession session, int ID, Albaran albaran, Material material, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			LineaAlbaran lineaalbaran = new LineaAlbaran();
			lineaalbaran.setID(ID);
			lineaalbaran.setORM_Albaran(albaran);
			lineaalbaran.setORM_Material(material);
			
			return (LineaAlbaran) session.get(LineaAlbaran.class, lineaalbaran, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLineaAlbaran(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryLineaAlbaran(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLineaAlbaran(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryLineaAlbaran(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran[] listLineaAlbaranByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listLineaAlbaranByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran[] listLineaAlbaranByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listLineaAlbaranByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLineaAlbaran(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From LineaAlbaran as LineaAlbaran");
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
	
	public static List queryLineaAlbaran(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From LineaAlbaran as LineaAlbaran");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("LineaAlbaran", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran[] listLineaAlbaranByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLineaAlbaran(session, condition, orderBy);
			return (LineaAlbaran[]) list.toArray(new LineaAlbaran[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran[] listLineaAlbaranByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLineaAlbaran(session, condition, orderBy, lockMode);
			return (LineaAlbaran[]) list.toArray(new LineaAlbaran[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadLineaAlbaranByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadLineaAlbaranByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		LineaAlbaran[] lineaAlbarans = listLineaAlbaranByQuery(session, condition, orderBy);
		if (lineaAlbarans != null && lineaAlbarans.length > 0)
			return lineaAlbarans[0];
		else
			return null;
	}
	
	public static LineaAlbaran loadLineaAlbaranByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		LineaAlbaran[] lineaAlbarans = listLineaAlbaranByQuery(session, condition, orderBy, lockMode);
		if (lineaAlbarans != null && lineaAlbarans.length > 0)
			return lineaAlbarans[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLineaAlbaranByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateLineaAlbaranByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineaAlbaranByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateLineaAlbaranByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineaAlbaranByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From LineaAlbaran as LineaAlbaran");
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
	
	public static java.util.Iterator iterateLineaAlbaranByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From LineaAlbaran as LineaAlbaran");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("LineaAlbaran", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static LineaAlbaran loadLineaAlbaranByCriteria(LineaAlbaranCriteria lineaAlbaranCriteria) {
		LineaAlbaran[] lineaAlbarans = listLineaAlbaranByCriteria(lineaAlbaranCriteria);
		if(lineaAlbarans == null || lineaAlbarans.length == 0) {
			return null;
		}
		return lineaAlbarans[0];
	}
	
	public static LineaAlbaran[] listLineaAlbaranByCriteria(LineaAlbaranCriteria lineaAlbaranCriteria) {
		return lineaAlbaranCriteria.listLineaAlbaran();
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof LineaAlbaran))
			return false;
		LineaAlbaran lineaalbaran = (LineaAlbaran)aObj;
		if (getID() != lineaalbaran.getID())
			return false;
		if (getAlbaran() == null) {
			if (lineaalbaran.getAlbaran() != null)
				return false;
		}
		else if (!getAlbaran().equals(lineaalbaran.getAlbaran()))
			return false;
		if (getMaterial() == null) {
			if (lineaalbaran.getMaterial() != null)
				return false;
		}
		else if (!getMaterial().equals(lineaalbaran.getMaterial()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getAlbaran() != null) {
			hashcode = hashcode + (int) getAlbaran().getORMID();
		}
		if (getMaterial() != null) {
			hashcode = hashcode + (int) getMaterial().getORMID();
		}
		return hashcode;
	}
	
	public static LineaAlbaran createLineaAlbaran() {
		return new LineaAlbaran();
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
			Albaran albaran = getAlbaran();
			if(getAlbaran() != null) {
				getAlbaran().lineaAlbarans.remove(this);
			}
			setORM_Albaran(albaran);
			
			Material material = getMaterial();
			if(getMaterial() != null) {
				getMaterial().lineaAlbarans.remove(this);
			}
			setORM_Material(material);
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			Albaran albaran = getAlbaran();
			if(getAlbaran() != null) {
				getAlbaran().lineaAlbarans.remove(this);
			}
			setORM_Albaran(albaran);
			
			Material material = getMaterial();
			if(getMaterial() != null) {
				getMaterial().lineaAlbarans.remove(this);
			}
			setORM_Material(material);
			
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
		if (key == ORMConstants.KEY_LINEAALBARAN_ALBARAN) {
			this.albaran = (Albaran) owner;
		}
		
		else if (key == ORMConstants.KEY_LINEAALBARAN_MATERIAL) {
			this.material = (Material) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private int cantidad;
	
	private Albaran albaran;
	
	private int albaranId;
	
	private void setAlbaranId(int value) {
		this.albaranId = value;
	}
	
	public int getAlbaranId() {
		return albaranId;
	}
	
	private Material material;
	
	private int materialId;
	
	private void setMaterialId(int value) {
		this.materialId = value;
	}
	
	public int getMaterialId() {
		return materialId;
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setCantidad(int value) {
		this.cantidad = value;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setAlbaran(Albaran value) {
		if (albaran != null) {
			albaran.lineaAlbarans.remove(this);
		}
		if (value != null) {
			value.lineaAlbarans.add(this);
		}
	}
	
	public Albaran getAlbaran() {
		return albaran;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Albaran(Albaran value) {
		this.albaran = value;
	}
	
	private Albaran getORM_Albaran() {
		return albaran;
	}
	
	public void setMaterial(Material value) {
		if (material != null) {
			material.lineaAlbarans.remove(this);
		}
		if (value != null) {
			value.lineaAlbarans.add(this);
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
	
	public String toString() {
		return String.valueOf(getID() + " " + ((getAlbaran() == null) ? "" : String.valueOf(getAlbaran().getORMID())) + " " + ((getMaterial() == null) ? "" : String.valueOf(getMaterial().getORMID())));
	}
	
}
