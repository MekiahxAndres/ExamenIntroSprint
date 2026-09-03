package ui.repository;

import ui.model.Expedition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ExpeditionRepository {
    private HashMap<Integer, Expedition> expeditions;

    public ExpeditionRepository() {
        expeditions = new HashMap<>();
    }

    public Collection<Expedition> findAll() {
        return expeditions.values();
    }

    public void save(Expedition expedition) {
        courses.put(course.getId(), course);
    }

    public boolean existById(int courseID) {
        return courses.containsKey(courseID);
    }

    private void initialize() {
        Course a = new Course();
        a.setId(1);
        a.setName("Computación en internet II");
        a.setSchedule("MA JU 2PM a 4PM");
        a.setProfessorName("Kevin Rodriguez");
        courses.put(a.getId(), a);

        Course b = new Course();
        b.setId(2);
        b.setName("Estructuras Discretas III");
        b.setSchedule("MA JU 4PM a 6PM");
        b.setProfessorName("Juan Marcos Caidedo");
        courses.put(b.getId(), b);
    }
}
