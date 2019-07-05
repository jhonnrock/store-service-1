/**
 * @author: Johnny penia trujillo
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.PromotionsDto;
import edu.umss.storeservice.model.Promotions;
import edu.umss.storeservice.service.PromotionsService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promotionss")
public class PromotionsController extends GenericController<Promotions, PromotionsDto> {
    private PromotionsService service;

    public PromotionsController(PromotionsService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}