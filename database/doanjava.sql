-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th9 16, 2022 lúc 11:32 AM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `doanjava`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_chitiethd`
--

CREATE TABLE `tbl_chitiethd` (
  `maChiTietHD` int(10) NOT NULL,
  `maHD` int(10) NOT NULL,
  `tenNV` varchar(255) NOT NULL,
  `tenKH` varchar(255) NOT NULL,
  `diaChiGiaoHang` varchar(255) NOT NULL,
  `sdtGiaoHang` int(10) NOT NULL,
  `maSP` int(10) NOT NULL,
  `tenSP` varchar(255) NOT NULL,
  `sizeSP` int(10) NOT NULL,
  `donGiaSP` int(10) NOT NULL,
  `soLuongSP` int(10) NOT NULL,
  `thanhTien` int(10) NOT NULL,
  `ghiChu` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_chitiethd`
--

INSERT INTO `tbl_chitiethd` (`maChiTietHD`, `maHD`, `tenNV`, `tenKH`, `diaChiGiaoHang`, `sdtGiaoHang`, `maSP`, `tenSP`, `sizeSP`, `donGiaSP`, `soLuongSP`, `thanhTien`, `ghiChu`) VALUES
(1, 1, 'Nguyễn Thương Mến', 'Trần Thanh Phong', 'Long An', 34342433, 234, 'Puma RS-X Hard Drive Mens White/Galaxy Blue', 40, 2400000, 5, 12000000, ''),
(2, 1, 'Nguyễn Thương Mến', 'Trần Thanh Phong', 'Long An', 34342433, 345, 'VANS OLD SKOOL BLACK', 41, 1700000, 4, 6800000, ''),
(3, 1, 'Nguyễn Thương Mến', 'Nguyễn Văn Hoàng', 'Hà Nội', 394939495, 234, 'Puma RS-X Hard Drive Mens White/Galaxy Blue', 40, 2400000, 5, 12000000, ''),
(4, 1, 'Nguyễn Thương Mến', 'Nguyễn Văn Hoàng', 'Hà Nội', 394939495, 345, 'VANS OLD SKOOL BLACK', 41, 1700000, 4, 6800000, ''),
(5, 1, 'Nguyễn Thương Mến', 'Trần Văn Tiến', '78 Nguyễn Văn Cừ, P2, Q5, HCMM', 345838581, 234, 'Puma RS-X Hard Drive Mens White/Galaxy Blue', 40, 2400000, 5, 12000000, ''),
(6, 1, 'Nguyễn Thương Mến', 'Trần Văn Tiến', '78 Nguyễn Văn Cừ, P2, Q5, HCMM', 345838581, 345, 'VANS OLD SKOOL BLACK', 41, 1700000, 4, 6800000, ''),
(7, 2, 'Trần Thanh Phong', 'Trần Thanh Phong', 'Long An', 34342433, 324, 'CONVERSE CHUCK TAYLOR CLASSIC BLACK', 41, 1500000, 12, 18000000, ''),
(8, 2, 'Trần Thanh Phong', 'Trần Thanh Phong', 'Long An', 34342433, 234, 'Puma RS-X Hard Drive Mens White/Galaxy Blue', 40, 2400000, 1, 2400000, ''),
(9, 3, 'Trần Thanh Phong', 'Kiều Oanh', 'Tân Bình', 453450454, 45, 'BASAS BUMPER GUM - LOW TOP - OFFWHITE', 38, 450000, 2, 900000, ''),
(10, 3, 'Trần Thanh Phong', 'Kiều Oanh', 'Tân Bình', 453450454, 324, 'CONVERSE CHUCK TAYLOR CLASSIC BLACK', 41, 1500000, 1, 1500000, ''),
(11, 4, 'Trần Thanh Phong', 'Nguyễn Văn Hoàng', 'Hà Nội', 394939495, 345, 'VANS OLD SKOOL BLACK', 41, 1700000, 2, 3400000, ''),
(12, 4, 'Trần Thanh Phong', 'Nguyễn Văn Hoàng', 'Hà Nội', 394939495, 546, 'NEW BALANCE 530 BLACK WHITE', 39, 1500000, 2, 3000000, ''),
(13, 5, 'Nguyễn Văn Admin', 'Trần Thanh Phong', '84 Nguyễn Trãi, Q5', 454543353, 231, 'AIR JORDAN RETRO 4', 41, 5500000, 2, 11000000, 'ýe'),
(14, 5, 'Nguyễn Văn Admin', 'Trần Thanh Phong', '84 Nguyễn Trãi, Q5', 454543353, 23, 'NIKE AIR FORCE 1 SHADOW AQUA PINK', 39, 4600000, 1, 4600000, 'ýe');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_chitietphieunhap`
--

CREATE TABLE `tbl_chitietphieunhap` (
  `maCTPN` int(11) NOT NULL,
  `maPhieuNhap` int(11) NOT NULL,
  `maSP` int(11) NOT NULL,
  `soLuongNhap` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_chitietphieunhap`
