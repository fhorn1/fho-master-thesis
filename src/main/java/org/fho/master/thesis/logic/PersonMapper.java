package org.fho.master.thesis.logic;

import org.fho.master.thesis.persistence.domain.PersonBo;
import org.fho.master.thesis.service.dto.Person;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "cdi")
public interface PersonMapper {
    Person map(PersonBo person);

    PersonBo map(Person person);

    List<Person> map(List<PersonBo> countries);
}
