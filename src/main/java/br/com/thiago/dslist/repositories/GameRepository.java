package br.com.thiago.dslist.repositories;

import br.com.thiago.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
