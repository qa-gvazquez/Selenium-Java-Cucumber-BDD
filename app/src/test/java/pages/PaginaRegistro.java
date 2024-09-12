package pages;

import java.util.List;

public class PaginaRegistro extends BasePage {

    // Lista de localizadores a modelar en la página
    // https://www.freerangetesters.com/checkout/cart

    private String planDropdown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    // Constructor de la clase PADRE BasePage.
    public PaginaRegistro() {
        super(driver);
    }

    // Acciones a modelar en la página
    // https://www.freerangetesters.com/checkout/cart

    /**
     * 
     */
    public List<String> returnPlanDropdownValues(){
        return getDropdownValues(planDropdown);
    }

    // Fin de la clase que modela la página
    // https://www.freerangetesters.com/checkout/cart
}
