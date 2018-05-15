/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.dao.impl;

import com.heroku.web.dao.SkillDAO;
import com.heroku.web.entity.Skill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SkillDAOImpl implements SkillDAO {

    @Override
    public List<Skill> getAll() {
        List<Skill> skills=new ArrayList<Skill>();
        try{
            Class.forName("org.postgresql.Driver");
            String user="dypwvfxkbgwqhc";
            String pass="4e9ff6411dccbd5af627bf19ba87b1f6ec8a75ba0d186ef9287a1b9c9f965b98";
            String url="jdbc:postgresql://ec2-23-23-130-158.compute-1.amazonaws.com/d9spd1v2cea4nt?sslmode=require";
            Connection conn=DriverManager
                    .getConnection(url,user,pass);
            //String sql="insert into skills(skill_name) values('Programming')";
            String sql="select * from skills";
            PreparedStatement stmt=conn.prepareStatement(sql);
            //int result=stmt.executeUpdate();
            //System.out.println(result);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                Skill skill=new Skill();
                skill.setId(rs.getInt("id"));
                skill.setName(rs.getString("skill_name"));
                skills.add(skill);
            }
            conn.close();
            return skills;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
}
