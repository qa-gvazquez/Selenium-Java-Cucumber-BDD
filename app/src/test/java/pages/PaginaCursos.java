package pages;

public class PaginaCursos extends BasePage {

    // Lista de localizadores de los WebElement a modelar en la página
    // https://www.freerangetesters.com/cursos

    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    // Constructor de la clase PADRE BasePage.
    public PaginaCursos() {
        super(driver);
    }

    // Acciones modeladas

    /**
     * Click en el botón fundamentosTestLink
     */
    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }

    // Cierre de la clase que modela la pagina
    // https://www.freerangetesters.com/cursos
}
