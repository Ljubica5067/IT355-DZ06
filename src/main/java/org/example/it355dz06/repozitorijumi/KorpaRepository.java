package org.example.it355dz06.repozitorijumi;

import org.example.it355dz06.entiteti.Korpa;
import org.example.it355dz06.entiteti.Proizvod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KorpaRepository extends JpaRepository<Korpa,Long> {
}
