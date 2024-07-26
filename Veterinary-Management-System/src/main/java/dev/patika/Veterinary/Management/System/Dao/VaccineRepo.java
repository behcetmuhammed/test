package dev.patika.Veterinary.Management.System.Dao;

import dev.patika.Veterinary.Management.System.Entities.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepo  extends JpaRepository<Vaccine, Long> {
}
