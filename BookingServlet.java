package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "BookingServlet", urlPatterns = {"/booking"})
public class BookingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Booking - DXN Paradise</title>");
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
            out.println("nav {");
            out.println("  background-color: #333;");
            out.println("  overflow: hidden;");
            out.println("}");
            out.println("nav a {");
            out.println("  float: left;");
            out.println("  display: block;");
            out.println("  color: white;");
            out.println("  text-align: center;");
            out.println("  padding: 14px 16px;");
            out.println("  text-decoration: none;");
            out.println("}");
            out.println("nav a:hover {");
            out.println("  background-color: #ddd;");
            out.println("  color: black;");
            out.println("}");
            out.println(".container {");
            out.println("  padding: 20px;");
            out.println("  max-width: 800px;");
            out.println("  margin: 0 auto;");
            out.println("}");
            out.println(".booking-form {");
            out.println("  background-color: white;");
            out.println("  padding: 40px;");
            out.println("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
            out.println("  border-radius: 10px;");
            out.println("}");
            out.println(".booking-form h2 {");
            out.println("  color: #4CAF50;");
            out.println("}");
            out.println(".booking-form label {");
            out.println("  display: block;");
            out.println("  margin-bottom: 10px;");
            out.println("}");
            out.println(".booking-form input, .booking-form select {");
            out.println("  width: 100%;");
            out.println("  padding: 10px;");
            out.println("  margin-bottom: 20px;");
            out.println("  border: 1px solid #ddd;");
            out.println("  border-radius: 5px;");
            out.println("}");
            out.println(".booking-form button {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  border: none;");
            out.println("  padding: 15px;");
            out.println("  font-size: 16px;");
            out.println("  border-radius: 5px;");
            out.println("  cursor: pointer;");
            out.println("}");
            out.println(".booking-form button:hover {");
            out.println("  background-color: #45a049;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Welcome to DXN Paradise</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='/web/home'>Home</a>");
            out.println("<a href='/web/about'>About</a>");
            out.println("<a href='/web/contact'>Contact</a>");
            out.println("<a href='/web/booking'>Booking</a>");
            out.println("</nav>");
            out.println("<div class='container'>");
            out.println("<div class='booking-form'>");
            out.println("<h2>Booking Form</h2>");
            out.println("<form action='/web/confirm-booking' method='post'>");
            out.println("<label for='name'>Name:</label>");
            out.println("<input type='text' id='name' name='name' required />");

            out.println("<label for='email'>Email:</label>");
            out.println("<input type='email' id='email' name='email' required />");

            out.println("<label for='phone'>Phone Number:</label>");
            out.println("<input type='tel' id='phone' name='phone' required />");

            out.println("<label for='checkin'>Check-In Date:</label>");
            out.println("<input type='date' id='checkin' name='checkin' required />");

            out.println("<label for='checkout'>Check-Out Date:</label>");
            out.println("<input type='date' id='checkout' name='checkout' required />");

            out.println("<label for='room-type'>Room Type:</label>");
            out.println("<select id='room-type' name='room_type' required>");
            out.println("<option value='single'>Single</option>");
            out.println("<option value='double'>Double</option>");
            out.println("<option value='suite'>Suite</option>");
            out.println("</select>");

            out.println("<button type='submit'>Book Now</button>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Booking Page";
    }
}
