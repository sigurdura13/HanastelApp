package com.example.notandi.hanastel.product;

import android.content.Context;

import com.example.notandi.hanastel.domain.IngredientRaw;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by SigurdurMarAtlason on 29/10/15.
 */
@SuppressWarnings("serial")
public class CocktailRecipe implements Serializable {

    private int cocktailId;
    private String name;
    private String imgName;
    private ArrayList<Ingredient> ingredients;
    private String description;

    public CocktailRecipe() {

    }

    public CocktailRecipe(int cocktailId, String name, String imgPath, ArrayList<Ingredient> ingredients) {
        this.cocktailId = cocktailId;
        this.name = name;
        this.imgName = imgPath;
        this.ingredients = ingredients;
    }

    public CocktailRecipe(int cocktailId, String name, String imgPath, ArrayList<Ingredient> ingredients, String description) {
        this.cocktailId = cocktailId;
        this.name = name;
        this.imgName = imgPath;
        this.ingredients = ingredients;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getImgName(){
        return this.imgName;
    }

    public void setImgName(String imgName){
        this.imgName = imgName;
    }

    public int getImgResourceId(Context context) {
        return context.getResources().getIdentifier(this.imgName , "drawable", context.getPackageName());
    }

    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredientsList(){
        return this.ingredients;
    }

    public Ingredient getIngredientById(int _id) {
        for(Ingredient i : this.ingredients){
            if(i.getId() == _id) return i;
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(int cocktailId) {
        this.cocktailId = cocktailId;
    }
}