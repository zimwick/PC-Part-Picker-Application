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

        //checking if part repository is empty, if empty add parts
        if(!outsourcedPartRepository.findAll().iterator().hasNext()){
            OutsourcedPart part1 = new OutsourcedPart();
            part1.setCompanyName("Memory Bros");
            part1.setName("8gb Ram");
            part1.setInv(15);
            part1.setPrice(50.0);
            part1.setId(100L);
            part1.setMaxInv(150);
            part1.setMinInv(2);
            outsourcedPartRepository.save(part1);

            OutsourcedPart part2 = new OutsourcedPart();
            part2.setCompanyName("Solitude");
            part2.setName("500gb SSD");
            part2.setInv(28);
            part2.setPrice(150.0);
            part2.setId(101L);
            part2.setMaxInv(650);
            part2.setMinInv(5);
            outsourcedPartRepository.save(part2);

            OutsourcedPart part3 = new OutsourcedPart();
            part3.setCompanyName("Newegg");
            part3.setName("Motherboard");
            part3.setInv(3);
            part3.setPrice(270.0);
            part3.setId(102L);
            part3.setMaxInv(250);
            part3.setMinInv(1);
            outsourcedPartRepository.save(part3);

            OutsourcedPart part4 = new OutsourcedPart();
            part4.setCompanyName("Amazon");
            part4.setName("CPU");
            part4.setInv(14);
            part4.setPrice(300.0);
            part4.setId(103L);
            part4.setMaxInv(800);
            part4.setMinInv(5);
            outsourcedPartRepository.save(part4);

            OutsourcedPart part5 = new OutsourcedPart();
            part5.setCompanyName("Tiger Direct");
            part5.setName("Chasis");
            part5.setInv(18);
            part5.setPrice(125.0);
            part5.setId(104L);
            part5.setMaxInv(1000);
            part5.setMinInv(10);
            outsourcedPartRepository.save(part5);
        }

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        //checking if repository is empty, if empty add the products
        if(!productRepository.findAll().iterator().hasNext()){
            Product gamingPC = new Product("Gaming PC", 600.0, 6);
            productRepository.save(gamingPC);

            Product workPC = new Product("Work PC", 450.0, 22);
            productRepository.save(workPC);

            Product personalPC = new Product("Personal PC", 300.0, 4);
            productRepository.save(personalPC);

            Product multiMediaPC = new Product("Multi Media PC", 900.0, 10);
            productRepository.save(multiMediaPC);

            Product schoolPC = new Product("School PC", 200.0, 100);
            productRepository.save(schoolPC);
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
