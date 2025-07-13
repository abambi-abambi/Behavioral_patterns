package com.patterns.behavioral.service.chainOfResponsibility;

import com.patterns.behavioral.domain.Salad;
import com.patterns.behavioral.domain.Vegetable;
import com.patterns.behavioral.service.chainOfResponsibility.validator.ValidatorChain;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SaladServiceImpl implements SaladService {

    private final List<ValidatorChain<Salad>> saladValidators;

    @Override
    public Salad create(String name, String receipt, List<Vegetable> vegetables) {
        var salad =  createByParams(name, receipt, vegetables);

        // salad validation
        validate(salad);

        return salad;
    }

    /**
     * going through validator list (= chain)
     */
    private void validate(Salad salad) {
        saladValidators.forEach(validator -> validator.validate(salad));
        log.info("Salad validation is successfull");
    }

    private Salad createByParams(String name, String receipt, List<Vegetable> vegetables) {
        return Salad.builder()
                .name(name)
                .receipt(receipt)
                .vegetables(vegetables)
                .build();
    }
}
