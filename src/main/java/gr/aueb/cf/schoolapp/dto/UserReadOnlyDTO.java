package gr.aueb.cf.schoolapp.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserReadOnlyDTO {
    private Long id;
    private String userName;
    private String password;
    private String role;
}
