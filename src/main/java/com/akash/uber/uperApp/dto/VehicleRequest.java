package com.akash.uber.uperApp.dto;

import com.akash.uber.uperApp.entiies.enums.PaymentMethod;
import lombok.Data;

@Data
public class VehicleRequest {
    private Double id;
    private PaymentMethod paymentMethod;
}
