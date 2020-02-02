package com.library.librarymanagement.iyer.dao;

import com.library.librarymanagement.iyer.entity.OrderEntity;
import org.springframework.data.repository.RepositoryDefinition;

import javax.transaction.Transactional;

@Transactional
@RepositoryDefinition(idClass = Integer.class,domainClass = OrderEntity.class)
public interface OrderDao {
    public OrderEntity save(OrderEntity order);
    public List

}
