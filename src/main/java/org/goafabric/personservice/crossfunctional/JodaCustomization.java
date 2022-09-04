package org.goafabric.personservice.crossfunctional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import io.quarkus.jackson.ObjectMapperCustomizer;

import javax.inject.Singleton;

@Singleton
public class JodaCustomization implements ObjectMapperCustomizer {

    public void customize(ObjectMapper mapper) {
        mapper.registerModule(new JodaModule());
    }
}
