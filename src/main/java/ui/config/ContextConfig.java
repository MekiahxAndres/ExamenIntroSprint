package ui.config;


import ui.repository.ExpeditionRepository;
import ui.repository.SightingRepository;
import ui.service.ExpeditionService;
import ui.service.SightingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfig {

    //Repositories
    @Bean(initMethod = "initialize")
    public ExpeditionRepository expeditionRepository(){
        return new ExpeditionRepository();
    }

    @Bean
    public SightingRepository sightingRepository(ExpeditionRepository expeditionRepository){
        return new SightingRepository(expeditionRepository);
    }

    //Services
    @Bean
    public ExpeditionService expeditionService(ExpeditionRepository expeditionRepository){
        return new ExpeditionService(expeditionRepository);
    }

    @Bean
    public SightingService sightingService(
            SightingRepository sightingRepository,
            ExpeditionRepository expeditionRepository
    ){
        return new SightingService(sightingRepository, expeditionRepository);
    }

}
