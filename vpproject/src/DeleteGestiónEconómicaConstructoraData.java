/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteGestiónEconómicaConstructoraData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = GestiónEconómicaConstructoraPersistentManager.instance().getSession().beginTransaction();
		try {
			Obra obra = Obra.loadObraByQuery(null, null);
			obra.delete();
			Persona persona = Persona.loadPersonaByQuery(null, null);
			persona.delete();
			Empleado empleado = Empleado.loadEmpleadoByQuery(null, null);
			empleado.delete();
			JefeDeObra jefeDeObra = JefeDeObra.loadJefeDeObraByQuery(null, null);
			jefeDeObra.delete();
			AdministrativoManoDeObra administrativoManoDeObra = AdministrativoManoDeObra.loadAdministrativoManoDeObraByQuery(null, null);
			administrativoManoDeObra.delete();
			EmpleadoAlmacen empleadoAlmacen = EmpleadoAlmacen.loadEmpleadoAlmacenByQuery(null, null);
			empleadoAlmacen.delete();
			Albaran albaran = Albaran.loadAlbaranByQuery(null, null);
			albaran.delete();
			EmpleadoObra empleadoObra = EmpleadoObra.loadEmpleadoObraByQuery(null, null);
			empleadoObra.delete();
			Maquinaria maquinaria = Maquinaria.loadMaquinariaByQuery(null, null);
			maquinaria.delete();
			PeriodoEmpleadoEnObra periodoEmpleadoEnObra = PeriodoEmpleadoEnObra.loadPeriodoEmpleadoEnObraByQuery(null, null);
			periodoEmpleadoEnObra.delete();
			Proveedor proveedor = Proveedor.loadProveedorByQuery(null, null);
			proveedor.delete();
			MaterialParaObra materialParaObra = MaterialParaObra.loadMaterialParaObraByQuery(null, null);
			materialParaObra.delete();
			PeriodoJefeObraEnObra periodoJefeObraEnObra = PeriodoJefeObraEnObra.loadPeriodoJefeObraEnObraByQuery(null, null);
			periodoJefeObraEnObra.delete();
			PeriodoMaquinariaEnObra periodoMaquinariaEnObra = PeriodoMaquinariaEnObra.loadPeriodoMaquinariaEnObraByQuery(null, null);
			periodoMaquinariaEnObra.delete();
			Material material = Material.loadMaterialByQuery(null, null);
			material.delete();
			AdministrativoObra administrativoObra = AdministrativoObra.loadAdministrativoObraByQuery(null, null);
			administrativoObra.delete();
			Categoria categoria = Categoria.loadCategoriaByQuery(null, null);
			categoria.delete();
			LineaAlbaran lineaAlbaran = LineaAlbaran.loadLineaAlbaranByQuery(null, null);
			lineaAlbaran.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGestiónEconómicaConstructoraData deleteGestiónEconómicaConstructoraData = new DeleteGestiónEconómicaConstructoraData();
			try {
				deleteGestiónEconómicaConstructoraData.deleteTestData();
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
