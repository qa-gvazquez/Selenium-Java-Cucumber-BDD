package pages;

public class PaginaPrincipal extends BasePage {
    // Lista de localizadores de los elementos Web a modelar, en la página
    // principal https://www.freerangetesters.com/
    private String sut = "https://www.freerangetesters.com"; // Final, no se puede cambiar el valor.

    /*
     * Dado que el localizador de los demás elementos de interés son idénticos, a
     * excepción
     * del 'TEXTO', podemos parametrizar ese valor como una variable, y enviarle un
     * 'argumento'
     * con los valores deseados, para evitar la mala práctica del HARDCODE en
     * nuestro script,
     * así como mejorar la mantenibilidad y el CLEAN CODE.
     *
     * Este 'argumento' se define en el archivo FEATURES en Cucumber, usando el
     * 'Scenario Outline'
     * y así poder crear una tabla de 'Examples:'
     * 
     * final String botonCursos = "//a[normalize-space()='Cursos' and @href]";
     * final String botonRecursos = "//a[normalize-space()='Recursos' and @href]";
     * final String botonBlog = "//a[normalize-space()='Blog' and @href]";
     * final String botonMentorías = "//a[normalize-space()='Mentorias' and @href]";
     * final String botonUdemy = "//a[normalize-space()='Udemy' and @href]";
     */
    private String botonCursos = "//a[normalize-space()='%s' and @href]";

    /**
     * Localizador del Scenario 3 - Users can select a plan when signing up.
     * Es un botón de la página principal con el texto 'Elegir Plan'
     */
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    // Constructor de la clase PADRE BasePage.
    public PaginaPrincipal() {
        super(driver);
    }

    // Acciones modeladas.

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
    public void clickOnLinksNavigationBar(String section) {
        // Reemplazar el marcador de posición en el locator 'botonCursos'por el
        // argumento
        String xpathSection = String.format(botonCursos, section);

        clickElement(xpathSection);
    }

    /**
     * Dar Click en el botón 'Elegir Plan' de la página principal del SUT.
     */
    public void clickOnElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }

    //Cierre de la clase que modela la página principal https://www.freerangetesters.com 
}
