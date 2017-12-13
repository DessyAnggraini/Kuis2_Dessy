-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 13, 2017 at 09:23 AM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1018`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_identitas`
--

CREATE TABLE `tbl_identitas` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `nohp` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_identitas`
--

INSERT INTO `tbl_identitas` (`id`, `alamat`, `nama`, `nohp`) VALUES
(1, 'jl.aaa', 'aaa', '123'),
(2, 'jl.bbb', 'bbb', '234'),
(3, 'jl.ccc', 'ccc', '3423'),
(5, 'jl.ttt', 'tttt', '456');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_ipk`
--

CREATE TABLE `tbl_ipk` (
  `id` bigint(20) NOT NULL,
  `id_identitas` varchar(255) DEFAULT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  `nilai` varchar(100) NOT NULL,
  `identitas_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_ipk`
--

INSERT INTO `tbl_ipk` (`id`, `id_identitas`, `jurusan`, `nilai`, `identitas_id`) VALUES
(1, '12', 'aet', '79', 1),
(2, '13', 'ti', '90', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_identitas`
--
ALTER TABLE `tbl_identitas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_kibmm249h54mqjhv9hvkposrb` (`nama`);

--
-- Indexes for table `tbl_ipk`
--
ALTER TABLE `tbl_ipk`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_6ua80pr5hpdyw308d2hsk3jh5` (`nilai`),
  ADD KEY `FKsq92qn3knrxhuwaf7v5eyu7re` (`identitas_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_identitas`
--
ALTER TABLE `tbl_identitas`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tbl_ipk`
--
ALTER TABLE `tbl_ipk`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_ipk`
--
ALTER TABLE `tbl_ipk`
  ADD CONSTRAINT `FKsq92qn3knrxhuwaf7v5eyu7re` FOREIGN KEY (`identitas_id`) REFERENCES `tbl_identitas` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
