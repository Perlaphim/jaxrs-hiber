package gr.aueb.cf.schoolapp.model;

import gr.aueb.cf.schoolapp.core.enums.RoleType;
import jakarta.persistence.*;
import lombok.*;

import javax.management.relation.Role;
import javax.security.auth.Subject;
import java.security.Principal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table (name = "users")
public class User extends AbstractEntity implements IdentifiableEntity, Principal {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column (unique = true)
    private String username;
    private String password;

    @Column (unique = true)
    @Enumerated(EnumType.STRING)
    public RoleType roleType;

    @Override
    public String getName() {
        return username;
    }
}
