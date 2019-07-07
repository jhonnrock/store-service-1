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
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
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