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

public class EmpleadoObra extends Empleado {
	public EmpleadoObra() {
	}
	
	public static EmpleadoObra loadEmpleadoObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra getEmpleadoObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getEmpleadoObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra getEmpleadoObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getEmpleadoObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EmpleadoObra) session.load(EmpleadoObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra getEmpleadoObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EmpleadoObra) session.get(EmpleadoObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EmpleadoObra) session.load(EmpleadoObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra getEmpleadoObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EmpleadoObra) session.get(EmpleadoObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleadoObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryEmpleadoObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleadoObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryEmpleadoObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra[] listEmpleadoObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listEmpleadoObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra[] listEmpleadoObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listEmpleadoObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleadoObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoObra as EmpleadoObra");
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
	
	public static List queryEmpleadoObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoObra as EmpleadoObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EmpleadoObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra[] listEmpleadoObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpleadoObra(session, condition, orderBy);
			return (EmpleadoObra[]) list.toArray(new EmpleadoObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra[] listEmpleadoObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpleadoObra(session, condition, orderBy, lockMode);
			return (EmpleadoObra[]) list.toArray(new EmpleadoObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EmpleadoObra[] empleadoObras = listEmpleadoObraByQuery(session, condition, orderBy);
		if (empleadoObras != null && empleadoObras.length > 0)
			return empleadoObras[0];
		else
			return null;
	}
	
	public static EmpleadoObra loadEmpleadoObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EmpleadoObra[] empleadoObras = listEmpleadoObraByQuery(session, condition, orderBy, lockMode);
		if (empleadoObras != null && empleadoObras.length > 0)
			return empleadoObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpleadoObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateEmpleadoObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateEmpleadoObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoObra as EmpleadoObra");
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
	
	public static java.util.Iterator iterateEmpleadoObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoObra as EmpleadoObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EmpleadoObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoObra loadEmpleadoObraByCriteria(EmpleadoObraCriteria empleadoObraCriteria) {
		EmpleadoObra[] empleadoObras = listEmpleadoObraByCriteria(empleadoObraCriteria);
		if(empleadoObras == null || empleadoObras.length == 0) {
			return null;
		}
		return empleadoObras[0];
	}
	
	public static EmpleadoObra[] listEmpleadoObraByCriteria(EmpleadoObraCriteria empleadoObraCriteria) {
		return empleadoObraCriteria.listEmpleadoObra();
	}
	
	public static EmpleadoObra createEmpleadoObra() {
		return new EmpleadoObra();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObrass = periodoEmpleadoEnObras.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObrass.length; i++) {
				lPeriodoEmpleadoEnObrass[i].setEmpleadoObra(null);
			}
			if(getCategoria() != null) {
				getCategoria().empleado.remove(this);
			}
			
			Proveedor[] lProveedors = proveedor.toArray();
			for(int i = 0; i < lProveedors.length; i++) {
				lProveedors[i].contacto.remove(this);
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
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObrass = periodoEmpleadoEnObras.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObrass.length; i++) {
				lPeriodoEmpleadoEnObrass[i].setEmpleadoObra(null);
			}
			if(getCategoria() != null) {
				getCategoria().empleado.remove(this);
			}
			
			Proveedor[] lProveedors = proveedor.toArray();
			for(int i = 0; i < lProveedors.length; i++) {
				lProveedors[i].contacto.remove(this);
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
		if (key == ORMConstants.KEY_EMPLEADOOBRA_PERIODOEMPLEADOENOBRAS) {
			return ORM_periodoEmpleadoEnObras;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_periodoEmpleadoEnObras = new java.util.HashSet();
	
	public Obra[] getObras() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = periodoEmpleadoEnObras.getIterator();lIter.hasNext();) {
			lValues.add(((PeriodoEmpleadoEnObra)lIter.next()).getObra());
		}
		return (Obra[])lValues.toArray(new Obra[lValues.size()]);
	}
	
	public void removeObra(Obra aObra) {
		PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObras.toArray();
		for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
			if(lPeriodoEmpleadoEnObras[i].getObra().equals(aObra)) {
				periodoEmpleadoEnObras.remove(lPeriodoEmpleadoEnObras[i]);
			}
		}
	}
	
	public void addObra(PeriodoEmpleadoEnObra aPeriodoEmpleadoEnObra, Obra aObra) {
		aPeriodoEmpleadoEnObra.setObra(aObra);
		periodoEmpleadoEnObras.add(aPeriodoEmpleadoEnObra);
	}
	
	public PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObraByObra(Obra aObra) {
		PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObras.toArray();
		for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
			if(lPeriodoEmpleadoEnObras[i].getObra().equals(aObra)) {
				return lPeriodoEmpleadoEnObras[i];
			}
		}
		return null;
	}
	
	private void setORM_PeriodoEmpleadoEnObras(java.util.Set value) {
		this.ORM_periodoEmpleadoEnObras = value;
	}
	
	private java.util.Set getORM_PeriodoEmpleadoEnObras() {
		return ORM_periodoEmpleadoEnObras;
	}
	
	public final PeriodoEmpleadoEnObraSetCollection periodoEmpleadoEnObras = new PeriodoEmpleadoEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_EMPLEADOOBRA_PERIODOEMPLEADOENOBRAS, ORMConstants.KEY_PERIODOEMPLEADOENOBRA_EMPLEADOOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
