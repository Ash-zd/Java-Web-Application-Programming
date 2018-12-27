package javaweb.controller;

import javaweb.entity.Lmenu;
import javaweb.entity.News;
import javaweb.repository.LmenuRepository;
import javaweb.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ash
 * @date 2018/12/27 12:53
 */
@RestController
@RequestMapping(path = "/news")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private LmenuRepository lmenuRepository;

    @RequestMapping(path = "gettitlesbyfather")
    public Object getTitlesByFather(@RequestParam("father") String father) {
        Lmenu lmenu = lmenuRepository.findLmenuByLname(father);
        List<News> list = new ArrayList<>();
        list = newsRepository.findAllByLmenu(lmenu);
        List<String> titles = new ArrayList<>(4);
        for (News n : list) {
            titles.add(n.getNtitle());
        }
        return titles;
    }

    @RequestMapping(path = "geturlsbyfather")
    public Object getUrlsByFather(@RequestParam("father") String father) {
        Lmenu lmenu = lmenuRepository.findLmenuByLname(father);
        List<News> list = new ArrayList<>();
        list = newsRepository.findAllByLmenu(lmenu);
        List<String> urls = new ArrayList<>();
        for (News n : list) {
            urls.add(n.getNurl());
        }
        return urls;
    }


}
