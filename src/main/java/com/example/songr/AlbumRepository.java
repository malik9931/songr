package com.example.songr;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface AlbumRepository extends CrudRepository<AlbumModel, Integer> {
}
