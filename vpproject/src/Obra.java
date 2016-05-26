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

public class Obra {
	public Obra() {
	}
	
	public static Obra loadObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra getObraByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getObraByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra getObraByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getObraByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Obra) session.load(Obra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra getObraByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Obra) session.get(Obra.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Obra) session.load(Obra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra getObraByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Obra) session.get(Obra.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryObra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryObra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryObra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryObra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra[] listObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra[] listObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryObra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Obra as Obra");
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
	
	public static List queryObra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Obra as Obra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Obra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra[] listObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryObra(session, condition, orderBy);
			return (Obra[]) list.toArray(new Obra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra[] listObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryObra(session, condition, orderBy, lockMode);
			return (Obra[]) list.toArray(new Obra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Obra[] obras = listObraByQuery(session, condition, orderBy);
		if (obras != null && obras.length > 0)
			return obras[0];
		else
			return null;
	}
	
	public static Obra loadObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Obra[] obras = listObraByQuery(session, condition, orderBy, lockMode);
		if (obras != null && obras.length > 0)
			return obras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateObraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateObraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateObraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateObraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateObraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Obra as Obra");
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
	
	public static java.util.Iterator iterateObraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Obra as Obra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Obra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Obra loadObraByCriteria(ObraCriteria obraCriteria) {
		Obra[] obras = listObraByCriteria(obraCriteria);
		if(obras == null || obras.length == 0) {
			return null;
		}
		return obras[0];
	}
	
	public static Obra[] listObraByCriteria(ObraCriteria obraCriteria) {
		return obraCriteria.listObra();
	}
	
	public static Obra createObra() {
		return new Obra();
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
			PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObrass = periodoJefeObraEnObras.toArray();
			for(int i = 0; i < lPeriodoJefeObraEnObrass.length; i++) {
				lPeriodoJefeObraEnObrass[i].setObra(null);
			}
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObrass = periodoEmpleadoEnObras.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObrass.length; i++) {
				lPeriodoEmpleadoEnObrass[i].setObra(null);
			}
			MaterialParaObra[] lMaterialParaObrass = materialParaObras.toArray();
			for(int i = 0; i < lMaterialParaObrass.length; i++) {
				lMaterialParaObrass[i].setObra(null);
			}
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObrass = periodoMaquinariaEnObras.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObrass.length; i++) {
				lPeriodoMaquinariaEnObrass[i].setObra(null);
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
				lPeriodoJefeObraEnObrass[i].setObra(null);
			}
			PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObrass = periodoEmpleadoEnObras.toArray();
			for(int i = 0; i < lPeriodoEmpleadoEnObrass.length; i++) {
				lPeriodoEmpleadoEnObrass[i].setObra(null);
			}
			MaterialParaObra[] lMaterialParaObrass = materialParaObras.toArray();
			for(int i = 0; i < lMaterialParaObrass.length; i++) {
				lMaterialParaObrass[i].setObra(null);
			}
			PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObrass = periodoMaquinariaEnObras.toArray();
			for(int i = 0; i < lPeriodoMaquinariaEnObrass.length; i++) {
				lPeriodoMaquinariaEnObrass[i].setObra(null);
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
		if (key == ORMConstants.KEY_OBRA_PERIODOJEFEOBRAENOBRAS) {
			return ORM_periodoJefeObraEnObras;
		}
		else if (key == ORMConstants.KEY_OBRA_PERIODOEMPLEADOENOBRAS) {
			return ORM_periodoEmpleadoEnObras;
		}
		else if (key == ORMConstants.KEY_OBRA_MATERIALPARAOBRAS) {
			return ORM_materialParaObras;
		}
		else if (key == ORMConstants.KEY_OBRA_PERIODOMAQUINARIAENOBRAS) {
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
	
	private java.util.Date fechaInicio;
	
	private java.util.Date fechaFin;
	
	private String direccion;
	
	private float presupuestoTotalEjecucion;
	
	private float estimacionCosteMateriales;
	
	private float estimacionCosteManoDeObra;
	
	private float estimacionGastosGenerales;
	
	private float estimacionBeneficioIndustrial;
	
	private float porcentajeDeObraEjecutado;
	
	private float cantidadCobrada;
	
	private float cantidadFacturada;
	
	private java.util.Set ORM_periodoJefeObraEnObras = new java.util.HashSet();
	
	private java.util.Set ORM_periodoEmpleadoEnObras = new java.util.HashSet();
	
	private java.util.Set ORM_materialParaObras = new java.util.HashSet();
	
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
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setPresupuestoTotalEjecucion(float value) {
		this.presupuestoTotalEjecucion = value;
	}
	
	public float getPresupuestoTotalEjecucion() {
		return presupuestoTotalEjecucion;
	}
	
	public void setEstimacionCosteMateriales(float value) {
		this.estimacionCosteMateriales = value;
	}
	
	public float getEstimacionCosteMateriales() {
		return estimacionCosteMateriales;
	}
	
	public void setEstimacionCosteManoDeObra(float value) {
		this.estimacionCosteManoDeObra = value;
	}
	
	public float getEstimacionCosteManoDeObra() {
		return estimacionCosteManoDeObra;
	}
	
	public void setEstimacionGastosGenerales(float value) {
		this.estimacionGastosGenerales = value;
	}
	
	public float getEstimacionGastosGenerales() {
		return estimacionGastosGenerales;
	}
	
	public void setEstimacionBeneficioIndustrial(float value) {
		this.estimacionBeneficioIndustrial = value;
	}
	
	public float getEstimacionBeneficioIndustrial() {
		return estimacionBeneficioIndustrial;
	}
	
	public void setPorcentajeDeObraEjecutado(float value) {
		this.porcentajeDeObraEjecutado = value;
	}
	
	public float getPorcentajeDeObraEjecutado() {
		return porcentajeDeObraEjecutado;
	}
	
	public void setCantidadCobrada(float value) {
		this.cantidadCobrada = value;
	}
	
	public float getCantidadCobrada() {
		return cantidadCobrada;
	}
	
	public void setCantidadFacturada(float value) {
		this.cantidadFacturada = value;
	}
	
	public float getCantidadFacturada() {
		return cantidadFacturada;
	}
	
	public JefeDeObra[] getJefeDeObras() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = periodoJefeObraEnObras.getIterator();lIter.hasNext();) {
			lValues.add(((PeriodoJefeObraEnObra)lIter.next()).getJefeDeObra());
		}
		return (JefeDeObra[])lValues.toArray(new JefeDeObra[lValues.size()]);
	}
	
	public void removeJefeDeObra(JefeDeObra aJefeDeObra) {
		PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObras = periodoJefeObraEnObras.toArray();
		for(int i = 0; i < lPeriodoJefeObraEnObras.length; i++) {
			if(lPeriodoJefeObraEnObras[i].getJefeDeObra().equals(aJefeDeObra)) {
				periodoJefeObraEnObras.remove(lPeriodoJefeObraEnObras[i]);
			}
		}
	}
	
	public void addJefeDeObra(PeriodoJefeObraEnObra aPeriodoJefeObraEnObra, JefeDeObra aJefeDeObra) {
		aPeriodoJefeObraEnObra.setJefeDeObra(aJefeDeObra);
		periodoJefeObraEnObras.add(aPeriodoJefeObraEnObra);
	}
	
	public PeriodoJefeObraEnObra getPeriodoJefeObraEnObraByJefeDeObra(JefeDeObra aJefeDeObra) {
		PeriodoJefeObraEnObra[] lPeriodoJefeObraEnObras = periodoJefeObraEnObras.toArray();
		for(int i = 0; i < lPeriodoJefeObraEnObras.length; i++) {
			if(lPeriodoJefeObraEnObras[i].getJefeDeObra().equals(aJefeDeObra)) {
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
	
	public final PeriodoJefeObraEnObraSetCollection periodoJefeObraEnObras = new PeriodoJefeObraEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_OBRA_PERIODOJEFEOBRAENOBRAS, ORMConstants.KEY_PERIODOJEFEOBRAENOBRA_OBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public EmpleadoObra[] getEmpleadoObras() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = periodoEmpleadoEnObras.getIterator();lIter.hasNext();) {
			lValues.add(((PeriodoEmpleadoEnObra)lIter.next()).getEmpleadoObra());
		}
		return (EmpleadoObra[])lValues.toArray(new EmpleadoObra[lValues.size()]);
	}
	
	public void removeEmpleadoObra(EmpleadoObra aEmpleadoObra) {
		PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObras.toArray();
		for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
			if(lPeriodoEmpleadoEnObras[i].getEmpleadoObra().equals(aEmpleadoObra)) {
				periodoEmpleadoEnObras.remove(lPeriodoEmpleadoEnObras[i]);
			}
		}
	}
	
	public void addEmpleadoObra(PeriodoEmpleadoEnObra aPeriodoEmpleadoEnObra, EmpleadoObra aEmpleadoObra) {
		aPeriodoEmpleadoEnObra.setEmpleadoObra(aEmpleadoObra);
		periodoEmpleadoEnObras.add(aPeriodoEmpleadoEnObra);
	}
	
	public PeriodoEmpleadoEnObra getPeriodoEmpleadoEnObraByEmpleadoObra(EmpleadoObra aEmpleadoObra) {
		PeriodoEmpleadoEnObra[] lPeriodoEmpleadoEnObras = periodoEmpleadoEnObras.toArray();
		for(int i = 0; i < lPeriodoEmpleadoEnObras.length; i++) {
			if(lPeriodoEmpleadoEnObras[i].getEmpleadoObra().equals(aEmpleadoObra)) {
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
	
	public final PeriodoEmpleadoEnObraSetCollection periodoEmpleadoEnObras = new PeriodoEmpleadoEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_OBRA_PERIODOEMPLEADOENOBRAS, ORMConstants.KEY_PERIODOEMPLEADOENOBRA_OBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Material[] getMaterials() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = materialParaObras.getIterator();lIter.hasNext();) {
			lValues.add(((MaterialParaObra)lIter.next()).getMaterial());
		}
		return (Material[])lValues.toArray(new Material[lValues.size()]);
	}
	
	public void removeMaterial(Material aMaterial) {
		MaterialParaObra[] lMaterialParaObras = materialParaObras.toArray();
		for(int i = 0; i < lMaterialParaObras.length; i++) {
			if(lMaterialParaObras[i].getMaterial().equals(aMaterial)) {
				materialParaObras.remove(lMaterialParaObras[i]);
			}
		}
	}
	
	public void addMaterial(MaterialParaObra aMaterialParaObra, Material aMaterial) {
		aMaterialParaObra.setMaterial(aMaterial);
		materialParaObras.add(aMaterialParaObra);
	}
	
	public MaterialParaObra getMaterialParaObraByMaterial(Material aMaterial) {
		MaterialParaObra[] lMaterialParaObras = materialParaObras.toArray();
		for(int i = 0; i < lMaterialParaObras.length; i++) {
			if(lMaterialParaObras[i].getMaterial().equals(aMaterial)) {
				return lMaterialParaObras[i];
			}
		}
		return null;
	}
	
	private void setORM_MaterialParaObras(java.util.Set value) {
		this.ORM_materialParaObras = value;
	}
	
	private java.util.Set getORM_MaterialParaObras() {
		return ORM_materialParaObras;
	}
	
	public final MaterialParaObraSetCollection materialParaObras = new MaterialParaObraSetCollection(this, _ormAdapter, ORMConstants.KEY_OBRA_MATERIALPARAOBRAS, ORMConstants.KEY_MATERIALPARAOBRA_OBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Maquinaria[] getMaquinarias() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = periodoMaquinariaEnObras.getIterator();lIter.hasNext();) {
			lValues.add(((PeriodoMaquinariaEnObra)lIter.next()).getMaquinaria());
		}
		return (Maquinaria[])lValues.toArray(new Maquinaria[lValues.size()]);
	}
	
	public void removeMaquinaria(Maquinaria aMaquinaria) {
		PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObras.toArray();
		for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
			if(lPeriodoMaquinariaEnObras[i].getMaquinaria().equals(aMaquinaria)) {
				periodoMaquinariaEnObras.remove(lPeriodoMaquinariaEnObras[i]);
			}
		}
	}
	
	public void addMaquinaria(PeriodoMaquinariaEnObra aPeriodoMaquinariaEnObra, Maquinaria aMaquinaria) {
		aPeriodoMaquinariaEnObra.setMaquinaria(aMaquinaria);
		periodoMaquinariaEnObras.add(aPeriodoMaquinariaEnObra);
	}
	
	public PeriodoMaquinariaEnObra getPeriodoMaquinariaEnObraByMaquinaria(Maquinaria aMaquinaria) {
		PeriodoMaquinariaEnObra[] lPeriodoMaquinariaEnObras = periodoMaquinariaEnObras.toArray();
		for(int i = 0; i < lPeriodoMaquinariaEnObras.length; i++) {
			if(lPeriodoMaquinariaEnObras[i].getMaquinaria().equals(aMaquinaria)) {
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
	
	public final PeriodoMaquinariaEnObraSetCollection periodoMaquinariaEnObras = new PeriodoMaquinariaEnObraSetCollection(this, _ormAdapter, ORMConstants.KEY_OBRA_PERIODOMAQUINARIAENOBRAS, ORMConstants.KEY_PERIODOMAQUINARIAENOBRA_OBRA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
