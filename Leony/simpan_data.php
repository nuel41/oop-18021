<!-- php script --
<?php    
include_once("koneksi.php");
    
        $a = $_POST ['id_ktpormhs'];
        $b = $_POST ['nama'];
        $c = $_POST ['nomor'];
        $d = $_POST ['email'];
        $e = $_POST ['pekerjaan'];
        $f = $_POST ['alamat'];
        $g = $_POST ['password'];
        $h = $_POST ['konfirmasi'];
        unset($_POST['password']);
        unset($_POST['konfirmasi']);
        $dataForm = http_build_query($_POST);


        $query = mysqli_query($koneksi, "SELECT * FROM tb_registrasi WHERE email='$d'");
        if(empty($a) || empty($b) || empty($c) || empty($d) || empty($f)|| empty($h)){            
            header("location:index.php?error=kosong");                  
        }        
        else{                    
        mysqli_query($koneksi, "INSERT INTO tb_registrasi (id_ktpormhs, nama, nomor, email, pekerjaan, alamat, password, konfirmasi)
                            VALUES('$a','$b','$c', '$d', '$e', '$f', '$g', '$h')");												
        header("location:index.php?error=done");
        }
    
        
?>

/
        if(empty($a) || empty($b) || empty($c) || empty($alamat) || empty($password)){
            echo"Lengkapi";
        }
        else{
            $password = md5($password);
            mysqli_query($koneksi, "INSERT INTO tb_registrasi (id_ktpormhs,nama, nomor, email, pekerjaan, alamat, password, konfirmasi)
                                            VALUES ('$a', '$b', '$c', '$d', '$e', '$f', '$g','$h')");												                
        }

      
    }
    