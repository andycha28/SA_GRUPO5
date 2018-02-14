/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_g5;

import com.google.common.net.MediaType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import static javax.ws.rs.HttpMethod.GET;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author Virginia
 */
public class Tarea1_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List <String> paises =new ArrayList<>() ;
        paises.add("Madrid");
        paises.add("Islas Canarias");
//        ingresarSoap("España","8",paises);
          GetREST1();
          GetREST2("1");
    }
 
    public static void ingresarSoap(String pais,String codpais,List paises) {    
        com.gt.soapws.InsertData_Service service = new com.gt.soapws.InsertData_Service();
        com.gt.soapws.InsertData port = service.getInsertDataPort();
        System.out.println(port.paisdeto(pais, codpais,paises));  
    }
    
    public static void GetREST1()
    {
        Client cli = ClientBuilder.newClient();
        WebTarget t = cli.target("http://localhost:8080/restWs_Web/rs/admpais/findAllPais");
        System.out.println(t.request().get(String.class));
    }
    public static void GetREST2(String id)
    {
        Client cli = ClientBuilder.newClient();
        WebTarget t = cli.target("http://localhost:8080/restWs_Web/rs/admpais/findByIdPais/"+id);
        System.out.println(t.request().get(String.class));
    }
    
}
