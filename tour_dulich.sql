-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2021 at 06:16 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tour_dulich`
--

-- --------------------------------------------------------

--
-- Table structure for table `chiphi`
--

CREATE TABLE `chiphi` (
  `macp` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tongchiphi` int(11) NOT NULL,
  `chitiet` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT 'lưu danh sách chi phí (json)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chiphi`
--

INSERT INTO `chiphi` (`macp`, `madoan`, `tongchiphi`, `chitiet`) VALUES
('cp1', 'D1', 500000, 'ăn uống'),
('cp2', 'D2', 1000000, 'ăn uống');

-- --------------------------------------------------------

--
-- Table structure for table `diadiem`
--

CREATE TABLE `diadiem` (
  `madd` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `thanhpho` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tendd` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `diadiem`
--

INSERT INTO `diadiem` (`madd`, `thanhpho`, `tendd`, `mota`) VALUES
('10000', 'Hồ Gươm', 'TP. Hà Nội', 'Tham quan'),
('43000', 'Hà Tĩnh', 'Hà Tĩnh', 'Hà Tĩnh'),
('47000', 'Huế', 'Thừa Thiên Huế', 'Huế'),
('70000', 'Quận 1', 'TP. Hồ Chí Minh', 'Phố đi bộ Nguyễn Huệ'),
('74000', 'Vũng Tàu', 'Bà Rịa Vũng Tàu', 'du lịch');

-- --------------------------------------------------------

--
-- Table structure for table `doan`
--

CREATE TABLE `doan` (
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tendoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaydi` date NOT NULL,
  `ngayve` date NOT NULL,
  `chitietchuongtrinh` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `doan`
--

INSERT INTO `doan` (`madoan`, `matour`, `tendoan`, `ngaydi`, `ngayve`, `chitietchuongtrinh`) VALUES
('D1', 't12', 'Khoa CNTT', '2021-03-24', '2021-03-31', 'chi tiết'),
('D2', 't12', 'Khoa Kế Toán', '2021-03-25', '2021-03-30', 'Tham quan');

-- --------------------------------------------------------

--
-- Table structure for table `gia`
--

CREATE TABLE `gia` (
  `magia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sotien` int(11) NOT NULL,
  `tungay` date NOT NULL,
  `denngay` date NOT NULL,
  `songay` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `gia`
--

INSERT INTO `gia` (`magia`, `matour`, `sotien`, `tungay`, `denngay`, `songay`) VALUES
('g1', 't1', 4900000, '2021-03-24', '2021-03-31', 7),
('g13', 't1', 630000000, '2021-03-24', '2021-03-31', 7),
('g133', 't12', 80000000, '2021-03-24', '2021-04-01', 8),
('g2', 't12', 73500000, '2021-03-24', '2021-03-31', 7),
('g3', 't12', 1396500000, '2021-03-24', '2021-04-12', 19);

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `makh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tenkh` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`makh`, `madoan`, `tenkh`, `sdt`, `ngaysinh`, `email`) VALUES
('kh1', 'D1', 'Nhật Duy', '0123456798', '2000-09-20', 'nhatduytran113@gmail.com'),
('kh13', 'D1', 'Nhật Duy', '0123456798', '2000-09-20', 'nhatduytran113@gmail.com'),
('kh133', 'D1', 'Nhật Duy', '0123456798', '2000-09-20', 'nhatduytran113@gmail.com'),
('kh1335', 'D1', 'Nhật Duy', '0123456798', '2000-09-20', 'nhatduytran113@gmail.com'),
('kh2', 'D2', 'Trà Mi', '0123654789', '2021-03-04', 'mi@gmail.com'),
('kh21', 'D2', 'Trà Mi', '0123654789', '2021-03-04', 'mi@gmail.com'),
('kh211', 'D2', 'Trà Mi', '0123654789', '2021-03-04', 'mi@gmail.com'),
('kh2313', 'D1', 'Bình', '0258741339', '2000-03-08', 'b@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `madoan` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tennv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `nhiemvu` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`manv`, `madoan`, `tennv`, `sdt`, `ngaysinh`, `email`, `nhiemvu`) VALUES
('Nv1', 'D1', 'Phát', '0987654321', '2000-03-04', 'dat@gmail.com', 'Hướng dẫn viên'),
('Nv2', 'D2', 'Phát', '0963258741', '2000-03-02', 'd@gmail.com', 'Tài xế'),
('Nv3', 'D1', 'Phát', '0987654321', '2000-03-04', 'dat@gmail.com', 'Lơ xe');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`username`, `password`) VALUES
('admin', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `tours`
--

CREATE TABLE `tours` (
  `matour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tentour` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `diemdulich` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `xuatphat` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `mota` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tours`
--

INSERT INTO `tours` (`matour`, `tentour`, `diemdulich`, `xuatphat`, `mota`) VALUES
('t1', 'a', 'a-a', 'a', 'a'),
('t12', 'a', 'a-a', '<Tự động>', 'a'),
('t126029', 'a', 'TP. Hồ Chí Minh-Hà Tĩnh', 'TP. Hồ Chí Minh', 'a'),
('t1260295667', 'a', 'TP. Hồ Chí Minh-Hà Tĩnh-Thừa Thiên Huế', 'TP. Hồ Chí Minh', 'a'),
('t2', 'a', 'TP. Hồ Chí Minh-Hà Tĩnh-TP. Hà Nội', 'TP. Hồ Chí Minh', 'a'),
('t3', 'a', 'Thừa Thiên Huế-Hà Tĩnh-Thừa Thiên Huế', 'Thừa Thiên Huế', 'a'),
('t4', 'a', 'Thừa Thiên Huế-Bà Rịa Vũng Tàu-TP. Hồ Chí Minh', 'Thừa Thiên Huế', 'a');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD PRIMARY KEY (`macp`,`madoan`),
  ADD KEY `doan_id` (`madoan`);

--
-- Indexes for table `diadiem`
--
ALTER TABLE `diadiem`
  ADD PRIMARY KEY (`madd`);

--
-- Indexes for table `doan`
--
ALTER TABLE `doan`
  ADD PRIMARY KEY (`madoan`),
  ADD KEY `tour_id` (`matour`);

--
-- Indexes for table `gia`
--
ALTER TABLE `gia`
  ADD PRIMARY KEY (`magia`),
  ADD KEY `madd` (`matour`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`makh`),
  ADD KEY `madoan` (`madoan`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`),
  ADD KEY `madoan` (`madoan`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tours`
--
ALTER TABLE `tours`
  ADD PRIMARY KEY (`matour`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chiphi`
--
ALTER TABLE `chiphi`
  ADD CONSTRAINT `chiphi_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `doan`
--
ALTER TABLE `doan`
  ADD CONSTRAINT `doan_ibfk_1` FOREIGN KEY (`matour`) REFERENCES `tours` (`matour`);

--
-- Constraints for table `gia`
--
ALTER TABLE `gia`
  ADD CONSTRAINT `gia_ibfk_1` FOREIGN KEY (`matour`) REFERENCES `tours` (`matour`);

--
-- Constraints for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`madoan`) REFERENCES `doan` (`madoan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
