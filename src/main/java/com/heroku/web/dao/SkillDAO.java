/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.dao;
import java.util.List;
import com.heroku.web.entity.Skill;
/**
 *
 * @author USER
 */
public interface SkillDAO {
    List<Skill> getAll();
}
