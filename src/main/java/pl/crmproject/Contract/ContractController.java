package pl.crmproject.Contract;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/contract")
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }


    @GetMapping("/addContract")
    public String addNewContract(Model model){
        model.addAttribute("contract", new Contract());
        return "newcontract";
    }


    @PostMapping
    @ResponseBody
    public String showNewContract(ContractDto contract){
        contractService.add(contract);
        return contract.toString();
    }
}
