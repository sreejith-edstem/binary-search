package com.binarysearch.project.service;

import com.binarysearch.project.contract.request.BinarySearchRequest;
import com.binarysearch.project.contract.response.BinarySearchResponse;
import com.binarysearch.project.model.Binary;
import com.binarysearch.project.repository.BinarySearchRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BinarySearchService {
    private final BinarySearchRepository binarySearchRepository;
    private final ModelMapper modelmapper;

    public BinarySearchResponse binarySearch(BinarySearchRequest request) {
        int[] array = request.getArray();
        int target = request.getTarget();
        int index = binarySearch(array, target);
        Binary binary = Binary.builder()
                .input(array)
                .output(target)
                .build();
        binarySearchRepository.save(binary);
        BinarySearchResponse response = modelmapper.map(binary, BinarySearchResponse.class);
        response.setIndex(index);
        return response;
    }

    private int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

