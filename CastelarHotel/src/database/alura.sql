-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2023 a las 17:34:14
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alura`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `idReserva` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`id`, `nombre`, `apellido`, `fecha_nacimiento`, `nacionalidad`, `telefono`, `idReserva`) VALUES
(1, 'Alvaro', 'Schneider', '2004-05-11', 'argentino-argentina', '', 26),
(2, 'Renata', 'Schneider', '2019-04-05', 'argentino-argentina', '1133224422', 27),
(3, 'Regina', 'Schneider', '2022-08-19', 'argentino-argentina', '1133224455', 28),
(4, 'Sole', 'Albornoz', '1983-08-07', 'argentino-argentina', '1133881234', 29);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL,
  `fecha_entrada` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `forma_pago` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`id`, `fecha_entrada`, `fecha_salida`, `valor`, `forma_pago`) VALUES
(1, '2023-05-10', '2023-05-14', 4, 'tarjeta'),
(2, '2023-05-12', '2023-05-12', 4, 'null'),
(3, '2023-05-12', '2023-05-12', 5, 'null'),
(4, '2023-05-14', '2023-05-14', 6, 'null'),
(5, '2023-05-15', '2023-05-19', 5, 'null'),
(6, '2023-05-15', '2023-05-19', 5, 'null'),
(7, '2023-05-15', '2023-05-29', 7, 'null'),
(8, '2023-05-12', '2023-05-22', 4, 'null'),
(9, '2023-05-17', '2023-05-22', 3, 'null'),
(10, '2023-05-15', '2023-05-29', 9, 'Tarjeta de Crédito'),
(11, '2023-05-15', '2023-05-22', 33, 'Tarjeta de Crédito'),
(12, '2023-05-17', '2023-05-24', 11, 'Tarjeta de Débito'),
(13, '2023-05-20', '2023-05-27', 22, 'Tarjeta de Crédito'),
(14, '2023-05-19', '2023-05-26', 55, 'Tarjeta de Crédito'),
(15, '2023-05-20', '2023-05-27', 55, 'Tarjeta de Crédito'),
(16, '2023-05-19', '2023-05-26', 22, 'Tarjeta de Crédito'),
(17, '2023-05-20', '2023-05-27', 33, 'Tarjeta de Crédito'),
(18, '2023-05-20', '2023-05-27', 77, 'Tarjeta de Crédito'),
(19, '2023-05-20', '2023-05-27', 22, 'Tarjeta de Crédito'),
(20, '2023-05-20', '2023-05-27', 22, 'Tarjeta de Crédito'),
(21, '2023-05-20', '2023-05-25', 88, 'Dinero en efectivo'),
(22, '2023-05-15', '2023-05-22', 22, 'Tarjeta de Crédito'),
(23, '2023-05-15', '2023-05-22', 44, 'Tarjeta de Débito'),
(24, '2023-05-18', '2023-05-25', 11, 'Tarjeta de Crédito'),
(25, '2023-05-15', '2023-05-22', 44, 'Tarjeta de Débito'),
(26, '2023-05-15', '2023-05-22', 22, 'Tarjeta de Crédito'),
(27, '2023-05-22', '2023-05-29', 44, 'Dinero en efectivo'),
(28, '2023-05-16', '2023-05-22', 33, 'Dinero en efectivo'),
(29, '2023-05-23', '2023-05-30', 44, 'Dinero en efectivo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
