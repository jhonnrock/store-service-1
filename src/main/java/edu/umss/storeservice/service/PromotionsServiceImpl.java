/**
 * @author: Johnny PT
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Promotions;
import edu.umss.storeservice.repository.PromotionsRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class PromotionsServiceImpl extends GenericServiceImpl<Promotions> implements PromotionsService {
    private final PromotionsRepository repository;

    public PromotionsServiceImpl(PromotionsRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Promotions> getRepository() {
        return repository;
    }
}