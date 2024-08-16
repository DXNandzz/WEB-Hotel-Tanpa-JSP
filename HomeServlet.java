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
            out.println("<title>DXN Paradise</title>");            
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f4f4f4;");
            out.println("}");
            out.println("header {");
            out.println("  background-size: cover;");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 100px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("header h1 {");
            out.println("  font-size: 50px;");
            out.println("  margin-bottom: 10px;");
            out.println("}");
            out.println("header p {");
            out.println("  font-size: 20px;");
            out.println("  margin-bottom: 30px;");
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
            out.println(".container {");
            out.println("  display: flex;");
            out.println("  justify-content: space-between;");
            out.println("  flex-wrap: wrap;");
            out.println("  gap: 20px;");
            out.println("  margin-top: 20px;");
            out.println("}");
            out.println(".card {");
            out.println("  background-color: white;");
            out.println("  padding: 20px;");
            out.println("  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);");
            out.println("  width: calc(25% - 20px);");
            out.println("  border-radius: 10px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println(".card img {");
            out.println("  width: 100%;");
            out.println("  height: 200px;");
            out.println("  object-fit: cover;");
            out.println("  border-radius: 10px;");
            out.println("  margin-bottom: 15px;");
            out.println("}");
            out.println("footer {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 15px 0;");
            out.println("}");
            out.println(".button {");
            out.println("  display: inline-block;");
            out.println("  padding: 10px 20px;");
            out.println("  font-size: 18px;");
            out.println("  color: white;");
            out.println("  background-color: #4CAF50;");
            out.println("  border: none;");
            out.println("  border-radius: 5px;");
            out.println("  text-decoration: none;");
            out.println("  cursor: pointer;");
            out.println("}");
            out.println(".button:hover {");
            out.println("  background-color: #45a049;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Selamat Datang di DXN Paradise</h1>");
            out.println("<p>Pengalaman menginap yang tak terlupakan</p>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='/web/home'>Home</a>");
            out.println("<a href='/web/about'>About</a>");
            out.println("<a href='/web/contact'>Contact</a>");
            out.println("<a href='/web/booking'>Booking</a>");
            out.println("</nav>");

            out.println("<section id='home'>");
            out.println("<p>Nikmati kenyamanan yang tiada tara saat menginap di Hotel "
                    + "DXN Paradise, sebuah tempat yang menawarkan berbagai fasilitas mewah dan layanan berkualitas tinggi. "
                    + "Setiap sudut hotel kami dirancang untuk memastikan pengalaman menginap Anda benar-benar istimewa, dengan pelayanan yang ramah dan "
                    + "fasilitas modern yang memenuhi setiap kebutuhan Anda, baik untuk relaksasi maupun kegiatan bisnis.</p>");
            out.println("</section>");

            out.println("<section id='facilities-rooms'>");
            out.println("<h2>Facilities & Rooms</h2>");
            out.println("<div class='container'>");

            // Facilities Cards
            out.println("<div class='card'>");
            out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2xcTTaLYGCAlZxnmG-rrMt6BT5eocaCnjLQ8KcXdHOzSI-CiUc9Tz0rHER_L39zjusZY&usqp=CAU' alt='Swimming Pool'>");
            out.println("<h3>Swimming Pool</h3>");
            out.println("<p>Kolam renang luar ruangan yang dikelilingi taman hijau.</p>");
            out.println("</div>");

            out.println("<div class='card'>");
            out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSi6dgxz0TT8f_T0Nwp3wZGqIHe1iBrlMnmVQ&s' alt='Spa & Wellness'>");
            out.println("<h3>Spa & Wellness</h3>");
            out.println("<p>Manjakan diri Anda dengan layanan spa kami.</p>");
            out.println("</div>");

            out.println("<div class='card'>");
            out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpqUU23eHpRbwvijhMinrTM37soFoOKsAfng&s' alt='Gym'>");
            out.println("<h3>Gym</h3>");
            out.println("<p>Fasilitas gym modern untuk menjaga kebugaran Anda.</p>");
            out.println("</div>");

            out.println("<div class='card'>");
            out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhyZVNRY6qXSy_tdW9Yq27ftYjbtg5sPOMoA&s' alt='Restaurant'>");
            out.println("<h3>Restaurant</h3>");
            out.println("<p>Restoran dengan berbagai pilihan kuliner lezat.</p>");
            out.println("</div>");

            // Rooms Cards
            out.println("<div class='card'>");
            out.println("<img src='https://haitraveller.com/source/Ayana%20komodo.jpg' alt='Deluxe Room'>");
            out.println("<h3>Deluxe Room</h3>");
            out.println("<p>Kamar luas dengan pemandangan laut.</p>");
            out.println("</div>");

            out.println("<div class='card'>");
            out.println("<img src='https://o-cdn-cas.sirclocdn.com/parenting/images/kamarhotel1.width-800.format-webp.webp' alt='Standard Room'>");
            out.println("<h3>Standard Room</h3>");
            out.println("<p>Kamar nyaman dengan fasilitas lengkap.</p>");
            out.println("</div>");

            out.println("</div>");
            out.println("</section>");

            out.println("<section id='booking'>");
            out.println("<h2>Book Your Stay</h2>");
            out.println("<a href='/web/booking' class='button'>Book Now</a>");
            out.println("</section>");

            out.println("<footer>");
            out.println("<div style='background-color: #4CAF50; color: white; padding: 20px;'>");
            out.println("  <div style='margin-bottom: 20px; text-align: left;'>");
            out.println("    <h3>Find Us</h3>");
            out.println("    <div style='width: 100%; height: 300px;'>");
            out.println("      <iframe src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3947.617322967451!2d114.34124907405929!3d-8.340766684007075!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2dd159d247da2105%3A0xf729c7d12d05270f!2sTani%20Makmur%20Amerthasari!5e0!3m2!1sid!2sid!4v1723789893543!5m2!1sid!2sid' style='width: 100%; height: 100%; border: 0;' allowfullscreen='' loading='lazy' referrerpolicy='no-referrer-when-downgrade'></iframe>");
            out.println("    </div>");
            out.println("  </div>");
            out.println("  <div style='margin-bottom: 20px; text-align: left;'>");
            out.println("    <h3>Leave a Review</h3>");
            out.println("    <form action='/web/submitReview' method='post' style='display: flex; flex-direction: column;'>");
            out.println("      <label for='name'>Your Name:</label>");
            out.println("      <input type='text' id='name' name='name' required style='margin-bottom: 10px; padding: 8px; border: 1px solid #ccc; border-radius: 4px;'>");
            out.println("      <label for='review'>Your Review:</label>");
            out.println("      <textarea id='review' name='review' rows='4' required style='margin-bottom: 10px; padding: 8px; border: 1px solid #ccc; border-radius: 4px;'></textarea>");
            out.println("      <input type='submit' value='Submit Review' style='background-color: #ffcc00; color: #333; border: none; padding: 10px; border-radius: 5px; cursor: pointer;'>");
            out.println("    </form>");
            out.println("  </div>");
            out.println("  <div style='margin-bottom: 20px; text-align: left;'>");
            out.println("    <p>Contact Us: <a href='mailto:info@dxnparadise.com' style='color: #ffcc00;'>info@dxnparadise.com</a></p>");
            out.println("    <p>Phone: +1 (234) 567-8900</p>");
            out.println("  </div>");
            out.println("  <div style='text-align: left;'>");
            out.println("    <p>&copy; 2024 DXN Paradise. All rights reserved.</p>");
            out.println("    <p><a href='/web/privacy-policy' style='color: #ffcc00;'>Privacy Policy</a> | <a href='/web/terms-of-service' style='color: #ffcc00;'>Terms of Service</a></p>");
            out.println("  </div>");
            out.println("</div>");
            out.println("</footer>");




        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Home Servlet";
    }
}
