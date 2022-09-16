package com.cjcode.projectMinTic.Services;

import com.cjcode.projectMinTic.Entities.Transaction;
import org.springframework.http.ResponseEntity;

public interface TransactionService {
    ResponseEntity<?> getAllTransactions(Long id);
    ResponseEntity<?> createTransaction(Long id, Transaction transaction);
    ResponseEntity<?> updateTransaction(Long enterpriseId, Long id, Transaction transaction);
    ResponseEntity<?> deleteTransaction(Long enterpriseId, Long id);
}
