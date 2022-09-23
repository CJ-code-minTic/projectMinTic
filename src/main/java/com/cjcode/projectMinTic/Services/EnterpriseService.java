package com.cjcode.projectMinTic.Services;

import com.cjcode.projectMinTic.Entities.Enterprise;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EnterpriseService {
    List<Enterprise> getAllEnterpriseMVC();
    ResponseEntity<?> getAllEnterprises();
    ResponseEntity<?> createEnterprise(Enterprise enterprise);
    ResponseEntity<?> getEnterpriseById(Long id);
    ResponseEntity<?> deleteEnterprise(Long id);
    ResponseEntity<?> updateEnterprise(Long id,Enterprise enterprise);
}
