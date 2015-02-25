package cont;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbo.Reg_dbo;

import vao.Address;
import vao.Reg_vao;
import vao.Vehicle;

/**
 * Servlet implementation class Reg_cont
 */
@WebServlet("/Reg_cont")
public class Reg_cont extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg_cont() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		
		Reg_vao rv=new Reg_vao();
		Address addr1=new Address();
		Address addr2=new Address();
		
		Vehicle vehicle=new Vehicle();
		Vehicle vehicle2=new Vehicle();
		String Vehicle_name=request.getParameter("Vehicle_name");
		
		vehicle.setVehicle_name(Vehicle_name);
		vehicle.setVehicle_id(1);
		
		vehicle2.setVehicle_id(2);
		vehicle2.setVehicle_name("car");
		
		String city=request.getParameter("City");
		String state=request.getParameter("State");
		String pin_code=request.getParameter("Pin_code");
		String streetname=request.getParameter("Street_name");
		
		String office_city=request.getParameter("Office_City");
		String office_state=request.getParameter("Office_State");
		String office_pin_code=request.getParameter("Office_Pin_code");
		String office_streetname=request.getParameter("Office_Street_name");
		
		

		addr1.setCity(city);
		addr1.setState(state);
		addr1.setPin_code(pin_code);
		addr1.setStreet_name(streetname);
	
		addr2.setCity(office_city);
		addr2.setState(office_state);
		addr2.setPin_code(office_pin_code);
		addr2.setStreet_name(office_streetname);
	
		
		rv.getAddress().add(addr1);	
		rv.getAddress().add(addr2);
		rv.setFn(fn);
		rv.setLn(ln);
		rv.getVehicle().add(vehicle);
		rv.getVehicle().add(vehicle2);
		
		vehicle.getUser().add(rv);
		
		Reg_dbo rd=new Reg_dbo();
		
		rd.insert(rv);
		rd.insert_Vehicle(vehicle);
		
		response.sendRedirect("welcome.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
