CREATE DATABASE quanlynhansu;
USE quanlynhansu;
CREATE TABLE ViTri (
    idvitri INT PRIMARY KEY,
    tenvitri VARCHAR(45)
);
insert into ViTri values ('01','lễ tân');
insert into ViTri values ('02','phuc vụ');
insert into ViTri values ('03','chuyên viên');
insert into ViTri values ('04','giám sát');
insert into ViTri values ('05','quản lý');
insert into ViTri values ('06','giá đốc');
create table TrinhDo(
	idtrinhdo int primary key,
    trinhdo varchar(45)
);
insert into TrinhDo values ('01','trung cấp');
insert into TrinhDo values ('02','cao đẳng');
insert into TrinhDo values ('03','đại học');
insert into TrinhDo values ('04','sau đại học');
create table BoPhan(
	idbophan int primary key,
    tenbophan varchar(45)
);
insert into BoPhan values ('01','Sale Marketting');
insert into BoPhan values ('02','hành chính');
insert into BoPhan values ('03','phục vụ');
insert into BoPhan values ('04','quản lý');
CREATE TABLE NhanVien (
    idnhanvien INT PRIMARY KEY,
    Hoten VARCHAR(45),
    idvitri INT,
    idtrinhdo INT,
    idbophan INT,
    ngaysinh DATE,
    socmnd VARCHAR(45),
    luong VARCHAR(45),
    sdt VARCHAR(45),
    email VARCHAR(45),
    diachi VARCHAR(45),
    FOREIGN KEY (idvitri)
        REFERENCES ViTri (idvitri),
    FOREIGN KEY (idtrinhdo)
        REFERENCES TrinhDo (idtrinhdo),
    FOREIGN KEY (idbophan)
        REFERENCES BoPhan (idbophan)
);
insert into NhanVien(idnhanvien,Hoten,idvitri,idtrinhdo,idbophan,ngaysinh,socmnd,luong,sdt,email,diachi)
values(0001,'Hoàng Văn An',3,2,1,2000/4/4,'197498491','10000000','0906654312','an@gmail.com','Quảng Trị');
insert into NhanVien(idnhanvien,Hoten,idvitri,idtrinhdo,idbophan,ngaysinh,socmnd,luong,sdt,email,diachi)
values(0002,'Nguyễn Huấn',5,1,2,'1999/8/15','197324746','15500000','090523456','huannguyen99@gmail.com','Đà Nẵng');
insert into NhanVien(idnhanvien,Hoten,idvitri,idtrinhdo,idbophan,ngaysinh,socmnd,luong,sdt,email,diachi)
values(0003,'Nguyễn Thị Khánh',5,3,4,'1996/4/7','197012478','12000000','0905123456','khanh96@gmail.com','Quảng Nam');
insert into NhanVien(idnhanvien,Hoten,idvitri,idtrinhdo,idbophan,ngaysinh,socmnd,luong,sdt,email,diachi)
values(0004,'Trần Tuấn ',5,1,3,'1990/5/5','197016987','15000000','0905123456','trantuan@gmail.com','Quảng Trị');
create table DichVuDiKem(
	iddichvudikem int primary key,
	tendichvudikem varchar(45),
    gia int,
    donvi varchar(45),
    trangthaikhadung varchar(45)
);
insert into DichVuDiKem values ('01','massage','500000','giờ ','khả dụng');
insert into DichVuDiKem values ('02','karaoke','80000','giờ','sẵn sàng');
insert into DichVuDiKem values ('03','thức ăn','30000','phần','sẵn sàng');
insert into DichVuDiKem values ('04','thức uống','10000','chai','sẵn sàng');
insert into DichVuDiKem values ('05','thuê xe','100000','lượt','sẵn sàng');
create table LoaiKhach(
	idloaikhach int primary key,
    tenloaikhach varchar(45)
);
insert into LoaiKhach values ('01','diamond');
insert into LoaiKhach values ('02','platinum');
insert into LoaiKhach values ('03','gold');
insert into LoaiKhach values ('04','silver');
insert into LoaiKhach values ('05','member');
create table KieuThue(
	idkieuthue int primary key,
    tenkieuthue varchar(45),
    gia int
);
insert into Kieuthue values ('01','năm','60000000');
insert into Kieuthue values ('02','tháng','6000000');
insert into Kieuthue values ('03','ngày','500000');
insert into Kieuthue values ('04','giờ','100000');
create table LoaiDichVu(
	idloaidichvu int primary key,
    tenloaidichvu varchar(45)
);
insert into LoaiDichVu values ('01','Villa');
insert into LoaiDichVu values ('02','House');
insert into LoaiDichVu values ('03','Phòng');
create table KhachHang(
	idkhachhang int primary key,
    idloaikhach int,
    hoten varchar(45),
    ngaysinh date,
    socmnd varchar(45),
    sdt varchar(45),
    email varchar(45),
    diachi varchar(45),
    foreign key (idloaikhach) references LoaiKhach(idloaikhach)
);
insert into KhachHang(idkhachhang,idloaikhach,hoten,ngaysinh ,socmnd,sdt,email,diachi)
values(01,1,'Hoàng Bùi','1960/06/09','16581237','0918123789','buihoang@gmail.com','Quảng Trị');
insert into KhachHang(idkhachhang,idloaikhach,hoten,ngaysinh ,socmnd,sdt,email,diachi)
values(02,2,'Nguyễn Thị Lựu','1945/12/09','13581275','0935555555','buthoang@gmail.com','Quảng Bình');
insert into KhachHang(idkhachhang,idloaikhach,hoten,ngaysinh ,socmnd,sdt,email,diachi)
values(03,4,'Lê Thị Hồng','1960/06/09','19763514','0908888668','hongle@gmail.com','Quảng Ngãi');
insert into KhachHang(idkhachhang,idloaikhach,hoten,ngaysinh ,socmnd,sdt,email,diachi)
values(04,3,'Lê Tập','1989/06/09','18546354','0906666666','letap@gmail.com','Hà Nội');
insert into KhachHang(idkhachhang,idloaikhach,hoten,ngaysinh ,socmnd,sdt,email,diachi)
values(05,1,'Hoàng Duc','1955/06/09','175821463','0982455555','duchoang@gmail.com','Đà Nẵng');
insert into KhachHang(idkhachhang,idloaikhach,hoten,ngaysinh ,socmnd,sdt,email,diachi)
values(06,1,'Nguyễn Nguyên','1999/06/09','175821500','0982466666','nguyen@gmail.com','Đà Nẵng');
create table DichVu(
	iddichvu int primary key,
	tendichvu varchar(45),
    dientich int,
    sotang int,
    songuoitoida varchar(45),
    chiphithue varchar(45),
    idkieuthue int,
    idloaidichvu int,
    trangthai varchar(45),
    constraint foreign key (idkieuthue) references KieuThue(idkieuthue),
    constraint foreign key (idloaidichvu) references LoaiDichVu(idloaidichvu)
);
insert into DichVu(iddichvu,tendichvu,dientich,sotang,songuoitoida,chiphithue,idkieuthue,idloaidichvu,trangthai)
values(1,'Villa',100,2,'20 người','1000000',2,1,'Chưa Sử Dụng');
insert into DichVu(iddichvu,tendichvu,dientich,sotang,songuoitoida,chiphithue,idkieuthue,idloaidichvu,trangthai)
values(2,'Room',50,1,'4 người','300000',3,3,'Đang Sử Dụng');
insert into DichVu(iddichvu,tendichvu,dientich,sotang,songuoitoida,chiphithue,idkieuthue,idloaidichvu,trangthai)
values(3,'House',80,2,'6 người','120000000',1,2,'Đã Sử Dụng');
create table HopDong(
	idhopdong int primary key,
	idnhanvien int,
    idkhachhang int,
    iddichvu int,
    ngaylamhopdong date,
    ngayketthuc date,
    tiendatcoc int,
    tongtien int,
    constraint foreign key (idnhanvien) references NhanVien(idnhanvien),
    constraint foreign key (idkhachhang) references KhachHang(idkhachhang),
    constraint foreign key (iddichvu) references DichVu(iddichvu)
);
insert into HopDong(idhopdong,idnhanvien,idkhachhang,iddichvu,ngaylamhopdong,ngayketthuc,tiendatcoc,tongtien)
values(001,0001,001,2,'2019/12/01','2019/12/01',300000,300000);
insert into HopDong(idhopdong,idnhanvien,idkhachhang,iddichvu,ngaylamhopdong,ngayketthuc,tiendatcoc,tongtien)
values(002,0002,002,1,'2020/07/05','2020/07/06',500000,1000000);
insert into HopDong(idhopdong,idnhanvien,idkhachhang,iddichvu,ngaylamhopdong,ngayketthuc,tiendatcoc,tongtien)
values(003,0004,001,3,'2018/12/01','2019/11/30',30000000,120000000);
create table HopDongChiTiet(
	idhopdongchitiet int primary key,
    idhopdong int,
    iddichvudikem int,
    soluong int,
    foreign key (idhopdong) references HopDong(idhopdong),
    foreign key (iddichvudikem) references DichVuDiKem(iddichvudikem)
);
insert into HopDongChiTiet(idhopdongchitiet,idhopdong,iddichvudikem,soluong)
values(1,001,1,1);
insert into HopDongChiTiet(idhopdongchitiet,idhopdong,iddichvudikem,soluong)
values(2,002,3,5);
insert into HopDongChiTiet(idhopdongchitiet,idhopdong,iddichvudikem,soluong)
values(3,003,4,5);
----- cau21
create or replace view V_NHANVIEN as select a.*
from nhanvien as a
join hopdong as b on a.idnhanvien=b.idnhanvien
where
a.diachi like "%Đà Nẵng%" 
and b.ngaylamhopdong='2019/12/12';
----- cau22
update V_NHANVIEN
set diachi="Liên Chiểu";
----- cau23
create index IX_KHACHHANG on KhachHang(IDKhachHang);
-- đối với cơ sở dữ liệu nhỏ không nhìn thấy sự hiệu quả của index
----- cau24
EXPLAIN select * from khachhang
where diachi like "%Quảng Trị%" and sdt like "%0918123789%";

