package com.example.feigntest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    private Long id;
    private Long albumId;
    private String title;
    private String url;
    private String thumbnailUrl;

}
