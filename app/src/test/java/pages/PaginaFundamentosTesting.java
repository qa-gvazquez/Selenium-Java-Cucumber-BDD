package pages;

public class PaginaFundamentosTesting extends BasePage {

    // Lista de localizadores a modelar en la página
    // https://www.freerangetesters.com/fundamentos-del-testing

    private String introduccionTestingLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    // Constructor de la clase PADRE BasePage.
    public PaginaFundamentosTesting() {
        super(driver);
    }

    // Acciones a modelar en la página
    // https://www.freerangetesters.com/fundamentos-del-testing

    /**
     * Da Click en el link 'Introducción al Testing de Software'
     */
    public void introduccionTestingLink() {
        clickElement(introduccionTestingLink);
    }

    // Fin de la clase que modela la página
    // https://www.freerangetesters.com/fundamentos-del-testing

}
