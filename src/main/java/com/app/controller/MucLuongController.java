package com.app.controller;

import com.app.model.Mucluong;
import com.app.model.dao.MucLuongDAO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MucLuongController {
    MucLuongDAO dao = new MucLuongDAO();
    //List
    @RequestMapping(value = "/mucluong", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Mucluong> mucLuongList(){
        return dao.getList();
    }

    //GetbyID
    @RequestMapping(value = "/mucluong/{MaML}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Mucluong mucluong(@PathVariable("MaML") String MaMl){
        return dao.getById(MaMl);
    }

    //Add
    @RequestMapping(value = "/mucluong/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Mucluong add(@RequestBody Mucluong mucluong){
        return dao.insert(mucluong.getMaMl(),mucluong.getSoTien());
    }

    //Update
    @RequestMapping(value = "/mucluong/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Mucluong update(@RequestBody Mucluong mucluong){
        return dao.update(mucluong.getMaMl(), mucluong.getSoTien());
    }

    //Delete
    @RequestMapping(value = "/mucluong/delete/{emp_No}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void delete(@PathVariable("emp_No") String emp_no){
        dao.delete(emp_no);
    }
}