--

INSERT INTO `tbl_chitietphieunhap` (`maCTPN`, `maPhieuNhap`, `maSP`, `soLuongNhap`) VALUES
(1, 1, 234, 100),
(2, 1, 324, 50),
(3, 1, 546, 300),
(4, 2, 789, 90),
(5, 2, 2344, 35),
(6, 2, 2345, 68),
(7, 2, 3454, 234),
(8, 2, 23, 234),
(9, 2, 19, 166),
(10, 3, 564, 345),
(11, 3, 345, 23),
(12, 3, 45, 56),
(13, 3, 12, 67),
(14, 4, 4535, 45),
(15, 4, 7853, 45),
(16, 5, 231, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_chucvu`
--

CREATE TABLE `tbl_chucvu` (
  `maChucVu` int(11) NOT NULL,
  `tenChucVu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_chucvu`
--

INSERT INTO `tbl_chucvu` (`maChucVu`, `tenChucVu`) VALUES
(1, 'admin'),
(2, 'manager');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_danhmuc`
--

CREATE TABLE `tbl_danhmuc` (
  `maDM` int(10) NOT NULL,
  `tenDM` varchar(255) NOT NULL,
  `soLuongSPDM` int(10) NOT NULL DEFAULT 0,
  `trangThaiDM` varchar(255) NOT NULL DEFAULT 'Mở'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_danhmuc`
--

INSERT INTO `tbl_danhmuc` (`maDM`, `tenDM`, `soLuongSPDM`, `trangThaiDM`) VALUES
(1, 'ADIDAS', 1, 'Mở'),
(2, 'NIKEs', 32, 'Mở'),
(3, 'CONVERSE', 5, 'Mở'),
(4, 'VANS', 21, 'Mở'),
(234, 'RieVienan', 0, 'Mở'),
(3454, 'PUMA', 0, 'Khóa');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_giamgia`
--

CREATE TABLE `tbl_giamgia` (
  `maGiamGia` varchar(255) NOT NULL,
  `tenGiamGia` varchar(255) NOT NULL,
  `soLuongGiam` int(10) NOT NULL,
  `soLuongConLai` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_hoadon`
--

CREATE TABLE `tbl_hoadon` (
  `maHD` int(11) NOT NULL,
  `maKH` int(11) NOT NULL,
  `maNV` int(11) NOT NULL,
  `ngayLapHD` date NOT NULL,
  `tongTienHD` int(11) NOT NULL,
  `trangThaiHD` varchar(255) NOT NULL DEFAULT 'Mở'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_hoadon`
--

INSERT INTO `tbl_hoadon` (`maHD`, `maKH`, `maNV`, `ngayLapHD`, `tongTienHD`, `trangThaiHD`) VALUES
(1, 12, 2, '2020-06-19', 18800000, 'Mở'),
(2, 12, 3, '2020-06-19', 20400000, 'Mở'),
(3, 324, 3, '2020-06-19', 2400000, 'Mở'),
(4, 67, 3, '2020-06-19', 6400000, 'Mở'),
(5, 3424, 1, '2022-09-09', 15600000, 'Mở');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_khachhang`
--

CREATE TABLE `tbl_khachhang` (
  `maKH` int(11) NOT NULL,
  `hoTenKH` varchar(255) NOT NULL,
  `diaChiKH` varchar(255) NOT NULL,
  `sdtKH` varchar(255) NOT NULL,
  `cmndKH` varchar(255) NOT NULL,
  `gioiTinhKH` varchar(255) NOT NULL,
  `trangThaiKH` varchar(255) NOT NULL DEFAULT 'Mở'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_khachhang`
--

INSERT INTO `tbl_khachhang` (`maKH`, `hoTenKH`, `diaChiKH`, `sdtKH`, `cmndKH`, `gioiTinhKH`, `trangThaiKH`) VALUES
(12, 'Trần Thanh Phong', 'Long An', '034342433', '234625345', 'Nam', 'Mở'),
(23, 'Trần Văn Tiến', '78 Nguyễn Văn Cừ, P2, Q5, HCMM', '0345838581', '873732723', 'Nam', 'Mở'),
(54, 'Nguyễn Thanh Toán', '34 Nguyễn Trãi, P1, Q5, HCM', '0949529592', '347737787', 'Nam', 'Mở'),
(67, 'Nguyễn Văn Hoàng', 'Hà Nội', '0394939495', '345234567', 'Nam', 'Mở'),
(98, 'Hùng Lâm', 'Quận 10', '0459345345', '342442123', 'Nam', 'Mở'),
(324, 'Kiều Oanh', 'Tân Bình', '0453450454', '345765234', 'Nữ', 'Mở'),
(546, 'Nguyễn Thế Phong', 'HCM', '0453455443', '345123567', 'Nam', 'Mở'),
(676, 'Tài Smile', 'Đà Lạt', '0342342342', '234343324', 'Khác', 'Mở'),
(3424, 'Trần Thanh Phong', '84 Nguyễn Trãi, Q5', '0454543353', '234432234', 'Nam', 'Mở');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nhacungcap`
--

CREATE TABLE `tbl_nhacungcap` (
  `maNCC` int(11) NOT NULL,
  `tenNCC` varchar(255) NOT NULL,
  `diaChiNCC` varchar(255) NOT NULL,
  `sdtNCC` int(11) NOT NULL,
  `soLuongSPNCC` int(10) NOT NULL DEFAULT 0,
  `trangThaiNCC` varchar(255) NOT NULL DEFAULT 'Mở'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_nhacungcap`
--

INSERT INTO `tbl_nhacungcap` (`maNCC`, `tenNCC`, `diaChiNCC`, `sdtNCC`, `soLuongSPNCC`, `trangThaiNCC`) VALUES
(12, 'Nike Crescent Mall', 'Tầng 2, Tòa nhà Crescent Mall, Phú Mỹ Hưng, Q. 7, TP. HCM', 254115559, 2, 'Mở'),
(23, 'Nike 93 Nguyễn Trãi', '93-95 Nguyễn Trãi, P. Bến Thành, Q. 1, TP. HCM', 283620906, 3, 'Mở'),
(56, 'Kho giày tân bình', '45 Út Tịch', 49543234, 0, 'Mở'),
(79, 'Adidas Bitexco', 'Tòa nhà Bitexco, số 2 Hải Triều, quận 1, thành phố Hồ Chí Minh', 283916079, 3, 'Mở'),
(89, 'Vans house', '89 Âu Cơ', 945424354, 0, 'Mở'),
(90, 'Ananas Store', '78 Nguyễn Trãi', 413231923, 0, 'Mở');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nhanvien`
--

CREATE TABLE `tbl_nhanvien` (
  `maNV` int(11) NOT NULL,
  `maChucVu` int(11) NOT NULL,
  `tenTaiKhoanNV` varchar(255) NOT NULL,
  `matKhauNV` varchar(255) NOT NULL,
  `hoTenNV` varchar(255) NOT NULL,
  `diaChiNV` varchar(255) NOT NULL,
  `sdtNV` varchar(255) NOT NULL,
  `cmndNV` varchar(255) NOT NULL,
  `gioiTinhNV` varchar(255) NOT NULL,
  `trangThaiNV` varchar(20) NOT NULL DEFAULT 'Mở',
  `anhNV` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_nhanvien`
--

INSERT INTO `tbl_nhanvien` (`maNV`, `maChucVu`, `tenTaiKhoanNV`, `matKhauNV`, `hoTenNV`, `diaChiNV`, `sdtNV`, `cmndNV`, `gioiTinhNV`, `trangThaiNV`, `anhNV`) VALUES
(1, 1, 'admin', 'admin', 'Nguyễn Văn Admin', 'Địa chỉ Admin', '0349529529', '349943943', 'Nam', 'Mở', '1663302522811.jpg'),
(2, 1, 'men', '123', 'Nguyễn Thương Mến', 'Địa chỉ Mến', '0539539539', '3498428429', 'Nam', 'Mở', '1663302538663.jpg'),
(3, 1, 'thanhphong', '123', 'Trần Thanh Phong', 'Địa chỉ Phong', '0340535035', '349491349', 'Nam', 'Mở', '1663302558588.jpg'),
(4, 1, 'thephong', '123', 'Nguyễn Thế Phong', 'Địa chỉ Phong', '0239429429', '348843834', 'Nam', 'Mở', '1663302574604.png'),
(5, 1, 'anhphi', '123', 'Lê Hồ Anh Phi', 'Địa chỉ Phi', '0345062062', '3450260260', 'Nam', 'Mở', '1663302588382.jpg'),
(6, 2, 'ngocminh1', '1234', 'Lưu Ngọc Minh', '6744 Phố Trần Nương Toản', '056 107 4856', '342626525', 'Nam', 'Mở', '1663302607265.jpg'),
(33, 1, 'dontheu', 'VE51T5nbC4P', 'Võ Quang Thạch', '9697 Phố Khai', '0580713434', '343842344', 'Nam', 'Mở', '1663302620701.png'),
(34, 1, 'duyhoang', '2409934', 'Phan Duy Hoàng', 'Binh Thuan', '032949420', '3242562626', 'Nam', 'Mở', '1663302632629.jpg'),
(45, 2, 'vietdungng', '45i09340gk', 'Sái Việt Dũng', 'HCM', '0293429402', '293498525', 'Khác', 'Mở', '1663302643316.jpg'),
(46, 2, 'chithanh23', '2626', 'Mai Chí Thành', 'Hải Phòng', '039425059205', '3409294024', 'Nam', 'Mở', '1663302655236.jpg'),
(63, 1, 'xuancung', '234255', 'Lê Xuân Cung', 'Ha Noi', '0923498529', '236224642', 'Nữ', 'Mở', '1663302674637.jpg'),
(66, 2, 'duchuy', '234134', 'Cao Ðức Huy', '821 Phố Trương San Nghị', '0349924244', '32424244244', 'Khác', 'Mở', '1663302692617.jpg'),
(87, 1, 'nghiadung', '23525', 'Huỳnh Nghĩa Dũng', 'Ninh Thuan', '0396269520', '2309592590', 'Nam', 'Mở', '1663302511146.png'),
(167, 2, 'phuongnguyen', '23398', 'Bành Phước Nguyên', 'Binh Dinh', '0324859925', '255627277', 'Nữ', 'Mở', '1663302492184.jpg'),
(233, 2, 'viettien22', '23414', 'Giang Việt Tiến', 'Ha Noi', '023494294', '329493934', 'Nam', 'Mở', '1663302395778.png'),
(234, 1, 'khanhhai', '12344', 'Thi Khánh Hải', 'Hồ Chí Minh', '0295626926', '3462667272', 'Khác', 'Khóa', '?PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\00\0\0\0׬R?\0\0 \0IDATx^??xS?????[???1`??&Hd6?٣ٳI?6M?kF????i?$iҦi?^M?7+?0`c?1x???$[{??kp????JWҽ?{??q??y?{>????\"@?\0 D?p$ ?X??\"@?\0 D\0$ h\"@?\0 ?	?????*\"@?\0 $ h\"@?\0 ?	?????*\"@?\0 $ h\"@?\0 ?	?????*'),
(344, 2, 'vuminh23', '29388', 'Bùi Vũ Minh', 'HCM', '0934349424', '592525986', 'Nam', 'Mở', '1663302288070.jpg'),
(345, 2, 'quynhnhu', '123', 'Nguyễn Ngọc Quỳnh Như', 'Đồng Nai', '0342424244', '123456789', 'Nữ', 'Mở', '1663302261607.jpg'),
(456, 2, 'quanglam', '92334', 'Trang Quang Lâm', 'Ha Noi', '023946206344', '246266272', 'Nữ', 'Mở', '1663302253822.jpg'),
(21312, 1, 'aloaloalo11', 'aloaloalo11', 'Nguyen van alo', 'kksdkkk', '0342343323', '342623425', 'Nam', 'Mở', '1663298420124.png');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phieunhap`
--

CREATE TABLE `tbl_phieunhap` (
  `maPhieuNhap` int(11) NOT NULL,
  `maNV` int(11) NOT NULL,
  `ngayLapPhieu` date NOT NULL,
  `tongSLNhap` int(11) NOT NULL,
  `trangThaiPN` varchar(255) NOT NULL DEFAULT 'Mở'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_phieunhap`
--

INSERT INTO `tbl_phieunhap` (`maPhieuNhap`, `maNV`, `ngayLapPhieu`, `tongSLNhap`, `trangThaiPN`) VALUES
(1, 2, '2020-06-19', 450, 'Khóa'),
(2, 2, '2020-06-19', 827, 'Khóa'),
(3, 2, '2020-06-19', 491, 'Mở'),
(4, 2, '2020-06-19', 90, 'Mở'),
(5, 1, '2022-09-09', 10, 'Mở');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_sanpham`
--

CREATE TABLE `tbl_sanpham` (
  `maSP` int(11) NOT NULL,
  `maNCC` int(10) NOT NULL,
  `maDM` int(10) NOT NULL,
  `tenSP` varchar(255) NOT NULL,
  `sizeSP` int(10) NOT NULL,
  `soLuongSP` int(10) NOT NULL DEFAULT 0,
  `mieuTaSP` varchar(255) NOT NULL,
  `donGiaSP` int(10) NOT NULL,
  `trangThaiSP` varchar(255) NOT NULL DEFAULT 'Mở',
  `anhSP` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_sanpham`
--

INSERT INTO `tbl_sanpham` (`maSP`, `maNCC`, `maDM`, `tenSP`, `sizeSP`, `soLuongSP`, `mieuTaSP`, `donGiaSP`, `trangThaiSP`, `anhSP`) VALUES
(12, 56, 1, 'ASICS GEL-RESPECTOR BLACK GOLD', 39, 67, 'Okeyyyy...kk', 2390000, 'Mở', '1662728173320.jpg'),
(19, 56, 1, 'PUMA RS-100 SOUND MEN\'S SNEAKERS', 43, 166, 'Okeyyy', 1400000, 'Mở', '1662728239245.jpg'),
(23, 56, 1, 'NIKE AIR FORCE 1 SHADOW AQUA PINK', 39, 233, 'Good...', 4600000, 'Mở', '1662728351010.jpg'),
(231, 56, 1, 'AIR JORDAN RETRO 4', 41, 8, 'giày vjp pro', 5500000, 'Mở', '1662728424573.jpg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
