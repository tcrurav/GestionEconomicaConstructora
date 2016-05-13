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

public class Albaran {
	public Albaran() {
	}
	
	public static Albaran loadAlbaranByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAlbaranByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran getAlbaranByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getAlbaranByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAlbaranByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran getAlbaranByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getAlbaranByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Albaran) session.load(Albaran.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran getAlbaranByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Albaran) session.get(Albaran.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Albaran) session.load(Albaran.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran getAlbaranByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Albaran) session.get(Albaran.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlbaran(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryAlbaran(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlbaran(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryAlbaran(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran[] listAlbaranByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listAlbaranByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran[] listAlbaranByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listAlbaranByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAlbaran(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Albaran as Albaran");
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
	
	public static List queryAlbaran(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Albaran as Albaran");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Albaran", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran[] listAlbaranByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAlbaran(session, condition, orderBy);
			return (Albaran[]) list.toArray(new Albaran[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran[] listAlbaranByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAlbaran(session, condition, orderBy, lockMode);
			return (Albaran[]) list.toArray(new Albaran[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAlbaranByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAlbaranByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Albaran[] albarans = listAlbaranByQuery(session, condition, orderBy);
		if (albarans != null && albarans.length > 0)
			return albarans[0];
		else
			return null;
	}
	
	public static Albaran loadAlbaranByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Albaran[] albarans = listAlbaranByQuery(session, condition, orderBy, lockMode);
		if (albarans != null && albarans.length > 0)
			return albarans[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAlbaranByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateAlbaranByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAlbaranByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateAlbaranByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAlbaranByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Albaran as Albaran");
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
	
	public static java.util.Iterator iterateAlbaranByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Albaran as Albaran");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Albaran", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Albaran loadAlbaranByCriteria(AlbaranCriteria albaranCriteria) {
		Albaran[] albarans = listAlbaranByCriteria(albaranCriteria);
		if(albarans == null || albarans.length == 0) {
			return null;
		}
		return albarans[0];
	}
	
	public static Albaran[] listAlbaranByCriteria(AlbaranCriteria albaranCriteria) {
		return albaranCriteria.listAlbaran();
	}
	
	public static Albaran createAlbaran() {
		return new Albaran();
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
			if(getEmpleado() != null) {
				getEmpleado().albaran.remove(this);
			}
			
			if(getProveedor() != null) {
				getProveedor().albaran.remove(this);
			}
			
			LineaAlbaran[] lLineaAlbaranss = lineaAlbarans.toArray();
			for(int i = 0; i < lLineaAlbaranss.length; i++) {
				lLineaAlbaranss[i].setAlbaran(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getEmpleado() != null) {
				getEmpleado().albaran.remove(this);
			}
			
			if(getProveedor() != null) {
				getProveedor().albaran.remove(this);
			}
			
			LineaAlbaran[] lLineaAlbaranss = lineaAlbarans.toArray();
			for(int i = 0; i < lLineaAlbaranss.length; i++) {
				lLineaAlbaranss[i].setAlbaran(null);
			}
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
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ALBARAN_LINEAALBARANS) {
			return ORM_lineaAlbarans;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ALBARAN_PROVEEDOR) {
			this.proveedor = (Proveedor) owner;
		}
		
		else if (key == ORMConstants.KEY_ALBARAN_EMPLEADO) {
			this.empleado = (EmpleadoAlmacen) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private EmpleadoAlmacen empleado;
	
	private Proveedor proveedor;
	
	private java.util.Date fecha;
	
	private String numAlbaran;
	
	private java.util.Set ORM_lineaAlbarans = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setNumAlbaran(String value) {
		this.numAlbaran = value;
	}
	
	public String getNumAlbaran() {
		return numAlbaran;
	}
	
	public void setProveedor(Proveedor value) {
		if (proveedor != null) {
			proveedor.albaran.remove(this);
		}
		if (value != null) {
			value.albaran.add(this);
		}
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Proveedor(Proveedor value) {
		this.proveedor = value;
	}
	
	private Proveedor getORM_Proveedor() {
		return proveedor;
	}
	
	public void setEmpleado(EmpleadoAlmacen value) {
		if (empleado != null) {
			empleado.albaran.remove(this);
		}
		if (value != null) {
			value.albaran.add(this);
		}
	}
	
	public EmpleadoAlmacen getEmpleado() {
		return empleado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Empleado(EmpleadoAlmacen value) {
		this.empleado = value;
	}
	
	private EmpleadoAlmacen getORM_Empleado() {
		return empleado;
	}
	
	public Material[] getMaterials() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = lineaAlbarans.getIterator();lIter.hasNext();) {
			lValues.add(((LineaAlbaran)lIter.next()).getMaterial());
		}
		return (Material[])lValues.toArray(new Material[lValues.size()]);
	}
	
	public void removeMaterial(Material aMaterial) {
		LineaAlbaran[] lLineaAlbarans = lineaAlbarans.toArray();
		for(int i = 0; i < lLineaAlbarans.length; i++) {
			if(lLineaAlbarans[i].getMaterial().equals(aMaterial)) {
				lineaAlbarans.remove(lLineaAlbarans[i]);
			}
		}
	}
	
	public void addMaterial(LineaAlbaran aLineaAlbaran, Material aMaterial) {
		aLineaAlbaran.setMaterial(aMaterial);
		lineaAlbarans.add(aLineaAlbaran);
	}
	
	public LineaAlbaran getLineaAlbaranByMaterial(Material aMaterial) {
		LineaAlbaran[] lLineaAlbarans = lineaAlbarans.toArray();
		for(int i = 0; i < lLineaAlbarans.length; i++) {
			if(lLineaAlbarans[i].getMaterial().equals(aMaterial)) {
				return lLineaAlbarans[i];
			}
		}
		return null;
	}
	
	private void setORM_LineaAlbarans(java.util.Set value) {
		this.ORM_lineaAlbarans = value;
	}
	
	private java.util.Set getORM_LineaAlbarans() {
		return ORM_lineaAlbarans;
	}
	
	public final LineaAlbaranSetCollection lineaAlbarans = new LineaAlbaranSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBARAN_LINEAALBARANS, ORMConstants.KEY_LINEAALBARAN_ALBARAN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
