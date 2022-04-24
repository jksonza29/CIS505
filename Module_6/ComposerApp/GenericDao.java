/*
    Author: Janzal Karlo Sonza
    Date: 04/21/2022
*/

import java.util.*;

public interface GenericDao<E, K>{
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
}