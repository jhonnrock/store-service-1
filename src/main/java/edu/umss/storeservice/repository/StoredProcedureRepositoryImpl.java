package edu.umss.storeservice.repository;

import edu.umss.storeservice.model.ModelBase;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

//public interface StoredProcedureRepositoryImpl<T extends ModelBase> extends JpaRepository<T,Long>, JpaSpecificationExecutor<T>
public abstract class StoredProcedureRepositoryImpl<T extends ModelBase>
{
    @PersistenceContext
    protected EntityManager entityManager;
    @Transactional
    public List<T> findAll()
    {
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery querySP = entityManager.createNamedStoredProcedureQuery("GetAll"+typeName);
        querySP.execute();

        return (List<T>) querySP.getResultList();
    }
    @Transactional
    public T findById(Long id){
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery  querySP = entityManager.createNamedStoredProcedureQuery("Get"+typeName+"ById");
        querySP.setParameter("id", id);

        querySP.execute();

        return (T) querySP.getSingleResult();
    }

    @Transactional
    public Boolean deleteById(Long id){
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery  querySP = entityManager.createNamedStoredProcedureQuery("Delete"+typeName+"ById");
        querySP.setParameter("id", id);

        querySP.execute();

        return (Boolean) querySP.getOutputParameterValue("result");
    }

    @Transactional
    public T save(T data) {
        entityManager.persist(data);
        return data;
    }
  }





