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

    }
}
