package org.hrabosch.docker.registryui.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.hrabosch.docker.registryui.domain.Registry;
import org.hrabosch.docker.registryui.domain.RegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * File description
 *
 * @author hrabosch
 */
@Service
public class RegistryService implements org.hrabosch.docker.registryui.service.RegistryService {

  @Autowired
  private RegistryRepository registryRepository;

  @Override
  public List<Registry> getRegistryList() {
    Iterable<Registry> repoRes = registryRepository.findAll();
    List<Registry> registryList = new ArrayList<>();
    if (repoRes != null) {
      repoRes.forEach(registryList::add);
    }
    return registryList;
  }

  @Override
  public void addNewRegistry(Registry registry) {
    registryRepository.save(registry);
  }
}
