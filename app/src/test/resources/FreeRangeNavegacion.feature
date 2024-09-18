@Navigation
Feature: Navigation Bar
    To see the subpages
    Without loggin in
    I can click the navigation bar links

    Background: I am on the FreeRangeTesters web without logging in.
        Given I navigate to www.freerangetesters.com

    @Plans
    Scenario Outline: I can access the subpages trough the navigation bar
        When I go to <section> using the navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |

    @Courses
    Scenario: Courses are presented correctly to potential customers
        When I go to Cursos using the navigation bar
        And select Introducción al Testing

    @Plans @Courses
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate the options in the checkout page
