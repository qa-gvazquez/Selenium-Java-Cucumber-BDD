Feature: Navigation Bar
    To see the subpages
    Without loggin in
    I can click the navigation bar links

    Scenario Outline: Scenario Outline name: I can access the subpages trough the navigation bar
        Given I navigate to www.freerangetesters.com
        When I go to <section> using the navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |

    Scenario: Courses are presented correctly to potential customers
        Given I navigate to www.freerangetesters.com
        When I go to Cursos using the navigation bar
        And select Introducción al Testing

    @Plans
    Scenario: Users can select a plan when signing up
        Given I navigate to www.freerangetesters.com
        When I select Elegir Plan
        Then I can validate the options in the checkout page
