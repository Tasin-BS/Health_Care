package org.management_system.userservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UserController {

}
