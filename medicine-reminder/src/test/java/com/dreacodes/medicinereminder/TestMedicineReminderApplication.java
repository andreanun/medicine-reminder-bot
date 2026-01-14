package com.dreacodes.medicinereminder;

import org.springframework.boot.SpringApplication;

public class TestMedicineReminderApplication {

    public static void main(String[] args) {
        SpringApplication.from(MedicineReminderApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
