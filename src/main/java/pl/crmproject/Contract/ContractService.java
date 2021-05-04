package pl.crmproject.Contract;

import org.springframework.stereotype.Service;

@Service
public class ContractService {

    public final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }


    public void add(ContractDto contractDto) {
        Contract newContract = new Contract();

       newContract.setContractName(contractDto.getContractName());
       newContract.setContractValue(contractDto.getContractValue());
       newContract.setComment(contractDto.getComment());

       contractRepository.save(newContract);

    }
}
