package dev.patika.Veterinary.Management.System.Dto.Request.Appoinment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentByDateRequest {
    private LocalDate startDate;
    private LocalDate endDate;
}
