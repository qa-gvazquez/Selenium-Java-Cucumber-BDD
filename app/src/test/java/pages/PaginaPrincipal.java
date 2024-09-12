package pages;

public class PaginaPrincipal extends BasePage {

    final String sut = "https://www.freerangetesters.com"; // Final, no se puede cambiar el valor.
    private String botonCursos = "(//a[contains(.,'Cursos')])[1]";

    public PaginaPrincipal() {
        super(driver);
    }

    /**
     * Modelando la acción navegar a la URL del SUT y dar click en un botón.
     */
    public void navigateToFreeRangeTesters() {
        navigateTo(sut);
        maxBrowser();
        clickElement(botonCursos);
    }



}
