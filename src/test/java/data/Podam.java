package data;

import DataPojo.Data;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


public class Podam {
    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    private Podam() {
    }

    public static Data getRandomEmployeeDetails() {
        return FACTORY.manufacturePojo(Data.class);
    }
}
