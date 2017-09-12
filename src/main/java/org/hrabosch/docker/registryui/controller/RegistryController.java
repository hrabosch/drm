/******************************************************************************
 *
 * Copyright (c) 2017 CA.  All rights reserved.
 *
 * This software and all information contained therein is confidential and
 * proprietary and shall not be duplicated, used, disclosed or disseminated
 * in any way except as authorized by the applicable license agreement,
 * without the express written permission of CA. All authorized reproductions
 * must be marked with this language.
 *
 * EXCEPT AS SET FORTH IN THE APPLICABLE LICENSE AGREEMENT, TO THE EXTENT
 * PERMITTED BY APPLICABLE LAW, CA PROVIDES THIS SOFTWARE WITHOUT
 * WARRANTY OF ANY KIND, INCLUDING WITHOUT LIMITATION, ANY IMPLIED
 * WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  IN
 * NO EVENT WILL CA BE LIABLE TO THE END USER OR ANY THIRD PARTY FOR ANY
 * LOSS OR DAMAGE, DIRECT OR INDIRECT, FROM THE USE OF THIS SOFTWARE,
 * INCLUDING WITHOUT LIMITATION, LOST PROFITS, BUSINESS INTERRUPTION,
 * GOODWILL, OR LOST DATA, EVEN IF CA IS EXPRESSLY ADVISED OF SUCH LOSS OR
 * DAMAGE.
 *
 ******************************************************************************/

package org.hrabosch.docker.registryui.controller;

import org.hrabosch.docker.registryui.domain.Registry;
import org.hrabosch.docker.registryui.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * File description
 *
 * @author lanal04
 */
@Controller
@RequestMapping("/registry")
public class RegistryController {

  @Autowired
  private RegistryService registryService;

  @GetMapping
  public String showRegistryList(Model model) {
    model.addAttribute("dockerRegistries", registryService.getRegistryList());
    model.addAttribute("template", "registryList");
    model.addAttribute("newRegistry", new Registry());
    return "index";
  }

  @PostMapping("/addNewRegistry")
  public String addNewRegistry(@ModelAttribute Registry registry) {
    registry.setImageCount(0);
    registryService.addNewRegistry(registry);
    return "redirect:/registry";
  }

}
