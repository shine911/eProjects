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
    @RequestMapping(value = "/mucluong", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Mucluong add(@RequestBody Mucluong mucluong){
        return dao.insert(mucluong.getMaMl(),mucluong.getSoTien());
    }
}
