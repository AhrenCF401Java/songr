package com.ahrenswett.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository < Type, Identifier type>, we set up the emotion id to be a Long so this is a Long
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
