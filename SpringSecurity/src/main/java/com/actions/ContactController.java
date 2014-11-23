package com.actions;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Contact;

@Controller
@SessionAttributes
public class ContactController {

	@RequestMapping(value = {"/addContact","/addContact2"}, method = RequestMethod.GET)
    public String addContactGet(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
         
        System.out.println("[GET]First Name:" + contact.getFirstname() + 
                    "\nLast Name:" + contact.getLastname());
         ObjectError err = new ObjectError("ERROR_TEST", "Test ERROR");
         result.addError(err);
         System.out.println(result.getAllErrors().size());
        return "contacts";
    }
     
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContactPost(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
         
        System.out.println("[POST]First Name:" + contact.getFirstname() + 
                    "\nLast Name:" + contact.getLastname());
         ObjectError err = new ObjectError("ERROR_TEST", "Test ERROR");
         result.addError(err);
         System.out.println(result.getAllErrors().size());
        return "redirect:contacts";
    }
	
    @RequestMapping("/contacts")
    public ModelAndView showContacts(@ModelAttribute("contact")Contact contact) {
         
    	System.out.println("Redirection /contacts ...");
    	Contact c = new Contact();
    	c.setEmail("Mon email");
    	System.out.println("REDIRECT OBJECT : " + contact.getFirstname());
        return new ModelAndView("contact", "command", contact);
    }
    
}
