package edu.umss.storeservice.Bootstrap;

import edu.umss.storeservice.repository.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
@Component

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private ImageFileRepository imageFileRepository;
    private ProductRepository productRepository;
    private ProviderRepository providerRepository;
    private StockRepository stockRepository;
    private UserRepository userRepository;

    public DevBootstrap(ImageFileRepository imageFileRepository, ProductRepository productRepository, ProviderRepository providerRepository, StockRepository stockRepository, UserRepository userRepository) {
        this.imageFileRepository = imageFileRepository;
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
//        Product prod=new Product();
//        prod.setName_Product("SUGAR");
//        prod.setQuantity_Product(3);
//        BigDecimal b =new BigDecimal("456.46");
//        prod.setUnit_Cost_Product(b);
//        productRepository.save(prod);
//        /////product2
//        Product prod2=new Product();
//        prod2.setName_Product("CHEESE");
//        prod2.setQuantity_Product(19);
//        BigDecimal c =new BigDecimal("56.23");
//        prod2.setUnit_Cost_Product(c);
//        productRepository.save(prod2);
//        ////////imagefile
//        ImageFile imagef=new ImageFile();
//        imagef.setFile_Image_Name("ICONS");
//        imagef.setFormat_Image("PNG");
//        imagef.setURL_Image("https://www.fontisto.com/icons");
//        imagef.setProduct(prod);
//        imageFileRepository.save(imagef);
//        ///////////users
//        User user=new User();
//        SecureRandom random = new SecureRandom();
//        String password = "secret1234";
//        byte[] hashedPassword = password.getBytes(StandardCharsets.UTF_8);
//        byte[] rest=DigestUtils.md5Digest(hashedPassword);
//        user.setAccount_user("JHONNY");
//        user.setPassword_User(rest);
//        user.setRePassword_User(rest);
//        user.setSecurity_Quest1("admin123");
//        user.setSecurity_Quest2("admin321");
//        userRepository.save(user);
//        ////Provider
//        Provider provider=new Provider();
//        provider.setFirst_Name("Pepito");
//        provider.setLast_Name("Rojas");
//        provider.setCorporate_Name("Food Business");
//        provider.setNit_provee(4577847);
//        provider.setCi_provee(445654);
//        provider.setBirth_date(this.Mytimestamp());
//        provider.setUser(user);
//        providerRepository.save(provider);
//
////        ////////provider2
//        Provider provi2=new Provider();
//        provi2.setFirst_Name("Fatima");
//        provi2.setLast_Name("Romero");
//        provi2.setCorporate_Name("Food Business2");
//        provi2.setNit_provee(587459);
//        provi2.setCi_provee(1281488);
//        provi2.setBirth_date(this.Mytimestamp());
//        provi2.setUser(user);
////         providerRepository.save(provi2);//--error
//        ///////Stock
//
//        Stock stock=new Stock();
//
//        stock.setStock_Code("koi45sd");
//        stock.setStock_Name("Store Foods");
//        stock.setDaDate_Registered(this.Mytimestamp());
//        stock.setElaboration_Date(this.Mytimestamp());
//        stock.setExpiration_Date(this.Mytimestamp());
//        stock.setStock_Quantity(85);
//        stock.setProduct(prod);
//        stock.setProvider(provider);
//        stockRepository.save(stock);
//        ////////////////// stock2
//
//        Stock stock2=new Stock();
//        stock2.setStock_Code("op789det");
//        stock2.setStock_Name("start Foods ");
//        stock2.setDaDate_Registered(this.Mytimestamp());
//        stock2.setElaboration_Date(this.Mytimestamp());
//        stock2.setExpiration_Date(Mytimestamp());
//        stock2.setStock_Quantity(25);
//        stock2.setProduct(prod);
//        stock2.setProvider(provider);
//        stockRepository.save(stock2);


  }
}
