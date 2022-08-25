/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pruebasunitariasweb.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pruebasunitariasweb.classes.Operacion;
import pruebasunitariasweb.implementaciones.ImpOperacion;
import pruebasunitariasweb.interfaces.IOperacion;

/**
 *
 * @author Shelly
 */
@WebServlet(name = "Operacion", urlPatterns = {"/Operacion"})
public class OperacionControlador extends HttpServlet {

    Operacion objoperacion = new Operacion();
    IOperacion operaciones = new ImpOperacion();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet OperacionControlador</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet OperacionControlador at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        PrintWriter out = response.getWriter();
        double n1 = 0, n2 = 0, sum = 0, res = 0, mul = 0, div = 0;
        n1 = Double.parseDouble(request.getParameter("txtN1"));
        n2 = Double.parseDouble(request.getParameter("txtN2"));
//enviamos los valores a la clase
        objoperacion.setNumero1(n1);
        objoperacion.setNumero2(n2);
//calculas las operaciones
        sum = operaciones.CalculaSuma(objoperacion);
        res = operaciones.CalculaResta(objoperacion);
        mul = operaciones.CalculaMultiplicacion(objoperacion);
        div = operaciones.CalculaDivision(objoperacion);
//enviamos los valores a la clase
        objoperacion.setSuma(sum);
        objoperacion.setResta(res);
        objoperacion.setMultiplicacion(mul);
        objoperacion.setDivision(div);
//mostrando resultados
        HttpSession sesion = request.getSession();
        out.println("La suma es: " + sum);
        out.println("La resta es es: " + res);
        out.println("La multiplicacion es: " + mul);
        out.println("La division es: " + div);
        sesion.setAttribute("suma", sum);
        sesion.setAttribute("resta", res);
        sesion.setAttribute("multiplicacion", mul);
        sesion.setAttribute("division", div);
        response.sendRedirect("frmOperacion.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
