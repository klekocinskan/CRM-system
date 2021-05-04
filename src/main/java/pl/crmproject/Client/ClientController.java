package pl.crmproject.Client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;
    private final Validator validator;

    public ClientController(ClientService clientService, Validator validator) {
        this.clientService = clientService;
        this.validator = validator;
    }

    @GetMapping("/addNewClient")
    public String getNewClient(Model model){

        model.addAttribute("client", new ClientDto());

        return "newclient";
    }



    @PostMapping("/addNewClient")
    public String postNewClient(@ModelAttribute("client")@Valid ClientDto client, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "newclient";
        }

        clientService.add(client);
        //do sprawdzenia
        return "redirect:/client/all";
    }



    @GetMapping("/all")
    @ResponseBody
    public String getAllClients(){
        List<Client> clients = clientService.findAll();
        return  clients.stream()
                .map(Client::getSurname)
                .collect(Collectors.joining(" , "));
    }
}
