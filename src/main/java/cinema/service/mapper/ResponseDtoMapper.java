package cinema.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D toDto(T t);
}
