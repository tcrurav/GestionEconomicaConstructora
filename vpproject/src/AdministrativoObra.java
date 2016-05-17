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

public class AdministrativoObra extends Empleado {
	public AdministrativoObra() {
	}
	
	public static AdministrativoObra loadAdministrativoObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra getAdministrativoObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getAdministrativoObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra getAdministrativoObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getAdministrativoObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AdministrativoObra) session.load(AdministrativoObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra getAdministrativoObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (AdministrativoObra) session.get(AdministrativoObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministrativoObra) session.load(AdministrativoObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra getAdministrativoObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (AdministrativoObra) session.get(AdministrativoObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrativoObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryAdministrativoObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrativoObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryAdministrativoObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra[] listAdministrativoObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listAdministrativoObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra[] listAdministrativoObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listAdministrativoObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrativoObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoObra as AdministrativoObra");
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
	
	public static List queryAdministrativoObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoObra as AdministrativoObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AdministrativoObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra[] listAdministrativoObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrativoObra(session, condition, orderBy);
			return (AdministrativoObra[]) list.toArray(new AdministrativoObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra[] listAdministrativoObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrativoObra(session, condition, orderBy, lockMode);
			return (AdministrativoObra[]) list.toArray(new AdministrativoObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadAdministrativoObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		AdministrativoObra[] administrativoObras = listAdministrativoObraByQuery(session, condition, orderBy);
		if (administrativoObras != null && administrativoObras.length > 0)
			return administrativoObras[0];
		else
			return null;
	}
	
	public static AdministrativoObra loadAdministrativoObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		AdministrativoObra[] administrativoObras = listAdministrativoObraByQuery(session, condition, orderBy, lockMode);
		if (administrativoObras != null && administrativoObras.length > 0)
			return administrativoObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministrativoObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateAdministrativoObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrativoObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateAdministrativoObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrativoObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoObra as AdministrativoObra");
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
	
	public static java.util.Iterator iterateAdministrativoObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From AdministrativoObra as AdministrativoObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AdministrativoObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static AdministrativoObra loadAdministrativoObraByCriteria(AdministrativoObraCriteria administrativoObraCriteria) {
		AdministrativoObra[] administrativoObras = listAdministrativoObraByCriteria(administrativoObraCriteria);
		if(administrativoObras == null || administrativoObras.length == 0) {
			return null;
		}
		return administrativoObras[0];
	}
	
	public static AdministrativoObra[] listAdministrativoObraByCriteria(AdministrativoObraCriteria administrativoObraCriteria) {
		return administrativoObraCriteria.listAdministrativoObra();
	}
	
	public static AdministrativoObra createAdministrativoObra() {
		return new AdministrativoObra();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			MaterialParaObra[] lMaterialAsignadoAObras = materialAsignadoAObra.toArray();
			for(int i = 0; i < lMaterialAsignadoAObras.length; i++) {
				lMaterialAsignadoAObras[i].setAdministrativoObra(null);
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
			MaterialParaObra[] lMaterialAsignadoAObras = materialAsignadoAObra.toArray();
			for(int i = 0; i < lMaterialAsignadoAObras.length; i++) {
				lMaterialAsignadoAObras[i].setAdministrativoObra(null);
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
		if (key == ORMConstants.KEY_ADMINISTRATIVOOBRA_MATERIALASIGNADOAOBRA) {
			return ORM_materialAsignadoAObra;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_materialAsignadoAObra = new java.util.HashSet();
	
	private void setORM_MaterialAsignadoAObra(java.util.Set value) {
		this.ORM_materialAsignadoAObra = value;
	}
	
	private java.util.Set getORM_MaterialAsignadoAObra() {
		return ORM_materialAsignadoAObra;
	}
	
	public final MaterialParaObraSetCollection materialAsignadoAObra = new MaterialParaObraSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRATIVOOBRA_MATERIALASIGNADOAOBRA, ORMConstants.KEY_MATERIALPARAOBRA_ADMINISTRATIVOOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
