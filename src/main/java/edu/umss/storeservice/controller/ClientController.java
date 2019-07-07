/**
 * @author: Johnny penia trujillo
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.ClientDto;
import edu.umss.storeservice.dto.ItemDto;
import edu.umss.storeservice.model.Client;
import edu.umss.storeservice.service.ClientService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }


  @GetMapping
    protected List<Client>ListOfClient(){
          return this.service.findAll();


   }

}