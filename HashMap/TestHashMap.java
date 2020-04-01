package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class TestHashMap {

    public static void main(String[] args) {
    HashMap<String, String> mapObject = new LinkedHashMap<>();

        mapObject.put ("BrandName: ", "Audi");
        mapObject.put("HorsePower: ", "340");
        mapObject.put ("Type: ", "4 Wheel");
        mapObject.put ("Price: ", "$70,000");
        mapObject.put ("Origin: ", "Germany");

        System.out.println("Elements of Map:");
        System.out.println();

        for (HashMap.Entry carModel:mapObject.entrySet())
        System.out.println(carModel.getKey()+ " " +carModel.getValue());


    }


}

