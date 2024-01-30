package com.tweeteroo.api.repositories;
import com.tweeteroo.api.models.TweetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, Long>{
    
}

