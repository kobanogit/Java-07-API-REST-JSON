package fr.wildcodeschool.getbeers;

import fr.wildcodeschool.dao.DaoGetDatas;
import fr.wildcodeschool.beer.Beer;

import java.util.ArrayList;
import java.util.List;


public class App {

    List<Beer> beers;

    String request = null;


    // CONSTRUCTORS

    public App(){
        // renvoyer List (ArrayList) de toutes les bières
        DaoGetDatas daoGetDatas = new DaoGetDatas("allBeers");

        // Envoi du résultat
        ShowBeers();

    }

    public App(String name){
        // renvoyer la bière "name"
        DaoGetDatas daoGetDatas = new DaoGetDatas("name");
    }

    public App(int id){
        // renvoyer la bière id
        DaoGetDatas daoGetDatas = new DaoGetDatas(String.valueOf(id));
    }

    public App(String ingredient, Long value){
        // Autre solution :
        // ajouter les bières en DAO selon la value demandée

        // 1ere solution :
        // Renvoyer les bières
        DaoGetDatas daoGetDatas = new DaoGetDatas("allBeers");
        // Le tri se fait sur l'objets métier contenant toutes les bières
    }



    // METHODS

    public List<Beer> ShowBeers(){
        List<Beer> beers = new ArrayList<>();
        return beers;
    }

//    public App(){
//        try (InputStream is = new URL("https://api.punkapi.com/v2/beers").openStream();
//             JsonReader reader = Json.createReader(new InputStreamReader(is, "UTF-8"));) {
//
//            JsonArray jsonArray = reader.readArray();
//
//            for (int i = 0; i < jsonArray.size(); i++){
//                JsonObject jsonObject = jsonArray.getJsonObject(i);
//                Beer beer = new Beer(jsonObject);
//                beers.add(beer);
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List getBeers() {
//        return beers;
//    }
//
//    public void setBeers(List beers) {
//        this.beers = beers;
//    }
//
//    public static void main(String[] args) {
//        App beers = new App();
//    }

}