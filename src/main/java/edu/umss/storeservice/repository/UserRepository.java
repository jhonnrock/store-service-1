/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.repository;

import edu.umss.storeservice.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends StoredProcedureRepositoryImpl<Users> {

}

