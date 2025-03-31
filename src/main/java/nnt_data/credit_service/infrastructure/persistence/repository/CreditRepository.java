package nnt_data.credit_service.infrastructure.persistence.repository;

import nnt_data.credit_service.infrastructure.persistence.entity.CreditBaseEntity;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Update;
import reactor.core.publisher.Mono;

public interface CreditRepository extends ReactiveMongoRepository<CreditBaseEntity, String> {
    @Query("{ 'creditId': ?0 }")
    @Update("{ '$set': { 'amountPaid': ?1 } }")
    Mono<Void> updateAmountPaidByCreditId(String creditId, Double amountPaid);

    @Query("{ 'creditId': ?0 }")
    @Update("{ '$set': { 'availableCredit': ?1 } }")
    Mono<Void> updateAvilableAmountByCreditId(String creditId, Double availableAmount);
}
