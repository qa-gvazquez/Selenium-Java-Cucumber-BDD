Feature: Navigation Bar
    To see the subpages
    Without loggin in
    I can click the navigation bar links

Scenario: I can access the subpages trough the navigation bar
    Given I navigate to www.freerangetesters.com
    When I go to <section> using the navigation bar
    Examples:
        | section |
        | Cursos |
        | Recursos |
        | Blog |
        | Mentorias |
        | Udemmy |
        | Cursos |