package ui;

import ui.model.Expedition;
import ui.service.ExpeditionService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/expeditions")
public class ServletExpedition extends HttpServlet {

    private ExpeditionService expeditionService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        expeditionService = Application.getContext()
                .getBean("expeditionService", ExpeditionService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Cursos registrados<h1>");

        resp.getWriter().println("<ul>");
        for (Expedition expedition : expeditionService.getExpeditions()) {
            resp.getWriter().println("<li>" + expedition + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String professorName = req.getParameter("professorName");
        String schedule = req.getParameter("schedule");
        System.out.println("doPost: " + id + " - " + name);

        Expedition expedition = new Expedition();
        expeditionService.addExpedition(expedition);
        resp.getWriter().println("expedición registrada: " + expedition);
    }
}
