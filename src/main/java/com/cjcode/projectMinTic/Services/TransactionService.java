package com.cjcode.projectMinTic.Services;

import com.cjcode.projectMinTic.Repositories.TransactionRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionService {
    private TransactionRepository transactionRepository;
}
