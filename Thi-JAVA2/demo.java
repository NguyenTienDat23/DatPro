import java.sql.*;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/films", "root", "");
                PreparedStatement pstmtInsert = conn.prepareStatement(
                        "insert into film values (?, ?, ?, ?, ?)");
                PreparedStatement pstmtUpdate = conn.prepareStatement(
                        "update film set id = ? where name = ?");
                PreparedStatement pstmtDelete = conn.prepareStatement(
                        "delete from film where name = ?");
                PreparedStatement pstmtSelect = conn.prepareStatement(
                        "select * from film where name = ?");
                PreparedStatement pstmtUpdate2 = conn.prepareStatement(
                        "update Film set date = ? where name = ?")
        ) {
            conn.setAutoCommit(false);
            try {
                int type1;
                int type2;
                String ID;
                String Name;
                String date;
                String author;
                int time;
                Scanner sp = new Scanner(System.in);
                do {
                    System.out.println("Chon tu 1 den 4 ");
                    System.out.println("1.Add\t\t\t2.Delete\t\t\t3.Fix\t\t\t4.Search");
                    type1 = sp.nextInt();
                    if (type1 == 1) {
                        System.out.println("Ban Chon ADD");
                        sp.nextLine();
                        System.out.println("\nNhap ID phim: ");
                        ID = sp.nextLine();
                        System.out.println("\nNhap Name: ");
                        Name = sp.nextLine();
                        System.out.println("\nNhap Date:  ");
                        date = sp.nextLine();
                        System.out.println("\nNhap Authur: ");
                        author = sp.nextLine();
                        System.out.println("\nNhap Time: ");
                        time = sp.nextInt();
                        pstmtInsert.setString(1, ID);
                        pstmtInsert.setString(2, Name);
                        pstmtInsert.setString(3, date);
                        pstmtInsert.setString(4, author);
                        pstmtInsert.setInt(5, time);
                        pstmtInsert.executeUpdate();
                        System.out.println("Sucsess");
                    } else if (type1 == 2) {
                        System.out.println("Ban Chon DELETE");
                        sp.nextLine();
                        System.out.println("\nNhap ten phim muon xoa:\n");
                        Name = sp.nextLine();
                        pstmtDelete.setString(1, Name);
                        pstmtDelete.executeUpdate();
                    } else if (type1 == 2) {
                        System.out.println("Ban chon FIX");
                        sp.nextLine();
                        System.out.println("Chon phim de FIX: ");
                        Name = sp.nextLine();
                        System.out.println("\nBan muon sua thong tin gi:");
                        System.out.println("1.ID\t\t2.Name\t\t3.Date\t\t4.author\t\t5.time");
                        type2 = sp.nextInt();
                        if (type2 == 1) {
                            System.out.println("Sua ID Phim ");
                            sp.nextLine();
                            System.out.println("Nhap ID phim: ");
                            ID = sp.nextLine();
                            pstmtUpdate.setString(1, ID);
                            pstmtUpdate.setString(2, Name);
                            pstmtUpdate.executeUpdate();
                        }

                    }
                }  while (type1 != 1 || type1 != 2 || type1 != 3 || type1 != 4 || type1 != 5) ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
