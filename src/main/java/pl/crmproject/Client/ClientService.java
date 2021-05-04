package pl.crmproject.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void add(ClientDto clientDto){
        Client newClient = new Client();

        newClient.setName(clientDto.getFirstName());
        newClient.setSurname(clientDto.getLastName());
        newClient.setEmail(clientDto.getEmailAdress());
        newClient.setAddress(clientDto.getAddress());
        newClient.setTelephoneNumber(clientDto.getTelephonNumber());

        clientRepository.save(newClient);

    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
}
