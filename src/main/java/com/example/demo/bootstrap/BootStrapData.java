package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*
        OutsourcedPart p100= new OutsourcedPart();
        p100.setCompanyName("EVGA");
        p100.setName("EVGA RTX 3070Ti");
        p100.setInv(5);
        p100.setMin(0);
        p100.setMax(50);
        p100.setPrice(499.99);
        p100.setId(100);
        outsourcedPartRepository.save(p100);


        OutsourcedPart p101= new OutsourcedPart();
        p101.setCompanyName("Trident");
        p101.setName("Trident Z RGB 16GB x 2 DDR4 4000");
        p101.setInv(20);
        p101.setMin(0);
        p101.setMax(50);
        p101.setPrice(299.99);
        p101.setId(101);
        outsourcedPartRepository.save(p101);


        OutsourcedPart p102 = new OutsourcedPart();
        p102.setCompanyName("ARCTIC");
        p102.setName("ARCTIC Liquid Freezer II 360mm");
        p102.setInv(30);
        p102.setMin(0);
        p102.setMax(50);
        p102.setPrice(169.99);
        p102.setId(102);
        outsourcedPartRepository.save(p102);


        OutsourcedPart p103 = new OutsourcedPart();
        p103.setCompanyName("EVGA");
        p103.setName("EVGA 500 GD ATX 80+ Gold 500 W");
        p103.setInv(59);
        p103.setMin(0);
        p103.setMax(100);
        p103.setPrice(69.99);
        p103.setId(103);
        outsourcedPartRepository.save(p103);


        OutsourcedPart p104 = new OutsourcedPart();
        p104.setCompanyName("Samsung");
        p104.setName("Samsung 970 Evo Plus M.2 NvME SSD 2Tb");
        p104.setInv(100);
        p104.setMin(0);
        p104.setMax(150);
        p104.setPrice(89.99);
        p104.setId(104);
        outsourcedPartRepository.save(p104);
        */

        /*
        OutsourcedPart thePart = null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("EVGA RTX 3070Ti"))thePart = part;
        }
        System.out.println(thePart.getCompanyName());
        */


        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        /*
        Product t1g = new Product("Tier 1 Gaming PC",1500.0,10);
        Product t2g = new Product("Tier 2 Gaming PC",2000.0,10);
        Product t3g = new Product("Tier 3 Gaming PC",2500.0,10);
        Product t1d = new Product("Tier 1 Desktop",1200.0,15);
        Product t3w = new Product("Tier 3 Media Workstation",3500.0,10);
        productRepository.save(t1g);
        productRepository.save(t2g);
        productRepository.save(t3g);
        productRepository.save(t1d);
        productRepository.save(t3w);
        */
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
