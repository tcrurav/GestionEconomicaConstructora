-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
<<<<<<< HEAD
<<<<<<< HEAD
-- Tiempo de generación: 27-05-2016 a las 03:52:52
=======
-- Tiempo de generación: 03-05-2016 a las 19:17:09
>>>>>>> origin/DarDeAltaMaterial
=======
-- Tiempo de generación: 03-05-2016 a las 19:17:09
>>>>>>> origin/SolicitarMaterialesParaObra
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `constructora`
--
<<<<<<< HEAD
<<<<<<< HEAD
=======
CREATE DATABASE IF NOT EXISTS `constructora` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `constructora`;
>>>>>>> origin/DarDeAltaMaterial
=======
CREATE DATABASE IF NOT EXISTS `constructora` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `constructora`;
>>>>>>> origin/SolicitarMaterialesParaObra

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `albaran`
--

CREATE TABLE `albaran` (
  `ID` int(11) NOT NULL,
  `EmpleadoAlmacenQueRecogeID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL,
  `Fecha` date DEFAULT NULL,
  `NumAlbaran` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `ID` int(11) NOT NULL,
  `Coste` float NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`ID`, `Coste`, `Nombre`) VALUES
(1, 1500, 'Albañil'),
(2, 3000, 'Ingeniero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineaalbaran`
--

CREATE TABLE `lineaalbaran` (
  `ID` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `MaterialID` int(11) NOT NULL,
  `AlbaranID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquinaria`
--

CREATE TABLE `maquinaria` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `PrecioDeCompra` float NOT NULL,
  `FechaFinVidaUtil` date DEFAULT NULL,
  `FechaCompra` date DEFAULT NULL,
  `CodInventario` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

<<<<<<< HEAD
<<<<<<< HEAD
--
-- Volcado de datos para la tabla `maquinaria`
--

INSERT INTO `maquinaria` (`ID`, `Nombre`, `PrecioDeCompra`, `FechaFinVidaUtil`, `FechaCompra`, `CodInventario`) VALUES
(5, 'Tractor', 1500, '2016-11-10', '2016-05-20', '200');

=======
>>>>>>> origin/DarDeAltaMaterial
=======
>>>>>>> origin/SolicitarMaterialesParaObra
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE `material` (
  `ID` int(11) NOT NULL,
  `Codigo` varchar(255) DEFAULT NULL,
  `Descripcion` varchar(255) DEFAULT NULL,
  `StockMedio` int(11) NOT NULL,
  `StockMinimo` int(11) NOT NULL,
  `Precio` float NOT NULL,
  `Stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialparaobra`
--

CREATE TABLE `materialparaobra` (
  `ID` int(11) NOT NULL,
  `JefeDeObraQueSolicitaID` int(11) NOT NULL,
  `AdministrativoObraQueRecogeID` int(11) NOT NULL,
  `CantidadMaterial` float NOT NULL,
  `Coste` float NOT NULL,
  `FechaSolicitud` date DEFAULT NULL,
  `FechaRecepcion` date DEFAULT NULL,
  `ObraID` int(11) NOT NULL,
  `MaterialID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obra`
--

CREATE TABLE `obra` (
  `ID` int(11) NOT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `PresupuestoTotalEjecucion` float NOT NULL,
  `EstimacionCosteMateriales` float NOT NULL,
  `EstimacionCosteManoDeObra` float NOT NULL,
  `EstimacionGastosGenerales` float NOT NULL,
  `EstimacionBeneficioIndustrial` float NOT NULL,
  `PorcentajeDeObraEjecutado` float NOT NULL,
  `CantidadCobrada` float NOT NULL,
  `CantidadFacturada` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `obra`
--

INSERT INTO `obra` (`ID`, `FechaInicio`, `FechaFin`, `Direccion`, `PresupuestoTotalEjecucion`, `EstimacionCosteMateriales`, `EstimacionCosteManoDeObra`, `EstimacionGastosGenerales`, `EstimacionBeneficioIndustrial`, `PorcentajeDeObraEjecutado`, `CantidadCobrada`, `CantidadFacturada`) VALUES
(5, '2010-02-02', '2010-02-10', '1', 2, 3, 4, 5, 6, 7, 8, 9),
(6, '2010-02-02', '2010-02-02', '1', 2, 3, 4, 5, 6, 1010, 8, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodoempleadoenobra`
--

CREATE TABLE `periodoempleadoenobra` (
  `ID` int(11) NOT NULL,
  `JefeDeObraQueSolicitaID` int(11) NOT NULL,
  `AdministrativoManoDeObraQueAsignaID` int(11) NOT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `Coste` float NOT NULL,
  `FechaSolicitud` date DEFAULT NULL,
  `FechaRecepcion` date DEFAULT NULL,
  `ObraID` int(11) NOT NULL,
  `EmpleadoDeObraID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodojefeobraenobra`
--

CREATE TABLE `periodojefeobraenobra` (
  `ID` int(11) NOT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `Coste` float NOT NULL,
  `ObraID` int(11) NOT NULL,
  `JefeDeObraID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodomaquinariaenobra`
--

CREATE TABLE `periodomaquinariaenobra` (
  `ID` int(11) NOT NULL,
  `EmpleadoAlmacenQueAsignaID` int(11) NOT NULL,
  `JefeDeObraQueSolicitaID` int(11) NOT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `FechaSolicitud` date DEFAULT NULL,
  `FechaRecepcion` date DEFAULT NULL,
  `MaquinariaID` int(11) NOT NULL,
<<<<<<< HEAD
<<<<<<< HEAD
  `ObraID` int(11) NOT NULL,
  `AdministrativoObraQueVerificaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `periodomaquinariaenobra`
--

INSERT INTO `periodomaquinariaenobra` (`ID`, `EmpleadoAlmacenQueAsignaID`, `JefeDeObraQueSolicitaID`, `FechaInicio`, `FechaFin`, `FechaSolicitud`, `FechaRecepcion`, `MaquinariaID`, `ObraID`, `AdministrativoObraQueVerificaID`) VALUES
(9, 20, 30, '2016-05-26', '2016-05-26', '2016-05-26', '2016-05-26', 5, 5, 10),
(14, 20, 30, '2016-05-27', '2016-05-27', '2016-05-27', '2016-05-27', 5, 5, 1);

=======
  `ObraID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

>>>>>>> origin/DarDeAltaMaterial
=======
  `ObraID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

>>>>>>> origin/SolicitarMaterialesParaObra
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `ID` int(11) NOT NULL,
  `CategoriaID` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Apellidos` varchar(255) DEFAULT NULL,
  `Telefono` varchar(255) DEFAULT NULL,
  `Dni` varchar(255) DEFAULT NULL,
  `Usuario` varchar(255) DEFAULT NULL,
  `Contra` varchar(255) DEFAULT NULL,
  `Discriminator` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`ID`, `CategoriaID`, `Nombre`, `Apellidos`, `Telefono`, `Dni`, `Usuario`, `Contra`, `Discriminator`) VALUES
<<<<<<< HEAD
<<<<<<< HEAD
(1, 1, 'Alberto', 'Viera Gil', '649235700', '43293575F', 'alberto', 'alberto', '2'),
(2, 2, 'Tiburcio', 'Cruz Ravelo', '655538544', '52845821d', 'tiburcio', 'tiburcio', '6'),
(10, 1, 'Juan', 'Hernandez perez', '647892547', '44557788F', 'juan', 'juan', '2'),
(20, 2, 'Pepe', 'Viera Hernandez', '653214788', '47223366A', 'pepe', 'pepe', '1'),
(30, 1, 'Maria', 'Cabrera Gil', '928445566', '41789632V', 'maria', 'maria', '5');
=======
(2, 2, 'Tiburcio', 'Cruz Ravelo', '655538544', '52845821d', 'tiburcio', 'tiburcio', '6');
>>>>>>> origin/DarDeAltaMaterial
=======
(2, 2, 'Tiburcio', 'Cruz Ravelo', '655538544', '52845821d', 'tiburcio', 'tiburcio', '6');
>>>>>>> origin/SolicitarMaterialesParaObra

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_proveedor`
--

CREATE TABLE `persona_proveedor` (
  `PersonaID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `albaran`
--
ALTER TABLE `albaran`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `entrega` (`ProveedorID`),
  ADD KEY `firma` (`EmpleadoAlmacenQueRecogeID`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `lineaalbaran`
--
ALTER TABLE `lineaalbaran`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `LineaAlbaran` (`MaterialID`),
  ADD KEY `LineaAlbaran2` (`AlbaranID`);

--
-- Indices de la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `materialparaobra`
--
ALTER TABLE `materialparaobra`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `MaterialParaObra` (`ObraID`),
  ADD KEY `MaterialParaObra2` (`MaterialID`),
  ADD KEY `firma2` (`AdministrativoObraQueRecogeID`),
  ADD KEY `solicita` (`JefeDeObraQueSolicitaID`);

--
-- Indices de la tabla `obra`
--
ALTER TABLE `obra`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `periodoempleadoenobra`
--
ALTER TABLE `periodoempleadoenobra`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `PeriodoEmpleadoEnObra` (`ObraID`),
  ADD KEY `PeriodoEmpleadoEnObra2` (`EmpleadoDeObraID`),
  ADD KEY `solicita3` (`AdministrativoManoDeObraQueAsignaID`),
  ADD KEY `asigna2` (`JefeDeObraQueSolicitaID`);

--
-- Indices de la tabla `periodojefeobraenobra`
--
ALTER TABLE `periodojefeobraenobra`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `PeriodoJefeObraEnObra` (`ObraID`),
  ADD KEY `PeriodoJefeObraEnObra2` (`JefeDeObraID`);

--
-- Indices de la tabla `periodomaquinariaenobra`
--
ALTER TABLE `periodomaquinariaenobra`
  ADD PRIMARY KEY (`ID`),
<<<<<<< HEAD
<<<<<<< HEAD
  ADD UNIQUE KEY `verifica` (`AdministrativoObraQueVerificaID`),
=======
>>>>>>> origin/DarDeAltaMaterial
=======
>>>>>>> origin/SolicitarMaterialesParaObra
  ADD KEY `PeriodoMaquinariaEnObra` (`MaquinariaID`),
  ADD KEY `PeriodoMaquinariaEnObra2` (`ObraID`),
  ADD KEY `solicita2` (`JefeDeObraQueSolicitaID`),
  ADD KEY `asigna` (`EmpleadoAlmacenQueAsignaID`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `es de` (`CategoriaID`);

--
-- Indices de la tabla `persona_proveedor`
--
ALTER TABLE `persona_proveedor`
  ADD PRIMARY KEY (`PersonaID`,`ProveedorID`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `albaran`
--
ALTER TABLE `albaran`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `lineaalbaran`
--
ALTER TABLE `lineaalbaran`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `maquinaria`
--
ALTER TABLE `maquinaria`
<<<<<<< HEAD
<<<<<<< HEAD
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
=======
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
>>>>>>> origin/DarDeAltaMaterial
=======
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
>>>>>>> origin/SolicitarMaterialesParaObra
--
-- AUTO_INCREMENT de la tabla `material`
--
ALTER TABLE `material`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `materialparaobra`
--
ALTER TABLE `materialparaobra`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `obra`
--
ALTER TABLE `obra`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `periodoempleadoenobra`
--
ALTER TABLE `periodoempleadoenobra`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `periodojefeobraenobra`
--
ALTER TABLE `periodojefeobraenobra`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `periodomaquinariaenobra`
--
ALTER TABLE `periodomaquinariaenobra`
<<<<<<< HEAD
<<<<<<< HEAD
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
=======
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
>>>>>>> origin/DarDeAltaMaterial
=======
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
>>>>>>> origin/SolicitarMaterialesParaObra
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
<<<<<<< HEAD
<<<<<<< HEAD
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
=======
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
>>>>>>> origin/DarDeAltaMaterial
=======
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
>>>>>>> origin/SolicitarMaterialesParaObra
--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `albaran`
--
ALTER TABLE `albaran`
  ADD CONSTRAINT `entrega` FOREIGN KEY (`ProveedorID`) REFERENCES `proveedor` (`ID`),
  ADD CONSTRAINT `firma` FOREIGN KEY (`EmpleadoAlmacenQueRecogeID`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `lineaalbaran`
--
ALTER TABLE `lineaalbaran`
  ADD CONSTRAINT `LineaAlbaran` FOREIGN KEY (`MaterialID`) REFERENCES `material` (`ID`),
  ADD CONSTRAINT `LineaAlbaran2` FOREIGN KEY (`AlbaranID`) REFERENCES `albaran` (`ID`);

--
-- Filtros para la tabla `materialparaobra`
--
ALTER TABLE `materialparaobra`
  ADD CONSTRAINT `MaterialParaObra` FOREIGN KEY (`ObraID`) REFERENCES `obra` (`ID`),
  ADD CONSTRAINT `MaterialParaObra2` FOREIGN KEY (`MaterialID`) REFERENCES `material` (`ID`),
  ADD CONSTRAINT `firma2` FOREIGN KEY (`AdministrativoObraQueRecogeID`) REFERENCES `persona` (`ID`),
  ADD CONSTRAINT `solicita` FOREIGN KEY (`JefeDeObraQueSolicitaID`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `periodoempleadoenobra`
--
ALTER TABLE `periodoempleadoenobra`
  ADD CONSTRAINT `PeriodoEmpleadoEnObra` FOREIGN KEY (`ObraID`) REFERENCES `obra` (`ID`),
  ADD CONSTRAINT `PeriodoEmpleadoEnObra2` FOREIGN KEY (`EmpleadoDeObraID`) REFERENCES `persona` (`ID`),
  ADD CONSTRAINT `asigna2` FOREIGN KEY (`JefeDeObraQueSolicitaID`) REFERENCES `persona` (`ID`),
  ADD CONSTRAINT `solicita3` FOREIGN KEY (`AdministrativoManoDeObraQueAsignaID`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `periodojefeobraenobra`
--
ALTER TABLE `periodojefeobraenobra`
  ADD CONSTRAINT `PeriodoJefeObraEnObra` FOREIGN KEY (`ObraID`) REFERENCES `obra` (`ID`),
  ADD CONSTRAINT `PeriodoJefeObraEnObra2` FOREIGN KEY (`JefeDeObraID`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `periodomaquinariaenobra`
--
ALTER TABLE `periodomaquinariaenobra`
  ADD CONSTRAINT `PeriodoMaquinariaEnObra` FOREIGN KEY (`MaquinariaID`) REFERENCES `maquinaria` (`ID`),
  ADD CONSTRAINT `PeriodoMaquinariaEnObra2` FOREIGN KEY (`ObraID`) REFERENCES `obra` (`ID`),
  ADD CONSTRAINT `asigna` FOREIGN KEY (`EmpleadoAlmacenQueAsignaID`) REFERENCES `persona` (`ID`),
<<<<<<< HEAD
<<<<<<< HEAD
  ADD CONSTRAINT `periodomaquinariaenobra_ibfk_1` FOREIGN KEY (`AdministrativoObraQueVerificaID`) REFERENCES `persona` (`ID`),
=======
>>>>>>> origin/DarDeAltaMaterial
=======
>>>>>>> origin/SolicitarMaterialesParaObra
  ADD CONSTRAINT `solicita2` FOREIGN KEY (`JefeDeObraQueSolicitaID`) REFERENCES `persona` (`ID`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `es de` FOREIGN KEY (`CategoriaID`) REFERENCES `categoria` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
