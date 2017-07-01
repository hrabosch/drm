package org.hrabosch.docker.registryui.service;

import java.util.ArrayList;
import java.util.List;
import org.hrabosch.docker.registryui.domain.Registry;
import org.springframework.stereotype.Service;

/**
 * File description
 *
 * @author hrabosch
 */
@Service
public class RegistryService implements IRegistryService {

  @Override
  public List<Registry> getRegistryList() {
    List<Registry> registryList = new ArrayList<>();
    registryList.add(new Registry());
    return registryList;
  }
}
