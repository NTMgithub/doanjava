-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 23, 2020 at 07:03 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.3.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `doanjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_chitiethd`
--

CREATE TABLE `tbl_chitiethd` (
  `maHD` int(11) NOT NULL,
  `maSP` int(11) NOT NULL,
  `soLuongSP` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `donGiaSP` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `thanhTien` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_chucvu`
--

CREATE TABLE `tbl_chucvu` (
  `maChucVu` int(11) NOT NULL,
  `tenChucVu` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbl_chucvu`
--

INSERT INTO `tbl_chucvu` (`maChucVu`, `tenChucVu`) VALUES
(1, 'admin'),
(2, 'manager');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_hoadon`
--

CREATE TABLE `tbl_hoadon` (
  `maHD` int(11) NOT NULL,
  `maKH` int(11) NOT NULL,
  `maNV` int(11) NOT NULL,
  `ngayLapHD` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tongTienHD` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_khachhang`
--

CREATE TABLE `tbl_khachhang` (
  `maKH` int(11) NOT NULL,
  `hoTenKH` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `diaChiKH` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `sdtKH` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cmndKH` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `gioiTinhKH` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_nhacungcap`
--

CREATE TABLE `tbl_nhacungcap` (
  `maNCC` int(11) NOT NULL,
  `diaChiNCC` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `sdtNCC` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_nhanvien`
--

CREATE TABLE `tbl_nhanvien` (
  `maNV` int(11) NOT NULL,
  `maChucVu` int(11) NOT NULL,
  `tenTaiKhoanNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `matKhauNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `hoTenNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `diaChiNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `sdtNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cmndNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `gioiTinhNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `anhNV` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbl_nhanvien`
--

INSERT INTO `tbl_nhanvien` (`maNV`, `maChucVu`, `tenTaiKhoanNV`, `matKhauNV`, `hoTenNV`, `diaChiNV`, `sdtNV`, `cmndNV`, `gioiTinhNV`, `anhNV`) VALUES
(2, 1, 'admin', 'admin', 'Nguyen Van Admin', 'Dia chi ne', '0913091049', '234234', '32432434', 'asdad'),
(3, 1, 'thephong', '123', 'Nguyễn Thế Phong', 'Địa chỉ nè', 'SDT nè', 'CMND nè', 'Nam', 'Ảnh nè'),
(4, 1, 'anhphi', '123', 'Lê Hồ Anh Phi', 'Dịa chỉ nè', 'SDT nè', 'CMND nè', 'Nam', 'Ảnh nè'),
(5, 2, 'manager', '123', 'Manager', 'Dịa chỉ manager', 'sdt manager', 'cmnd manager', 'giói tính manager', 'ảnh manager');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sanpham`
--

CREATE TABLE `tbl_sanpham` (
  `maSP` int(11) NOT NULL,
  `maNCC` int(10) NOT NULL,
  `tenSP` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `sizeSP` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `soLuongSP` int(10) NOT NULL,
  `mieuTaSP` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `donGiaSP` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_chitiethd`
--
ALTER TABLE `tbl_chitiethd`
  ADD PRIMARY KEY (`maHD`),
  ADD KEY `maSP` (`maSP`);

--
-- Indexes for table `tbl_chucvu`
--
ALTER TABLE `tbl_chucvu`
  ADD PRIMARY KEY (`maChucVu`);

--
-- Indexes for table `tbl_hoadon`
--
ALTER TABLE `tbl_hoadon`
  ADD PRIMARY KEY (`maHD`),
  ADD KEY `maKH` (`maKH`),
  ADD KEY `maNV` (`maNV`);

--
-- Indexes for table `tbl_khachhang`
--
ALTER TABLE `tbl_khachhang`
  ADD PRIMARY KEY (`maKH`);

--
-- Indexes for table `tbl_nhacungcap`
--
ALTER TABLE `tbl_nhacungcap`
  ADD PRIMARY KEY (`maNCC`);

--
-- Indexes for table `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  ADD PRIMARY KEY (`maNV`),
  ADD KEY `maChucVu` (`maChucVu`);

--
-- Indexes for table `tbl_sanpham`
--
ALTER TABLE `tbl_sanpham`
  ADD PRIMARY KEY (`maSP`),
  ADD KEY `maNCC` (`maNCC`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_chucvu`
--
ALTER TABLE `tbl_chucvu`
  MODIFY `maChucVu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_hoadon`
--
ALTER TABLE `tbl_hoadon`
  MODIFY `maHD` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_khachhang`
--
ALTER TABLE `tbl_khachhang`
  MODIFY `maKH` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_nhacungcap`
--
ALTER TABLE `tbl_nhacungcap`
  MODIFY `maNCC` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  MODIFY `maNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_sanpham`
--
ALTER TABLE `tbl_sanpham`
  MODIFY `maSP` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_chitiethd`
--
ALTER TABLE `tbl_chitiethd`
  ADD CONSTRAINT `tbl_chitiethd_ibfk_1` FOREIGN KEY (`maHD`) REFERENCES `tbl_hoadon` (`maHD`),
  ADD CONSTRAINT `tbl_chitiethd_ibfk_2` FOREIGN KEY (`maSP`) REFERENCES `tbl_sanpham` (`maSP`);

--
-- Constraints for table `tbl_hoadon`
--
ALTER TABLE `tbl_hoadon`
  ADD CONSTRAINT `tbl_hoadon_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `tbl_khachhang` (`maKH`),
  ADD CONSTRAINT `tbl_hoadon_ibfk_2` FOREIGN KEY (`maNV`) REFERENCES `tbl_nhanvien` (`maNV`);

--
-- Constraints for table `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  ADD CONSTRAINT `tbl_nhanvien_ibfk_1` FOREIGN KEY (`maChucVu`) REFERENCES `tbl_chucvu` (`maChucVu`);

--
-- Constraints for table `tbl_sanpham`
--
ALTER TABLE `tbl_sanpham`
  ADD CONSTRAINT `tbl_sanpham_ibfk_1` FOREIGN KEY (`maNCC`) REFERENCES `tbl_nhacungcap` (`maNCC`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
