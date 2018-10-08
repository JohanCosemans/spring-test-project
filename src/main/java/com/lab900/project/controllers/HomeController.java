/**
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lab900.project.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@CrossOrigin
@RestController
public class HomeController {

    @Value("${app.url}")
    private String appUrl;

    @GetMapping("/")
    public String index(HttpServletResponse reponse) throws IOException {
        return "Check the api documentation at "+appUrl+"/swagger-ui.html";
    }
    @GetMapping("/_ah/start")
    public String startupCall(HttpServletResponse reponse) throws IOException {
        return "I have started!";
    }
}
