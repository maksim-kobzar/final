package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    private final IngredientType type = SAUCE;
    private final String testName = "craps-burger";
    private final float testPrice = 20.0F;

    Ingredient ingredient = new Ingredient(type, testName, testPrice);

    @Test
    public void getPriceTest() {
        Assert.assertEquals("Ошибка в методе возвращения цены бургера", ingredient.getPrice(), testPrice, 0.0f);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Ошибка в методе возвращения названия бургера", ingredient.getName(), testName);
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals("Ошибка в методе возвращения типа ингридиентов", ingredient.getType(), type);
    }
}