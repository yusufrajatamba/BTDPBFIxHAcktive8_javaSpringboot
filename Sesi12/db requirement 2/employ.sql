-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP DATABASE IF EXISTS `employ`;
CREATE DATABASE `employ` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `employ`;

DROP TABLE IF EXISTS `tb_deot_location`;
CREATE TABLE `tb_deot_location` (
  `Dnumber` int(11) NOT NULL,
  `Dlocation` varchar(50) NOT NULL,
  KEY `Dnumber` (`Dnumber`),
  CONSTRAINT `tb_deot_location_ibfk_1` FOREIGN KEY (`Dnumber`) REFERENCES `tb_departement` (`Dnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_deot_location` (`Dnumber`, `Dlocation`) VALUES
(1,	'Jalan gagak Hitam'),
(2,	'Jalan  Bungan Cempaka'),
(2,	'Jalan Pembangunan no 23'),
(1,	'Jalan Swasembada Timur no 23'),
(3,	'Jalan Bunga Cempaka 3'),
(4,	'Jalan Mangonkusumo 24 A'),
(4,	'Jalan Swasembada Timur no 23'),
(5,	'Jalan Bunga angrek No 12'),
(6,	'Jalan In Aja dulu no 01'),
(6,	'Jalan Swasembada Barat 6'),
(7,	'Jalan  Bungan Cempaka'),
(7,	'Jalan yang Sudah ketemu 1'),
(10,	'Jalan In Aja dulu no 01'),
(10,	'Jalan Masing-masing sementara 09'),
(1,	'Jalan Kita Buana 21')
ON DUPLICATE KEY UPDATE `Dnumber` = VALUES(`Dnumber`), `Dlocation` = VALUES(`Dlocation`);

DROP TABLE IF EXISTS `tb_departement`;
CREATE TABLE `tb_departement` (
  `Dnumber` int(11) NOT NULL AUTO_INCREMENT,
  `ssn` int(11) NOT NULL,
  `Dname` varchar(50) NOT NULL,
  `MgrStartdate` date NOT NULL,
  PRIMARY KEY (`Dnumber`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_departement_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_departement` (`Dnumber`, `ssn`, `Dname`, `MgrStartdate`) VALUES
(1,	1,	'Departement Pengembangan',	'2010-07-21'),
(2,	2,	'Departement keuangan',	'2022-06-21'),
(3,	2,	'Departement Procurement',	'2021-01-21'),
(4,	3,	'Deaprtement Perjalanan',	'2020-05-21'),
(5,	6,	'Departement HRD',	'2019-06-08'),
(6,	6,	'Departement Keamanan',	'2018-06-21'),
(7,	2,	'Departement Programer 1',	'2017-06-21'),
(10,	2,	'Departement Audit',	'2016-06-21')
ON DUPLICATE KEY UPDATE `Dnumber` = VALUES(`Dnumber`), `ssn` = VALUES(`ssn`), `Dname` = VALUES(`Dname`), `MgrStartdate` = VALUES(`MgrStartdate`);

DROP TABLE IF EXISTS `tb_dependent`;
CREATE TABLE `tb_dependent` (
  `ssn` int(11) NOT NULL,
  `Dependent_Name` varchar(50) NOT NULL,
  `Sex` enum('Pria','Wanita') NOT NULL,
  `Bdate` date NOT NULL,
  `Relationship` enum('Suami','Istri','Anak','saudara kandung','Orangtua') NOT NULL,
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_dependent_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_dependent` (`ssn`, `Dependent_Name`, `Sex`, `Bdate`, `Relationship`) VALUES
(1,	'Grecia',	'Wanita',	'2003-04-24',	'Anak'),
(2,	'Muti',	'Wanita',	'2002-11-29',	'Anak'),
(3,	'Cintia Lasra',	'Wanita',	'2020-10-10',	'Anak'),
(4,	'Lanang',	'Pria',	'2005-01-19',	'Anak'),
(1,	'Markus',	'Pria',	'2012-04-06',	'Anak'),
(5,	'Mawar Le',	'Wanita',	'0000-00-00',	'Istri'),
(8,	'Joko',	'Pria',	'1994-02-05',	'Suami'),
(4,	'Budi',	'Pria',	'2001-09-19',	'Anak'),
(8,	'Jinta',	'Wanita',	'1965-09-01',	'Orangtua'),
(7,	'Sulaiman',	'Pria',	'2000-09-05',	'Anak'),
(3,	'GreciaaPolli',	'Wanita',	'2007-09-01',	'Anak')
ON DUPLICATE KEY UPDATE `ssn` = VALUES(`ssn`), `Dependent_Name` = VALUES(`Dependent_Name`), `Sex` = VALUES(`Sex`), `Bdate` = VALUES(`Bdate`), `Relationship` = VALUES(`Relationship`);

DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `ssn` int(11) NOT NULL AUTO_INCREMENT,
  `Dnumber` int(11) NOT NULL,
  `Fname` varchar(50) NOT NULL,
  `Mname` varchar(50) NOT NULL,
  `Lname` varchar(50) NOT NULL,
  `Bdate` date NOT NULL,
  `Addres` varchar(50) NOT NULL,
  `Sex` enum('Pria','Wanita') NOT NULL,
  `Salary` int(10) NOT NULL,
  `SuperSSN` int(10) NOT NULL,
  PRIMARY KEY (`ssn`),
  KEY `Dnumber` (`Dnumber`),
  CONSTRAINT `tb_employee_ibfk_1` FOREIGN KEY (`Dnumber`) REFERENCES `tb_departement` (`Dnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_employee` (`ssn`, `Dnumber`, `Fname`, `Mname`, `Lname`, `Bdate`, `Addres`, `Sex`, `Salary`, `SuperSSN`) VALUES
(1,	1,	'Yusuf',	'Raja',	'Tamba',	'1997-11-27',	'Jalan Curug Garden B3.40',	'Pria',	7000000,	1223),
(2,	2,	'Rusli',	'Fajar',	'Nugraha',	'1997-11-01',	'jalan Setia budi bo 04',	'Pria',	5000000,	2341),
(3,	2,	'Farha',	'Alim',	'Kusuma',	'1994-11-22',	'jalan Curug Garden B2.23',	'Pria',	3500000,	1432),
(4,	2,	'Julia',	'Ras',	'Simatupang',	'1994-11-22',	'Jalan Paguyuban no 34',	'Wanita',	8000000,	34212),
(5,	3,	'Pronogo',	'yos',	'Sudarso',	'1999-11-22',	'Jalan Jepara no 34',	'Pria',	3000000,	341),
(6,	3,	'Cinta',	'Mulia',	'Mutiara',	'1997-11-09',	'Jalan Berdikari diatas kaki No.01',	'Wanita',	3400000,	5431),
(7,	10,	'Mutiara',	'Hati',	'Kita',	'1996-10-01',	'Jalan Ku milik Mu',	'Wanita',	9000000,	5432),
(8,	7,	'Cintia',	'Aku',	'Padamu',	'1994-04-24',	'jalan Kita Bersama No 01',	'Wanita',	3000000,	4421)
ON DUPLICATE KEY UPDATE `ssn` = VALUES(`ssn`), `Dnumber` = VALUES(`Dnumber`), `Fname` = VALUES(`Fname`), `Mname` = VALUES(`Mname`), `Lname` = VALUES(`Lname`), `Bdate` = VALUES(`Bdate`), `Addres` = VALUES(`Addres`), `Sex` = VALUES(`Sex`), `Salary` = VALUES(`Salary`), `SuperSSN` = VALUES(`SuperSSN`);

DROP TABLE IF EXISTS `tb_project`;
CREATE TABLE `tb_project` (
  `Pnumber` int(11) NOT NULL AUTO_INCREMENT,
  `Pname` varchar(50) NOT NULL,
  `Plocation` varchar(50) NOT NULL,
  `Dnumber` int(11) NOT NULL,
  PRIMARY KEY (`Pnumber`),
  KEY `Dnumber` (`Dnumber`),
  CONSTRAINT `tb_project_ibfk_1` FOREIGN KEY (`Dnumber`) REFERENCES `tb_departement` (`Dnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_project` (`Pnumber`, `Pname`, `Plocation`, `Dnumber`) VALUES
(1,	'Upgrade Database',	'SMA Cinta Mulia',	1),
(2,	'Gathring Day',	'Bandung',	5),
(3,	'Seminar Sosial kemanuasiaan',	'Jakarta Pusat',	5),
(4,	'Pelatihan Keamanan Gedung',	'Jakarta Selatan',	6),
(5,	'Audit Cabang Bandung',	'Bandung',	10),
(6,	'Audit Berkala ',	'Kantor Pusat',	10),
(7,	'Perjalanan Kunjungan Direktur',	'Medan',	4),
(8,	'Pembangunan Gedung',	'Kantor cabang Tangerang',	3),
(9,	'Pembuatan Aplikasi Peduli ',	'Kantor Pusat',	7)
ON DUPLICATE KEY UPDATE `Pnumber` = VALUES(`Pnumber`), `Pname` = VALUES(`Pname`), `Plocation` = VALUES(`Plocation`), `Dnumber` = VALUES(`Dnumber`);

DROP TABLE IF EXISTS `tb_works_on`;
CREATE TABLE `tb_works_on` (
  `essn` int(11) NOT NULL,
  `Pnumber` int(11) NOT NULL,
  `Hours` int(50) NOT NULL,
  KEY `Pnumber` (`Pnumber`),
  CONSTRAINT `tb_works_on_ibfk_1` FOREIGN KEY (`Pnumber`) REFERENCES `tb_project` (`Pnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_works_on` (`essn`, `Pnumber`, `Hours`) VALUES
(1,	2,	120),
(2,	3,	160),
(7,	3,	129),
(4,	6,	800),
(5,	4,	120),
(4,	7,	170),
(10,	3,	180),
(6,	1,	160),
(8,	2,	120),
(9,	6,	500),
(9,	2,	160),
(10,	9,	190)
ON DUPLICATE KEY UPDATE `essn` = VALUES(`essn`), `Pnumber` = VALUES(`Pnumber`), `Hours` = VALUES(`Hours`);

-- 2022-06-21 23:36:09
