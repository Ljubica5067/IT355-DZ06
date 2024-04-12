package org.example.it355dz06.kontroleri;
import org.example.it355dz06.entiteti.Korpa;
import org.example.it355dz06.entiteti.Proizvod;
import org.example.it355dz06.repozitorijumi.KorpaRepository;
import org.example.it355dz06.repozitorijumi.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller

public class KorpaController {

    @Autowired
    private KorpaRepository korpaRepository;
    private ProizvodRepository proizvodRepository;

    @GetMapping("/korpa ")
    public String list(Model model) {
        List<Korpa> korpa = korpaRepository.findAll();
        model.addAttribute("korpa", korpa);
        return "korpa";
    }

    @PostMapping("/checkout")
    public String checkout(@RequestParam("name") String name,@RequestParam("address") String address,Model model)
    {
        List<Korpa> stavke=korpaRepository.findAll();

        double ukupno=0.0;

        for(Korpa k:stavke)
        {
            ukupno+=k.getP().getCena();
        }

        model.addAttribute("name",name);
        model.addAttribute("address",address);
        model.addAttribute("total",ukupno);

        return "checkout";
    }

}
