package org.hrabosch.docker.registryui.service;

import java.util.List;
import org.hrabosch.docker.registryui.domain.Registry;

/**
 * File description
 *
 * @author hrabosch
 */
public interface IRegistryService {

  List<Registry> getRegistryList();

}
