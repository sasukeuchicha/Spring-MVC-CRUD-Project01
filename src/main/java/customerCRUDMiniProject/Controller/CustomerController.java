package customerCRUDMiniProject.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import customerCRUDMiniProject.Dao.CustomerDao;
import customerCRUDMiniProject.Models.Customer;
@Controller
public class CustomerController {
	@RequestMapping("/")
	public String Index(Model model ) {
		System.out.println("hello world");
		return "index";
	}
	@RequestMapping("/customerPage")
	public String CustomerPage(Model model){
		System.out.println("this is customer page");
		return "customerPage";
	}
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String customerInfoSubmit(@ModelAttribute Customer customer, Model model) {
		System.out.println("clicked save customer");
//		this.customerDao.addCustomer(customer);
		
		return "customerAdded";
		
	}
	@RequestMapping("/redirectToCustomerPage")
    public String redirectToAddProd() {
        return "redirect:customerPage";
    }
}
