package librarymanagement.repository;

import librarymanagement.domain.entity.Publisher;
import librarymanagement.domain.request.PublisherSearch;
import librarymanagement.domain.response.PublisherDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PublisherCustomRepository {
    Page<Publisher> findPublisher(PublisherSearch publisherSearch, Pageable pageable);

    Optional<Publisher> findByIdDetail(Long publisherId);
}