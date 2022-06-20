-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP DATABASE IF EXISTS `db_universitas`;
CREATE DATABASE `db_universitas` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `db_universitas`;

DROP VIEW IF EXISTS `data_nilai`;
CREATE TABLE `data_nilai` (`ts` int(10), `tf` int(10), `th` int(5));


DROP VIEW IF EXISTS `data_nilai_1`;
CREATE TABLE `data_nilai_1` (`nama_mahasiswa` varchar(20), `Nama_dosen` varchar(25), `Nilai` int(5));


DROP VIEW IF EXISTS `pembimbing`;
CREATE TABLE `pembimbing` (`NIM` int(10), `nama_mahasiswa` varchar(20), `Alamat Mahasiswa` varchar(20), `Dosen Pembimbing` varchar(25), `Umur Dosen` int(5));


DROP TABLE IF EXISTS `tb_dosen`;
CREATE TABLE `tb_dosen` (
  `id_dosen` int(10) NOT NULL AUTO_INCREMENT,
  `nama_dosen` varchar(25) NOT NULL,
  `umur` int(5) NOT NULL,
  PRIMARY KEY (`id_dosen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_dosen` (`id_dosen`, `nama_dosen`, `umur`) VALUES
(1,	'Kimura',	27),
(2,	'Patar',	30),
(3,	'Sri',	26);

DROP TABLE IF EXISTS `tb_mahasiswa`;
CREATE TABLE `tb_mahasiswa` (
  `nim` int(10) NOT NULL AUTO_INCREMENT,
  `nama_mahasiswa` varchar(20) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `id_dosen` int(10) NOT NULL,
  `kode_matakuliah` int(10) NOT NULL,
  PRIMARY KEY (`nim`),
  KEY `id_dosen` (`id_dosen`),
  KEY `kode_matakuliah` (`kode_matakuliah`),
  CONSTRAINT `tb_mahasiswa_ibfk_1` FOREIGN KEY (`id_dosen`) REFERENCES `tb_dosen` (`id_dosen`),
  CONSTRAINT `tb_mahasiswa_ibfk_2` FOREIGN KEY (`kode_matakuliah`) REFERENCES `tb_matakuliah` (`kode_matakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_mahasiswa` (`nim`, `nama_mahasiswa`, `alamat`, `id_dosen`, `kode_matakuliah`) VALUES
(1,	'Yusuf',	'curuh',	1,	2),
(2,	'Raja',	'garden',	2,	1),
(3,	'Tamba',	'tangerang',	3,	3);

DROP TABLE IF EXISTS `tb_matakuliah`;
CREATE TABLE `tb_matakuliah` (
  `kode_matakuliah` int(10) NOT NULL AUTO_INCREMENT,
  `nilai` int(5) NOT NULL,
  PRIMARY KEY (`kode_matakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_matakuliah` (`kode_matakuliah`, `nilai`) VALUES
(1,	78),
(2,	88),
(3,	77);

DROP TABLE IF EXISTS `data_nilai`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_nilai` AS select `ta`.`nim` AS `ts`,`td`.`id_dosen` AS `tf`,`tg`.`nilai` AS `th` from ((`tb_mahasiswa` `ta` left join `tb_dosen` `td` on(`ta`.`id_dosen` = `td`.`id_dosen`)) left join `tb_matakuliah` `tg` on(`ta`.`kode_matakuliah` = `tg`.`kode_matakuliah`));

DROP TABLE IF EXISTS `data_nilai_1`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_nilai_1` AS select `ta`.`nama_mahasiswa` AS `nama_mahasiswa`,`td`.`nama_dosen` AS `Nama_dosen`,`tg`.`nilai` AS `Nilai` from ((`tb_mahasiswa` `ta` left join `tb_dosen` `td` on(`ta`.`id_dosen` = `td`.`id_dosen`)) left join `tb_matakuliah` `tg` on(`ta`.`kode_matakuliah` = `tg`.`kode_matakuliah`));

DROP TABLE IF EXISTS `pembimbing`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `pembimbing` AS select `ta`.`nim` AS `NIM`,`ta`.`nama_mahasiswa` AS `nama_mahasiswa`,`ta`.`alamat` AS `Alamat Mahasiswa`,`tds`.`nama_dosen` AS `Dosen Pembimbing`,`tds`.`umur` AS `Umur Dosen` from (`tb_mahasiswa` `ta` left join `tb_dosen` `tds` on(`ta`.`id_dosen` = `tds`.`id_dosen`));

-- 2022-06-20 23:02:17
