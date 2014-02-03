package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalculatorService;
import model.Shape;

/**
 *
 * @author F03 H4MM3R
 */
@WebServlet(name = "AreaController", urlPatterns = {"/AreaController"})
public class AreaController extends HttpServlet {
    private static final String CALC_TYPE = "calcType";
    private static final String RECTANGLE = "rectangle";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
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
        response.setContentType("text/html;charset=UTF-8");
        String calcType = request.getParameter(CALC_TYPE);
        double answer = 0.00;
        String rAnswer = "";
        String calcTitle = "";
        String destination = "/index.jsp";
//        String w = request.getParameter("width");
//        String h = request.getParameter("height");
//        double wt = Double.parseDouble(w);
//        double ht = Double.parseDouble(h);
        
        CalculatorService csv = new CalculatorService();
        
        if(calcType.equalsIgnoreCase("Rectangle")) {
            request = csv.getResultForType(request, Shape.RECTANGLE);
            
        }else if(calcType.equalsIgnoreCase("Circle")) {
            request = csv.getResultForType(request, Shape.CIRCLE);
            
        }else if(calcType.equalsIgnoreCase("Triangle")) {
            request = csv.getResultForType(request, Shape.TRIANGLE);
        }
//        
//        double result = csv.getArea(wt,ht);
//        
//        request.setAttribute("area", result);
//        
        RequestDispatcher view =
                request.getRequestDispatcher(destination);
        view.forward(request, response);
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
