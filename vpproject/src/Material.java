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

public class Material {
	public Material() {
	}
	
	public static Material loadMaterialByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material getMaterialByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getMaterialByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material getMaterialByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return getMaterialByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Material) session.load(Material.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material getMaterialByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Material) session.get(Material.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Material) session.load(Material.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material getMaterialByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Material) session.get(Material.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterial(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryMaterial(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterial(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return queryMaterial(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material[] listMaterialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listMaterialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material[] listMaterialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return listMaterialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMaterial(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Material as Material");
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
	
	public static List queryMaterial(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Material as Material");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Material", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material[] listMaterialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMaterial(session, condition, orderBy);
			return (Material[]) list.toArray(new Material[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material[] listMaterialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMaterial(session, condition, orderBy, lockMode);
			return (Material[]) list.toArray(new Material[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return loadMaterialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Material[] materials = listMaterialByQuery(session, condition, orderBy);
		if (materials != null && materials.length > 0)
			return materials[0];
		else
			return null;
	}
	
	public static Material loadMaterialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Material[] materials = listMaterialByQuery(session, condition, orderBy, lockMode);
		if (materials != null && materials.length > 0)
			return materials[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMaterialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateMaterialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaterialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiónEconómicaConstructoraPersistentManager.instance().getSession();
			return iterateMaterialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMaterialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Material as Material");
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
	
	public static java.util.Iterator iterateMaterialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Material as Material");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Material", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Material loadMaterialByCriteria(MaterialCriteria materialCriteria) {
		Material[] materials = listMaterialByCriteria(materialCriteria);
		if(materials == null || materials.length == 0) {
			return null;
		}
		return materials[0];
	}
	
	public static Material[] listMaterialByCriteria(MaterialCriteria materialCriteria) {
		return materialCriteria.listMaterial();
	}
	
	public static Material createMaterial() {
		return new Material();
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
			LineaAlbaran[] lLineaAlbaranss = lineaAlbarans.toArray();
			for(int i = 0; i < lLineaAlbaranss.length; i++) {
				lLineaAlbaranss[i].setMaterial(null);
			}
			MaterialParaObra[] lMaterialParaObrass = materialParaObras.toArray();
			for(int i = 0; i < lMaterialParaObrass.length; i++) {
				lMaterialParaObrass[i].setMaterial(null);
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
			LineaAlbaran[] lLineaAlbaranss = lineaAlbarans.toArray();
			for(int i = 0; i < lLineaAlbaranss.length; i++) {
				lLineaAlbaranss[i].setMaterial(null);
			}
			MaterialParaObra[] lMaterialParaObrass = materialParaObras.toArray();
			for(int i = 0; i < lMaterialParaObrass.length; i++) {
				lMaterialParaObrass[i].setMaterial(null);
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
		if (key == ORMConstants.KEY_MATERIAL_LINEAALBARANS) {
			return ORM_lineaAlbarans;
		}
		else if (key == ORMConstants.KEY_MATERIAL_MATERIALPARAOBRAS) {
			return ORM_materialParaObras;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String codigo;
	
	private String descripcion;
	
	private int stockMedio;
	
	private int stockMinimo;
	
	private float precio;
	
	private int stock;
	
	private java.util.Set ORM_lineaAlbarans = new java.util.HashSet();
	
	private java.util.Set ORM_materialParaObras = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCodigo(String value) {
		this.codigo = value;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setStockMedio(int value) {
		this.stockMedio = value;
	}
	
	public int getStockMedio() {
		return stockMedio;
	}
	
	public void setStockMinimo(int value) {
		this.stockMinimo = value;
	}
	
	public int getStockMinimo() {
		return stockMinimo;
	}
	
	/**
	 * El precio del Material.
	 * 
	 * Si viene un nuevo material con un precio diferente se hace lo siguiente:
	 * Si el nuevo precio es mayor que el del almacén, entonces el precio pasará a ser el de la nueva compra.
	 * Si el nuevo precio es menor entonces se queda con el anterior.
	 *  
	 */
	public void setPrecio(float value) {
		this.precio = value;
	}
	
	/**
	 * El precio del Material.
	 * 
	 * Si viene un nuevo material con un precio diferente se hace lo siguiente:
	 * Si el nuevo precio es mayor que el del almacén, entonces el precio pasará a ser el de la nueva compra.
	 * Si el nuevo precio es menor entonces se queda con el anterior.
	 *  
	 */
	public float getPrecio() {
		return precio;
	}
	
	public void setStock(int value) {
		this.stock = value;
	}
	
	public int getStock() {
		return stock;
	}
	
	public Albaran[] getAlbarans() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = lineaAlbarans.getIterator();lIter.hasNext();) {
			lValues.add(((LineaAlbaran)lIter.next()).getAlbaran());
		}
		return (Albaran[])lValues.toArray(new Albaran[lValues.size()]);
	}
	
	public void removeAlbaran(Albaran aAlbaran) {
		LineaAlbaran[] lLineaAlbarans = lineaAlbarans.toArray();
		for(int i = 0; i < lLineaAlbarans.length; i++) {
			if(lLineaAlbarans[i].getAlbaran().equals(aAlbaran)) {
				lineaAlbarans.remove(lLineaAlbarans[i]);
			}
		}
	}
	
	public void addAlbaran(LineaAlbaran aLineaAlbaran, Albaran aAlbaran) {
		aLineaAlbaran.setAlbaran(aAlbaran);
		lineaAlbarans.add(aLineaAlbaran);
	}
	
	public LineaAlbaran getLineaAlbaranByAlbaran(Albaran aAlbaran) {
		LineaAlbaran[] lLineaAlbarans = lineaAlbarans.toArray();
		for(int i = 0; i < lLineaAlbarans.length; i++) {
			if(lLineaAlbarans[i].getAlbaran().equals(aAlbaran)) {
				return lLineaAlbarans[i];
			}
		}
		return null;
	}
	
	private void setORM_LineaAlbarans(java.util.Set value) {
		this.ORM_lineaAlbarans = value;
	}
	
	private java.util.Set getORM_LineaAlbarans() {
		return ORM_lineaAlbarans;
	}
	
	public final LineaAlbaranSetCollection lineaAlbarans = new LineaAlbaranSetCollection(this, _ormAdapter, ORMConstants.KEY_MATERIAL_LINEAALBARANS, ORMConstants.KEY_LINEAALBARAN_MATERIAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Obra[] getObras() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = materialParaObras.getIterator();lIter.hasNext();) {
			lValues.add(((MaterialParaObra)lIter.next()).getObra());
		}
		return (Obra[])lValues.toArray(new Obra[lValues.size()]);
	}
	
	public void removeObra(Obra aObra) {
		MaterialParaObra[] lMaterialParaObras = materialParaObras.toArray();
		for(int i = 0; i < lMaterialParaObras.length; i++) {
			if(lMaterialParaObras[i].getObra().equals(aObra)) {
				materialParaObras.remove(lMaterialParaObras[i]);
			}
		}
	}
	
	public void addObra(MaterialParaObra aMaterialParaObra, Obra aObra) {
		aMaterialParaObra.setObra(aObra);
		materialParaObras.add(aMaterialParaObra);
	}
	
	public MaterialParaObra getMaterialParaObraByObra(Obra aObra) {
		MaterialParaObra[] lMaterialParaObras = materialParaObras.toArray();
		for(int i = 0; i < lMaterialParaObras.length; i++) {
			if(lMaterialParaObras[i].getObra().equals(aObra)) {
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
	
	public final MaterialParaObraSetCollection materialParaObras = new MaterialParaObraSetCollection(this, _ormAdapter, ORMConstants.KEY_MATERIAL_MATERIALPARAOBRAS, ORMConstants.KEY_MATERIALPARAOBRA_MATERIAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
