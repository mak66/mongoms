package com.example.osfams.mongoms.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.osfams.mongoms.models.LogEntry;
import java.util.List;
/**
 *
 * @author ngan
 */
public interface LogEntryRepository extends CrudRepository<LogEntry, String> {
    
    List<LogEntry> findByService(String service);

    @Override
    void delete(LogEntry deleted);
}
