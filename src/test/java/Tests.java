package test.java;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import sk.hlad.velky.soap.Recipe;
import sk.hlad.velky.soap.RecipesService;
import sk.hlad.velky.soap.RecipesServiceService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Created by Milan Chrastina on 01.03.2016.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests {
    RecipesServiceService service = new RecipesServiceService();
    RecipesService recipesServices = service.getRecipesServicePort();

    @Test
    public void testovanie1Pridaj() {
        Recipe recept = new Recipe();
        recept.setAuthor("milanko");
        recept.setName("Chlieb");
        recept.setProcess("Velmmi pomaly");
        int vysledok = recipesServices.addRecipe(recept);
        System.out.println("testovaniePridaj: " + vysledok);
        assertNotNull(vysledok);

    }

    @Test
    public void testovanie2AllRecipes() {

        List vysledok = recipesServices.getAllRecipes();
        System.out.println("testovanieAllRecipes: "+vysledok);
        assertNotNull(vysledok);

    }

    @Test
    public void testovanie3Edit() {
        Recipe recept = new Recipe();
        recept.setId(1);
        recept.setAuthor("milanko");
        recept.setName("Chlieb");
        recept.getIngrediencies().add("mlieko");
        recept.getIngrediencies().add("sol");
        recept.getIngrediencies().add("muka");
        recept.setProcess("Velmmi pomaly a pekne");
        int vysledok = recipesServices.editRecipe(recept);
        assertNotSame(-1, vysledok);
    }

    @Test
    public void testovanie4ByWord() {
        List vysledok = recipesServices.getRecipesByKeyWord("Chlieb");
        System.out.println(vysledok);
        assertNotNull(vysledok);
    }

    @Test
    public void testovanie5ByIng() {
        List<String> ing = new ArrayList<>();
        ing.add("muka");
        ing.add("sol");
        ing.add("mlieko");
        List vysledok = recipesServices.getRecipesByIng(ing);
        System.out.println("Testovanie by ing: " + vysledok);
        assertNotNull(vysledok);
    }

    @Test
    public void testovanie6Vyber() {
        Recipe vysledok = recipesServices.getRecipe("1");
        System.out.println(vysledok);
        assertNotNull(vysledok);
    }

    @Test
    public void testovanie7Delete() {
        boolean vysledok = recipesServices.deleteRecipe("1");
        System.out.println(vysledok);
        assertFalse(!vysledok);
    }



}
