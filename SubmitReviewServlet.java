package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SubmitReviewServlet", urlPatterns = {"/submitReview"})
public class SubmitReviewServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Mendapatkan data dari form
        String name = request.getParameter("name");
        String review = request.getParameter("review");

        System.out.println("Name: " + name);
        System.out.println("Review: " + review);

        // Mengatur konten respons
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Review Submitted</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  background-color: #f4f4f4;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("}");
            out.println("header {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 20px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("main {");
            out.println("  display: flex;");
            out.println("  justify-content: center;");
            out.println("  align-items: center;");
            out.println("  min-height: 80vh;");
            out.println("  padding: 20px;");
            out.println("}");
            out.println(".card {");
            out.println("  background-color: white;");
            out.println("  padding: 20px;");
            out.println("  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);");
            out.println("  border-radius: 10px;");
            out.println("  max-width: 600px;");
            out.println("  width: 100%;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("blockquote {");
            out.println("  border-left: 4px solid #4CAF50;");
            out.println("  padding-left: 15px;");
            out.println("  margin: 20px 0;");
            out.println("  font-style: italic;");
            out.println("  color: #555;");
            out.println("}");
            out.println(".button {");
            out.println("  display: inline-block;");
            out.println("  padding: 10px 20px;");
            out.println("  font-size: 16px;");
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
            out.println("<h1>DXN Paradise</h1>");
            out.println("</header>");
            out.println("<main>");
            out.println("<div class='card'>");
            out.println("<h1>Thank You for Your Review, " + name + "!</h1>");
            out.println("<p>Your review:</p>");
            out.println("<blockquote>" + review + "</blockquote>");
            out.println("<a href='/web/home' class='button'>Back to Home</a>");
            out.println("</div>");
            out.println("</main>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Handles review submission";
    }
}

