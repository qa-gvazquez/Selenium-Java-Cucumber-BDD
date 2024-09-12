package pages;

public class PaginaPrincipal extends BasePage {

    final String sut = "https://www.freerangetesters.com"; // Final, no se puede cambiar el valor.
    final String botonCursos = "//a[normalize-space()='Cursos' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    /**
     * Modelando la acción navegar a la URL del SUT y dar click en un botón.
     */
    public void navigateToFreeRangeTesters() {
        navigateTo(sut);
        maxBrowser();
    }

    /**
     * Ejecuta la acción de hacer click en los botones de la barra de navegación.
     */
    public void clickOnLinksNavigationBar(){
        clickElement(botonCursos);
    }


}
