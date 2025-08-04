package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account holder name cannot be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "AccountNumber must be a valid 10-digit number")
    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty")
    @Schema(
            description = "Account type of Eazy Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty")
    @Schema(
            description = "Eazy Bank branch address", example = "Main Street 123, New York City"
    )
    private String branchAddress;

}
