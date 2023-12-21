package com.binarysearch.project.contract.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinarySearchRequest {
    private int[] array;
    private int target;
}
