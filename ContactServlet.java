package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ContactServlet", urlPatterns = {"/contact"})
public class ContactServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contact Us - DXN Paradise</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f4f4f4;");
            out.println("}");
            out.println("header {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 15px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("header h1 {");
            out.println("  margin: 0;");
            out.println("  font-size: 30px;");
            out.println("}");
            out.println("nav {");
            out.println("  background-color: rgba(0, 0, 0, 0.7);");
            out.println("  padding: 10px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav a {");
            out.println("  color: white;");
            out.println("  margin: 0 15px;");
            out.println("  text-decoration: none;");
            out.println("  font-size: 16px;");
            out.println("}");
            out.println("nav a:hover {");
            out.println("  color: #ffcc00;");
            out.println("}");
            out.println(".container {");
            out.println("  width: 80%;");
            out.println("  max-width: 800px;");
            out.println("  margin: 20px auto;");
            out.println("  padding: 20px;");
            out.println("  background-color: white;");
            out.println("  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);");
            out.println("  border-radius: 10px;");
            out.println("}");
            out.println(".container h2 {");
            out.println("  margin-top: 0;");
            out.println("  font-size: 24px;");
            out.println("  color: #333;");
            out.println("}");
            out.println(".contact-info {");
            out.println("  font-size: 18px;");
            out.println("  margin-bottom: 20px;");
            out.println("  line-height: 1.6;");
            out.println("}");
            out.println("form {");
            out.println("  display: flex;");
            out.println("  flex-direction: column;");
            out.println("}");
            out.println("form label {");
            out.println("  margin: 10px 0 5px;");
            out.println("}");
            out.println("form input, form textarea {");
            out.println("  padding: 10px;");
            out.println("  margin-bottom: 10px;");
            out.println("  border: 1px solid #ddd;");
            out.println("  border-radius: 5px;");
            out.println("}");
            out.println("form input[type='submit'] {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  border: none;");
            out.println("  padding: 15px;");
            out.println("  font-size: 16px;");
            out.println("  cursor: pointer;");
            out.println("  border-radius: 5px;");
            out.println("}");
            out.println("form input[type='submit']:hover {");
            out.println("  background-color: #45a049;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>DXN Paradise</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='/web/home'>Home</a>");
            out.println("<a href='/web/about'>About</a>");
            out.println("<a href='/web/contact'>Contact</a>");
            out.println("<a href='/web/booking'>Booking</a>");
            out.println("</nav>");
            out.println("<div class='container'>");
            out.println("<h2>Contact Us</h2>");
            out.println("<p class='contact-info'>");
            out.println("Hubungi kami melalui email: <a href='mailto:hotel@dxnparadise.com'>hotel@dxnparadise.com</a><br>");
            out.println("Telepon: <a href='tel:+0361123456'>(0361) 123456</a>");
            out.println("</p>");
            out.println("<form action='/web/submitContact' method='post'>");
            out.println("  <label for='name'>Your Name:</label>");
            out.println("  <input type='text' id='name' name='name' required>");
            out.println("  <label for='email'>Your Email:</label>");
            out.println("  <input type='email' id='email' name='email' required>");
            out.println("  <label for='message'>Your Message:</label>");
            out.println("  <textarea id='message' name='message' rows='6' required></textarea>");
            out.println("  <input type='submit' value='Send Message'>");
            out.println("</form>");
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
        return "Contact Us Page";
    }
}
