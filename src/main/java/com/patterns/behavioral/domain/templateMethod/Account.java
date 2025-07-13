package com.patterns.behavioral.domain.templateMethod;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Client's account
 */

@Valid
@Getter
@Setter
@AllArgsConstructor
public class Account {
    private BigDecimal balance;
}
