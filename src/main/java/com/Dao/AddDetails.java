package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import org.apache.taglibs.standard.tag.common.core.SetSupport;

import com.Entity.sunEntity;

public class AddDetails {
    private Connection con;

	public AddDetails(Connection con) {
		super();
		this.con = con;
	}
	
	
	public boolean insertDetails(sunEntity s) {
		boolean b=false;
		try {
			String q="insert into cruddata(first_name,last_name,address,street,city,state,email,phone) values(?,?,?,?,?,?,?,?)";
		    PreparedStatement ps=con.prepareStatement(q);
		    ps.setString(1, s.getFname());
		    ps.setString(2, s.getLname());
		    ps.setString(3,s.getAdd());
		    ps.setString(4, s.getStreet());
		    ps.setString(5, s.getCity());
		    ps.setString(6, s.getState());
		    ps.setString(7, s.getEmail());
		    ps.setString(8, s.getPhone());
		    int i=ps.executeUpdate();
		    if(i==1) {
		    	b=true;
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
	public List<sunEntity> getDetails(){
		List<sunEntity> list=new ArrayList<sunEntity>();
		sunEntity s=null;
		try {
			String q="select * from cruddata";
			PreparedStatement ps=con.prepareStatement(q);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				s=new sunEntity();
				s.setId(rs.getInt(1));
				s.setFname(rs.getString(2));
				s.setLname(rs.getString(3));
				s.setAdd(rs.getString(4));
				s.setStreet(rs.getString(5));
				s.setCity(rs.getString(6));
				s.setState(rs.getString(7));
				s.setEmail(rs.getString(8));
				s.setPhone(rs.getString(9));
				list.add(s);
				
				
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean deleteDetails(int id) {
		boolean b=false;
		try {
			String q="delete from cruddata where id=?";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i==1) {
				b=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return b;
	}
	
	public sunEntity getDetailsById(int id) {
		sunEntity s=null;
		try {
			String q="select * from cruddata where id=?";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				s=new sunEntity();
				s.setId(rs.getInt(1));
				s.setFname(rs.getString(2));
				s.setLname(rs.getString(3));
				s.setAdd(rs.getString(4));
				s.setStreet(rs.getString(5));
				s.setCity(rs.getString(6));
				s.setState(rs.getString(7));
				s.setEmail(rs.getString(8));
				s.setPhone(rs.getString(9));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	public boolean updateDetails(sunEntity s) {
		boolean b=false;
		try {
			String q="update cruddata set first_name=?,last_name=?,address=?,street=?,city=?,state=?,email=?,phone=? where id=?";
		     PreparedStatement ps=con.prepareStatement(q);
		     ps.setString(1, s.getFname());
			    ps.setString(2, s.getLname());
			    ps.setString(3,s.getAdd());
			    ps.setString(4, s.getStreet());
			    ps.setString(5, s.getCity());
			    ps.setString(6, s.getState());
			    ps.setString(7, s.getEmail());
			    ps.setString(8, s.getPhone());
			    ps.setInt(9, s.getId());
			    int i=ps.executeUpdate();
			    if(i==1) {
			    	b=true;
			    }
		     
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
}
