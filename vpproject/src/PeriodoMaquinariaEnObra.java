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
public class PeriodoMaquinariaEnObra implements Serializable {
	public PeriodoMaquinariaEnObra() {
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByORMID(int ID, Obra obra, Maquinaria maquinaria) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoMaquinariaEnObraByORMID(session, ID, obra, maquinaria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObraByORMID(int ID, Obra obra, Maquinaria maquinaria) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getPeriodoMaquinariaEnObraByORMID(session, ID, obra, maquinaria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByORMID(int ID, Obra obra, Maquinaria maquinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoMaquinariaEnObraByORMID(session, ID, obra, maquinaria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObraByORMID(int ID, Obra obra, Maquinaria maquinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getPeriodoMaquinariaEnObraByORMID(session, ID, obra, maquinaria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByORMID(PersistentSession session, int ID, Obra obra, Maquinaria maquinaria) throws PersistentException {
		try {
			PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();
			periodomaquinariaenobra.setID(ID);
			periodomaquinariaenobra.setORM_Obra(obra);
			periodomaquinariaenobra.setORM_Maquinaria(maquinaria);
			
			return (PeriodoMaquinariaEnObra) session.load(PeriodoMaquinariaEnObra.class, periodomaquinariaenobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObraByORMID(PersistentSession session, int ID, Obra obra, Maquinaria maquinaria) throws PersistentException {
		try {
			PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();
			periodomaquinariaenobra.setID(ID);
			periodomaquinariaenobra.setORM_Obra(obra);
			periodomaquinariaenobra.setORM_Maquinaria(maquinaria);
			
			return (PeriodoMaquinariaEnObra) session.get(PeriodoMaquinariaEnObra.class, periodomaquinariaenobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByORMID(PersistentSession session, int ID, Obra obra, Maquinaria maquinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();
			periodomaquinariaenobra.setID(ID);
			periodomaquinariaenobra.setORM_Obra(obra);
			periodomaquinariaenobra.setORM_Maquinaria(maquinaria);
			
			return (PeriodoMaquinariaEnObra) session.load(PeriodoMaquinariaEnObra.class, periodomaquinariaenobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObraByORMID(PersistentSession session, int ID, Obra obra, Maquinaria maquinaria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PeriodoMaquinariaEnObra periodomaquinariaenobra = new PeriodoMaquinariaEnObra();
			periodomaquinariaenobra.setID(ID);
			periodomaquinariaenobra.setORM_Obra(obra);
			periodomaquinariaenobra.setORM_Maquinaria(maquinaria);
			
			return (PeriodoMaquinariaEnObra) session.get(PeriodoMaquinariaEnObra.class, periodomaquinariaenobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoMaquinariaEnObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryPeriodoMaquinariaEnObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoMaquinariaEnObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryPeriodoMaquinariaEnObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listPeriodoMaquinariaEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listPeriodoMaquinariaEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoMaquinariaEnObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoMaquinariaEnObra as PeriodoMaquinariaEnObra");
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
	
	public static List queryPeriodoMaquinariaEnObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoMaquinariaEnObra as PeriodoMaquinariaEnObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PeriodoMaquinariaEnObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeriodoMaquinariaEnObra(session, condition, orderBy);
			return (PeriodoMaquinariaEnObra[]) list.toArray(new PeriodoMaquinariaEnObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeriodoMaquinariaEnObra(session, condition, orderBy, lockMode);
			return (PeriodoMaquinariaEnObra[]) list.toArray(new PeriodoMaquinariaEnObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoMaquinariaEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoMaquinariaEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PeriodoMaquinariaEnObra[] periodoMaquinariaEnObras = listPeriodoMaquinariaEnObraByQuery(session, condition, orderBy);
		if (periodoMaquinariaEnObras != null && periodoMaquinariaEnObras.length > 0)
			return periodoMaquinariaEnObras[0];
		else
			return null;
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PeriodoMaquinariaEnObra[] periodoMaquinariaEnObras = listPeriodoMaquinariaEnObraByQuery(session, condition, orderBy, lockMode);
		if (periodoMaquinariaEnObras != null && periodoMaquinariaEnObras.length > 0)
			return periodoMaquinariaEnObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePeriodoMaquinariaEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iteratePeriodoMaquinariaEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodoMaquinariaEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iteratePeriodoMaquinariaEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodoMaquinariaEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoMaquinariaEnObra as PeriodoMaquinariaEnObra");
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
	
	public static java.util.Iterator iteratePeriodoMaquinariaEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoMaquinariaEnObra as PeriodoMaquinariaEnObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PeriodoMaquinariaEnObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoMaquinariaEnObra loadPeriodoMaquinariaEnObraByCriteria(PeriodoMaquinariaEnObraCriteria periodoMaquinariaEnObraCriteria) {
		PeriodoMaquinariaEnObra[] periodoMaquinariaEnObras = listPeriodoMaquinariaEnObraByCriteria(periodoMaquinariaEnObraCriteria);
		if(periodoMaquinariaEnObras == null || periodoMaquinariaEnObras.length == 0) {
			return null;
		}
		return periodoMaquinariaEnObras[0];
	}
	
	public static PeriodoMaquinariaEnObra[] listPeriodoMaquinariaEnObraByCriteria(PeriodoMaquinariaEnObraCriteria periodoMaquinariaEnObraCriteria) {
		return periodoMaquinariaEnObraCriteria.listPeriodoMaquinariaEnObra();
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof PeriodoMaquinariaEnObra))
			return false;
		PeriodoMaquinariaEnObra periodomaquinariaenobra = (PeriodoMaquinariaEnObra)aObj;
		if (getID() != periodomaquinariaenobra.getID())
			return false;
		if (getObra() == null) {
			if (periodomaquinariaenobra.getObra() != null)
				return false;
		}
		else if (!getObra().equals(periodomaquinariaenobra.getObra()))
			return false;
		if (getMaquinaria() == null) {
			if (periodomaquinariaenobra.getMaquinaria() != null)
				return false;
		}
		else if (!getMaquinaria().equals(periodomaquinariaenobra.getMaquinaria()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getObra() != null) {
			hashcode = hashcode + (int) getObra().getORMID();
		}
		if (getMaquinaria() != null) {
			hashcode = hashcode + (int) getMaquinaria().getORMID();
		}
		return hashcode;
	}
	
	public static PeriodoMaquinariaEnObra createPeriodoMaquinariaEnObra() {
		return new PeriodoMaquinariaEnObra();
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
			if(getEmpleadoAlmacen() != null) {
				getEmpleadoAlmacen().periodoMaquinariaEnObra.remove(this);
			}
			
			if(getJefeDeObra() != null) {
				getJefeDeObra().periodoMaquinariaEnObra.remove(this);
			}
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().periodoMaquinariaEnObras.remove(this);
			}
			setORM_Obra(obra);
			
			Maquinaria maquinaria = getMaquinaria();
			if(getMaquinaria() != null) {
				getMaquinaria().periodoMaquinariaEnObras.remove(this);
			}
			setORM_Maquinaria(maquinaria);
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getEmpleadoAlmacen() != null) {
				getEmpleadoAlmacen().periodoMaquinariaEnObra.remove(this);
			}
			
			if(getJefeDeObra() != null) {
				getJefeDeObra().periodoMaquinariaEnObra.remove(this);
			}
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().periodoMaquinariaEnObras.remove(this);
			}
			setORM_Obra(obra);
			
			Maquinaria maquinaria = getMaquinaria();
			if(getMaquinaria() != null) {
				getMaquinaria().periodoMaquinariaEnObras.remove(this);
			}
			setORM_Maquinaria(maquinaria);
			
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
		if (key == ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_JEFEDEOBRA) {
			this.jefeDeObra = (JefeDeObra) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_EMPLEADOALMACEN) {
			this.empleadoAlmacen = (EmpleadoAlmacen) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_OBRA) {
			this.obra = (Obra) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_MAQUINARIA) {
			this.maquinaria = (Maquinaria) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private EmpleadoAlmacen empleadoAlmacen;
	
	private JefeDeObra jefeDeObra;
	
	private java.util.Date fechaInicio;
	
	private java.util.Date fechaFin;
	
	private java.util.Date fechaSolicitud;
	
	private java.util.Date fechaRecepcion;
	
	private Obra obra;
	
	private int obraId;
	
	private void setObraId(int value) {
		this.obraId = value;
	}
	
	public int getObraId() {
		return obraId;
	}
	
	private Maquinaria maquinaria;
	
	private int maquinariaId;
	
	private void setMaquinariaId(int value) {
		this.maquinariaId = value;
	}
	
	public int getMaquinariaId() {
		return maquinariaId;
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setFechaInicio(java.util.Date value) {
		this.fechaInicio = value;
	}
	
	public java.util.Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaFin(java.util.Date value) {
		this.fechaFin = value;
	}
	
	public java.util.Date getFechaFin() {
		return fechaFin;
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
	
	public void setJefeDeObra(JefeDeObra value) {
		if (jefeDeObra != null) {
			jefeDeObra.periodoMaquinariaEnObra.remove(this);
		}
		if (value != null) {
			value.periodoMaquinariaEnObra.add(this);
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
	
	public void setEmpleadoAlmacen(EmpleadoAlmacen value) {
		if (empleadoAlmacen != null) {
			empleadoAlmacen.periodoMaquinariaEnObra.remove(this);
		}
		if (value != null) {
			value.periodoMaquinariaEnObra.add(this);
		}
	}
	
	public EmpleadoAlmacen getEmpleadoAlmacen() {
		return empleadoAlmacen;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_EmpleadoAlmacen(EmpleadoAlmacen value) {
		this.empleadoAlmacen = value;
	}
	
	private EmpleadoAlmacen getORM_EmpleadoAlmacen() {
		return empleadoAlmacen;
	}
	
	public void setObra(Obra value) {
		if (obra != null) {
			obra.periodoMaquinariaEnObras.remove(this);
		}
		if (value != null) {
			value.periodoMaquinariaEnObras.add(this);
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
	
	public void setMaquinaria(Maquinaria value) {
		if (maquinaria != null) {
			maquinaria.periodoMaquinariaEnObras.remove(this);
		}
		if (value != null) {
			value.periodoMaquinariaEnObras.add(this);
		}
	}
	
	public Maquinaria getMaquinaria() {
		return maquinaria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Maquinaria(Maquinaria value) {
		this.maquinaria = value;
	}
	
	private Maquinaria getORM_Maquinaria() {
		return maquinaria;
	}
	
	public PeriodoMaquinariaEnObra(int parameter) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID() + " " + ((getObra() == null) ? "" : String.valueOf(getObra().getORMID())) + " " + ((getMaquinaria() == null) ? "" : String.valueOf(getMaquinaria().getORMID())));
	}
	
}
