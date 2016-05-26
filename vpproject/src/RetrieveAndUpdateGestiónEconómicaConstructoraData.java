/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateGestiónEconómicaConstructoraData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = GestiónEconómicaConstructoraPersistentManager.instance().getSession().beginTransaction();
		try {
			Obra obra = Obra.loadObraByQuery(null, null);
			// Update the properties of the persistent object
			obra.save();
			Persona persona = Persona.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			persona.save();
			Empleado empleado = Empleado.loadEmpleadoByQuery(null, null);
			// Update the properties of the persistent object
			empleado.save();
			JefeDeObra jefeDeObra = JefeDeObra.loadJefeDeObraByQuery(null, null);
			// Update the properties of the persistent object
			jefeDeObra.save();
			AdministrativoManoDeObra administrativoManoDeObra = AdministrativoManoDeObra.loadAdministrativoManoDeObraByQuery(null, null);
			// Update the properties of the persistent object
			administrativoManoDeObra.save();
			EmpleadoAlmacen empleadoAlmacen = EmpleadoAlmacen.loadEmpleadoAlmacenByQuery(null, null);
			// Update the properties of the persistent object
			empleadoAlmacen.save();
			Albaran albaran = Albaran.loadAlbaranByQuery(null, null);
			// Update the properties of the persistent object
			albaran.save();
			EmpleadoObra empleadoObra = EmpleadoObra.loadEmpleadoObraByQuery(null, null);
			// Update the properties of the persistent object
			empleadoObra.save();
			Maquinaria maquinaria = Maquinaria.loadMaquinariaByQuery(null, null);
			// Update the properties of the persistent object
			maquinaria.save();
			PeriodoEmpleadoEnObra periodoEmpleadoEnObra = PeriodoEmpleadoEnObra.loadPeriodoEmpleadoEnObraByQuery(null, null);
			// Update the properties of the persistent object
			periodoEmpleadoEnObra.save();
			Proveedor proveedor = Proveedor.loadProveedorByQuery(null, null);
			// Update the properties of the persistent object
			proveedor.save();
			MaterialParaObra materialParaObra = MaterialParaObra.loadMaterialParaObraByQuery(null, null);
			// Update the properties of the persistent object
			materialParaObra.save();
			PeriodoJefeObraEnObra periodoJefeObraEnObra = PeriodoJefeObraEnObra.loadPeriodoJefeObraEnObraByQuery(null, null);
			// Update the properties of the persistent object
			periodoJefeObraEnObra.save();
			PeriodoMaquinariaEnObra periodoMaquinariaEnObra = PeriodoMaquinariaEnObra.loadPeriodoMaquinariaEnObraByQuery(null, null);
			// Update the properties of the persistent object
			periodoMaquinariaEnObra.save();
			Material material = Material.loadMaterialByQuery(null, null);
			// Update the properties of the persistent object
			material.save();
			AdministrativoObra administrativoObra = AdministrativoObra.loadAdministrativoObraByQuery(null, null);
			// Update the properties of the persistent object
			administrativoObra.save();
			Categoria categoria = Categoria.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			categoria.save();
			LineaAlbaran lineaAlbaran = LineaAlbaran.loadLineaAlbaranByQuery(null, null);
			// Update the properties of the persistent object
			lineaAlbaran.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Obra by ObraCriteria");
		ObraCriteria obraCriteria = new ObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//obraCriteria.ID.eq();
		System.out.println(obraCriteria.uniqueObra());
		
		System.out.println("Retrieving Persona by PersonaCriteria");
		PersonaCriteria personaCriteria = new PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//personaCriteria.ID.eq();
		System.out.println(personaCriteria.uniquePersona());
		
		System.out.println("Retrieving Empleado by EmpleadoCriteria");
		EmpleadoCriteria empleadoCriteria = new EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//empleadoCriteria.ID.eq();
		System.out.println(empleadoCriteria.uniqueEmpleado());
		
		System.out.println("Retrieving JefeDeObra by JefeDeObraCriteria");
		JefeDeObraCriteria jefeDeObraCriteria = new JefeDeObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//jefeDeObraCriteria.ID.eq();
		System.out.println(jefeDeObraCriteria.uniqueJefeDeObra());
		
		System.out.println("Retrieving AdministrativoManoDeObra by AdministrativoManoDeObraCriteria");
		AdministrativoManoDeObraCriteria administrativoManoDeObraCriteria = new AdministrativoManoDeObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//administrativoManoDeObraCriteria.ID.eq();
		System.out.println(administrativoManoDeObraCriteria.uniqueAdministrativoManoDeObra());
		
		System.out.println("Retrieving EmpleadoAlmacen by EmpleadoAlmacenCriteria");
		EmpleadoAlmacenCriteria empleadoAlmacenCriteria = new EmpleadoAlmacenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//empleadoAlmacenCriteria.ID.eq();
		System.out.println(empleadoAlmacenCriteria.uniqueEmpleadoAlmacen());
		
		System.out.println("Retrieving Albaran by AlbaranCriteria");
		AlbaranCriteria albaranCriteria = new AlbaranCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//albaranCriteria.ID.eq();
		System.out.println(albaranCriteria.uniqueAlbaran());
		
		System.out.println("Retrieving EmpleadoObra by EmpleadoObraCriteria");
		EmpleadoObraCriteria empleadoObraCriteria = new EmpleadoObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//empleadoObraCriteria.ID.eq();
		System.out.println(empleadoObraCriteria.uniqueEmpleadoObra());
		
		System.out.println("Retrieving Maquinaria by MaquinariaCriteria");
		MaquinariaCriteria maquinariaCriteria = new MaquinariaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//maquinariaCriteria.ID.eq();
		System.out.println(maquinariaCriteria.uniqueMaquinaria());
		
		System.out.println("Retrieving PeriodoEmpleadoEnObra by PeriodoEmpleadoEnObraCriteria");
		PeriodoEmpleadoEnObraCriteria periodoEmpleadoEnObraCriteria = new PeriodoEmpleadoEnObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//periodoEmpleadoEnObraCriteria.ID.eq();
		//periodoEmpleadoEnObraCriteria.empleadoObra.eq();
		//periodoEmpleadoEnObraCriteria.obra.eq();
		System.out.println(periodoEmpleadoEnObraCriteria.uniquePeriodoEmpleadoEnObra());
		
		System.out.println("Retrieving Proveedor by ProveedorCriteria");
		ProveedorCriteria proveedorCriteria = new ProveedorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//proveedorCriteria.ID.eq();
		System.out.println(proveedorCriteria.uniqueProveedor());
		
		System.out.println("Retrieving MaterialParaObra by MaterialParaObraCriteria");
		MaterialParaObraCriteria materialParaObraCriteria = new MaterialParaObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//materialParaObraCriteria.ID.eq();
		//materialParaObraCriteria.material.eq();
		//materialParaObraCriteria.obra.eq();
		System.out.println(materialParaObraCriteria.uniqueMaterialParaObra());
		
		System.out.println("Retrieving PeriodoJefeObraEnObra by PeriodoJefeObraEnObraCriteria");
		PeriodoJefeObraEnObraCriteria periodoJefeObraEnObraCriteria = new PeriodoJefeObraEnObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//periodoJefeObraEnObraCriteria.ID.eq();
		//periodoJefeObraEnObraCriteria.jefeDeObra.eq();
		//periodoJefeObraEnObraCriteria.obra.eq();
		System.out.println(periodoJefeObraEnObraCriteria.uniquePeriodoJefeObraEnObra());
		
		System.out.println("Retrieving PeriodoMaquinariaEnObra by PeriodoMaquinariaEnObraCriteria");
		PeriodoMaquinariaEnObraCriteria periodoMaquinariaEnObraCriteria = new PeriodoMaquinariaEnObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//periodoMaquinariaEnObraCriteria.ID.eq();
		//periodoMaquinariaEnObraCriteria.obra.eq();
		//periodoMaquinariaEnObraCriteria.maquinaria.eq();
		System.out.println(periodoMaquinariaEnObraCriteria.uniquePeriodoMaquinariaEnObra());
		
		System.out.println("Retrieving Material by MaterialCriteria");
		MaterialCriteria materialCriteria = new MaterialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//materialCriteria.ID.eq();
		System.out.println(materialCriteria.uniqueMaterial());
		
		System.out.println("Retrieving AdministrativoObra by AdministrativoObraCriteria");
		AdministrativoObraCriteria administrativoObraCriteria = new AdministrativoObraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//administrativoObraCriteria.ID.eq();
		System.out.println(administrativoObraCriteria.uniqueAdministrativoObra());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		CategoriaCriteria categoriaCriteria = new CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//categoriaCriteria.ID.eq();
		System.out.println(categoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving LineaAlbaran by LineaAlbaranCriteria");
		LineaAlbaranCriteria lineaAlbaranCriteria = new LineaAlbaranCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lineaAlbaranCriteria.ID.eq();
		//lineaAlbaranCriteria.albaran.eq();
		//lineaAlbaranCriteria.material.eq();
		System.out.println(lineaAlbaranCriteria.uniqueLineaAlbaran());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGestiónEconómicaConstructoraData retrieveAndUpdateGestiónEconómicaConstructoraData = new RetrieveAndUpdateGestiónEconómicaConstructoraData();
			try {
				retrieveAndUpdateGestiónEconómicaConstructoraData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGestiónEconómicaConstructoraData.retrieveByCriteria();
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
