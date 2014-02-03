package model;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

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
        switch (shape) {
            case RECTANGLE:
                calcTitle = "Area of a Rectangle";
                String sLength = request.getParameter("length");
                String sWidth = request.getParameter("width");
                double length = 0;
                double width = 0;
                try {
                    length = Double.valueOf(sLength);
                    width = Double.valueOf(sWidth);
                    answer = length * width;
                    sAnswer = "" + answer;
                } catch (NumberFormatException nfe) {
                    sAnswer = "Sorry, you must submit 2 numerical value for this computation";
                }

                request.setAttribute("formula", "length x width: (" + sLength + " x " + sWidth + ")");
                break;
        
        }
                
                request.setAttribute("answer", sAnswer);
                request.setAttribute("title", calcTitle);

        return request;
    }
    
}
