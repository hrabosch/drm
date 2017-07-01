package org.hrabosch.docker.registryui.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.hrabosch.docker.registryui.domain.DockerRegistry;
import org.hrabosch.docker.registryui.domain.Registry;
import org.hrabosch.docker.registryui.service.IRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * File description
 *
 * @author hrabosch
 */
@Controller
public class MainController {

  @ModelAttribute("dockerRegistries")
  public List<DockerRegistry> populateDockerRegistries() {
    List<DockerRegistry> dockerRegistries = new ArrayList<>();
    DockerRegistry dockerRegistry = new DockerRegistry("Testing", 5);
    DockerRegistry dockerRegistry2 = new DockerRegistry("Another", 23);
    dockerRegistries.add(dockerRegistry);
    dockerRegistries.add(dockerRegistry2);
    return dockerRegistries;
  }

  @Autowired
  private IRegistryService registryService;

  @RequestMapping("/")
  public String listDockerRegistries(Map<String, Object> model) {
    model.put("dockerRegistries", populateDockerRegistries());
    return "index";
  }

  public IRegistryService getRegistryService() {
    return registryService;
  }

  public void setRegistryService(IRegistryService registryService) {
    this.registryService = registryService;
  }

}
