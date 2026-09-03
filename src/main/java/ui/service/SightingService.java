package ui.service;

import ui.model.Sighting;
import ui.repository.ExpeditionRepository;
import ui.repository.SightingRepository;

import java.util.List;

public class SightingService {

    private SightingRepository sightingRepository;
    private ExpeditionRepository expeditionRepository;

    public SightingService(SightingRepository sightingRepository, ExpeditionRepository expeditionRepository) {
        this.sightingRepository = sightingRepository;
        this.expeditionRepository = expeditionRepository;
    }

    public void addSighting(Sighting sighting) {
        //Solo puedo registrar al estudiante si el curso existe
        if( expeditionRepository.existById(sighting.getExpeditionId()) ) {
            sightingRepository.save(sighting);
            System.out.println("Sighting saved");
        }else{
            System.out.println("Expedition not found");
        }


    }

    public List<Sighting> getSightings() {
        return sightingRepository.findAll();
    }
}
