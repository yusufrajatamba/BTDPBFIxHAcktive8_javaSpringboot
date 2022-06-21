-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP DATABASE IF EXISTS `db_ptmelodi`;
CREATE DATABASE `db_ptmelodi` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `db_ptmelodi`;

DROP VIEW IF EXISTS `combine_album`;
CREATE TABLE `combine_album` (`id_album` int(10), `id_lagu` int(20), `judul` varchar(25), `nama_pengarang` varchar(25), `nama_album` varchar(20), `tanggal_copyright` date, `format` enum('CD','MC'));


DROP VIEW IF EXISTS `combine_test`;
CREATE TABLE `combine_test` (`judul` varchar(25), `nama_pengarang` varchar(25), `tanggal_copyright` date, `format` enum('CD','MC'));


DROP TABLE IF EXISTS `tb_album`;
CREATE TABLE `tb_album` (
  `id_album` int(10) NOT NULL AUTO_INCREMENT,
  `nama_album` varchar(20) NOT NULL,
  `tanggal_copyright` date NOT NULL,
  `format` enum('CD','MC') NOT NULL,
  `id_musisi` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_album`),
  KEY `id_musisi` (`id_musisi`),
  CONSTRAINT `tb_album_ibfk_1` FOREIGN KEY (`id_musisi`) REFERENCES `tb_musisi` (`id_musisi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_album` (`id_album`, `nama_album`, `tanggal_copyright`, `format`, `id_musisi`) VALUES
(1,	'Pasrah',	'2022-06-21',	'CD',	1),
(2,	'Terserah',	'2022-06-21',	'MC',	2),
(3,	'Mungkin Nanti',	'2022-06-21',	'CD',	5),
(4,	'Rock And roll',	'0000-00-00',	'CD',	5),
(5,	'Pop Thailand',	'2022-06-21',	'MC',	2)
ON DUPLICATE KEY UPDATE `id_album` = VALUES(`id_album`), `nama_album` = VALUES(`nama_album`), `tanggal_copyright` = VALUES(`tanggal_copyright`), `format` = VALUES(`format`), `id_musisi` = VALUES(`id_musisi`);

DROP TABLE IF EXISTS `tb_instrumen`;
CREATE TABLE `tb_instrumen` (
  `id_instrumen` int(10) NOT NULL AUTO_INCREMENT,
  `nama_instrumen` varchar(20) NOT NULL,
  `kunci_musik` varchar(10) NOT NULL,
  PRIMARY KEY (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_instrumen` (`id_instrumen`, `nama_instrumen`, `kunci_musik`) VALUES
(1,	'Gitar',	'G'),
(2,	'Piano',	'C#'),
(3,	'bass',	'G7'),
(4,	'Seruling',	'c#'),
(5,	'Saxophone',	'A')
ON DUPLICATE KEY UPDATE `id_instrumen` = VALUES(`id_instrumen`), `nama_instrumen` = VALUES(`nama_instrumen`), `kunci_musik` = VALUES(`kunci_musik`);

DROP TABLE IF EXISTS `tb_lagu`;
CREATE TABLE `tb_lagu` (
  `id_lagu` int(20) NOT NULL AUTO_INCREMENT,
  `judul` varchar(25) NOT NULL,
  `nama_pengarang` varchar(25) NOT NULL,
  `id_album` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_lagu`),
  KEY `id_album` (`id_album`),
  CONSTRAINT `tb_lagu_ibfk_1` FOREIGN KEY (`id_album`) REFERENCES `tb_album` (`id_album`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_lagu` (`id_lagu`, `judul`, `nama_pengarang`, `id_album`) VALUES
(1,	'kasih Putih',	'Glenn',	1),
(2,	'Sucat pelat boog',	'Phong Nam',	3),
(3,	'are you ready',	'Nim Thong',	2),
(4,	'7 ring',	'ariana grande',	5),
(5,	'Putus atau terus',	'judika',	4)
ON DUPLICATE KEY UPDATE `id_lagu` = VALUES(`id_lagu`), `judul` = VALUES(`judul`), `nama_pengarang` = VALUES(`nama_pengarang`), `id_album` = VALUES(`id_album`);

DROP TABLE IF EXISTS `tb_musisi`;
CREATE TABLE `tb_musisi` (
  `id_musisi` int(10) NOT NULL AUTO_INCREMENT,
  `SSN` int(13) NOT NULL,
  `nama_musisi` varchar(25) NOT NULL,
  `id_instrument` int(10) NOT NULL,
  `id_lagu` int(20) DEFAULT NULL,
  `alamat_musisi` varchar(25) NOT NULL,
  `nomor_telp` int(15) NOT NULL,
  PRIMARY KEY (`id_musisi`),
  KEY `id_instrument` (`id_instrument`),
  KEY `id_lagu` (`id_lagu`),
  CONSTRAINT `tb_musisi_ibfk_1` FOREIGN KEY (`id_instrument`) REFERENCES `tb_instrumen` (`id_instrumen`),
  CONSTRAINT `tb_musisi_ibfk_2` FOREIGN KEY (`id_lagu`) REFERENCES `tb_lagu` (`id_lagu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_musisi` (`id_musisi`, `SSN`, `nama_musisi`, `id_instrument`, `id_lagu`, `alamat_musisi`, `nomor_telp`) VALUES
(1,	234112,	'Afgan',	1,	1,	'jakrata utara',	825345611),
(2,	2345621,	'Judika',	4,	5,	'jakarta Timur',	2147483647),
(3,	10000986,	'Phom Tim',	2,	2,	'Thailand',	28944112),
(4,	342513,	'Phom Nma',	5,	3,	'Thailand',	32423523),
(5,	32542523,	'Iwan fals',	1,	5,	'Bandung',	2147483647),
(6,	1412412,	'Ariel',	1,	4,	'jakarta Pusat',	825345622)
ON DUPLICATE KEY UPDATE `id_musisi` = VALUES(`id_musisi`), `SSN` = VALUES(`SSN`), `nama_musisi` = VALUES(`nama_musisi`), `id_instrument` = VALUES(`id_instrument`), `id_lagu` = VALUES(`id_lagu`), `alamat_musisi` = VALUES(`alamat_musisi`), `nomor_telp` = VALUES(`nomor_telp`);

DROP TABLE IF EXISTS `combine_album`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `combine_album` AS select `s`.`id_album` AS `id_album`,`a`.`id_lagu` AS `id_lagu`,`a`.`judul` AS `judul`,`a`.`nama_pengarang` AS `nama_pengarang`,`s`.`nama_album` AS `nama_album`,`s`.`tanggal_copyright` AS `tanggal_copyright`,`s`.`format` AS `format` from (`tb_lagu` `a` join `tb_album` `s` on(`a`.`id_album` = `s`.`id_album`));

DROP TABLE IF EXISTS `combine_test`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `combine_test` AS select `a`.`judul` AS `judul`,`a`.`nama_pengarang` AS `nama_pengarang`,`s`.`tanggal_copyright` AS `tanggal_copyright`,`s`.`format` AS `format` from (`tb_lagu` `a` join `tb_album` `s` on(`a`.`id_album` = `s`.`id_album`));

-- 2022-06-21 23:35:42
