/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateGestiónEconómicaConstructoraData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = GestiónEconómicaConstructoraPersistentManager.instance().getSession().beginTransaction();
		try {
			Obra obra = Obra.createObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : periodoMaquinariaEnObras, materialParaObras, periodoEmpleadoEnObras, periodoJefeObraEnObras, cantidadFacturada, cantidadCobrada, porcentajeDeObraEjecutado, estimacionBeneficioIndustrial, estimacionGastosGenerales, estimacionCosteManoDeObra, estimacionCosteMateriales, presupuestoTotalEjecucion
			obra.save();
			Persona persona = Persona.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : proveedor
			persona.save();
			Empleado empleado = Empleado.createEmpleado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : categoria
			empleado.save();
			JefeDeObra jefeDeObra = JefeDeObra.createJefeDeObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : periodoEmpleadoEnObra, periodoMaquinariaEnObra, materialAsignadoAObra, periodoJefeObraEnObras
			jefeDeObra.save();
			AdministrativoManoDeObra administrativoManoDeObra = AdministrativoManoDeObra.createAdministrativoManoDeObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : periodoEmpleadoEnObra
			administrativoManoDeObra.save();
			EmpleadoAlmacen empleadoAlmacen = EmpleadoAlmacen.createEmpleadoAlmacen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : periodoMaquinariaEnObra, albaran
			empleadoAlmacen.save();
			Albaran albaran = Albaran.createAlbaran();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lineaAlbarans, proveedor, empleado
			albaran.save();
			EmpleadoObra empleadoObra = EmpleadoObra.createEmpleadoObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : periodoEmpleadoEnObras
			empleadoObra.save();
			Maquinaria maquinaria = Maquinaria.createMaquinaria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : periodoMaquinariaEnObras, precioDeCompra
			maquinaria.save();
			PeriodoEmpleadoEnObra periodoEmpleadoEnObra = PeriodoEmpleadoEnObra.createPeriodoEmpleadoEnObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coste, jefeDeObra, administrativoManoObra
			periodoEmpleadoEnObra.save();
			Proveedor proveedor = Proveedor.createProveedor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : albaran, contacto
			proveedor.save();
			MaterialParaObra materialParaObra = MaterialParaObra.createMaterialParaObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coste, CantidadMaterial, administrativoObra, jefeDeObra
			materialParaObra.save();
			PeriodoJefeObraEnObra periodoJefeObraEnObra = PeriodoJefeObraEnObra.createPeriodoJefeObraEnObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : coste
			periodoJefeObraEnObra.save();
			PeriodoMaquinariaEnObra periodoMaquinariaEnObra = PeriodoMaquinariaEnObra.createPeriodoMaquinariaEnObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jefeDeObra, empleadoAlmacen
			periodoMaquinariaEnObra.save();
			Material material = Material.createMaterial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : materialParaObras, lineaAlbarans, stock, precio, stockMinimo, stockMedio
			material.save();
			AdministrativoObra administrativoObra = AdministrativoObra.createAdministrativoObra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : materialAsignadoAObra
			administrativoObra.save();
			Categoria categoria = Categoria.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : empleado, coste
			categoria.save();
			LineaAlbaran lineaAlbaran = LineaAlbaran.createLineaAlbaran();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantidad
			lineaAlbaran.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateGestiónEconómicaConstructoraData createGestiónEconómicaConstructoraData = new CreateGestiónEconómicaConstructoraData();
			try {
				createGestiónEconómicaConstructoraData.createTestData();
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
