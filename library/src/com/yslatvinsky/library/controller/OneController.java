package src.com.yslatvinsky.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.com.yslatvinsky.library.Entity.AuthorEntity;
import src.com.yslatvinsky.library.Service.AuthorService;

import java.util.Map;

@Controller
public class OneController {
    @Autowired
    private AuthorService contactService;

    @RequestMapping("/index")
    public String listContacts(Map<String, Object> map) {

        map.put("contact", new AuthorEntity());
        map.put("contactList", contactService.listAuthorEntity());

        return "author";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("author")
                             AuthorEntity author, BindingResult result) {

        contactService.addAuthor(author);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{authorId}")
    public String deleteContact(@PathVariable("contactId")
                                Integer authorId) {

        contactService.removeAuthor(authorId);

        return "redirect:/index";
    }
}
