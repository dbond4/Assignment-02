package model;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author F03 H4MM3R
 */
public class CalculatorService {
    
    private String calcTitle;
    private double answer;
    private String rAnswer;
    
    public CalculatorService() {
        calcTitle = "Unknown";
    }

    public HttpServletRequest getResultForType(HttpServletRequest request, Shape shape) {
        switch (shape) {
            case RECTANGLE:
                calcTitle = "Area of a Rectangle";
                String rLength = request.getParameter("length");
                String rWidth = request.getParameter("width");
                double length = 0;
                double width = 0;
                try {
                    length = Double.valueOf(rLength);
                    width = Double.valueOf(rWidth);
                    answer = length * width;
                    rAnswer = "" + answer;
                } catch (NumberFormatException nfe) {
                    rAnswer = "You must enter numbers for the Length and Width.";
                }

                request.setAttribute("formula", "length x width: (" + rLength + " x " + rWidth + ")");
                break;
            
            case CIRCLE:
                calcTitle = "Area of a Circle";
                String sRadius = request.getParameter("radius");
                double pi = 3.14;
                double radius = 0;
                double radiusSquared = 0;
                try {
                    radius = Double.valueOf(sRadius);
                    radiusSquared = radius * radius;
                    answer = pi * radiusSquared;
                    rAnswer = "" + answer;
                } catch (NumberFormatException nfe) {
                    rAnswer = "You must enter a number.";
                }

                request.setAttribute("formula", "PI x radius squared: (" + 3.14 + " x " + radiusSquared + ")");
                break;
        
        }
                
                request.setAttribute("answer", rAnswer);
                request.setAttribute("title", calcTitle);

        return request;
    }
    
}
