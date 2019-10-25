package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerFormController {

	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("customer")
	public String customerForm() {
		return "customerForm";
	}
	
	@RequestMapping("saveCustomer")
	public String saveCustomerForm(Customer customer) {
		repo.save(customer);
		return "customerForm";
	}
	
	@RequestMapping("viewCustomer")
	public String viewCustomer() {
		return "viewCustomerDetails";
	}
	 @PostMapping("/viewCustomer") 
	  public ModelAndView retrieveCustomerDetails(@RequestParam int cid) {
	  
		 ModelAndView mv = new ModelAndView("retrieveCustomer");
		 Customer customer = repo.findById(cid).orElse(null);
		 mv.addObject(customer);
		 return mv;
	  }
	 
	 /* Retrive data from DB using REST API */
	 
	 @RequestMapping("getAllCustomers")
	 @ResponseBody
	 public List<Customer> getAllCustomers() {
		 return repo.findAll();
	 }
	 @RequestMapping("getAllCustomers/{cid}")
	 @ResponseBody
	 public Optional<Customer> getCustomerById(@PathVariable("cid") int cid) {
		 return repo.findById(cid);
	 }
	 
	/*
	  @GetMapping("customer") 
	  public String customerForm() {
	  
	  return "customerForm"; }
	 
	*/
	
	/*  @PostMapping("/addCustomer") 
	  public String viewCustomerDetails(@RequestParam("cid") String cid,
			  							@RequestParam("cname") String cname, 
			  							@RequestParam("cemail") String cemail, ModelMap modelMap) {
	  
	  modelMap.put("cid", cid); modelMap.put("cname", cname);
	  modelMap.put("cemail", cemail); return "viewCustomerDetails";
	  
	  }
	 */
}
