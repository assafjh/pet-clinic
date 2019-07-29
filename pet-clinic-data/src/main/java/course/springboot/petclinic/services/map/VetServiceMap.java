package course.springboot.petclinic.services.map;

import course.springboot.petclinic.model.Vet;
import course.springboot.petclinic.services.CrudeService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudeService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
