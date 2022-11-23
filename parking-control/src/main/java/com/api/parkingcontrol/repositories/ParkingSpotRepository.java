package com.api.parkingcontrol.repositories;


import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    boolean existsBylicensePlateCar(String licensePlateCar);
}
/* se extende o JPAREPOSITORY,
 que é uma interface do spring data,
 que já tem várias operações prontas para serem usadas

 */

