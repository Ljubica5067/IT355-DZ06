package org.example.it355dz06.repozitorijumi;

import org.example.it355dz06.entiteti.Proizvod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod,Long> {
}
