package model;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author F03 H4MM3R
 */
public class CalculatorService {
    
    private String calcTitle;
    private double area, answer;
    private String sAnswer;
    
    public CalculatorService() {
        calcTitle = "Unknown";
    }

    public HttpServletRequest getResultForType(HttpServletRequest request, Shape shape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
