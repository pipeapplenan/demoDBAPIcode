package com.example.demodbapi.controller;

import com.example.demodbapi.dao.Speciality1Mapper;
import com.example.demodbapi.entity.Speciality1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Speciality1Controller {
    @Autowired
    private Speciality1Mapper mapper;
    @RequestMapping("/databasecall")
    public List<Speciality1> databaseAPI(){
        return mapper.aa();
    }
    @RequestMapping("/databasecallone")
    public Speciality1 databaseAPIOne(){
        return mapper.get();
    }
    @RequestMapping("/databasecallparam")
    public Speciality1 requestParam(@RequestParam(name = "specID") String specID){
        return mapper.getParam(specID);
    }

    @RequestMapping("/databasecallinsert")
    public int insertData(@RequestBody Speciality1 rBody){
        return mapper.insertData(rBody);
    }

    @RequestMapping("/databasecalldele")
    public int deleteData(@RequestParam(name = "specID") String specID){
        return mapper.deleteData(specID);
    }

    @RequestMapping("/databasecallupdate")
    public int updateData(@RequestParam(name = "specID") String specID, @RequestParam(name = "SpecNotes") String SpecNotes){
        return mapper.updateData(specID, SpecNotes);
    }
}
