package uk.co.mm.movieclub.domain.genre;

import uk.co.mm.movieclub.domain.genre.dto.GenreDto;

public class GenreDtoMapper {
    static GenreDto map (Genre genre){
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
