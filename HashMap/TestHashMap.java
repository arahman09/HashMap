package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        Map<String, String > mapObject = new HashMap<String, String>();

        mapObject.put ("BrandName: ", "Audi");
        mapObject.put("HorsePower: ", "340");
        mapObject.put ("Type: ", "4 Wheel");
        mapObject.put ("Price: ", "$70,000");
        mapObject.put ("Origin: ", "Germeny");

        System.out.println("Elements of Map: ");
        System.out.println(mapObject);



    }




}

