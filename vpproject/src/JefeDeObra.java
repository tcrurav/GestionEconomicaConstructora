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

public class JefeDeObra extends Empleado {
	public JefeDeObra() {
	}
	
	public static JefeDeObra loadJefeDeObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadJefeDeObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra getJefeDeObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getJefeDeObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadJefeDeObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra getJefeDeObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getJefeDeObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (JefeDeObra) session.load(JefeDeObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra getJefeDeObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (JefeDeObra) session.get(JefeDeObra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (JefeDeObra) session.load(JefeDeObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra getJefeDeObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (JefeDeObra) session.get(JefeDeObra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeDeObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryJefeDeObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeDeObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryJefeDeObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra[] listJefeDeObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listJefeDeObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra[] listJefeDeObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listJefeDeObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJefeDeObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From JefeDeObra as JefeDeObra");
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
	
	public static List queryJefeDeObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From JefeDeObra as JefeDeObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("JefeDeObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra[] listJefeDeObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJefeDeObra(session, condition, orderBy);
			return (JefeDeObra[]) list.toArray(new JefeDeObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra[] listJefeDeObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJefeDeObra(session, condition, orderBy, lockMode);
			return (JefeDeObra[]) list.toArray(new JefeDeObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadJefeDeObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadJefeDeObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		JefeDeObra[] jefeDeObras = listJefeDeObraByQuery(session, condition, orderBy);
		if (jefeDeObras != null && jefeDeObras.length > 0)
			return jefeDeObras[0];
		else
			return null;
	}
	
	public static JefeDeObra loadJefeDeObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		JefeDeObra[] jefeDeObras = listJefeDeObraByQuery(session, condition, orderBy, lockMode);
		if (jefeDeObras != null && jefeDeObras.length > 0)
			return jefeDeObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJefeDeObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateJefeDeObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJefeDeObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateJefeDeObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJefeDeObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From JefeDeObra as JefeDeObra");
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
	
	public static java.util.Iterator iterateJefeDeObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From JefeDeObra as JefeDeObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("JefeDeObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static JefeDeObra loadJefeDeObraByCriteria(JefeDeObraCriteria jefeDeObraCriteria) {
		JefeDeObra[] jefeDeObras = listJefeDeObraByCriteria(jefeDeObraCriteria);
		if(jefeDeObras == null || jefeDeObras.length == 0) {
			return null;
		}
		return jefeDeObras[0];
	}
	
	public static JefeDeObra[] listJefeDeObraByCriteria(JefeDeObraCriteria jefeDeObraCriteria) {
		return jefeDeObraCriteria.listJefeDeObra();
	}
	
	public static JefeDeObra createJefeDeObra() {
		return new JefeDeObra();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObrass = periodoJefeObraEnObras.toArray();
			for(int i = 0; i < lPeriodoJefeObraEnObrass.length; i++) {
				lPeriodoJefeObraEnObrass[i].setJefeDeObra(null);
			}
			MaterialParaObra[] lMaterialAsignadoAObras = materialAsignadoAObra.toArray();
			for(int i = 0; i < lMaterialAsignadoAObras.length; i++) {
				lMaterialAsignadoAObras[i].setJefeDeObra(null);
			}
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObra.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
				lPeriodoMaquinariaEnObras[i].setJefeDeObra(null);
			}
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObra.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
				lPeriodoEmpleadoEnObras[i].setJefeDeObra(null);
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
			PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObrass = periodoJefeObraEnObras.toArray();
			for(int i = 0; i < lPeriodoJefeObraEnObrass.length; i++) {
				lPeriodoJefeObraEnObrass[i].setJefeDeObra(null);
			}
			MaterialParaObra[] lMaterialAsignadoAObras = materialAsignadoAObra.toArray();
			for(int i = 0; i < lMaterialAsignadoAObras.length; i++) {
				lMaterialAsignadoAObras[i].setJefeDeObra(null);
			}
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObra.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
				lPeriodoMaquinariaEnObras[i].setJefeDeObra(null);
			}
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObra.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
				lPeriodoEmpleadoEnObras[i].setJefeDeObra(null);
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
		if (key == ORMConstants.KEY_JEFEDEOBRA_PERIODOJEFEOBRAENOBRAS) {
			return ORM_periodoJefeObraEnObras;
		}
		else if (key == ORMConstants.KEY_JEFEDEOBRA_MATERIALASIGNADOAOBRA) {
			return ORM_materialAsignadoAObra;
		}
		else if (key == ORMConstants.KEY_JEFEDEOBRA_PERIODOMAQUINARIAENOBRA) {
			return ORM_periodoMaquinariaEnObra;
		}
		else if (key == ORMConstants.KEY_JEFEDEOBRA_PERIODOEMPLEADOENOBRA) {
			return ORM_periodoEmpleadoEnObra;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private java.util.Set ORM_periodoJefeObraEnObras = new java.util.HashSet();
	
	private java.util.Set ORM_materialAsignadoAObra = new java.util.HashSet();
	
	private java.util.Set ORM_periodoMaquinariaEnObra = new java.util.HashSet();
	
	private java.util.Set ORM_periodoEmpleadoEnObra = new java.util.HashSet();
	
	public Obra[] getObras() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = periodoJefeObraEnObras.getIterator();lIter.hasNext();) {
			lValues.add(((PeriodoJefeObraEnObra)lIter.next()).getObra());
		}
		return (Obra[])lValues.toArray(new Obra[lValues.size()]);
	}
	
	public void removeObra(Obra aObra) {
		PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObras = periodoJefeObraEnObras.toArray();
		for(int i = 0; i < lPeriodoJefeObraEnObras.length; i++) {
			if(lPeriodoJefeObraEnObras[i].getObra().equals(aObra)) {
				periodoJefeObraEnObras.remove(lPeriodoJefeObraEnObras[i]);
			}
		}
	}
	
	public void addObra(PeriodoJefeObraEnObra aPeriodoJefeObraEnObra, Obra aObra) {
		aPeriodoJefeObraEnObra.setObra(aObra);
		periodoJefeObraEnObras.add(aPeriodoJefeObraEnObra);
	}
	
	public PeriodoJefeObraEnObra getPeriodoJefeObraEnObraByObra(Obra aObra) {
		PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObras = periodoJefeObraEnObras.toArray();
		for(int i = 0; i < lPeriodoJefeObraEnObras.length; i++) {
			if(lPeriodoJefeObraEnObras[i].getObra().equals(aObra)) {
				return lPeriodoJefeObraEnObras[i];
			}
		}
		return null;
	}
	
	private void setORM_PeriodoJefeObraEnObras(java.util.Set value) {
		this.ORM_periodoJefeObraEnObras = value;
	}
	
	private java.util.Set getORM_PeriodoJefeObraEnObras() {
		return ORM_periodoJefeObraEnObras;
	}
	
	public final PeriodoJefeObraEnObraSetCollection periodoJefeObraEnObras = new PeriodoJefeObraEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_JEFEDEOBRA_PERIODOJEFEOBRAENOBRAS, ORMConstants.KEY_PERIODOJEFEOBRAENOBRA_JEFEDEOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_MaterialAsignadoAObra(java.util.Set value) {
		this.ORM_materialAsignadoAObra = value;
	}
	
	private java.util.Set getORM_MaterialAsignadoAObra() {
		return ORM_materialAsignadoAObra;
	}
	
	public final MaterialParaObraSetCollection materialAsignadoAObra = new MaterialParaObraSetCollection(this, _ormAdapter, ORMConstants.KEY_JEFEDEOBRA_MATERIALASIGNADOAOBRA, ORMConstants.KEY_MATERIALPARAOBRA_JEFEDEOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_PeriodoMaquinariaEnObra(java.util.Set value) {
		this.ORM_periodoMaquinariaEnObra = value;
	}
	
	private java.util.Set getORM_PeriodoMaquinariaEnObra() {
		return ORM_periodoMaquinariaEnObra;
	}
	
	public final PeriodoMaquinariaEnObraSetCollection periodoMaquinariaEnObra = new PeriodoMaquinariaEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_JEFEDEOBRA_PERIODOMAQUINARIAENOBRA, ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_JEFEDEOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_PeriodoEmpleadoEnObra(java.util.Set value) {
		this.ORM_periodoEmpleadoEnObra = value;
	}
	
	private java.util.Set getORM_PeriodoEmpleadoEnObra() {
		return ORM_periodoEmpleadoEnObra;
	}
	
	public final PeriodoEmpleadoEnObraSetCollection periodoEmpleadoEnObra = new PeriodoEmpleadoEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_JEFEDEOBRA_PERIODOEMPLEADOENOBRA, ORMConstants.KEY_PERIODOEMPLEADOENOBRA_JEFEDEOBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
