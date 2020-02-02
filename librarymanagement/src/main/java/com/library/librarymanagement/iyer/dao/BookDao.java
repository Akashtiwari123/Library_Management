package com.library.librarymanagement.iyer.dao;

import com.library.librarymanagement.iyer.entity.BookEntity;
import org.springframework.data.repository.RepositoryDefinition;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RepositoryDefinition(idClass=String.class,domainClass = BookEntity.class)
public interface BookDao {
    public BookEntity findByBookName(String bookName);
    public List<BookEntity> findAll();
    public BookEntity save(BookEntity book);
}
