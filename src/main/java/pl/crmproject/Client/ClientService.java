package pl.crmproject.Client;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void add(ClientDto clientDto){
        Client newClient = new Client();

    }
}
