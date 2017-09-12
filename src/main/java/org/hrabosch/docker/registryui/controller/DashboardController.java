package org.hrabosch.docker.registryui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * File description
 *
 * @author hrabosch
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {

  @RequestMapping
  public String showDashboard(Model model) {
    model.addAttribute("template", "dashboard");
    return "index";
  }
}
