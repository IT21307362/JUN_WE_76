package com.paf.gymgoals.service;

import com.paf.gymgoals.model.Like;

public interface LikeService {
    void addLike(Like like);

    void removeLikeById(String likeId);
}