CREATE UNIQUE INDEX IX_SoDT_DiaChi
ON khachhang (diachi, sdt);

EXPLAIN select * from khachhang
where diadchi like "%Quảng Trị%" and sdt like "%0918123789%";
----- cau25
DELIMITER //
CREATE PROCEDURE Sp_1(	
IN id_kh INT,
OUT message VARCHAR(50)
)
IF id_kh in (Select idkhachhang from khachhang) THEN
BEGIN
	DELETE FROM khachhang WHERE khachhang.idkhachhang = id_kh;
    SET message = "Đã xóa khách hàng" ;
END;
ELSE
BEGIN
SET message = "Khách hàng không tồn tại" ;
END;
END IF;
//  DELIMITER ;
----- cau26
DELIMITER //
CREATE PROCEDURE Sp_2(in IDHopDong int, IDNhanVien int, IDKhachhang int, IDDichVu int , 
		Ngaylamhopdong date, Ngayketthuc date, TienDatCoc int, Tongtien int)

BEGIN 
INSERT INTO hopdong
VALUES ( IDHopDong, IDNhanVien, IDKhachhang , IDDichVu , Ngaylamhopdong , Ngayketthuc , TienDatCoc, Tongtien ) ;
END 
//  DELIMITER 
call Sp_2(5 ,2 , 2, 2, '2020-02-02', '2020-03-03', 700, 1000)
----- cau27
DELIMITER // 
create trigger Tr_1 
after delete on hopdong
for each row 
begin
	select count(*) into @a from hopdong;
