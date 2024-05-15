package com.example.onetoone.service.impl;

import com.example.onetoone.model.Book;
import com.example.onetoone.model.Owner;
import com.example.onetoone.repository.OwnerRepository;
import com.example.onetoone.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public void save(Owner owner) {
        // list of Book
        List<Book> Books = new ArrayList<>();
        for (Book bookIn : owner.getBooks()) {
            // new Book
            Book book = new Book();
            book.setTitle(bookIn.getTitle());
            book.setCategory(bookIn.getCategory());
            book.setContent(bookIn.getContent());

            // set owner to Book
            book.setOwner(owner);
            // add Book to list
            Books.add(book);
        }

        // add Book list to Owner
        owner.setBooks(Books);

        // save Owner
        ownerRepository.save(owner);
    }

    @Override
    public void getById(int id) {
        Owner ownerOut = ownerRepository.getById(id);
        System.out.println("\nOwner details :: \n" + ownerOut);
        System.out.println("\nList of Blogs :: \n" + ownerOut.getBooks());
    }
}
