package uk.co.mm.movieclub.domain.movie;

import uk.co.mm.movieclub.domain.movie.dto.MovieDto;

public class MovieDtoMapper {

    static MovieDto map(Movie movie){
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getOriginalTitle(),
                movie.getShortDescription(),
                movie.getDescription(),
                movie.getYoutubeTrailerId(),
                movie.getReleaseYear(),
                movie.getGenre().getName(),
                movie.isPromoted()
        );
    }
}
