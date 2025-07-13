package com.patterns.behavioral.domain;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Valid
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vegetable {

    private String name;
}
