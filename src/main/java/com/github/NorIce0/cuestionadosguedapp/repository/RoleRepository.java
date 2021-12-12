package com.github.NorIce0.cuestionadosguedapp.repository;

import com.github.NorIce0.cuestionadosguedapp.models.ERole;
import com.github.NorIce0.cuestionadosguedapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole aLong);
}
