package za.ac.cput.service;

public interface IService<T, ID> {
    T create(T t);

    T read(ID id);

    T update(T t);

    //No Delete - Service layer can have less or more functions than the repository layer.
}
