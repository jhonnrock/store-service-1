/**
 * @author: Johnny penia trujillo
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.model.Client;
import edu.umss.storeservice.service.ClientService;
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
   @PostMapping
    public Client Saveclients(@RequestBody Client c){
        return this.service.save(c);
   }
   @CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
   @DeleteMapping("clients/{id}")
    public void DeleteClient(@PathVariable Long id){

        this.service.deleteById(id);

   }

}