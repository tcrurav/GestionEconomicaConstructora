/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListGestiónEconómicaConstructoraData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Obra...");
		Obra[] obras = Obra.listObraByQuery(null, null);
		int length = Math.min(obras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(obras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona...");
		Persona[] personas = Persona.listPersonaByQuery(null, null);
		length = Math.min(personas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(personas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empleado...");
		Empleado[] empleados = Empleado.listEmpleadoByQuery(null, null);
		length = Math.min(empleados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(empleados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing JefeDeObra...");
		JefeDeObra[] jefeDeObras = JefeDeObra.listJefeDeObraByQuery(null, null);
		length = Math.min(jefeDeObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(jefeDeObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AdministrativoManoDeObra...");
		AdministrativoManoDeObra[] administrativoManoDeObras = AdministrativoManoDeObra.listAdministrativoManoDeObraByQuery(null, null);
		length = Math.min(administrativoManoDeObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(administrativoManoDeObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EmpleadoAlmacen...");
		EmpleadoAlmacen[] empleadoAlmacens = EmpleadoAlmacen.listEmpleadoAlmacenByQuery(null, null);
		length = Math.min(empleadoAlmacens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(empleadoAlmacens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Albaran...");
		Albaran[] albarans = Albaran.listAlbaranByQuery(null, null);
		length = Math.min(albarans.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(albarans[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EmpleadoObra...");
		EmpleadoObra[] empleadoObras = EmpleadoObra.listEmpleadoObraByQuery(null, null);
		length = Math.min(empleadoObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(empleadoObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Maquinaria...");
		Maquinaria[] maquinarias = Maquinaria.listMaquinariaByQuery(null, null);
		length = Math.min(maquinarias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(maquinarias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PeriodoEmpleadoEnObra...");
		PeriodoEmpleadoEnObra[] periodoEmpleadoEnObras = PeriodoEmpleadoEnObra.listPeriodoEmpleadoEnObraByQuery(null, null);
		length = Math.min(periodoEmpleadoEnObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(periodoEmpleadoEnObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Proveedor...");
		Proveedor[] proveedors = Proveedor.listProveedorByQuery(null, null);
		length = Math.min(proveedors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(proveedors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MaterialParaObra...");
		MaterialParaObra[] materialParaObras = MaterialParaObra.listMaterialParaObraByQuery(null, null);
		length = Math.min(materialParaObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(materialParaObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PeriodoJefeObraEnObra...");
		PeriodoJefeObraEnObra[] periodoJefeObraEnObras = PeriodoJefeObraEnObra.listPeriodoJefeObraEnObraByQuery(null, null);
		length = Math.min(periodoJefeObraEnObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(periodoJefeObraEnObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PeriodoMaquinariaEnObra...");
		PeriodoMaquinariaEnObra[] periodoMaquinariaEnObras = PeriodoMaquinariaEnObra.listPeriodoMaquinariaEnObraByQuery(null, null);
		length = Math.min(periodoMaquinariaEnObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(periodoMaquinariaEnObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Material...");
		Material[] materials = Material.listMaterialByQuery(null, null);
		length = Math.min(materials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(materials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing AdministrativoObra...");
		AdministrativoObra[] administrativoObras = AdministrativoObra.listAdministrativoObraByQuery(null, null);
		length = Math.min(administrativoObras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(administrativoObras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		Categoria[] categorias = Categoria.listCategoriaByQuery(null, null);
		length = Math.min(categorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(categorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing LineaAlbaran...");
		LineaAlbaran[] lineaAlbarans = LineaAlbaran.listLineaAlbaranByQuery(null, null);
		length = Math.min(lineaAlbarans.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lineaAlbarans[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Obra by Criteria...");
		ObraCriteria obraCriteria = new ObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//obraCriteria.ID.eq();
		obraCriteria.setMaxResults(ROW_COUNT);
		Obra[] obras = obraCriteria.listObra();
		int length =obras== null ? 0 : Math.min(obras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(obras[i]);
		}
		System.out.println(length + " Obra record(s) retrieved."); 
		
		System.out.println("Listing Persona by Criteria...");
		PersonaCriteria personaCriteria = new PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//personaCriteria.ID.eq();
		personaCriteria.setMaxResults(ROW_COUNT);
		Persona[] personas = personaCriteria.listPersona();
		length =personas== null ? 0 : Math.min(personas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(personas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing Empleado by Criteria...");
		EmpleadoCriteria empleadoCriteria = new EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//empleadoCriteria.ID.eq();
		empleadoCriteria.setMaxResults(ROW_COUNT);
		Empleado[] empleados = empleadoCriteria.listEmpleado();
		length =empleados== null ? 0 : Math.min(empleados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(empleados[i]);
		}
		System.out.println(length + " Empleado record(s) retrieved."); 
		
		System.out.println("Listing JefeDeObra by Criteria...");
		JefeDeObraCriteria jefeDeObraCriteria = new JefeDeObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//jefeDeObraCriteria.ID.eq();
		jefeDeObraCriteria.setMaxResults(ROW_COUNT);
		JefeDeObra[] jefeDeObras = jefeDeObraCriteria.listJefeDeObra();
		length =jefeDeObras== null ? 0 : Math.min(jefeDeObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(jefeDeObras[i]);
		}
		System.out.println(length + " JefeDeObra record(s) retrieved."); 
		
		System.out.println("Listing AdministrativoManoDeObra by Criteria...");
		AdministrativoManoDeObraCriteria administrativoManoDeObraCriteria = new AdministrativoManoDeObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//administrativoManoDeObraCriteria.ID.eq();
		administrativoManoDeObraCriteria.setMaxResults(ROW_COUNT);
		AdministrativoManoDeObra[] administrativoManoDeObras = administrativoManoDeObraCriteria.listAdministrativoManoDeObra();
		length =administrativoManoDeObras== null ? 0 : Math.min(administrativoManoDeObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(administrativoManoDeObras[i]);
		}
		System.out.println(length + " AdministrativoManoDeObra record(s) retrieved."); 
		
		System.out.println("Listing EmpleadoAlmacen by Criteria...");
		EmpleadoAlmacenCriteria empleadoAlmacenCriteria = new EmpleadoAlmacenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//empleadoAlmacenCriteria.ID.eq();
		empleadoAlmacenCriteria.setMaxResults(ROW_COUNT);
		EmpleadoAlmacen[] empleadoAlmacens = empleadoAlmacenCriteria.listEmpleadoAlmacen();
		length =empleadoAlmacens== null ? 0 : Math.min(empleadoAlmacens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(empleadoAlmacens[i]);
		}
		System.out.println(length + " EmpleadoAlmacen record(s) retrieved."); 
		
		System.out.println("Listing Albaran by Criteria...");
		AlbaranCriteria albaranCriteria = new AlbaranCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//albaranCriteria.ID.eq();
		albaranCriteria.setMaxResults(ROW_COUNT);
		Albaran[] albarans = albaranCriteria.listAlbaran();
		length =albarans== null ? 0 : Math.min(albarans.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(albarans[i]);
		}
		System.out.println(length + " Albaran record(s) retrieved."); 
		
		System.out.println("Listing EmpleadoObra by Criteria...");
		EmpleadoObraCriteria empleadoObraCriteria = new EmpleadoObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//empleadoObraCriteria.ID.eq();
		empleadoObraCriteria.setMaxResults(ROW_COUNT);
		EmpleadoObra[] empleadoObras = empleadoObraCriteria.listEmpleadoObra();
		length =empleadoObras== null ? 0 : Math.min(empleadoObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(empleadoObras[i]);
		}
		System.out.println(length + " EmpleadoObra record(s) retrieved."); 
		
		System.out.println("Listing Maquinaria by Criteria...");
		MaquinariaCriteria maquinariaCriteria = new MaquinariaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//maquinariaCriteria.ID.eq();
		maquinariaCriteria.setMaxResults(ROW_COUNT);
		Maquinaria[] maquinarias = maquinariaCriteria.listMaquinaria();
		length =maquinarias== null ? 0 : Math.min(maquinarias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(maquinarias[i]);
		}
		System.out.println(length + " Maquinaria record(s) retrieved."); 
		
		System.out.println("Listing PeriodoEmpleadoEnObra by Criteria...");
		PeriodoEmpleadoEnObraCriteria periodoEmpleadoEnObraCriteria = new PeriodoEmpleadoEnObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//periodoEmpleadoEnObraCriteria.ID.eq();
		//EmpleadoObraCriteria periodoEmpleadoEnObraCriteria_EmpleadoObra = periodoEmpleadoEnObraCriteria.createEmpleadoObraCriteria();
		//periodoEmpleadoEnObraCriteria_EmpleadoObra.ID.eq();
		//ObraCriteria periodoEmpleadoEnObraCriteria_Obra = periodoEmpleadoEnObraCriteria.createObraCriteria();
		//periodoEmpleadoEnObraCriteria_Obra.ID.eq();
		periodoEmpleadoEnObraCriteria.setMaxResults(ROW_COUNT);
		PeriodoEmpleadoEnObra[] periodoEmpleadoEnObras = periodoEmpleadoEnObraCriteria.listPeriodoEmpleadoEnObra();
		length =periodoEmpleadoEnObras== null ? 0 : Math.min(periodoEmpleadoEnObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(periodoEmpleadoEnObras[i]);
		}
		System.out.println(length + " PeriodoEmpleadoEnObra record(s) retrieved."); 
		
		System.out.println("Listing Proveedor by Criteria...");
		ProveedorCriteria proveedorCriteria = new ProveedorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//proveedorCriteria.ID.eq();
		proveedorCriteria.setMaxResults(ROW_COUNT);
		Proveedor[] proveedors = proveedorCriteria.listProveedor();
		length =proveedors== null ? 0 : Math.min(proveedors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(proveedors[i]);
		}
		System.out.println(length + " Proveedor record(s) retrieved."); 
		
		System.out.println("Listing MaterialParaObra by Criteria...");
		MaterialParaObraCriteria materialParaObraCriteria = new MaterialParaObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//materialParaObraCriteria.ID.eq();
		//MaterialCriteria materialParaObraCriteria_Material = materialParaObraCriteria.createMaterialCriteria();
		//materialParaObraCriteria_Material.ID.eq();
		//ObraCriteria materialParaObraCriteria_Obra = materialParaObraCriteria.createObraCriteria();
		//materialParaObraCriteria_Obra.ID.eq();
		materialParaObraCriteria.setMaxResults(ROW_COUNT);
		MaterialParaObra[] materialParaObras = materialParaObraCriteria.listMaterialParaObra();
		length =materialParaObras== null ? 0 : Math.min(materialParaObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(materialParaObras[i]);
		}
		System.out.println(length + " MaterialParaObra record(s) retrieved."); 
		
		System.out.println("Listing PeriodoJefeObraEnObra by Criteria...");
		PeriodoJefeObraEnObraCriteria periodoJefeObraEnObraCriteria = new PeriodoJefeObraEnObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//periodoJefeObraEnObraCriteria.ID.eq();
		//JefeDeObraCriteria periodoJefeObraEnObraCriteria_JefeDeObra = periodoJefeObraEnObraCriteria.createJefeDeObraCriteria();
		//periodoJefeObraEnObraCriteria_JefeDeObra.ID.eq();
		//ObraCriteria periodoJefeObraEnObraCriteria_Obra = periodoJefeObraEnObraCriteria.createObraCriteria();
		//periodoJefeObraEnObraCriteria_Obra.ID.eq();
		periodoJefeObraEnObraCriteria.setMaxResults(ROW_COUNT);
		PeriodoJefeObraEnObra[] periodoJefeObraEnObras = periodoJefeObraEnObraCriteria.listPeriodoJefeObraEnObra();
		length =periodoJefeObraEnObras== null ? 0 : Math.min(periodoJefeObraEnObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(periodoJefeObraEnObras[i]);
		}
		System.out.println(length + " PeriodoJefeObraEnObra record(s) retrieved."); 
		
		System.out.println("Listing PeriodoMaquinariaEnObra by Criteria...");
		PeriodoMaquinariaEnObraCriteria periodoMaquinariaEnObraCriteria = new PeriodoMaquinariaEnObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//periodoMaquinariaEnObraCriteria.ID.eq();
		//ObraCriteria periodoMaquinariaEnObraCriteria_Obra = periodoMaquinariaEnObraCriteria.createObraCriteria();
		//periodoMaquinariaEnObraCriteria_Obra.ID.eq();
		//MaquinariaCriteria periodoMaquinariaEnObraCriteria_Maquinaria = periodoMaquinariaEnObraCriteria.createMaquinariaCriteria();
		//periodoMaquinariaEnObraCriteria_Maquinaria.ID.eq();
		periodoMaquinariaEnObraCriteria.setMaxResults(ROW_COUNT);
		PeriodoMaquinariaEnObra[] periodoMaquinariaEnObras = periodoMaquinariaEnObraCriteria.listPeriodoMaquinariaEnObra();
		length =periodoMaquinariaEnObras== null ? 0 : Math.min(periodoMaquinariaEnObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(periodoMaquinariaEnObras[i]);
		}
		System.out.println(length + " PeriodoMaquinariaEnObra record(s) retrieved."); 
		
		System.out.println("Listing Material by Criteria...");
		MaterialCriteria materialCriteria = new MaterialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//materialCriteria.ID.eq();
		materialCriteria.setMaxResults(ROW_COUNT);
		Material[] materials = materialCriteria.listMaterial();
		length =materials== null ? 0 : Math.min(materials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(materials[i]);
		}
		System.out.println(length + " Material record(s) retrieved."); 
		
		System.out.println("Listing AdministrativoObra by Criteria...");
		AdministrativoObraCriteria administrativoObraCriteria = new AdministrativoObraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//administrativoObraCriteria.ID.eq();
		administrativoObraCriteria.setMaxResults(ROW_COUNT);
		AdministrativoObra[] administrativoObras = administrativoObraCriteria.listAdministrativoObra();
		length =administrativoObras== null ? 0 : Math.min(administrativoObras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(administrativoObras[i]);
		}
		System.out.println(length + " AdministrativoObra record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		CategoriaCriteria categoriaCriteria = new CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//categoriaCriteria.ID.eq();
		categoriaCriteria.setMaxResults(ROW_COUNT);
		Categoria[] categorias = categoriaCriteria.listCategoria();
		length =categorias== null ? 0 : Math.min(categorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(categorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing LineaAlbaran by Criteria...");
		LineaAlbaranCriteria lineaAlbaranCriteria = new LineaAlbaranCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lineaAlbaranCriteria.ID.eq();
		//AlbaranCriteria lineaAlbaranCriteria_Albaran = lineaAlbaranCriteria.createAlbaranCriteria();
		//lineaAlbaranCriteria_Albaran.ID.eq();
		//MaterialCriteria lineaAlbaranCriteria_Material = lineaAlbaranCriteria.createMaterialCriteria();
		//lineaAlbaranCriteria_Material.ID.eq();
		lineaAlbaranCriteria.setMaxResults(ROW_COUNT);
		LineaAlbaran[] lineaAlbarans = lineaAlbaranCriteria.listLineaAlbaran();
		length =lineaAlbarans== null ? 0 : Math.min(lineaAlbarans.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(lineaAlbarans[i]);
		}
		System.out.println(length + " LineaAlbaran record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListGestiónEconómicaConstructoraData listGestiónEconómicaConstructoraData = new ListGestiónEconómicaConstructoraData();
			try {
				listGestiónEconómicaConstructoraData.listTestData();
				//listGestiónEconómicaConstructoraData.listByCriteria();
			}
			finally {
				GestiónEconómicaConstructoraPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
