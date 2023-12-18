package io.mosip.esignet.mock.integration.dto;

import lombok.Data;

import java.util.List;

@Data
public class InsurenceResponceDto {
    private List<String> benefits;
    private String gender;
    private String policyName;
    private String dob;
    private String policyNumber;
    private String mobile;
    private String fullName;
    private String expiresOn;
    private String osid;
    private List<String> osOwner;
    private String email;
}