end;
//  DELIMITER     
alter table hopdongchitiet
add constraint fk_hoten
FOREIGN KEY (IDHopDong) REFERENCES hopdong(IDHopDong)
ON DELETE CASCADE;
delete from hopdong
where IDHopDong=10;
----- cau29a
DELIMITER //
CREATE FUNCTION func_1(
	tongtien int
) 
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
    DECLARE dem varchar(20);
    IF tongtien>2000000 Then 
    Set dem=1;
    ELSEIF tongtien < 200000 THEN
        SET dem = 0;
    End if;
    return (dem);
END//
DELIMITER ;
select tongtien,tendichvu ,func_1(tongtien) as solan
from hopdong a, dichvu b,loaidichvu c
where a.iddichvu=b.iddichvu
and  b.idloaidichvu=c.idloaidichvu
and a.tongtien >2000000;
------ cau29b
DELIMITER //
CREATE FUNCTION func_2(
	idkhachhang int
) 
RETURNS varchar(20)
DETERMINISTIC
BEGIN
    DECLARE songay varchar(20);
    IF idkhachhang > 0 THEN
		SET songay =datediff(ngayketthuc,ngaylamhopdong);
        ELSEIF idkhachang < 0 THEN
        SET songay = 0;
    END IF;
	-- return the student level
	RETURN (songay);
END//
DELIMITER ;
select func_2(idkhachhang) as songay
from hopdong 
where datediff(ngayketthuc,ngaylamhopdong)
order by songay desc
limit 1;
