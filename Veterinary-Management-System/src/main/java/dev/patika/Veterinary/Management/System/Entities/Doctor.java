package dev.patika.Veterinary.Management.System.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "doctors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private long id;

    @Column(name = "doctor_name", nullable = false)
    private String name;

    @Column(name = "doctor_surname", nullable = false)
    private String surname;

    @Column(name = "doctor_phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "doctor_mail", nullable = false, unique = true)
    private String mail;

    @Column(name = "doctor_address", nullable = false)
    private String address;

    @Column(name = "doctor_city", nullable = false)
    private String city;


    //Doctor (1)<=>(x) appointmentList
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Appointment> appointmentList;


    //Doctor (1)<=>(x) availableDates
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvailableDate> availableDates;
}