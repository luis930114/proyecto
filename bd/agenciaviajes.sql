-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 05, 2015 at 06:49 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `agenciaviajes`
--
CREATE DATABASE IF NOT EXISTS `agenciaviajes` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `agenciaviajes`;

-- --------------------------------------------------------

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
CREATE TABLE IF NOT EXISTS `area` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `comision`
--

DROP TABLE IF EXISTS `comision`;
CREATE TABLE IF NOT EXISTS `comision` (
  `numero` int(11) NOT NULL,
  `Ciudad` varchar(100) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `Dias` int(11) NOT NULL,
  `ValorInscripcion` int(11) NOT NULL,
  `ValorApoyoE` int(11) NOT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `contabilidad`
--

DROP TABLE IF EXISTS `contabilidad`;
CREATE TABLE IF NOT EXISTS `contabilidad` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
CREATE TABLE IF NOT EXISTS `pagos` (
  `id` int(11) NOT NULL,
  `valor` int(11) NOT NULL,
  `solicitudAprobada` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `rectoria`
--

DROP TABLE IF EXISTS `rectoria`;
CREATE TABLE IF NOT EXISTS `rectoria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `solicitante`
--

DROP TABLE IF EXISTS `solicitante`;
CREATE TABLE IF NOT EXISTS `solicitante` (
  `Cedula` int(11) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  `Apellido` varchar(200) NOT NULL,
  `Telefono` int(10) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Cargo` varchar(100) NOT NULL,
  `Dependencia` varchar(100) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `Direccion` varchar(200) NOT NULL,
  `JefeInmediato` int(11) NOT NULL,
  PRIMARY KEY (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `solicitud`
--

DROP TABLE IF EXISTS `solicitud`;
CREATE TABLE IF NOT EXISTS `solicitud` (
  `numero` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` varchar(2) NOT NULL,
  `numero_comision` int(11) NOT NULL,
  `Solicitante` int(11) NOT NULL,
  `contabilidad` int(11) NOT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `superiorinmediato`
--

DROP TABLE IF EXISTS `superiorinmediato`;
CREATE TABLE IF NOT EXISTS `superiorinmediato` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(200) NOT NULL,
  `Apellido` varchar(200) NOT NULL,
  `Dependencia` varchar(200) NOT NULL,
  `Cargo` varchar(200) NOT NULL,
  `PagoPresupuestal` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tesoreria`
--

DROP TABLE IF EXISTS `tesoreria`;
CREATE TABLE IF NOT EXISTS `tesoreria` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `pagos` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
