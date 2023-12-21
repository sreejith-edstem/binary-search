package com.binarysearch.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name = "binary_search")
@AllArgsConstructor
@NoArgsConstructor
public class Binary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int[] input;
    private int output;
}
