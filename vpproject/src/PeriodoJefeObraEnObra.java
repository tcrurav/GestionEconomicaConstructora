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
public class PeriodoJefeObraEnObra implements Serializable {
	public PeriodoJefeObraEnObra() {
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByORMID(int ID, JefeDeObra jefeDeObra, Obra obra) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoJefeObraEnObraByORMID(session, ID, jefeDeObra, obra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra getPeriodoJefeObraEnObraByORMID(int ID, JefeDeObra jefeDeObra, Obra obra) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getPeriodoJefeObraEnObraByORMID(session, ID, jefeDeObra, obra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByORMID(int ID, JefeDeObra jefeDeObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoJefeObraEnObraByORMID(session, ID, jefeDeObra, obra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra getPeriodoJefeObraEnObraByORMID(int ID, JefeDeObra jefeDeObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getPeriodoJefeObraEnObraByORMID(session, ID, jefeDeObra, obra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByORMID(PersistentSession session, int ID, JefeDeObra jefeDeObra, Obra obra) throws PersistentException {
		try {
			PeriodoJefeObraEnObra periodojefeobraenobra = new PeriodoJefeObraEnObra();
			periodojefeobraenobra.setID(ID);
			periodojefeobraenobra.setORM_JefeDeObra(jefeDeObra);
			periodojefeobraenobra.setORM_Obra(obra);
			
			return (PeriodoJefeObraEnObra) session.load(PeriodoJefeObraEnObra.class, periodojefeobraenobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra getPeriodoJefeObraEnObraByORMID(PersistentSession session, int ID, JefeDeObra jefeDeObra, Obra obra) throws PersistentException {
		try {
			PeriodoJefeObraEnObra periodojefeobraenobra = new PeriodoJefeObraEnObra();
			periodojefeobraenobra.setID(ID);
			periodojefeobraenobra.setORM_JefeDeObra(jefeDeObra);
			periodojefeobraenobra.setORM_Obra(obra);
			
			return (PeriodoJefeObraEnObra) session.get(PeriodoJefeObraEnObra.class, periodojefeobraenobra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByORMID(PersistentSession session, int ID, JefeDeObra jefeDeObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PeriodoJefeObraEnObra periodojefeobraenobra = new PeriodoJefeObraEnObra();
			periodojefeobraenobra.setID(ID);
			periodojefeobraenobra.setORM_JefeDeObra(jefeDeObra);
			periodojefeobraenobra.setORM_Obra(obra);
			
			return (PeriodoJefeObraEnObra) session.load(PeriodoJefeObraEnObra.class, periodojefeobraenobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra getPeriodoJefeObraEnObraByORMID(PersistentSession session, int ID, JefeDeObra jefeDeObra, Obra obra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PeriodoJefeObraEnObra periodojefeobraenobra = new PeriodoJefeObraEnObra();
			periodojefeobraenobra.setID(ID);
			periodojefeobraenobra.setORM_JefeDeObra(jefeDeObra);
			periodojefeobraenobra.setORM_Obra(obra);
			
			return (PeriodoJefeObraEnObra) session.get(PeriodoJefeObraEnObra.class, periodojefeobraenobra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoJefeObraEnObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryPeriodoJefeObraEnObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoJefeObraEnObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryPeriodoJefeObraEnObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listPeriodoJefeObraEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listPeriodoJefeObraEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPeriodoJefeObraEnObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoJefeObraEnObra as PeriodoJefeObraEnObra");
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
	
	public static List queryPeriodoJefeObraEnObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoJefeObraEnObra as PeriodoJefeObraEnObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PeriodoJefeObraEnObra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPeriodoJefeObraEnObra(session, condition, orderBy);
			return (PeriodoJefeObraEnObra[]) list.toArray(new PeriodoJefeObraEnObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPeriodoJefeObraEnObra(session, condition, orderBy, lockMode);
			return (PeriodoJefeObraEnObra[]) list.toArray(new PeriodoJefeObraEnObra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoJefeObraEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadPeriodoJefeObraEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PeriodoJefeObraEnObra[] periodoJefeObraEnObras = listPeriodoJefeObraEnObraByQuery(session, condition, orderBy);
		if (periodoJefeObraEnObras != null && periodoJefeObraEnObras.length > 0)
			return periodoJefeObraEnObras[0];
		else
			return null;
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PeriodoJefeObraEnObra[] periodoJefeObraEnObras = listPeriodoJefeObraEnObraByQuery(session, condition, orderBy, lockMode);
		if (periodoJefeObraEnObras != null && periodoJefeObraEnObras.length > 0)
			return periodoJefeObraEnObras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePeriodoJefeObraEnObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iteratePeriodoJefeObraEnObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodoJefeObraEnObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iteratePeriodoJefeObraEnObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePeriodoJefeObraEnObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoJefeObraEnObra as PeriodoJefeObraEnObra");
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
	
	public static java.util.Iterator iteratePeriodoJefeObraEnObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From PeriodoJefeObraEnObra as PeriodoJefeObraEnObra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PeriodoJefeObraEnObra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PeriodoJefeObraEnObra loadPeriodoJefeObraEnObraByCriteria(PeriodoJefeObraEnObraCriteria periodoJefeObraEnObraCriteria) {
		PeriodoJefeObraEnObra[] periodoJefeObraEnObras = listPeriodoJefeObraEnObraByCriteria(periodoJefeObraEnObraCriteria);
		if(periodoJefeObraEnObras == null || periodoJefeObraEnObras.length == 0) {
			return null;
		}
		return periodoJefeObraEnObras[0];
	}
	
	public static PeriodoJefeObraEnObra[] listPeriodoJefeObraEnObraByCriteria(PeriodoJefeObraEnObraCriteria periodoJefeObraEnObraCriteria) {
		return periodoJefeObraEnObraCriteria.listPeriodoJefeObraEnObra();
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof PeriodoJefeObraEnObra))
			return false;
		PeriodoJefeObraEnObra periodojefeobraenobra = (PeriodoJefeObraEnObra)aObj;
		if (getID() != periodojefeobraenobra.getID())
			return false;
		if (getJefeDeObra() == null) {
			if (periodojefeobraenobra.getJefeDeObra() != null)
				return false;
		}
		else if (!getJefeDeObra().equals(periodojefeobraenobra.getJefeDeObra()))
			return false;
		if (getObra() == null) {
			if (periodojefeobraenobra.getObra() != null)
				return false;
		}
		else if (!getObra().equals(periodojefeobraenobra.getObra()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getJefeDeObra() != null) {
			hashcode = hashcode + (int) getJefeDeObra().getORMID();
		}
		if (getObra() != null) {
			hashcode = hashcode + (int) getObra().getORMID();
		}
		return hashcode;
	}
	
	public static PeriodoJefeObraEnObra createPeriodoJefeObraEnObra() {
		return new PeriodoJefeObraEnObra();
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
			JefeDeObra jefeDeObra = getJefeDeObra();
			if(getJefeDeObra() != null) {
				getJefeDeObra().periodoJefeObraEnObras.remove(this);
			}
			setORM_JefeDeObra(jefeDeObra);
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().periodoJefeObraEnObras.remove(this);
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
			JefeDeObra jefeDeObra = getJefeDeObra();
			if(getJefeDeObra() != null) {
				getJefeDeObra().periodoJefeObraEnObras.remove(this);
			}
			setORM_JefeDeObra(jefeDeObra);
			
			Obra obra = getObra();
			if(getObra() != null) {
				getObra().periodoJefeObraEnObras.remove(this);
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
		if (key == ORMConstants.KEY_PERIODOJEFEOBRAENOBRA_JEFEDEOBRA) {
			this.jefeDeObra = (JefeDeObra) owner;
		}
		
		else if (key == ORMConstants.KEY_PERIODOJEFEOBRAENOBRA_OBRA) {
			this.obra = (Obra) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private java.util.Date fechaInicio;
	
	private java.util.Date fechaFin;
	
	private float coste;
	
	private JefeDeObra jefeDeObra;
	
	private int jefeDeObraId;
	
	private void setJefeDeObraId(int value) {
		this.jefeDeObraId = value;
	}
	
	public int getJefeDeObraId() {
		return jefeDeObraId;
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
	
	public void setJefeDeObra(JefeDeObra value) {
		if (jefeDeObra != null) {
			jefeDeObra.periodoJefeObraEnObras.remove(this);
		}
		if (value != null) {
			value.periodoJefeObraEnObras.add(this);
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
	
	public void setObra(Obra value) {
		if (obra != null) {
			obra.periodoJefeObraEnObras.remove(this);
		}
		if (value != null) {
			value.periodoJefeObraEnObras.add(this);
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
		return String.valueOf(getID() + " " + ((getJefeDeObra() == null) ? "" : String.valueOf(getJefeDeObra().getORMID())) + " " + ((getObra() == null) ? "" : String.valueOf(getObra().getORMID())));
	}
	
}
