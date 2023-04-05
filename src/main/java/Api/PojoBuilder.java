package Api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class PojoBuilder {

    private String name;
    private int number;
    private int airline;
}
