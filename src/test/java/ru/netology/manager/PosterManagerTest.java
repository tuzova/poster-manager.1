package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    private PosterManager manager = new PosterManager();
    private MovieUnit first = new MovieUnit(154, 55, "Bloodshot", 350);
    private MovieUnit second = new MovieUnit(155, 89, "Onward", 350);
    private MovieUnit third = new MovieUnit(156, 113, "Hotel Belgrade", 350);
    private MovieUnit fourth = new MovieUnit(157, 84, "The Gentlemen", 400);
    private MovieUnit fifth = new MovieUnit(158, 105, "The Invisible Man", 350);
    private MovieUnit sixth = new MovieUnit(159, 118, "Trolls World Tour", 400);
    private MovieUnit seventh = new MovieUnit(160, 52, "Number One", 350);
    private MovieUnit eighth = new MovieUnit(161, 36, "Soul", 450);
    private MovieUnit ninth = new MovieUnit(163, 99, "Nomadland", 350);

    @Test
    public void shouldGetLastOver7() {

        manager.add(ninth);
        manager.add(eighth);
        manager.add(seventh);
        manager.add(sixth);
        manager.add(fifth);
        manager.add(fourth);
        manager.add(third);
        manager.add(second);
        manager.add(first);

        MovieUnit[] actual = manager.getLast7();
        MovieUnit[] expected = new MovieUnit[]{ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastUnder7() {

        manager.add(ninth);
        manager.add(eighth);
        manager.add(seventh);
        manager.add(sixth);
        manager.add(fifth);

        MovieUnit[] actual = manager.getLast7();
        MovieUnit[] expected = new MovieUnit[]{ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }
}



