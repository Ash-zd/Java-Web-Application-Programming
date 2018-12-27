package javaweb.controller;

import javaweb.entity.Lmenu;
import javaweb.repository.LmenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ash
 * @date 2018/12/27 12:53
 */
@RestController
@RequestMapping(path = "/lmenu")
public class LmenuController {

    private final LmenuRepository lmenuRepository;

    @Autowired
    public LmenuController(LmenuRepository lmenuRepository) {
        this.lmenuRepository = lmenuRepository;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Object getAllLmenus() {
        return lmenuRepository.findAll();
    }

    @RequestMapping(path = "/details", method = RequestMethod.GET)
    public Object getLmenuDetailsByName(@RequestParam("name") String name) {
        return lmenuRepository.findLmenuByLname(name).getLdescription();
    }




}
