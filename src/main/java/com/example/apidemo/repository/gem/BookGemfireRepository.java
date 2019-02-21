package com.example.apidemo.repository.gem;

import com.example.apidemo.entity.BookGemfire;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.gemfire.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookGemfireRepository extends GemfireRepository<BookGemfire, String> {

    @Query("SELECT * FROM /book b WHERE b.id = $1")
    BookGemfire findBookById(String id);

}