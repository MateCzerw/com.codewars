package com.codewars.whatClassySong;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Song {

    private final String title;
    private final String artist;
    private final Set<String> listeners = new HashSet<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> newListeners) {

        List<String> lowerCaseDistinctListeners =
                newListeners
                        .stream()
                        .map(e -> e.toLowerCase())
                        .distinct()
                        .collect(Collectors.toList());

        long result =
                lowerCaseDistinctListeners
                        .stream()
                        .filter(e -> !listeners.contains(e))
                        .count();

        lowerCaseDistinctListeners
                .stream()
                .forEach(e -> listeners.add(e));

        return (int) result;
    }

}
