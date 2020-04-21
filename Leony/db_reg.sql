create table tb_registrasi(
    id_ktpormhs int(25) primary key,
    nama varchar(30),
    nomor varchar(16),
    email varchar(30),
    pekerjaan varchar(20),
    alamat varchar(20),
    password varchar(8),
    konfirmasi varchar(8)
)