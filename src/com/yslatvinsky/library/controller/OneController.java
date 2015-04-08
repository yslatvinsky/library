package com.yslatvinsky.library.controller;

import com.yslatvinsky.library.Entity.AuthorEntity;
import com.yslatvinsky.library.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class OneController {
    @Autowired
    private AuthorService authorService;

    @RequestMapping("/index")
    public String listContacts(Map<String, Object> map) {
        System.out.println("conroller");
        map.put("contact", new AuthorEntity());
        map.put("contactList", authorService.listAuthorEntity());


        return "author";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("author")
                             AuthorEntity author, BindingResult result) {

        authorService.addAuthor(author);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{authorId}")
    public String deleteContact(@PathVariable("contactId")
                                Integer authorId) {

        authorService.removeAuthor(authorId);

        return "redirect:/index";
    }
}
