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

public class Maquinaria {
	public Maquinaria() {
	}
	
	public static Maquinaria loadMaquinariaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaquinariaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria getMaquinariaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getMaquinariaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaquinariaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria getMaquinariaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getMaquinariaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Maquinaria) session.load(Maquinaria.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria getMaquinariaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Maquinaria) session.get(Maquinaria.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Maquinaria) session.load(Maquinaria.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria getMaquinariaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Maquinaria) session.get(Maquinaria.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaquinaria(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryMaquinaria(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaquinaria(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryMaquinaria(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria[] listMaquinariaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listMaquinariaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria[] listMaquinariaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listMaquinariaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaquinaria(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Maquinaria as Maquinaria");
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
	
	public static List queryMaquinaria(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Maquinaria as Maquinaria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Maquinaria", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria[] listMaquinariaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMaquinaria(session, condition, orderBy);
			return (Maquinaria[]) list.toArray(new Maquinaria[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria[] listMaquinariaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMaquinaria(session, condition, orderBy, lockMode);
			return (Maquinaria[]) list.toArray(new Maquinaria[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaquinariaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaquinariaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Maquinaria[] maquinarias = listMaquinariaByQuery(session, condition, orderBy);
		if (maquinarias != null && maquinarias.length > 0)
			return maquinarias[0];
		else
			return null;
	}
	
	public static Maquinaria loadMaquinariaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Maquinaria[] maquinarias = listMaquinariaByQuery(session, condition, orderBy, lockMode);
		if (maquinarias != null && maquinarias.length > 0)
			return maquinarias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMaquinariaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateMaquinariaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaquinariaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateMaquinariaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaquinariaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Maquinaria as Maquinaria");
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
	
	public static java.util.Iterator iterateMaquinariaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Maquinaria as Maquinaria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Maquinaria", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Maquinaria loadMaquinariaByCriteria(MaquinariaCriteria maquinariaCriteria) {
		Maquinaria[] maquinarias = listMaquinariaByCriteria(maquinariaCriteria);
		if(maquinarias == null || maquinarias.length == 0) {
			return null;
		}
		return maquinarias[0];
	}
	
	public static Maquinaria[] listMaquinariaByCriteria(MaquinariaCriteria maquinariaCriteria) {
		return maquinariaCriteria.listMaquinaria();
	}
	
	public static Maquinaria createMaquinaria() {
		return new Maquinaria();
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
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObrass = periodoMaquinariaEnObras.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObrass.length; i++) {
				lPeriodoMaquinariaEnObrass[i].setMaquinaria(null);
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
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObrass = periodoMaquinariaEnObras.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObrass.length; i++) {
				lPeriodoMaquinariaEnObrass[i].setMaquinaria(null);
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
		if (key == ORMConstants.KEY_MAQUINARIA_PERIODOMAQUINARIAENOBRAS) {
			return ORM_periodoMaquinariaEnObras;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nombre;
	
	private float precioDeCompra;
	
	private java.util.Date fechaFinVidaUtil;
	
	private java.util.Date fechaCompra;
	
	private String codInventario;
	
	private java.util.Set ORM_periodoMaquinariaEnObras = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecioDeCompra(float value) {
		this.precioDeCompra = value;
	}
	
	public float getPrecioDeCompra() {
		return precioDeCompra;
	}
	
	public void setFechaFinVidaUtil(java.util.Date value) {
		this.fechaFinVidaUtil = value;
	}
	
	public java.util.Date getFechaFinVidaUtil() {
		return fechaFinVidaUtil;
	}
	
	public void setFechaCompra(java.util.Date value) {
		this.fechaCompra = value;
	}
	
	public java.util.Date getFechaCompra() {
		return fechaCompra;
	}
	
	public void setCodInventario(String value) {
		this.codInventario = value;
	}
	
	public String getCodInventario() {
		return codInventario;
	}
	
	public Obra[] getObras() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = periodoMaquinariaEnObras.getIterator();lIter.hasNext();) {
			lValues.add(((PeriodoMaquinariaEnObra)lIter.next()).getObra());
		}
		return (Obra[])lValues.toArray(new Obra[lValues.size()]);
	}
	
	public void removeObra(Obra aObra) {
		PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObras.toArray();
		for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
			if(lPeriodoMaquinariaEnObras[i].getObra().equals(aObra)) {
				periodoMaquinariaEnObras.remove(lPeriodoMaquinariaEnObras[i]);
			}
		}
	}
	
	public void addObra(PeriodoMaquinariaEnObra aPeriodoMaquinariaEnObra, Obra aObra) {
		aPeriodoMaquinariaEnObra.setObra(aObra);
		periodoMaquinariaEnObras.add(aPeriodoMaquinariaEnObra);
	}
	
	public PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObraByObra(Obra aObra) {
		PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObras.toArray();
		for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
			if(lPeriodoMaquinariaEnObras[i].getObra().equals(aObra)) {
				return lPeriodoMaquinariaEnObras[i];
			}
		}
		return null;
	}
	
	private void setORM_PeriodoMaquinariaEnObras(java.util.Set value) {
		this.ORM_periodoMaquinariaEnObras = value;
	}
	
	private java.util.Set getORM_PeriodoMaquinariaEnObras() {
		return ORM_periodoMaquinariaEnObras;
	}
	
	public final PeriodoMaquinariaEnObraSetCollection periodoMaquinariaEnObras = new PeriodoMaquinariaEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_MAQUINARIA_PERIODOMAQUINARIAENOBRAS, ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_MAQUINARIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
