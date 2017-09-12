package org.hrabosch.docker.registryui.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * File description
 *
 * @author hrabosch
 */
public interface RegistryRepository extends CrudRepository<Registry, Long> {

  List<Registry> findByName(String name);

}
