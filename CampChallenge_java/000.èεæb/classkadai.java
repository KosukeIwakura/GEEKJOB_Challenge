
/* 


 
 * To change this license header, choose License Headers in Project Properties. 


 
 * To change this template file, choose Tools | Templates   


 
 * and open the template in the editor. 


 
 */
import java.io.IOException;

import java.io.PrintWriter;
import static java.lang.System.out;

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
class human2 {

    public String name = "";

    public int age = 0;

    public void setHuman(String n, int a) {

        this.name = n;

        this.age = a;

    }

    public void prtHuman() {

        out.print(name + "です。年齢は" + age + "です。");

    }

}

public class classkadai extends HttpServlet {

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

        try (PrintWriter out = response.getWriter()) {

            human2 hito = new human2();

            hito.setHuman("田中", 19);

            hito.prtHuman();

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
