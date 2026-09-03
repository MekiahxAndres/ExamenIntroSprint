package ui.service;

import ui.model.Expedition;
import ui.repository.ExpeditionRepository;

import java.util.Collection;
import java.util.List;

public class ExpeditionService {

    private ExpeditionRepository expeditionRepository;

    public ExpeditionService(ExpeditionRepository expeditionRepository) {
        this.expeditionRepository = expeditionRepository;
    }

    public void addExpedition(Expedition expedition) {
        expeditionRepository.save(expedition);
    }

    public Collection<Expedition> getExpeditions() {
        return expeditionRepository.findAll();
    }
}
