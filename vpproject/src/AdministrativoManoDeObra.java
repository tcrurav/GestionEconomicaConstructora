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

public class AdministrativoManoDeObra extends Empleado {
	public AdministrativoManoDeObra() {
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoManoDeObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra getAdministrativoManoDeObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getAdministrativoManoDeObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoManoDeObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra getAdministrativoManoDeObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getAdministrativoManoDeObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AdministrativoManoDeObra) session.load(AdministrativoManoDeObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra getAdministrativoManoDeObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AdministrativoManoDeObra) session.get(AdministrativoManoDeObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministrativoManoDeObra) session.load(AdministrativoManoDeObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra getAdministrativoManoDeObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministrativoManoDeObra) session.get(AdministrativoManoDeObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrativoManoDeObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryAdministrativoManoDeObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrativoManoDeObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryAdministrativoManoDeObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra[] listAdministrativoManoDeObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listAdministrativoManoDeObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra[] listAdministrativoManoDeObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listAdministrativoManoDeObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrativoManoDeObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoManoDeObra as AdministrativoManoDeObra");
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
	
	public static List queryAdministrativoManoDeObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoManoDeObra as AdministrativoManoDeObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AdministrativoManoDeObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra[] listAdministrativoManoDeObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrativoManoDeObra(session, condition, orderBy);
			return (AdministrativoManoDeObra[]) list.toArray(new AdministrativoManoDeObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra[] listAdministrativoManoDeObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrativoManoDeObra(session, condition, orderBy, lockMode);
			return (AdministrativoManoDeObra[]) list.toArray(new AdministrativoManoDeObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoManoDeObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoManoDeObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AdministrativoManoDeObra[] administrativoManoDeObras = listAdministrativoManoDeObraByQuery(session, condition, orderBy);
		if (administrativoManoDeObras != null && administrativoManoDeObras.length > 0)
			return administrativoManoDeObras[0];
		else
			return null;
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AdministrativoManoDeObra[] administrativoManoDeObras = listAdministrativoManoDeObraByQuery(session, condition, orderBy, lockMode);
		if (administrativoManoDeObras != null && administrativoManoDeObras.length > 0)
			return administrativoManoDeObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministrativoManoDeObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateAdministrativoManoDeObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrativoManoDeObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateAdministrativoManoDeObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrativoManoDeObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoManoDeObra as AdministrativoManoDeObra");
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
	
	public static java.util.Iterator iterateAdministrativoManoDeObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoManoDeObra as AdministrativoManoDeObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AdministrativoManoDeObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoManoDeObra loadAdministrativoManoDeObraByCriteria(AdministrativoManoDeObraCriteria administrativoManoDeObraCriteria) {
		AdministrativoManoDeObra[] administrativoManoDeObras = listAdministrativoManoDeObraByCriteria(administrativoManoDeObraCriteria);
		if(administrativoManoDeObras == null || administrativoManoDeObras.length == 0) {
			return null;
		}
		return administrativoManoDeObras[0];
	}
	
	public static AdministrativoManoDeObra[] listAdministrativoManoDeObraByCriteria(AdministrativoManoDeObraCriteria administrativoManoDeObraCriteria) {
		return administrativoManoDeObraCriteria.listAdministrativoManoDeObra();
	}
	
	public static AdministrativoManoDeObra createAdministrativoManoDeObra() {
		return new AdministrativoManoDeObra();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObra.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
				lPeriodoEmpleadoEnObras[i].setAdministrativoManoObra(null);
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
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObra.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
				lPeriodoEmpleadoEnObras[i].setAdministrativoManoObra(null);
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
		if (key == ORMConstants.KEY_ADMINISTRATIVOMANODEOBRA_PERIODOEMPLEADOENOBRA) {
			return ORM_periodoEmpleadoEnObra;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_periodoEmpleadoEnObra = new java.util.HashSet();
	
	private void setORM_PeriodoEmpleadoEnObra(java.util.Set value) {
		this.ORM_periodoEmpleadoEnObra = value;
	}
	
	private java.util.Set getORM_PeriodoEmpleadoEnObra() {
		return ORM_periodoEmpleadoEnObra;
	}
	
	public final PeriodoEmpleadoEnObraSetCollection periodoEmpleadoEnObra = new PeriodoEmpleadoEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATIVOMANODEOBRA_PERIODOEMPLEADOENOBRA, ORMConstants.KEY_PERIODOEMPLEADOENOBRA_ADMINISTRATIVOMANOOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
