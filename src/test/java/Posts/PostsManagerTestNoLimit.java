package Posts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostsManagerTestNoLimit {

    @Test
    public void shouldZeroFilmsNoLimit() {
        PostsManager poster = new PostsManager(5);

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsNoLimit() {
        PostsManager poster = new PostsManager(0);
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLimitIdenticallyFilms() {
        PostsManager poster = new PostsManager(3);
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsOneLessForLimit() {
        PostsManager poster = new PostsManager(6);
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMuchLessThanLimit() {
        PostsManager poster = new PostsManager(15);
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMoreByOneThanLimit() {
        PostsManager poster = new PostsManager(4);
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");

        String[] expected = {"film5", "film4", "film3", "film2"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMuchMoreLimit() {
        PostsManager poster = new PostsManager(1);
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");
        poster.addFilm("film6");
        poster.addFilm("film7");
        poster.addFilm("film8");
        poster.addFilm("film9");
        poster.addFilm("film10");
        poster.addFilm("film11");
        poster.addFilm("film12");
        poster.addFilm("film13");
        poster.addFilm("film14");
        poster.addFilm("film15");

        String[] expected = {"film15"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
