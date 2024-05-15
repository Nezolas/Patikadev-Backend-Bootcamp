package com.restapi.mapper;

import com.restapi.dto.response.PublisherResponse;
import com.restapi.entitiy.Publisher;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public class PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);
    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
