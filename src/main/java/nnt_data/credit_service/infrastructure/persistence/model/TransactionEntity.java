package nnt_data.credit_service.infrastructure.persistence.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import nnt_data.credit_service.model.Transaction;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Getter
@Setter
@Document(collection = "credit_transaction")
public class TransactionEntity {
    @Id
    private String transactionId;
    private Date date;
    private Transaction.TypeEnum type;
    private Double amount;
    private String creditId;
}
