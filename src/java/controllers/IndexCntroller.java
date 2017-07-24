/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashif
 */
@Controller
public class IndexCntroller {

    /**
     * If the root is requested without any path variable the @RequestMapping() annotation's parameter should be value = ""
     *
     * @return view
     */
    @RequestMapping(value = "", method = RequestMethod.GET)//method handles requests for root path
    public String getMethod1() {

        return "index";
    }
}
