/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;

import java.io.PrintWriter;

import java.util.ArrayList;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

/**
 * *
 *
 *
 *
 *
 *
 *
 * @author guest1Day *
 *
 *
 */
public class hikisuukadai extends HttpServlet {

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
    ArrayList<ArrayList> myprofile() {

        ArrayList< String> data1 = new ArrayList<String>();

        ArrayList< String> data2 = new ArrayList<String>();

        ArrayList< String> data3 = new ArrayList<String>();

        ArrayList< ArrayList> prof = new ArrayList<ArrayList>();

        data1.add("8r857t7t");
        data1.add("鍛冶");
        data1.add("1993.1.8");
        data1.add(null);

        prof.add(data1);

        data2.add("84746466r4");
        data2.add("岩倉");
        data2.add("1998.3.29");
        data2.add("神奈川県");
        prof.add(data2);

        data3.add("848474654");
        data3.add("斎藤");
        data3.add("1989.4.30");
        data3.add("東京都");
        prof.add(data3);

        return prof;

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            ArrayList< ArrayList> mozi = myprofile();

            for (int i = 0; i < mozi.size(); i++) {

                ArrayList< String> oneData = mozi.get(i);

                for (int j = 1; j < oneData.size(); j++) {

                    if (oneData.get(j) == null) {
                        continue;

                    } else {
                        out.print(oneData.get(j) + "<br>");

                    }

                }
            }
        }
    }

    /* TODO output your page here. You may use following sample code. */
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
