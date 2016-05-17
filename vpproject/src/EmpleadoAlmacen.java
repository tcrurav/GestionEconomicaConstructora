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

public class EmpleadoAlmacen extends Empleado {
	public EmpleadoAlmacen() {
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoAlmacenByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen getEmpleadoAlmacenByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getEmpleadoAlmacenByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoAlmacenByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen getEmpleadoAlmacenByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getEmpleadoAlmacenByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EmpleadoAlmacen) session.load(EmpleadoAlmacen.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen getEmpleadoAlmacenByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EmpleadoAlmacen) session.get(EmpleadoAlmacen.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EmpleadoAlmacen) session.load(EmpleadoAlmacen.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen getEmpleadoAlmacenByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EmpleadoAlmacen) session.get(EmpleadoAlmacen.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleadoAlmacen(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryEmpleadoAlmacen(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleadoAlmacen(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryEmpleadoAlmacen(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen[] listEmpleadoAlmacenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listEmpleadoAlmacenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen[] listEmpleadoAlmacenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listEmpleadoAlmacenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleadoAlmacen(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoAlmacen as EmpleadoAlmacen");
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
	
	public static List queryEmpleadoAlmacen(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoAlmacen as EmpleadoAlmacen");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EmpleadoAlmacen", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen[] listEmpleadoAlmacenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpleadoAlmacen(session, condition, orderBy);
			return (EmpleadoAlmacen[]) list.toArray(new EmpleadoAlmacen[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen[] listEmpleadoAlmacenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpleadoAlmacen(session, condition, orderBy, lockMode);
			return (EmpleadoAlmacen[]) list.toArray(new EmpleadoAlmacen[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoAlmacenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadEmpleadoAlmacenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EmpleadoAlmacen[] empleadoAlmacens = listEmpleadoAlmacenByQuery(session, condition, orderBy);
		if (empleadoAlmacens != null && empleadoAlmacens.length > 0)
			return empleadoAlmacens[0];
		else
			return null;
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EmpleadoAlmacen[] empleadoAlmacens = listEmpleadoAlmacenByQuery(session, condition, orderBy, lockMode);
		if (empleadoAlmacens != null && empleadoAlmacens.length > 0)
			return empleadoAlmacens[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpleadoAlmacenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateEmpleadoAlmacenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoAlmacenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateEmpleadoAlmacenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoAlmacenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoAlmacen as EmpleadoAlmacen");
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
	
	public static java.util.Iterator iterateEmpleadoAlmacenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EmpleadoAlmacen as EmpleadoAlmacen");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EmpleadoAlmacen", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EmpleadoAlmacen loadEmpleadoAlmacenByCriteria(EmpleadoAlmacenCriteria empleadoAlmacenCriteria) {
		EmpleadoAlmacen[] empleadoAlmacens = listEmpleadoAlmacenByCriteria(empleadoAlmacenCriteria);
		if(empleadoAlmacens == null || empleadoAlmacens.length == 0) {
			return null;
		}
		return empleadoAlmacens[0];
	}
	
	public static EmpleadoAlmacen[] listEmpleadoAlmacenByCriteria(EmpleadoAlmacenCriteria empleadoAlmacenCriteria) {
		return empleadoAlmacenCriteria.listEmpleadoAlmacen();
	}
	
	public static EmpleadoAlmacen createEmpleadoAlmacen() {
		return new EmpleadoAlmacen();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			Albaran[] lAlbarans = albaran.toArray();
			for(int i = 0; i < lAlbarans.length; i++) {
				lAlbarans[i].setEmpleado(null);
			}
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObra.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
				lPeriodoMaquinariaEnObras[i].setEmpleadoAlmacen(null);
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
			Albaran[] lAlbarans = albaran.toArray();
			for(int i = 0; i < lAlbarans.length; i++) {
				lAlbarans[i].setEmpleado(null);
			}
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObra.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
				lPeriodoMaquinariaEnObras[i].setEmpleadoAlmacen(null);
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
		if (key == ORMConstants.KEY_EMPLEADOALMACEN_ALBARAN) {
			return ORM_albaran;
		}
		else if (key == ORMConstants.KEY_EMPLEADOALMACEN_PERIODOMAQUINARIAENOBRA) {
			return ORM_periodoMaquinariaEnObra;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_albaran = new java.util.HashSet();
	
	private java.util.Set ORM_periodoMaquinariaEnObra = new java.util.HashSet();
	
	private void setORM_Albaran(java.util.Set value) {
		this.ORM_albaran = value;
	}
	
	private java.util.Set getORM_Albaran() {
		return ORM_albaran;
	}
	
	public final AlbaranSetCollection albaran = new AlbaranSetCollection(this, _ormAdapter, ORMConstants.KEY_EMPLEADOALMACEN_ALBARAN, ORMConstants.KEY_ALBARAN_EMPLEADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_PeriodoMaquinariaEnObra(java.util.Set value) {
		this.ORM_periodoMaquinariaEnObra = value;
	}
	
	private java.util.Set getORM_PeriodoMaquinariaEnObra() {
		return ORM_periodoMaquinariaEnObra;
	}
	
	public final PeriodoMaquinariaEnObraSetCollection periodoMaquinariaEnObra = new PeriodoMaquinariaEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_EMPLEADOALMACEN_PERIODOMAQUINARIAENOBRA, ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_EMPLEADOALMACEN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
