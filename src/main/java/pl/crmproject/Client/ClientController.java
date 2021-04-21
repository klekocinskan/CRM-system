package pl.crmproject.Client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/addNewClient")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public String getNewClient(Model model){

        model.addAttribute("client", new ClientDto());

        return "newClient";
    }

    @PostMapping
    @ResponseBody
    public String postNewClient(ClientDto client){
        return client.toString();
    }
}
