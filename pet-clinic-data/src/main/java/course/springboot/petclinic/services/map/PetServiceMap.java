package course.springboot.petclinic.services.map;

import course.springboot.petclinic.model.Pet;
import course.springboot.petclinic.services.CrudeService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudeService<Pet, Long>
{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}