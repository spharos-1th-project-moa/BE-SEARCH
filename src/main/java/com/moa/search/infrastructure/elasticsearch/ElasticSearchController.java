package com.moa.search.infrastructure.elasticsearch;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/es/search")
public class ElasticSearchController {

    private final ElasticSearchService elasticSearchService;

    @GetMapping("")
    public void handle() {
        Iterable<ElasticSearchItems> items = elasticSearchService.getUserById();
        List<ElasticSearchItems> itemsList = (List<ElasticSearchItems>) items;
        log.debug(itemsList.get(0).getData());
    }


}