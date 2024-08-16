package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "AboutServlet", urlPatterns = {"/about"})
public class AboutServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>About Us - DXN Paradise</title>");
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
            out.println("  max-width: 1200px;");
            out.println("  margin: 0 auto;");
            out.println("}");
            out.println(".about-section {");
            out.println("  display: flex;");
            out.println("  align-items: center;");
            out.println("  background-color: white;");
            out.println("  padding: 40px;");
            out.println("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
            out.println("  margin: 20px 0;");
            out.println("  border-radius: 10px;");
            out.println("}");
            out.println(".about-section img {");
            out.println("  width: 50%;");
            out.println("  height: auto;");
            out.println("  border-radius: 10px;");
            out.println("  margin-right: 20px;");
            out.println("}");
            out.println(".about-section .text {");
            out.println("  flex: 1;");
            out.println("}");
            out.println(".about-section h2 {");
            out.println("  color: #4CAF50;");
            out.println("}");
            out.println(".about-section p {");
            out.println("  font-size: 18px;");
            out.println("  color: #333;");
            out.println("  line-height: 1.6;");
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
            out.println("<div class='about-section'>");
            out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPjobchSUfPnp0ObuGgAmuWfBkZcelos7JsQ&s' alt='Hotel Image'/>");
            out.println("<div class='text'>");
            out.println("<h2>About Us</h2>");
            out.println("<p>DXN Paradise adalah hotel bintang 5 yang terletak di jantung kota. Dengan fasilitas modern dan pelayanan prima, kami menawarkan pengalaman menginap yang tak terlupakan.</p>");
            out.println("<p>Didirikan pada tahun 2000, hotel kami telah menjadi pilihan utama bagi wisatawan lokal maupun internasional. Kami bangga dengan reputasi kami sebagai salah satu hotel terbaik di daerah ini.</p>");
            out.println("</div>");
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
        return "About Us Page";
    }
}
