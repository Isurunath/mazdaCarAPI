-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 04, 2021 at 04:01 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mazdadb`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
CREATE TABLE IF NOT EXISTS `car` (
  `id` int(10) NOT NULL,
  `model` varchar(15) NOT NULL,
  `yearManufactured` int(4) NOT NULL,
  `color` varchar(10) NOT NULL,
  `engineTransmission` varchar(6) NOT NULL,
  `plateNo` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `plateNo` (`plateNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`id`, `model`, `yearManufactured`, `color`, `engineTransmission`, `plateNo`) VALUES
(28, 'CX5', 2021, 'Red', 'auto', '1AB2CD'),
(29, 'CX5', 2021, 'Blue', 'manual', '2AB3CD'),
(30, 'MX5', 2020, 'Red', 'auto', '3AB4CD'),
(31, 'MX5', 2021, 'Black', 'auto', '4AB5CD'),
(32, 'CX9', 2021, 'Black', 'auto', '5AB6CD'),
(33, 'CX9', 2021, 'Grey', 'auto', '6AB7CD'),
(34, 'CX9', 2020, 'Red', 'manual', '7AB8CD'),
(35, 'BT50', 2020, 'White', 'auto', '8AB9CD'),
(36, 'Mazda3', 2019, 'Red', 'auto', '8AB1CD'),
(37, 'CX8', 2021, 'White', 'auto', '1AC2AB');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(38);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
