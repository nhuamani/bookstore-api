package com.nhuamani.bookstoreapi.controllers;

import com.nhuamani.bookstoreapi.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// TODO 2. convertir a un controlador rest
// TODO 3. mapear la ruta "/api/books"
public class BookController {

    public static List<Book> bookList = new ArrayList<>();

    /**
     * Devuelve la lista completa de libros
     * Retorna el status OK: 200
     * Ej.: GET http://localhost:9090/api/books
     */
    // TODO 4. mapear la ruta ""
    List<Book> list() {
        return bookList;
    }

    /**
     * Devuelve un libro por su ID, en caso contrario null.
     * Retorna el status OK: 200
     * Ej.: GET http://localhost:9090/api/books/1
     */
    // TODO 5. mapear la ruta "/{id}"
    Book get(/* TODO 6. capturar la variable "id" */ Integer id) {
        return bookList
                .stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Crea un libro a partir del cuerpo
     * de la solicitud HTTP y retorna
     * el libro creado.
     * Retorna el status CREATED: 201
     * Ej.: POST http://localhost:9090/api/books
     */
    // TODO 14. Cambiar el status code de respuesta a 201
    // TODO 7. mapear la ruta ""
    Book create(/* TODO 8. capturar el cuerpo de la solicitud */ Book book) {
        // asigna los datos básicos del libro y que deben ser establecidos
        // solo por el programa
        book.setId(new Random().nextInt(256));

        bookList.add(book);
        return book;
    }

    /**
     * Actualiza un libro por su ID, a partir
     * del cuerpo de la solicitud HTTP.
     * Retorna el status OK: 200.
     * Ej.: PUT http://localhost:9090/api/books/1
     */
    // TODO 9. mapear la ruta "/{id}"
    Book update(/* TODO 10. capturar la variable "id" */ Integer id,
            /* TODO 11. capturar el cuerpo de la solicitud */ Book bookForm) {
        Book bookFromDb = bookList
                .stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (bookFromDb == null) return null;

        bookFromDb.setTitle(bookForm.getTitle());
        bookFromDb.setPrice(bookForm.getPrice());

        return bookFromDb;
    }

    /**
     * Elimina un libro por su ID.
     * Retorna el status NO_CONTENT: 204
     * Ej.: DELETE http://localhost:9090/api/books/1
     */
    // TODO 15. cambiar el status code de respuesta a 204
    // TODO 12. mapear la ruta "/{id}"
    void delete(/* TODO 13. capturar la variable "id" */ Integer id) {
        bookList.removeIf(l -> l.getId().equals(id));
    }

}
