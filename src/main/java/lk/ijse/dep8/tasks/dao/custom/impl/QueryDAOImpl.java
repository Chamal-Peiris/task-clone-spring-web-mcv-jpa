package lk.ijse.dep8.tasks.dao.custom.impl;

import lk.ijse.dep8.tasks.dao.custom.QueryDAO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Scope("prototype")
@Component
public class QueryDAOImpl implements QueryDAO {

    private final Connection connection;

    public QueryDAOImpl(Connection connection) {
        this.connection = connection;
    }

}
