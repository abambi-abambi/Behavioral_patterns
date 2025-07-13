package com.patterns.behavioral.domain.mediator;

import jakarta.validation.Valid;
import lombok.*;

@Data
@Valid
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fruit{

    private String name;
}
