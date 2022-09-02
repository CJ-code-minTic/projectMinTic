package com.cjcode.projectMinTic.Controllers;

import com.cjcode.projectMinTic.Entities.Transaction;
import com.cjcode.projectMinTic.Services.EnterpriseService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionController {
    //private TransactionService transactionService;
    private EnterpriseService service;

    @GetMapping("/enterprises/[id]/movements")
    public List<Transaction> getTransaction(@PathVariable("id") Long id){
        return this.service.getEnterpriseRepository().getReferenceById(id).getTransactions();
    }

    @PostMapping("/enterprises/[id]/movements")
    public boolean createTransaction(@PathVariable("id") Long id,@RequestBody Transaction transaction){
        //return this.service.getEnterpriseRepository().getReferenceById(id).getTransactions().set(id1,transaction);
        try {
            this.service.getEnterpriseRepository().getReferenceById(id).getTransactions().add(transaction);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @PutMapping("/enterprises/[id]/movements")
    public Transaction updateTransaction(@PathVariable("id") Long id,@PathVariable("id") int id1, @RequestBody Transaction transaction){
        return this.service.getEnterpriseRepository().getReferenceById(id).getTransactions().set(id1,transaction);
    }

    @DeleteMapping("/enterprises/[id]/movements")
    public boolean deleteTransaction(@PathVariable("id") Long id){
        try{
            this.service.getEnterpriseRepository().getReferenceById(id).getTransactions().clear();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
