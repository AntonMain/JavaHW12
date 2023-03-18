package Posts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostsManagerTestFindAll {


    @Test
    public void shouldAddFilms() {

        PostsManager poster = new PostsManager();

        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");

        String[] expectedPoster = {"film1", "film2", "film3", "film4", "film5"};
        String[] actualPoster = poster.findAll();

        Assertions.assertArrayEquals(expectedPoster, actualPoster);
    }
}