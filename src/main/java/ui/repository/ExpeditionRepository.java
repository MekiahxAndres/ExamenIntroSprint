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

    public void save(Expedition expedition) {expeditions.put(expedition.getId(), expedition);
    }

    public boolean existById(int courseID) {
        return expeditions.containsKey(courseID);
    }


    private void initialize() {
        Expedition a = new Expedition();
        a.setId(1);
        a.setName("Expedición amazonas");
        a.setCode("1234");
        a.setRegion("Centro");
        a.setBaseCamp("Guaviare");
        a.setLeader("Jose");
        a.setEndDate("Diciembre 1");
        a.setStartDate("Octubre 1");
        a.setState("Finalizado");
        expeditions.put(a.getId(), a);

        Expedition b = new Expedition();
        b.setId(2);
        b.setName("Guajira exploración");
        b.setCode("456");
        b.setRegion("Norte");
        b.setBaseCamp("Guajira");
        b.setLeader("Marcos");
        b.setEndDate("Diciembre 2");
        b.setStartDate("Octubre 2");
        b.setState("Finalizado");
        expeditions.put(b.getId(), b);
    }


}
