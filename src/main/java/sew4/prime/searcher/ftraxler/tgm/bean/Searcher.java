package sew4.prime.searcher.ftraxler.tgm.bean;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;


/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-04-19
 * @project sew4-prime-searcher-ftraxler-tgm
 */
@Controller
@Component
public class Searcher implements ApplicationRunner {
    private long prime;
    private Date primeModified;
    private Date start;
    private boolean flag = false;


    @GetMapping("/primes")
    public String prime(){
        return "prime";
    }


    
    @GetMapping("/primes/searcher")
    public String updatePrime(Model model){
        model.addAttribute("start", this.start);
        model.addAttribute("prime",this.prime);
        model.addAttribute("primeModified",this.primeModified);
        return "searcher";


    }
    @PostConstruct
    public void init(){
        this.start=new Date();
        this.prime=2;
        this.flag=true;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long zahl=2;
        prime = zahl;
        primeModified = new Date();
        zahl=3;
        while (flag){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ign){}
            if(isPrime(zahl)){
                prime=zahl;
                primeModified=new Date();
            }
            zahl+=2;
        }

    }
    public boolean isPrime(long zahl){

        double sqrt = Math.sqrt(zahl);

        for(long i = 3;i<=sqrt;i+=2){
            if(zahl%i==0){
                return false;
            }
        }
        return true;
    }

    @PreDestroy
    public void destroy(){
        this.flag=false;
    }


}
