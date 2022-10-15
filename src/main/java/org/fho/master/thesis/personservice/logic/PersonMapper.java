package org.fho.master.thesis.personservice.logic;

import org.fho.master.thesis.personservice.persistence.domain.PersonBo;
import org.fho.master.thesis.personservice.service.dto.Person;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface PersonMapper {
    Person map(PersonBo person);

    PersonBo map(Person person);

    List<Person> map(List<PersonBo> countries);
}
