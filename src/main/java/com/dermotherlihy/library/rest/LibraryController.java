package com.dermotherlihy.library.rest;

/**
 * Created by dermot.herlihy on 30/08/15.
 */

import com.dermotherlihy.library.config.LibraryConfig;
import com.dermotherlihy.library.domain.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryConfig libraryConfig;

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Greeting home() {
        return new Greeting(libraryConfig.getId(), libraryConfig.getName());
    }
}

