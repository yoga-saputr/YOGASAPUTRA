package pulsa;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
private Statement data = null;
private Connection koneksi = null;
private String Url="jdbc:Mysql://localhost/"; //host database
private String DbName="pulsa"; //nama database
private String DBUser="root"; //username dari database, deafaultnya = root
private String DBPassword="";//password db , default xampp tidak ada = "";
public koneksi(){
try {
//setting driver yang digunakan untuk terhubung ke database
Class.forName("com.mysql.jdbc.Driver");
//membuat koneksi dengan parameter url +nama database, username dan password
koneksi = DriverManager.getConnection(Url+DbName, DBUser, DBPassword);
//membuat statement yang akan digunakan untuk mengeksekusi query dari aplikasi
data = this.koneksi.createStatement();
} catch (Throwable ex) {
System.out.println("error : "+ex);
System.exit(1);
}
}
public Connection getConnection(){
return koneksi;
}
public Statement getStatement(){
return data;
}
}