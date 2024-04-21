package com.paf.gymgoals.repository;

import com.paf.gymgoals.model.SharedPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedPostRepository extends MongoRepository<SharedPost, String> {
}
