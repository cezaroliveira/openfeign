package com.example.feigntest.feign;

import com.example.feigntest.model.Photo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.List;

@FeignClient(
        value = "photo-feign",
        url = "https://jsonplaceholder.typicode.com"
)
public interface PhotoFeign {

    @GetMapping(path = "/photos")
    List<Photo> findPhotos();

    @GetMapping(path = "/photos/{id}")
    Photo findPhotoById(@PathVariable("id") Long id);

}
