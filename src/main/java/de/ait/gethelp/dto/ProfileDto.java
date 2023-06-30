package de.ait.gethelp.dto;

import de.ait.gethelp.models.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileDto {

    private Long id;
    private String username;
    private String email;
    private String phone;
    private String role;
    private Boolean isHelper;
}
