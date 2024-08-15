package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "home", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hotel DXNandzz</title>");            
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f4f4f4;");
            out.println("}");
            out.println("header {");
            out.println("  background-size: cover;");
            out.println("  color: black;");
            out.println("  padding: 50px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav {");
            out.println("  background-color: rgba(0, 0, 0, 0.7);");
            out.println("  padding: 15px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav a {");
            out.println("  margin: 0 20px;");
            out.println("  text-decoration: none;");
            out.println("  color: white;");
            out.println("  font-weight: bold;");
            out.println("  font-size: 16px;");
            out.println("}");
            out.println("nav a:hover {");
            out.println("  color: #ffcc00;");
            out.println("}");
            out.println("section {");
            out.println("  padding: 40px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println(".facilities, .rooms {");
            out.println("  display: flex;");
            out.println("  justify-content: space-around;");
            out.println("  margin-top: 20px;");
            out.println("}");
            out.println(".card {");
            out.println("  background-color: white;");
            out.println("  padding: 20px;");
            out.println("  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);");
            out.println("  width: 300px;");
            out.println("  border-radius: 10px;");
            out.println("}");
            out.println("footer {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 15px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Selamat Datang di Hotel DXNandzz</h1>");
            out.println("<p>Pengalaman menginap yang tak terlupakan</p>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='/java'>Home</a>");
            out.println("<a href='/about'>About</a>");
            out.println("<a href='/contact'>Contact</a>");
            out.println("</nav>");

            out.println("<section id='home'>");
            out.println("<h2>Home</h2>");
            out.println("<p>Nikmati kenyamanan menginap di Hotel DXNandzz dengan fasilitas dan layanan terbaik.</p>");
            out.println("</section>");
            out.println("<section id='facilities'>");
            out.println("<h2>Facilities</h2>");
            out.println("<div class='facilities'>");
            out.println("<div class='card'>");
            out.println("<h3>Swimming Pool</h3>");
            out.println("<p>Kolam renang luar ruangan yang dikelilingi taman hijau.</p>");
            out.println("</div>");
            out.println("<div class='card'>");
            out.println("<h3>Spa & Wellness</h3>");
            out.println("<p>Manjakan diri Anda dengan layanan spa kami.</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</section>");
            out.println("<section id='rooms'>");
            out.println("<h2>Rooms</h2>");
            out.println("<div class='rooms'>");
            out.println("<div class='card'>");
            out.println("<h3>Deluxe Room</h3>");
            out.println("<p>Kamar luas dengan pemandangan laut.</p>");
            out.println("</div>");
            out.println("<div class='card'>");
            out.println("<h3>Standard Room</h3>");
            out.println("<p>Kamar nyaman dengan fasilitas lengkap.</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</section>");
            out.println("<section id='contact'>");
            out.println("<h2>Contact</h2>");
            out.println("<p>Hubungi kami melalui email: hotel@dxnandzz.com atau telepon: (0361) 123456</p>");
            out.println("</section>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 Hotel DXNandzz. All rights reserved.</p>");
            out.println("</footer>");
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
        return "Simple Webpage Servlet";
    }
}
