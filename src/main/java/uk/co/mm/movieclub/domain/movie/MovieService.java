package uk.co.mm.movieclub.domain.movie;

import org.springframework.stereotype.Service;
import uk.co.mm.movieclub.domain.movie.dto.MovieDto;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> findAllPromotedMovies(){
        return movieRepository.findAllByPromotedIsTrue().stream()
                .map(MovieDtoMapper::map)
                .toList();
    }
    public Optional<MovieDto> findMovieById(Long id){
        return movieRepository.findById(id).map(MovieDtoMapper::map);
    }
}
