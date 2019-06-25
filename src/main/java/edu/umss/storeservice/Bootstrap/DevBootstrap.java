package edu.umss.storeservice.Bootstrap;

import edu.umss.storeservice.model.*;
import edu.umss.storeservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

//import edu.umss.storeservice.repository.ImageFileRepository;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Component

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private ImageFileRepository imageFileRepository;
    private ProductRepository productRepository;
    private ProviderRepository providerRepository;
    private StockRepository stockRepository;
    private UserRepository userRepository;

    public DevBootstrap(ProductRepository productRepository, ProviderRepository providerRepository, StockRepository stockRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.providerRepository = providerRepository;
        this.stockRepository = stockRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
            initData();
            MyDate();
            Mytimestamp();
    }

    private Date MyDate() {

        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }
    private Timestamp Mytimestamp(){
        Calendar cal=Calendar.getInstance();
        Timestamp rest=new Timestamp(cal.getTimeInMillis());
                return rest;
    }

    private void initData() {

        /////////for product
        Product prod=new Product();
        prod.setNameProduct("SUGAR");
        prod.setQuantityProduct(3);
        prod.setUnitCostProduct(56);
        this.productRepository.save(prod);
        /////product2
        Product prod2=new Product();
        prod2.setNameProduct("CHEESE");
        prod2.setQuantityProduct(19);
        prod2.setUnitCostProduct(56);
        this.productRepository.save(prod2);

        ///////////users
        Users user=new Users();
        SecureRandom random = new SecureRandom();
        String password = "secret1234";
        byte[] hashedPassword = password.getBytes(StandardCharsets.UTF_8);
        byte[] rest= DigestUtils.md5Digest(hashedPassword);
        user.setAccountUser("JHONNY");
        user.setPasswordUser(rest);
        user.setRePasswordUser(rest);
        user.setSecurityQuest1("admin123");
        user.setSecurityQuest2("admin321");
        userRepository.save(user);
        ////////////////////ImageFile
            ImageFile imagef=new ImageFile();
            imagef.setFileImageName("ICONS");
            imagef.setFormatImage("PNG");
            imagef.setUrlImage("https://www.fontisto.com/icons");
            imagef.setProduct(prod);
            imageFileRepository.save(imagef);
        ////Provider
        Provider provider=new Provider();
        provider.setFirstName("Pepito");
        provider.setLastName("Rojas");
        provider.setCorporateName("Food Business");
        provider.setNitProvee(4577847);
        provider.setCiProvee(445654);
        provider.setBirthDate(this.Mytimestamp());
        provider.setUser(user);
       providerRepository.save(provider);

////        ////////provider2
//        Provider provi2=new Provider();
//        provi2.setFirstName("Fatima");
//        provi2.setLastName("Romero");
//        provi2.setCorporateName("Food Business2");
//        provi2.setNitProvee(587459);
//        provi2.setCiProvee(1281488);
//        provi2.setBirthDate(this.Mytimestamp());
//        provi2.setUser(user);
       // providerRepository.save(provi2);//--error
//        ///////Stock
//
        Stock stock=new Stock();

        stock.setStockCode("koi45sd");
        stock.setStockName("Store Foods");
        stock.setDateRegistered(this.Mytimestamp());
        stock.setElaborationDate(this.Mytimestamp());
        stock.setExpirationDate(this.Mytimestamp());
        stock.setStockQuantity(85);
        stock.setProduct(prod);
        stock.setProvider(provider);
        stockRepository.save(stock);


//        ////////////////// stock2

        Stock stock2=new Stock();
        stock2.setStockCode("op789det");
        stock2.setStockName("start Foods ");
        stock2.setDateRegistered(this.Mytimestamp());
        stock2.setElaborationDate(this.Mytimestamp());
        stock2.setExpirationDate(Mytimestamp());
        stock2.setStockQuantity(25);
        stock2.setProduct(prod);
        stock2.setProvider(provider);
        stockRepository.save(stock2);




  }
}
