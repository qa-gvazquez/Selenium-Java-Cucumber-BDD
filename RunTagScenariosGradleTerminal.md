# Ejecutar escenarios con @TAG desde Gradle, usando la terminal.

Aquí el 'truco' es definir `TERMINAL`, ya que hay varias

- PowerShell (Windows):
- CMD (Windows):
- Bash (Linux/Mac):
- Zsh (Mac):

Y cada una tiene su sintaxis.

## BASH

`gradle test -Dcucumber.filter.tags="@Plans and @Courses"`


`gradle test -Dcucumber.filter.tags="@Plans or @Courses"`

- Para ejecutar todo lo que contenga `Plans` pero NO lo que contenga `Courses`

`gradle test -Dcucumber.filter.tags="@Plans and not @Courses"`


## PowerShell

`gradle test -D "cucumber.filter.tags=@Plans"`

`gradle test -D "cucumber.filter.tags=@Courses"`

`gradle test -D "cucumber.filter.tags=@Courses and @Plans"`

`gradle test -D "cucumber.filter.tags=@Plans and not @Courses"`