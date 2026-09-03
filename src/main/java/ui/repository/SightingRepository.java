package ui.repository;

import ui.model.Expedition;
import ui.model.Sighting;

import java.util.ArrayList;
import java.util.List;

public class SightingRepository {
    private List<Sighting> sightings = new ArrayList<>();

    private ExpeditionRepository expeditionRepository;

    public SightingRepository(ExpeditionRepository expeditionRepository) {
        this.expeditionRepository = expeditionRepository;
    }

    public List<Sighting> findAll() {
        return sightings;
    }

    public void save(Sighting sighting) {
        sightings.add(sighting);
    }
}
