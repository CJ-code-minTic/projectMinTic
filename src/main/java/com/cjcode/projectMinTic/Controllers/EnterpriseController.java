package com.cjcode.projectMinTic.Controllers;

import com.cjcode.projectMinTic.Entities.Enterprise;
import com.cjcode.projectMinTic.Services.EnterpriseService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.PrimitiveIterator;

@RestController
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnterpriseController {
    private EnterpriseService service;
    @GetMapping("/enterprises")
    public List<Enterprise> getEnterprises(){
        return this.service.getEnterpriseRepository().findAll();
    }

    @PostMapping("/enterprises")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return this.service.getEnterpriseRepository().save(enterprise);
    }

    @GetMapping("/enterprises/{id}")
    public Enterprise getEnterprise(@PathVariable("id") Long id){
        return this.service.getEnterpriseRepository().getReferenceById(id);
    }

    @PutMapping("/enterprises/{id}")
    public Enterprise updateEnterprise(@PathVariable("id") int id, @RequestBody Enterprise enterprise){
        return this.service.getEnterpriseRepository().findAll().set(id, enterprise);
    }

    @DeleteMapping("/enterprises/{id}")
    public boolean deleteEnterprise(@PathVariable("id") Long id){
        try{
            this.service.getEnterpriseRepository().deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
