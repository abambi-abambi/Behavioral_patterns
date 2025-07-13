package com.patterns.behavioral.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Any salad consists only from vegetables
 */
@Data
@Valid
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Salad<T> {

    private String name;

    @NotBlank
    private List<T> ingredients;

    private String receipt;

}
