package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ConfirmBookingServlet", urlPatterns = {"/confirm-booking"})
public class ConfirmBookingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Mendapatkan data dari form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String checkin = request.getParameter("checkin");
        String checkout = request.getParameter("checkout");
        String roomType = request.getParameter("room_type");

        // Mengatur konten respons
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Booking Confirmation</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f0f0f0;");
            out.println("}");
            out.println("header {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 50px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println(".container {");
            out.println("  padding: 20px;");
            out.println("  max-width: 800px;");
            out.println("  margin: 0 auto;");
            out.println("}");
            out.println(".confirmation {");
            out.println("  background-color: white;");
            out.println("  padding: 20px;");
            out.println("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
            out.println("  border-radius: 10px;");
            out.println("}");
            out.println(".confirmation h2 {");
            out.println("  color: #4CAF50;");
            out.println("}");
            out.println(".confirmation p {");
            out.println("  margin: 10px 0;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Booking Confirmation</h1>");
            out.println("</header>");
            out.println("<div class='container'>");
            out.println("<div class='confirmation'>");
            out.println("<h2>Thank you for your booking!</h2>");
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
            out.println("<p><strong>Phone Number:</strong> " + phone + "</p>");
            out.println("<p><strong>Check-In Date:</strong> " + checkin + "</p>");
            out.println("<p><strong>Check-Out Date:</strong> " + checkout + "</p>");
            out.println("<p><strong>Room Type:</strong> " + roomType + "</p>");
            out.println("<p>Your booking has been successfully processed. We look forward to welcoming you to DXN Paradise!</p>");
            out.println("<a href='/web/home'>Back to Home</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Handles booking confirmation";
    }
}
