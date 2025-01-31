package dev.patika.Veterinary.Management.System.Dao;

import dev.patika.Veterinary.Management.System.Entities.Animal;
import dev.patika.Veterinary.Management.System.Entities.Appointment;
import dev.patika.Veterinary.Management.System.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

    List<Appointment> findByAppointmentDateBetween(LocalDate startDate, LocalDate endDate);
    boolean existsByAppointmentDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Appointment> findByAppointmentDateBetweenAndDoctor(LocalDateTime startDate, LocalDateTime endDate, Doctor doctor);
    boolean existsByDoctor_Id(Long id);
    List<Appointment> findByAppointmentDateBetweenAndAnimal(LocalDateTime startDate, LocalDateTime endDate, Animal animal);
    boolean existsByAvailableDate_Id(Long id);
}
