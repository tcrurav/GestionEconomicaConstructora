CREATE TABLE Persona_Obra2 (
  PersonaID int(11) NOT NULL, 
  ObraID    int(11) NOT NULL, 
  PRIMARY KEY (PersonaID, 
  ObraID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Obra_Maquinaria2 (
  ObraID       int(11) NOT NULL, 
  MaquinariaID int(11) NOT NULL, 
  PRIMARY KEY (ObraID, 
  MaquinariaID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Material_Obra2 (
  MaterialID int(11) NOT NULL, 
  ObraID     int(11) NOT NULL, 
  PRIMARY KEY (MaterialID, 
  ObraID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Albaran_Material2 (
  AlbaranID  int(11) NOT NULL, 
  MaterialID int(11) NOT NULL, 
  PRIMARY KEY (AlbaranID, 
  MaterialID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Persona_Proveedor (
  PersonaID2   int(11) NOT NULL, 
  ProveedorID2 int(11) NOT NULL, 
  PRIMARY KEY (PersonaID2, 
  ProveedorID2)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Persona_Proveedor3 (
  ProveedorAttribute int(11) NOT NULL, 
  PersonaAttribute   int(11) NOT NULL, 
  PRIMARY KEY (ProveedorAttribute, 
  PersonaAttribute)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Persona_Proveedor2 (
  PersonaID   int(11) NOT NULL, 
  ProveedorID int(11) NOT NULL, 
  PRIMARY KEY (PersonaID, 
  ProveedorID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Persona_Proveedor4 (
  PersonaID   int(11) NOT NULL, 
  ProveedorID int(11) NOT NULL, 
  PRIMARY KEY (PersonaID, 
  ProveedorID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Obra (
  ID                            int(11) NOT NULL AUTO_INCREMENT, 
  FechaInicio                   date, 
  FechaFin                      date, 
  Direccion                     varchar(255), 
  PresupuestoTotalEjecucion     float NOT NULL, 
  EstimacionCosteMateriales     float NOT NULL, 
  EstimacionCosteManoDeObra     float NOT NULL, 
  EstimacionGastosGenerales     float NOT NULL, 
  EstimacionBeneficioIndustrial float NOT NULL, 
  PorcentajeDeObraEjecutado     float NOT NULL, 
  CantidadCobrada               float NOT NULL, 
  CantidadFacturada             float NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Albaran (
  ID                         int(11) NOT NULL AUTO_INCREMENT, 
  EmpleadoAlmacenQueRecogeID int(11) NOT NULL, 
  ProveedorID                int(11) NOT NULL, 
  Fecha                      date, 
  NumAlbaran                 varchar(255), 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Maquinaria (
  ID               int(11) NOT NULL AUTO_INCREMENT, 
  Nombre           varchar(255), 
  PrecioDeCompra   float NOT NULL, 
  FechaFinVidaUtil date, 
  FechaCompra      date, 
  CodInventario    varchar(255), 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE PeriodoEmpleadoEnObra (
  ID                                  int(11) NOT NULL AUTO_INCREMENT, 
  JefeDeObraQueSolicitaID             int(11) NOT NULL, 
  AdministrativoManoDeObraQueAsignaID int(11) NOT NULL, 
  FechaInicio                         date, 
  FechaFin                            date, 
  Coste                               float NOT NULL, 
  FechaSolicitud                      date, 
  FechaRecepcion                      date, 
  ObraID                              int(11) NOT NULL, 
  EmpleadoDeObraID                    int(11) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Proveedor (
  ID        int(11) NOT NULL AUTO_INCREMENT, 
  Nombre    varchar(255), 
  Direccion varchar(255), 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Persona (
  ID            int(11) NOT NULL AUTO_INCREMENT, 
  CategoriaID   int(11) NOT NULL, 
  Nombre        varchar(255), 
  Apellidos     varchar(255), 
  Telefono      varchar(255), 
  Dni           varchar(255), 
  Usuario       varchar(255), 
  Contra        varchar(255), 
  Discriminator varchar(255) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE MaterialParaObra (
  ID                            int(11) NOT NULL AUTO_INCREMENT, 
  JefeDeObraQueSolicitaID       int(11) NOT NULL, 
  AdministrativoObraQueRecogeID int(11) NOT NULL, 
  CantidadMaterial              float NOT NULL, 
  Coste                         float NOT NULL, 
  FechaSolicitud                date, 
  FechaRecepcion                date, 
  ObraID                        int(11) NOT NULL, 
  MaterialID                    int(11) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE PeriodoJefeObraEnObra (
  ID           int(11) NOT NULL AUTO_INCREMENT, 
  FechaInicio  date, 
  FechaFin     date, 
  Coste        float NOT NULL, 
  ObraID       int(11) NOT NULL, 
  JefeDeObraID int(11) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE PeriodoMaquinariaEnObra (
  ID                         int(11) NOT NULL AUTO_INCREMENT, 
  EmpleadoAlmacenQueAsignaID int(11) NOT NULL, 
  JefeDeObraQueSolicitaID    int(11) NOT NULL, 
  FechaInicio                date, 
  FechaFin                   date, 
  FechaSolicitud             date, 
  FechaRecepcion             date, 
  MaquinariaID               int(11) NOT NULL, 
  ObraID                     int(11) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Material (
  ID          int(11) NOT NULL AUTO_INCREMENT, 
  Codigo      varchar(255), 
  Descripcion varchar(255), 
  StockMedio  int(11) NOT NULL, 
  StockMinimo int(11) NOT NULL, 
  Precio      float NOT NULL, 
  Stock       int(11) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Categoria (
  ID     int(11) NOT NULL AUTO_INCREMENT, 
  Coste  float NOT NULL, 
  Nombre varchar(255), 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE LineaAlbaran (
  ID         int(11) NOT NULL AUTO_INCREMENT, 
  Cantidad   int(11) NOT NULL, 
  MaterialID int(11) NOT NULL, 
  AlbaranID  int(11) NOT NULL, 
  PRIMARY KEY (ID)) ENGINE=InnoDB CHARACTER SET UTF8;
CREATE TABLE Persona_Proveedor5 (
  PersonaID   int(11) NOT NULL, 
  ProveedorID int(11) NOT NULL, 
  PRIMARY KEY (PersonaID, 
  ProveedorID)) ENGINE=InnoDB CHARACTER SET UTF8;
ALTER TABLE PeriodoJefeObraEnObra ADD INDEX PeriodoJefeObraEnObra (ObraID), ADD CONSTRAINT PeriodoJefeObraEnObra FOREIGN KEY (ObraID) REFERENCES Obra (ID);
ALTER TABLE PeriodoJefeObraEnObra ADD INDEX PeriodoJefeObraEnObra2 (JefeDeObraID), ADD CONSTRAINT PeriodoJefeObraEnObra2 FOREIGN KEY (JefeDeObraID) REFERENCES Persona (ID);
ALTER TABLE PeriodoEmpleadoEnObra ADD INDEX PeriodoEmpleadoEnObra (ObraID), ADD CONSTRAINT PeriodoEmpleadoEnObra FOREIGN KEY (ObraID) REFERENCES Obra (ID);
ALTER TABLE PeriodoEmpleadoEnObra ADD INDEX PeriodoEmpleadoEnObra2 (EmpleadoDeObraID), ADD CONSTRAINT PeriodoEmpleadoEnObra2 FOREIGN KEY (EmpleadoDeObraID) REFERENCES Persona (ID);
ALTER TABLE Albaran ADD INDEX entrega (ProveedorID), ADD CONSTRAINT entrega FOREIGN KEY (ProveedorID) REFERENCES Proveedor (ID);
ALTER TABLE Persona_Proveedor5 ADD INDEX `es el contacto de` (PersonaID), ADD CONSTRAINT `es el contacto de` FOREIGN KEY (PersonaID) REFERENCES Persona (ID);
ALTER TABLE Persona_Proveedor5 ADD INDEX `es el contacto de2` (ProveedorID), ADD CONSTRAINT `es el contacto de2` FOREIGN KEY (ProveedorID) REFERENCES Proveedor (ID);
ALTER TABLE PeriodoMaquinariaEnObra ADD INDEX PeriodoMaquinariaEnObra (MaquinariaID), ADD CONSTRAINT PeriodoMaquinariaEnObra FOREIGN KEY (MaquinariaID) REFERENCES Maquinaria (ID);
ALTER TABLE PeriodoMaquinariaEnObra ADD INDEX PeriodoMaquinariaEnObra2 (ObraID), ADD CONSTRAINT PeriodoMaquinariaEnObra2 FOREIGN KEY (ObraID) REFERENCES Obra (ID);
ALTER TABLE Albaran ADD INDEX firma (EmpleadoAlmacenQueRecogeID), ADD CONSTRAINT firma FOREIGN KEY (EmpleadoAlmacenQueRecogeID) REFERENCES Persona (ID);
ALTER TABLE Persona ADD INDEX `es de` (CategoriaID), ADD CONSTRAINT `es de` FOREIGN KEY (CategoriaID) REFERENCES Categoria (ID);
ALTER TABLE MaterialParaObra ADD INDEX MaterialParaObra (ObraID), ADD CONSTRAINT MaterialParaObra FOREIGN KEY (ObraID) REFERENCES Obra (ID);
ALTER TABLE MaterialParaObra ADD INDEX MaterialParaObra2 (MaterialID), ADD CONSTRAINT MaterialParaObra2 FOREIGN KEY (MaterialID) REFERENCES Material (ID);
ALTER TABLE LineaAlbaran ADD INDEX LineaAlbaran (MaterialID), ADD CONSTRAINT LineaAlbaran FOREIGN KEY (MaterialID) REFERENCES Material (ID);
ALTER TABLE LineaAlbaran ADD INDEX LineaAlbaran2 (AlbaranID), ADD CONSTRAINT LineaAlbaran2 FOREIGN KEY (AlbaranID) REFERENCES Albaran (ID);
ALTER TABLE MaterialParaObra ADD INDEX firma2 (AdministrativoObraQueRecogeID), ADD CONSTRAINT firma2 FOREIGN KEY (AdministrativoObraQueRecogeID) REFERENCES Persona (ID);
ALTER TABLE MaterialParaObra ADD INDEX solicita (JefeDeObraQueSolicitaID), ADD CONSTRAINT solicita FOREIGN KEY (JefeDeObraQueSolicitaID) REFERENCES Persona (ID);
ALTER TABLE PeriodoMaquinariaEnObra ADD INDEX solicita2 (JefeDeObraQueSolicitaID), ADD CONSTRAINT solicita2 FOREIGN KEY (JefeDeObraQueSolicitaID) REFERENCES Persona (ID);
ALTER TABLE PeriodoEmpleadoEnObra ADD INDEX solicita3 (AdministrativoManoDeObraQueAsignaID), ADD CONSTRAINT solicita3 FOREIGN KEY (AdministrativoManoDeObraQueAsignaID) REFERENCES Persona (ID);
ALTER TABLE PeriodoMaquinariaEnObra ADD INDEX asigna (EmpleadoAlmacenQueAsignaID), ADD CONSTRAINT asigna FOREIGN KEY (EmpleadoAlmacenQueAsignaID) REFERENCES Persona (ID);
ALTER TABLE PeriodoEmpleadoEnObra ADD INDEX asigna2 (JefeDeObraQueSolicitaID), ADD CONSTRAINT asigna2 FOREIGN KEY (JefeDeObraQueSolicitaID) REFERENCES Persona (ID);
