package fr.wildcodeschool.dao;

import fr.wildcodeschool.beer.Beer;
import fr.wildcodeschool.beer.Hop;
import fr.wildcodeschool.beer.Malt;
import fr.wildcodeschool.beer.Ingredient;

import javax.json.JsonObject;
import javax.json.JsonArray;
import javax.json.JsonValue;
import java.util.ArrayList;
import java.util.List;

public class BeerDao {

    private List<Ingredient> ingredients = new ArrayList<>();
    private Beer beer;


    public BeerDao(JsonObject jsonObject){
        beer = new Beer();

        beer.setId(jsonObject.getInt("id"));
        System.out.println("beer id : " + beer.getId());
        beer.setName(jsonObject.getString("name"));
        System.out.println("beer name : " + beer.getName());

        // Ingredients
        JsonObject ingredientsJsOb = jsonObject.getJsonObject("ingredients");


        // Reading maltsJsArr from json ingredientsJsOb
        JsonArray maltsJsArr = ingredientsJsOb.getJsonArray("malt");
        for(JsonValue maltJsVal : maltsJsArr){
            JsonObject maltJsObj = (JsonObject) maltJsVal;
            // creating malt bean
            Ingredient malt = new Malt();
            malt.setName(maltJsObj.getString("name"));
            JsonObject maltAmount = maltJsObj.getJsonObject("amount");
            String maltAmountValueStr = maltAmount.get("value").toString();
            Double maltAmountValueDouble = Double.parseDouble(maltAmountValueStr);
            malt.setValue(maltAmountValueDouble);
            System.out.println("malt.get(value) : " + malt.getValue());

            ingredients.add(malt);
            System.out.println("");
        }

        // Reading hopsJsArr from json ingredientsJsOb
        JsonArray hopsJsArr = ingredientsJsOb.getJsonArray("hops");
        for(JsonValue hopJsVal : hopsJsArr){
            JsonObject hopJsObj = (JsonObject) hopJsVal;
            // creating malt bean
            Ingredient hop = new Hop();
            hop.setName(hopJsObj.getString("name"));
            JsonObject hopAmount = hopJsObj.getJsonObject("amount");
            String hopAmountValueStr = hopAmount.get("value").toString();
            Double hopAmountValueDouble = Double.parseDouble(hopAmountValueStr);
            hop.setValue(hopAmountValueDouble);

            ingredients.add(hop);
            System.out.println("");
        }

        System.out.println("ingredients.toString() : " + ingredients.toString());
        System.out.println("");
    }

    public Beer getBeer() {
        return beer;
    }

}
