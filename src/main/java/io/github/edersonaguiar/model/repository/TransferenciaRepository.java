package io.github.edersonaguiar.model.repository;

import io.github.edersonaguiar.model.entity.TranferenciasContas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenciaRepository extends JpaRepository<TranferenciasContas, Long> {
}
