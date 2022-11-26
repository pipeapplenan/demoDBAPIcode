package com.example.demodbapi.dao;

import com.example.demodbapi.entity.Speciality1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Speciality1Mapper {
    @Select("SELECT * FROM Speciality WHERE SpecID = '0124' ")
    Speciality1 get();

 @Select("SELECT * FROM Speciality")
 List<Speciality1> aa();

    @Select("SELECT * FROM Speciality WHERE SpecID = #{specID} ")
    Speciality1 getParam(String specID);

    @Insert("insert into Speciality(SpecId,SpecName,SpecNotes) values(#{specId},#{specName},#{specNotes})")
    int insertData(Speciality1 allInOne);

    @Delete("delete from Speciality where specID = #{specID}")
    int deleteData(String specID);

    @Update("update speciality set SpecNotes = #{SpecNotes} where specID = #{specID}")
    int updateData(String specID, String SpecNotes);
}


