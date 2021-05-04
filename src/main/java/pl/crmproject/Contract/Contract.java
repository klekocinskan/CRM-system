package pl.crmproject.Contract;

import pl.crmproject.Client.Client;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="contracts")
public class Contract {

    @Id
    @GeneratedValue
    private Long id;
    private String contractName;
    private String comment;
    private BigDecimal contractValue;
    private LocalDateTime deadlineRealization;

    @ManyToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDateTime getDeadlineRealization() {
        return deadlineRealization;
    }

    public void setDeadlineRealization(LocalDateTime deadlineRealization) {
        this.deadlineRealization = deadlineRealization;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
