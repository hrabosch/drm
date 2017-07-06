package org.hrabosch.docker.registryui.controller;

import java.util.ArrayList;
import java.util.List;

import org.hrabosch.docker.registryui.domain.DockerRegistry;
import org.hrabosch.docker.registryui.service.IRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * File description
 *
 * @author hrabosch
 */
@Controller
public class MainController {

  @ModelAttribute("dockerRegistries")
  public Object[] populateDockerRegistries() {
    List<DockerRegistry> dockerRegistries = new ArrayList<>();
    DockerRegistry dockerRegistry = new DockerRegistry("Testing", 5);
    DockerRegistry dockerRegistry2 = new DockerRegistry("Another", 23);
    dockerRegistries.add(dockerRegistry);
    dockerRegistries.add(dockerRegistry2);
    return dockerRegistries.toArray();
  }

  @Autowired
  private IRegistryService registryService;

  @RequestMapping("/")
  public String listDockerRegistries(Model model) {
    model.addAttribute("dockerRegistries", populateDockerRegistries());
    return "index";
  }

  public IRegistryService getRegistryService() {
    return registryService;
  }

  public void setRegistryService(IRegistryService registryService) {
    this.registryService = registryService;
  }

}
