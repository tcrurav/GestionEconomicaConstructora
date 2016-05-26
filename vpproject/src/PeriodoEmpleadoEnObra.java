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
public class PeriodoEmpleadoEnObra implements Serializable {
	public PeriodoEmpleadoEnObra() {
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByORMID(int ID, EmpleadoObra empleadoObra, Obra obra) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoEmpleadoEnObraByORMID(session, ID, empleadoObra, obra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObraByORMID(int ID, EmpleadoObra empleadoObra, Obra obra) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getPeriodoEmpleadoEnObraByORMID(session, ID, empleadoObra, obra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByORMID(int ID, EmpleadoObra empleadoObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoEmpleadoEnObraByORMID(session, ID, empleadoObra, obra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObraByORMID(int ID, EmpleadoObra empleadoObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getPeriodoEmpleadoEnObraByORMID(session, ID, empleadoObra, obra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByORMID(PersistentSession session, int ID, EmpleadoObra empleadoObra, Obra obra) throws PersistentException {
		try {
			PeriodoEmpleadoEnObra periodoempleadoenobra = new PeriodoEmpleadoEnObra();
			periodoempleadoenobra.setID(ID);
			periodoempleadoenobra.setORM_EmpleadoObra(empleadoObra);
			periodoempleadoenobra.setORM_Obra(obra);
			
			return (PeriodoEmpleadoEnObra) session.load(PeriodoEmpleadoEnObra.class, periodoempleadoenobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObraByORMID(PersistentSession session, int ID, EmpleadoObra empleadoObra, Obra obra) throws PersistentException {
		try {
			PeriodoEmpleadoEnObra periodoempleadoenobra = new PeriodoEmpleadoEnObra();
			periodoempleadoenobra.setID(ID);
			periodoempleadoenobra.setORM_EmpleadoObra(empleadoObra);
			periodoempleadoenobra.setORM_Obra(obra);
			
			return (PeriodoEmpleadoEnObra) session.get(PeriodoEmpleadoEnObra.class, periodoempleadoenobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByORMID(PersistentSession session, int ID, EmpleadoObra empleadoObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PeriodoEmpleadoEnObra periodoempleadoenobra = new PeriodoEmpleadoEnObra();
			periodoempleadoenobra.setID(ID);
			periodoempleadoenobra.setORM_EmpleadoObra(empleadoObra);
			periodoempleadoenobra.setORM_Obra(obra);
			
			return (PeriodoEmpleadoEnObra) session.load(PeriodoEmpleadoEnObra.class, periodoempleadoenobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObraByORMID(PersistentSession session, int ID, EmpleadoObra empleadoObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PeriodoEmpleadoEnObra periodoempleadoenobra = new PeriodoEmpleadoEnObra();
			periodoempleadoenobra.setID(ID);
			periodoempleadoenobra.setORM_EmpleadoObra(empleadoObra);
			periodoempleadoenobra.setORM_Obra(obra);
			
			return (PeriodoEmpleadoEnObra) session.get(PeriodoEmpleadoEnObra.class, periodoempleadoenobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoEmpleadoEnObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryPeriodoEmpleadoEnObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoEmpleadoEnObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryPeriodoEmpleadoEnObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listPeriodoEmpleadoEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listPeriodoEmpleadoEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoEmpleadoEnObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoEmpleadoEnObra as PeriodoEmpleadoEnObra");
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
	
	public static List queryPeriodoEmpleadoEnObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoEmpleadoEnObra as PeriodoEmpleadoEnObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PeriodoEmpleadoEnObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeriodoEmpleadoEnObra(session, condition, orderBy);
			return (PeriodoEmpleadoEnObra[]) list.toArray(new PeriodoEmpleadoEnObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeriodoEmpleadoEnObra(session, condition, orderBy, lockMode);
			return (PeriodoEmpleadoEnObra[]) list.toArray(new PeriodoEmpleadoEnObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoEmpleadoEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoEmpleadoEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PeriodoEmpleadoEnObra[] periodoEmpleadoEnObras = listPeriodoEmpleadoEnObraByQuery(session, condition, orderBy);
		if (periodoEmpleadoEnObras != null && periodoEmpleadoEnObras.length > 0)
			return periodoEmpleadoEnObras[0];
		else
			return null;
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PeriodoEmpleadoEnObra[] periodoEmpleadoEnObras = listPeriodoEmpleadoEnObraByQuery(session, condition, orderBy, lockMode);
		if (periodoEmpleadoEnObras != null && periodoEmpleadoEnObras.length > 0)
			return periodoEmpleadoEnObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePeriodoEmpleadoEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iteratePeriodoEmpleadoEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodoEmpleadoEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iteratePeriodoEmpleadoEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodoEmpleadoEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoEmpleadoEnObra as PeriodoEmpleadoEnObra");
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
	
	public static java.util.Iterator iteratePeriodoEmpleadoEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoEmpleadoEnObra as PeriodoEmpleadoEnObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PeriodoEmpleadoEnObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoEmpleadoEnObra loadPeriodoEmpleadoEnObraByCriteria(PeriodoEmpleadoEnObraCriteria periodoEmpleadoEnObraCriteria) {
		PeriodoEmpleadoEnObra[] periodoEmpleadoEnObras = listPeriodoEmpleadoEnObraByCriteria(periodoEmpleadoEnObraCriteria);
		if(periodoEmpleadoEnObras == null || periodoEmpleadoEnObras.length == 0) {
			return null;
		}
		return periodoEmpleadoEnObras[0];
	}
	
	public static PeriodoEmpleadoEnObra[] listPeriodoEmpleadoEnObraByCriteria(PeriodoEmpleadoEnObraCriteria periodoEmpleadoEnObraCriteria) {
		return periodoEmpleadoEnObraCriteria.listPeriodoEmpleadoEnObra();
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof PeriodoEmpleadoEnObra))
			return false;
		PeriodoEmpleadoEnObra periodoempleadoenobra = (PeriodoEmpleadoEnObra)aObj;
		if (getID() != periodoempleadoenobra.getID())
			return false;
		if (getEmpleadoObra() == null) {
			if (periodoempleadoenobra.getEmpleadoObra() != null)
				return false;
		}
		else if (!getEmpleadoObra().equals(periodoempleadoenobra.getEmpleadoObra()))
			return false;
		if (getObra() == null) {
			if (periodoempleadoenobra.getObra() != null)
				return false;
		}
		else if (!getObra().equals(periodoempleadoenobra.getObra()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getEmpleadoObra() != null) {
			hashcode = hashcode + (int) getEmpleadoObra().getORMID();
		}
		if (getObra() != null) {
			hashcode = hashcode + (int) getObra().getORMID();
		}
		return hashcode;
	}
	
	public static PeriodoEmpleadoEnObra createPeriodoEmpleadoEnObra() {
		return new PeriodoEmpleadoEnObra();
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
			if(getAdministrativoManoObra() != null) {
				getAdministrativoManoObra().periodoEmpleadoEnObra.remove(this);
			}
			
			if(getJefeDeObra() != null) {
				getJefeDeObra().periodoEmpleadoEnObra.remove(this);
			}
			
			EmpleadoObra empleadoObra = getEmpleadoObra();
			if(getEmpleadoObra() != null) {
				getEmpleadoObra().periodoEmpleadoEnObras.remove(this);
			}
			setORM_EmpleadoObra(empleadoObra);
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().periodoEmpleadoEnObras.remove(this);
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
			if(getAdministrativoManoObra() != null) {
				getAdministrativoManoObra().periodoEmpleadoEnObra.remove(this);
			}
			
			if(getJefeDeObra() != null) {
				getJefeDeObra().periodoEmpleadoEnObra.remove(this);
			}
			
			EmpleadoObra empleadoObra = getEmpleadoObra();
			if(getEmpleadoObra() != null) {
				getEmpleadoObra().periodoEmpleadoEnObras.remove(this);
			}
			setORM_EmpleadoObra(empleadoObra);
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().periodoEmpleadoEnObras.remove(this);
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
		if (key == ORMConstants.KEY_PERIODOEMPLEADOENOBRA_JEFEDEOBRA) {
			this.jefeDeObra = (JefeDeObra) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOEMPLEADOENOBRA_ADMINISTRATIVOMANOOBRA) {
			this.administrativoManoObra = (AdministrativoManoDeObra) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOEMPLEADOENOBRA_EMPLEADOOBRA) {
			this.empleadoObra = (EmpleadoObra) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOEMPLEADOENOBRA_OBRA) {
			this.obra = (Obra) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private AdministrativoManoDeObra administrativoManoObra;
	
	public JefeDeObra jefeDeObra;
	
	private java.util.Date fechaInicio;
	
	private java.util.Date fechaFin;
	
	private float coste;
	
	private java.util.Date fechaSolicitud;
	
	private java.util.Date fechaRecepcion;
	
	private EmpleadoObra empleadoObra;
	
	private int empleadoObraId;
	
	private void setEmpleadoObraId(int value) {
		this.empleadoObraId = value;
	}
	
	public int getEmpleadoObraId() {
		return empleadoObraId;
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
	
	/**
	 * Parte proporcional del sueldo correspondiente a la categoría del trabajador en el momento de la asignación
	 */
	public void setCoste(float value) {
		this.coste = value;
	}
	
	/**
	 * Parte proporcional del sueldo correspondiente a la categoría del trabajador en el momento de la asignación
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
	
	public void setJefeDeObra(JefeDeObra value) {
		if (jefeDeObra != null) {
			jefeDeObra.periodoEmpleadoEnObra.remove(this);
		}
		if (value != null) {
			value.periodoEmpleadoEnObra.add(this);
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
	
	public void setAdministrativoManoObra(AdministrativoManoDeObra value) {
		if (administrativoManoObra != null) {
			administrativoManoObra.periodoEmpleadoEnObra.remove(this);
		}
		if (value != null) {
			value.periodoEmpleadoEnObra.add(this);
		}
	}
	
	public AdministrativoManoDeObra getAdministrativoManoObra() {
		return administrativoManoObra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_AdministrativoManoObra(AdministrativoManoDeObra value) {
		this.administrativoManoObra = value;
	}
	
	private AdministrativoManoDeObra getORM_AdministrativoManoObra() {
		return administrativoManoObra;
	}
	
	public void setEmpleadoObra(EmpleadoObra value) {
		if (empleadoObra != null) {
			empleadoObra.periodoEmpleadoEnObras.remove(this);
		}
		if (value != null) {
			value.periodoEmpleadoEnObras.add(this);
		}
	}
	
	public EmpleadoObra getEmpleadoObra() {
		return empleadoObra;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_EmpleadoObra(EmpleadoObra value) {
		this.empleadoObra = value;
	}
	
	private EmpleadoObra getORM_EmpleadoObra() {
		return empleadoObra;
	}
	
	public void setObra(Obra value) {
		if (obra != null) {
			obra.periodoEmpleadoEnObras.remove(this);
		}
		if (value != null) {
			value.periodoEmpleadoEnObras.add(this);
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
	
	public String toString() {
		return String.valueOf(getID() + " " + ((getEmpleadoObra() == null) ? "" : String.valueOf(getEmpleadoObra().getORMID())) + " " + ((getObra() == null) ? "" : String.valueOf(getObra().getORMID())));
	}
	
}
