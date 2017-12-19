package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.BlogDAO;
import model.entidad.GnrPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController{

    @RequestMapping({"/index.htm", "/"})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("index");
        try{
            List<GnrPost> lista = BlogDAO.getAllPosts();
            mv.addObject("lista", lista);
        }catch(Exception e){
            e.printStackTrace();
        }
        return mv;
    }
}
