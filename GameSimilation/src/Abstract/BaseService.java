package Abstract;

public interface BaseService<T> {
	T getAll();
	void add(T entity);
	void update(T entity);
	void delete(T entity);
}
