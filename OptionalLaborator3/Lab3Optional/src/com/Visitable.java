package com;

import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {
    LocalTime getOpeningTime();
    LocalTime getClosingTime();
    void setOpeningHour(LocalTime of);
    void setClosingHour(LocalTime of);

    default void setOpeningTime(Visitable obj1){                    // Setez ora default de deschidere
        obj1.setOpeningHour(LocalTime.of(9,30));
    }

    static Duration getVisitingDuration(Visitable obj) {
        return Duration.between(obj.getClosingTime(), obj.getOpeningTime());            // Cu ajutorul functiei Duration.between imi calculeaza cate ore sunt intre ora deschiderii si cea de inchidere
    }

    default void setCloseTime(Visitable obj2){
        obj2.setClosingHour(LocalTime.of(20,00));           // Setez ora default de inchidere
    }


}
