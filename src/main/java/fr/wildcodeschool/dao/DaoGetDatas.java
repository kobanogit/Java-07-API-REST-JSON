package fr.wildcodeschool.dao;

import fr.wildcodeschool.beer.Beer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class DaoGetDatas {
    private String request;
    private String url;
    private List<Beer> beers = new ArrayList<>();

    public DaoGetDatas (String request){
        this.request = request;

        if(request.matches("\\d+")){
            // Recherche avec l'url par id'

        }else if(request == "allBeers") {
            this.url = "https://api.punkapi.com/v2/beers";
            JsonArray jsonArray = getJsonArray();

        }else if(request != "allBeers"){
            // Recherche par noms
            // voir URL spécialisée qui renvoie toutes les bières en
        }


    }

    public JsonArray getJsonArray(){
        // JSON Data recovery
        JsonArray jsonArray = null;
        try (InputStream is = new URL(url).openStream();
             JsonReader reader = Json.createReader(new InputStreamReader(is, "UTF-8"));) {

            jsonArray = reader.readArray();

            // Creating Beans objects list
            for (int i = 0; i < jsonArray.size(); i++){
                JsonObject jsonObject = jsonArray.getJsonObject(i);
                BeerDao beerDao = new BeerDao(jsonObject);
                beers.add(beerDao.getBeer());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
