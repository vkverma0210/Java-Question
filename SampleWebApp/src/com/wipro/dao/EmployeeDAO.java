package com.wipro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.wipro.util.DBUtil;

import com.wipro.bean.EmployeeBean;

public class EmployeeDAO {
	public List<EmployeeBean> getAllEmployee()
	{
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean> ();
		
		try
		{
			String sql = "SELECT * FROM EMPLOYEE_TABLE";
			
			Connection conn = DBUtil.getDBConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet resultSet = st.executeQuery();
			
			while(resultSet.next())
			{
				EmployeeBean bean = new EmployeeBean();
				
				bean.setEmployeeId(resultSet.getInt("employee_id"));
				bean.setEmployeeName(resultSet.getString("employee_name"));
				bean.setEmployeeSalary(resultSet.getInt("employee_salary"));
				employeeList.add(bean);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return employeeList;
	}
}
