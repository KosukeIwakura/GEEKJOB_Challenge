/* 


 
 * To change this license header, choose License Headers in Project Properties. 


 
 * To change this template file, choose Tools | Templates 


 
 * and open the template in the editor. 


 
 */
package Database;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class sousa11_2 extends HttpServlet {

    /**
     * *
     *
     *
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> *
     *
     *
     * methods. *
     *
     *
     *
     *
     *
     *
     * @param request servlet request *
     *
     *
     * @param response servlet response *
     *
     *
     * @throws ServletException if a servlet-specific error occurs *
     *
     *
     * @throws IOException if an I/O error occurs *
     *
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        Connection db_con = null;

        PreparedStatement db_st = null;

        ResultSet db_data = null;

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            // 文字コード指定 
            request.setCharacterEncoding("UTF-8");

            // 情報の取り出し 
            // 入力されたIDと年齢は整数として扱いたいので、String→intに型変換 
            int pid = Integer.parseInt(request.getParameter("id"));

            String nm = request.getParameter("name");

            String tl = request.getParameter("tell");

            int ag = Integer.parseInt(request.getParameter("age"));

            String bd = request.getParameter("birthday");

            out.print("今回、更新するのは【profilesID：" + pid + "】です。<br><br>");

            String you = (nm + "／" + tl + "／" + ag + "／" + bd);

            out.print("下記の内容に情報を更新します。<br>【" + you + "】<br><br>");

            Class.forName("com.mysql.jdbc.Driver");

            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DATA_db", "root", "");

            // 接続確認 
            if (db_con != null) {

                out.print("接続成功しました。<br>");

            }

            // ?の中に更新したい内容が入るよう変数を指定　複数の情報を更新する場合はカンマで区切る 
            db_st = db_con.prepareStatement("update profiles set name = ?, tel = ?, age = ?, birthday = ? where profilesID = ?");

            db_st.setString(1, nm);

            db_st.setString(2, tl);

            db_st.setInt(3, ag);

            db_st.setString(4, bd);

            db_st.setInt(5, pid);

            int num = db_st.executeUpdate();

            out.print("更新されたのは" + num + "人分の情報です。<br><br>");

            db_st = db_con.prepareStatement("select*from profiles");

            db_data = db_st.executeQuery();

            while (db_data.next()) {

                out.print("ID：" + db_data.getInt("profilesID") + "<br>");

                out.print("名前：" + db_data.getString("name") + "<br>");

                out.print("電話番号：" + db_data.getString("tel") + "<br>");

                out.print("年齢：" + db_data.getInt("age") + "<br>");

                out.print("誕生日：" + db_data.getString("birthday")
                        + "<br><br>");

            }

            db_con.close();

            db_st.close();

            db_data.close();

        } catch (SQLException e_sql) {

            System.out.println("接続時にエラーが発生しました。");

        } catch (Exception e) {

            System.out.println("エラーが発生しました。");

        } finally {

            try {

                db_con.close();

            } catch (Exception e_con) {

                System.out.println(e_con.getMessage());

            }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the  sign on the left to edit the code."> 
    /**
     * *
     *
     *
     * Handles the HTTP <code>GET</code> method. *
     *
     *
     *
     *
     *
     *
     * @param request servlet request *
     *
     *
     * @param response servlet response *
     *
     *
     * @throws ServletException if a servlet-specific error occurs *
     *
     *
     * @throws IOException if an I/O error occurs *
     *
     *
     */
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    /**
     * *
     *
     *
     * Handles the HTTP <code>POST</code> method. *
     *
     *
     *
     *
     *
     *
     * @param request servlet request *
     *
     *
     * @param response servlet response *
     *
     *
     * @throws ServletException if a servlet-specific error occurs *
     *
     *
     * @throws IOException if an I/O error occurs *
     *
     *
     */
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    /**
     * *
     *
     *
     * Returns a short description of the servlet. *
     *
     *
     *
     *
     *
     *
     * @return a String containing servlet description *
     *
     *
     */
    @Override

    public String getServletInfo() {

        return "Short description";

    }// </editor-fold> 

}
