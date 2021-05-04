package pl.crmproject.Contract;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContractDto {


    private String contractName;
    private String comment;
    private BigDecimal contractValue;



    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getContractValue() {
        return contractValue;
    }

    public void setContractValue(BigDecimal contractValue) {
        this.contractValue = contractValue;
    }




    @Override
    public String toString() {
        return "ContractDto{" +
                "contractName='" + contractName + '\'' +
                ", comment='" + comment + '\'' +
                ", contractValue=" + contractValue +
                '}';
    }
}
