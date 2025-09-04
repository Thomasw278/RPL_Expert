import java.sql.*;

public class DatabaseController {
    private Connection con;

    public DatabaseController() {
        String url = "jdbc:mysql://localhost:3306/ppdb";
        String username = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Input Peserta - nama, alamat , no hp , umur
    public boolean InputPeserta(String nama,String alamat, String no_hp, int umur){
        String query = "INSERT INTO peserta (nama_peserta,alamat_peserta,nomor_hp,umur_peserta) VALUES (?,?,?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,nama);
            stmt.setString(2,alamat);
            stmt.setString(3,no_hp);
            stmt.setInt(4,umur);
            if(stmt.executeUpdate()>0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //Select Peserta - Berdasarkan Nomor HP Yang Diinputkan :
    public boolean SelectDataPeserta (String no_hp) {
        String querySelect = "SELECT * FROM peserta WHERE nomor_hp = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(querySelect);
            stmt.setString(1,no_hp);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
            }
        }
    //Update Data Peserta :
    public boolean UpdateDataPeserta(String no_hp, String namabaru, String alamatbaru, int umurbaru) {
        String queryUpdate = "UPDATE peserta SET nama_peserta = ? , alamat_peserta = ?, umur_peserta = ? WHERE nomor_hp = ?";
        try {
          PreparedStatement stmtupdate = con.prepareStatement(queryUpdate);
          stmtupdate.setString(1,namabaru);
          stmtupdate.setString(2,alamatbaru);
          stmtupdate.setInt(3,umurbaru);
          stmtupdate.setString(4,no_hp);
          if(stmtupdate.executeUpdate()>0){
              return true;
          } else {
          return false;
        }
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Lihat Data PPDB
    public void LihatPeserta(){
        String query = "SELECT * FROM peserta";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println("================ NAMA PESERTA ================");
                System.out.println("1. Nama Peserta: "+rs.getString("nama_peserta"));
                System.out.println("2. Alamat Peserta: "+rs.getString("alamat_peserta"));
                System.out.println("3. Nomor HP: "+rs.getString("nomor_hp"));
                System.out.println("4. Umur Peserta: "+rs.getInt("umur_peserta"));
                System.out.println("==============================================");
                System.out.println("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Delete Peserta Berdasrakan Nomor Handphone
    public boolean DeleteDataPeserta(String no_hp) {
        String QueryDelete = "DELETE FROM peserta WHERE nomor_hp = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(QueryDelete);
            stmt.setString(1,no_hp);
            if(stmt.executeUpdate()>0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
