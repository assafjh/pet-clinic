package course.springboot.petclinic.services;

import course.springboot.petclinic.model.Owner;

public interface OwnerService extends CrudeService<Owner, Long> {

    Owner findByLastName(String lastName);

}
