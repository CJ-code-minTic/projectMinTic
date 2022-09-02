package com.cjcode.projectMinTic.Services;

import com.cjcode.projectMinTic.Repositories.EnterpriseRepository;
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
public class EnterpriseService {
    private EnterpriseRepository enterpriseRepository;
}
