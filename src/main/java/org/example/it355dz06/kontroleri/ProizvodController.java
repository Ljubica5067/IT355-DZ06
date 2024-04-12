package org.example.it355dz06.kontroleri;

import org.example.it355dz06.entiteti.Korpa;
import org.example.it355dz06.entiteti.Proizvod;
import org.example.it355dz06.repozitorijumi.KorpaRepository;
import org.example.it355dz06.repozitorijumi.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class ProizvodController {
    @Autowired
    private ProizvodRepository proizvodRepository;

    @Autowired
    private KorpaRepository korpaRepository;

    @GetMapping("/")
    public String list(Model model)
    {
        List<Proizvod> proizvodi=proizvodRepository.findAll();
        model.addAttribute("proizvodi",proizvodi);
        return "list";
    }

    @PostMapping("/addToCart")
    public String addToCart(@RequestParam(name="productId") Long productId)
    {
            Proizvod p=proizvodRepository.findById(productId).orElse(null);
            if(p!=null)
            {
                Korpa k=new Korpa();
                k.setKolicina(1);
                k.setP(p);
                korpaRepository.save(k);
            }

            return "redirect:/";
    }

    }

