/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.repository;

import edu.umss.storeservice.model.Stock;
import org.springframework.stereotype.Repository;

@Repository
public class StockRepository extends StoredProcedureRepositoryImpl<Stock> {

}

