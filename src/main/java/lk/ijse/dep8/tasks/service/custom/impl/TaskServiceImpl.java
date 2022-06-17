package lk.ijse.dep8.tasks.service.custom.impl;

import lk.ijse.dep8.tasks.service.custom.TaskService;
import lk.ijse.dep8.tasks.service.util.JNDIConnectionPool;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Scope("prototype")
@Component
public class TaskServiceImpl implements TaskService {

    private final DataSource pool;

    public TaskServiceImpl() {
        pool = JNDIConnectionPool.getInstance().getDataSource();
    }

}
