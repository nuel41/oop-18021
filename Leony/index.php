    <link rel="stylesheet" type ="text/css" href="css/style.css">
    <div id="container">    
        <form action="simpan_data.php" method="POST">
        <?php				
					$a = isset($_GET['id_ktpormhs']) ? $_GET['id_ktpormhs'] : false;
					$b = isset($_GET['nama']) ? $_GET['nama'] : false;
					$c = isset($_GET['nomor']) ? $_GET['nomor'] : false;
					$d = isset($_GET['email']) ? $_GET['email'] : false;
					$e = isset($_GET['pekerjaan']) ? $_GET['pekerjaan'] : false;
					$f = isset($_GET['alamat']) ? $_GET['alamat'] : false;
					$g = isset($_GET['password']) ? $_GET['password'] : false;
					$h = isset($_GET['konfirmasi']) ? $_GET['konfirmasi'] : false;					
                    
              
                    if(isset($_GET['error'])){
                        $error=$_GET['error'];
                    }
                    else{
                        $error="";
                    }                                                  
                    if($error == "kosong"){
                        echo '<script language="javascript">
                        alert ("Lengkapi! Ada yang kosong!");
                        window.location="index.php";
                        </script>';                 
                    }    
                    elseif($error == "done"){
                        echo '<script language="javascript">
                        alert ("Done");
                        window.location="index.php";
                        </script>';
                    }					
				?>
        <div id="form">      
        <h1 style="color:whitesmoke"><center>Registrasi Training HTML</center></h1><hr>
            <input type="text" id="id_ktpormhs" name="id_ktpormhs" placeholder="Nomor KTP/Mahasiswa" value="<?php echo $a; ?>"> 
            <input type="text" id="nama" name="nama" placeholder="Nama Lengkap" value="<?php echo $b; ?>"> 
            <input type="text" id="nomor" name="nomor" placeholder="Nomor Telepon/HP" value="<?php echo $c; ?>">
            <input type="text" id="email" name="email" placeholder="E-mail" value="<?php echo $d; ?>">
            <input type="text" id="pekerjaan" name="pekerjaan" placeholder="Pekerjaan" value="<?php echo $e; ?>">
            <input type="text" id="alamat" name="alamat" placeholder="Alamat" value="<?php echo $f; ?>">
            <input type="password" name="password" id="password" placeholder="Password">
            <input type="password" name="konfirmasi" id="konfirmasi" placeholder="Konfirmasi Password">
            <input type="submit" name="submit" value="Submit">
            
            </div>
        </form>            
    </div>
