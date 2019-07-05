/**
 * @author: Johnny PT
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Client;
import edu.umss.storeservice.repository.ClientRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends GenericServiceImpl<Client> implements ClientService {
    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Client> getRepository() {
        return repository;
    }
}