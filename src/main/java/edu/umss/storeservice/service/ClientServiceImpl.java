/**
 * @author: Johnny PT
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.dto.DtoBase;
import edu.umss.storeservice.model.Client;
import edu.umss.storeservice.repository.ClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients=new ArrayList<>();
        this.repository.findAll().forEach(clients::add);
        return clients;
    }

    @Override
    public Client findById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Client save(Client model) {
            return  this.repository.save(model);
    }

    @Override
    public Client saveAndFlush(Client model) {
        return null;
    }

    @Override
    public Client patch(DtoBase dto, Client model) {
        return null;
    }

    @Override
    public List<Client> saveAll(Iterable<Client> models) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
            this.repository.deleteById(id);
    }

    @Override
    public Byte[] getBytes(MultipartFile file) {
        return new Byte[0];
    }

    @Override
    public Page<Client> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Client> findAll(String filter) {
        return null;
    }
}