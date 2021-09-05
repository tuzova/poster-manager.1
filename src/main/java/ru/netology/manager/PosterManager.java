package ru.netology.manager;

import ru.netology.domain.MovieUnit;

public class PosterManager {
    private MovieUnit[] units = new MovieUnit[0];
    private int limit = 7;

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(MovieUnit unit) {
        int length = units.length + 1;
        MovieUnit[] tmp = new MovieUnit[length];
        for (int i = 0; i < units.length; i++) {
            tmp[i] = units[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = unit;
        units = tmp;
    }

    public MovieUnit[] getLast7() {
        int resultLength;
        if (units.length > limit) {
            resultLength = limit;
        } else {
            resultLength = units.length;
        }
        MovieUnit[] result = new MovieUnit[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = units[i];
        }
        return result;
    }

    public MovieUnit[] getAll() {
        MovieUnit[] result = new MovieUnit[limit];
        for (int i = 0; i < limit; i++) {
            result[i] = units[i];
        }
        return result;
    }
}



