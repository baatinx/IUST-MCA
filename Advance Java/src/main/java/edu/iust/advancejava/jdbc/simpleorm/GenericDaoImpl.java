package edu.iust.advancejava.jdbc.simpleorm;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class GenericDaoImpl<T extends IEntity> implements GenericDao<T> {
    private final Connection conn;
    private final Class<?> entityClass;
    private final List<FieldInfo> fields;

    public GenericDaoImpl(Connection conn, Class<?> entityClass){
        this.conn = conn;
        this.entityClass = entityClass;
        this.fields = ReflectionUtils.getFieldNames(entityClass);
    }

    @Override
    public void create(T entity) throws SQLException, InvocationTargetException, IllegalAccessException {
        assert entity != null;
        String query = createInsertQuery();
    }

    private String createInsertQuery(){
        return String.format("insert into %s(%s) values (%s);",
                tableName(), commaSeperatedFieldNames());
    }

    private String commaSeperatedFieldNames(){
        return fields.stream().map(FieldInfo::getFieldName).reduce()
    }
    private String tableName(){ return ReflectionUtils.className(entityClass); }
}
