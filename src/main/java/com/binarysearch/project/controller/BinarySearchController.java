package com.binarysearch.project.controller;

import com.binarysearch.project.contract.request.BinarySearchRequest;
import com.binarysearch.project.contract.response.BinarySearchResponse;
import com.binarysearch.project.service.BinarySearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/binary-search")
public class BinarySearchController {
    private final BinarySearchService binarySearchService;

    @PostMapping
    public BinarySearchResponse binarySearch(@RequestBody BinarySearchRequest request) {
        return binarySearchService.binarySearch(request);
    }
}
