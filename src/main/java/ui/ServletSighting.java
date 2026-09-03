package ui;

import ui.model.Sighting;
import ui.service.SightingService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/sightings")
public class ServletSighting extends HttpServlet {

    private SightingService sightingService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        sightingService = Application.getContext()
                .getBean("sightingService", SightingService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Exploraciones registrados<h1>");

        resp.getWriter().println("<ul>");
        for (Sighting sighting : sightingService.getSightings()) {
            resp.getWriter().println("<li>" + sighting + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: leer code, name, program y courseId del request.
        // TODO: registrar al estudiante e inscribirlo directamente en el curso con id = courseId.
        // Lo resolvemos en clase.
        String id = req.getParameter("id");
        String sightingId = req.getParameter("sightingId");
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String scientificName = req.getParameter("scientificName");
        String sightingAt = req.getParameter("sightingAt");
        String location = req.getParameter("location");
        String quantity = req.getParameter("quantity");
        String confidenceLevel = req.getParameter("confidenceLevel");
        String expeditionId = req.getParameter("expeditionId");

        System.out.println(id);
        System.out.println(sightingId);
        System.out.println(name);
        System.out.println(description);
        System.out.println(scientificName);
        System.out.println(sightingAt);
        System.out.println(location);
        System.out.println(quantity);
        System.out.println(confidenceLevel);
        System.out.println(expeditionId);
        //Llamar al service


        Sighting sighting = new Sighting();
        sighting.setId(Integer.parseInt(id));
        sighting.setName(name);
        sighting.setDescription(description);
        sighting.setScientificName(scientificName);
        sighting.setSightingAt(sightingAt);
        sighting.setLocation(location);
        sighting.setQuantity(Integer.parseInt(quantity));
        sighting.setSightingId(sightingId);
        sighting.setSightingId(confidenceLevel);
        sighting.setSightingId(expeditionId);
        sightingService.addSighting( sighting );
    }
}
