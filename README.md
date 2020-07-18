# spring-vaadin-app
Spring Boot 2.3.1
Java 8

Treść wykonanego zadania:

Utworz aplikacje ktora bedzie zawierała encja JPA:

- Author (imie, nazwisko)
- Kategoria (nazwa)
- Ksiazka (ISBN, tytuł)

Jeden autor moze miec wiele ksiazek, jedna ksiazka moze miec wiele autorow ale moze nalezec tylko do jednej kategorii.
Zasil baze danych w dowolny sposob (zapytanie SQL badz poprzez Jave).

Nastepnie stworz serwis REST ktory bedzie zwracal dane:
- Autor
- Informacje ile ksiazak ma autor w danej kategorii

Nastepnie stworzyc plik index.html ktory wystwietli te dane pobrane z serwisu REST. Do wyswietlanie tych danych nalezy wykorzystac Primefaces oraz komponentu DataTable.
