package edu.umss.storeservice.repository;

import edu.umss.storeservice.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StoredProcedureRepositoryImpl<T extends ModelBase> extends JpaRepository<T,Long> , JpaSpecificationExecutor<T> {

}
